package nl.paulinternet.gtasaveedit.view.component;

import nl.paulinternet.libsavegame.TextFieldInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValueButton extends JButton implements ActionListener {
    private TextFieldInterface field;
    private String value;

    public ValueButton(TextFieldInterface field, String value, String text) {
        super(text);
        this.field = field;
        this.value = value;
        addActionListener(this);
        field.setOnTextChange(s -> updateEnabledState());
    }

    private void updateEnabledState() {
        setEnabled(field.isEnabled());
    }

    public ValueButton(TextFieldInterface field, String value) {
        this(field, value, value);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        field.setText(value);
    }
}
