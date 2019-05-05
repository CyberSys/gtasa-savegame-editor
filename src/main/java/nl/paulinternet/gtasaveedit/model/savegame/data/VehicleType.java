package nl.paulinternet.gtasaveedit.model.savegame.data;

import java.util.*;

public class VehicleType
{

  private int id;
  private String type;
  private String name;
  private ArrayList<VehicleColor.ColorPair> validColors;


  private VehicleType(String type, String name, int id, VehicleColor.ColorPair... validColors)
  {
    this.id = id;
    this.type = type;
    this.name = name;
    if (validColors != null) {
      this.validColors = new ArrayList<>(Arrays.asList(validColors));
    } else {
      this.validColors = new ArrayList<>();
    }
  }

  public int getId()
  {
    return id;
  }

  public String getType()
  {
    return type;
  }

  public String getName()
  {
    return name;
  }

  public ArrayList<VehicleColor.ColorPair> getValidColors()
  {
    return validColors;
  }

  private static List<VehicleType> types;

  static {
    types = new ArrayList<>();

    types.add(new VehicleType("None", "None", 0,
      new VehicleColor.ColorPair(0, 0)));

    types.add(new VehicleType("Bikes", "BF-400", 581,
      new VehicleColor.ColorPair(54, 1),
      new VehicleColor.ColorPair(58, 1),
      new VehicleColor.ColorPair(66, 1),
      new VehicleColor.ColorPair(72, 1),
      new VehicleColor.ColorPair(75, 1),
      new VehicleColor.ColorPair(87, 1),
      new VehicleColor.ColorPair(101, 1),
      new VehicleColor.ColorPair(36, 1)));

    types.add(new VehicleType("Bikes", "Bike", 509,
      new VehicleColor.ColorPair(7, 1),
      new VehicleColor.ColorPair(74, 1),
      new VehicleColor.ColorPair(61, 1),
      new VehicleColor.ColorPair(16, 1),
      new VehicleColor.ColorPair(25, 1),
      new VehicleColor.ColorPair(30, 1),
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(53, 1)));

    types.add(new VehicleType("Bikes", "BMX", 481,
      new VehicleColor.ColorPair(1, 1),
      new VehicleColor.ColorPair(3, 3),
      new VehicleColor.ColorPair(6, 6),
      new VehicleColor.ColorPair(46, 46),
      new VehicleColor.ColorPair(65, 9),
      new VehicleColor.ColorPair(14, 1),
      new VehicleColor.ColorPair(12, 9),
      new VehicleColor.ColorPair(26, 1)));

    types.add(new VehicleType("Bikes", "Faggio", 462,
      new VehicleColor.ColorPair(12, 12),
      new VehicleColor.ColorPair(13, 13),
      new VehicleColor.ColorPair(14, 14),
      new VehicleColor.ColorPair(1, 2),
      new VehicleColor.ColorPair(2, 1),
      new VehicleColor.ColorPair(1, 3),
      new VehicleColor.ColorPair(3, 1),
      new VehicleColor.ColorPair(10, 10)));

    types.add(new VehicleType("Bikes", "FCR-900", 521,
      new VehicleColor.ColorPair(74, 74),
      new VehicleColor.ColorPair(75, 13),
      new VehicleColor.ColorPair(87, 118),
      new VehicleColor.ColorPair(92, 3),
      new VehicleColor.ColorPair(115, 118),
      new VehicleColor.ColorPair(25, 118),
      new VehicleColor.ColorPair(36, 0),
      new VehicleColor.ColorPair(118, 118)));

    types.add(new VehicleType("Bikes", "Freeway", 463,
      new VehicleColor.ColorPair(79, 79),
      new VehicleColor.ColorPair(84, 84),
      new VehicleColor.ColorPair(7, 7),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(19, 19),
      new VehicleColor.ColorPair(22, 22),
      new VehicleColor.ColorPair(36, 36),
      new VehicleColor.ColorPair(53, 53)));

    types.add(new VehicleType("Bikes", "HPV1000 (cop bike)", 523,
      new VehicleColor.ColorPair(0, 1)));

    types.add(new VehicleType("Bikes", "Mountain Bike", 510,
      new VehicleColor.ColorPair(43, 43),
      new VehicleColor.ColorPair(46, 46),
      new VehicleColor.ColorPair(39, 39),
      new VehicleColor.ColorPair(28, 28),
      new VehicleColor.ColorPair(16, 16),
      new VehicleColor.ColorPair(6, 6),
      new VehicleColor.ColorPair(5, 5),
      new VehicleColor.ColorPair(2, 2)));

    types.add(new VehicleType("Bikes", "NRG-500", 522,
      new VehicleColor.ColorPair(3, 3),
      new VehicleColor.ColorPair(3, 8),
      new VehicleColor.ColorPair(6, 25),
      new VehicleColor.ColorPair(7, 79),
      new VehicleColor.ColorPair(8, 82),
      new VehicleColor.ColorPair(36, 105),
      new VehicleColor.ColorPair(39, 106),
      new VehicleColor.ColorPair(51, 118)));

    types.add(new VehicleType("Bikes", "PCJ-600", 461,
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(37, 1),
      new VehicleColor.ColorPair(43, 1),
      new VehicleColor.ColorPair(53, 1),
      new VehicleColor.ColorPair(61, 1),
      new VehicleColor.ColorPair(75, 1),
      new VehicleColor.ColorPair(79, 1),
      new VehicleColor.ColorPair(88, 1)));

    types.add(new VehicleType("Bikes", "Pizzaboy", 448,
      new VehicleColor.ColorPair(3, 6)));

    types.add(new VehicleType("Bikes", "Sanchez", 468,
      new VehicleColor.ColorPair(6, 6),
      new VehicleColor.ColorPair(46, 46),
      new VehicleColor.ColorPair(53, 53),
      new VehicleColor.ColorPair(3, 3)));

    types.add(new VehicleType("Bikes", "Wayfarer", 586,
      new VehicleColor.ColorPair(119, 1),
      new VehicleColor.ColorPair(122, 1),
      new VehicleColor.ColorPair(8, 1),
      new VehicleColor.ColorPair(10, 1),
      new VehicleColor.ColorPair(13, 1),
      new VehicleColor.ColorPair(25, 1),
      new VehicleColor.ColorPair(27, 1),
      new VehicleColor.ColorPair(32, 1)));

    types.add(new VehicleType("Cars", "Admiral", 445,
      new VehicleColor.ColorPair(34, 34),
      new VehicleColor.ColorPair(35, 35),
      new VehicleColor.ColorPair(37, 37),
      new VehicleColor.ColorPair(39, 39),
      new VehicleColor.ColorPair(41, 41),
      new VehicleColor.ColorPair(43, 43),
      new VehicleColor.ColorPair(45, 45),
      new VehicleColor.ColorPair(47, 47)));

    types.add(new VehicleType("Cars", "Alpha", 602,
      new VehicleColor.ColorPair(58, 1),
      new VehicleColor.ColorPair(69, 1),
      new VehicleColor.ColorPair(75, 77),
      new VehicleColor.ColorPair(18, 1),
      new VehicleColor.ColorPair(32, 1),
      new VehicleColor.ColorPair(45, 45),
      new VehicleColor.ColorPair(13, 1),
      new VehicleColor.ColorPair(34, 1)));

    types.add(new VehicleType("Cars", "Ambulance", 416,
      new VehicleColor.ColorPair(1, 3)));

    types.add(new VehicleType("Cars", "Baggage", 485,
      new VehicleColor.ColorPair(1, 73),
      new VehicleColor.ColorPair(1, 74),
      new VehicleColor.ColorPair(1, 75),
      new VehicleColor.ColorPair(1, 76),
      new VehicleColor.ColorPair(1, 77),
      new VehicleColor.ColorPair(1, 78),
      new VehicleColor.ColorPair(1, 79)));

    types.add(new VehicleType("Cars", "Bandito", 568,
      new VehicleColor.ColorPair(2, 39),
      new VehicleColor.ColorPair(9, 39),
      new VehicleColor.ColorPair(17, 1),
      new VehicleColor.ColorPair(21, 1),
      new VehicleColor.ColorPair(33, 0),
      new VehicleColor.ColorPair(37, 0),
      new VehicleColor.ColorPair(41, 29),
      new VehicleColor.ColorPair(56, 29)));

    types.add(new VehicleType("Cars", "Banshee", 429,
      new VehicleColor.ColorPair(12, 12),
      new VehicleColor.ColorPair(13, 13),
      new VehicleColor.ColorPair(14, 14),
      new VehicleColor.ColorPair(1, 2),
      new VehicleColor.ColorPair(2, 1),
      new VehicleColor.ColorPair(1, 3),
      new VehicleColor.ColorPair(3, 1),
      new VehicleColor.ColorPair(10, 10)));

    types.add(new VehicleType("Cars", "Barracks", 433,
      new VehicleColor.ColorPair(43, 0)));

    types.add(new VehicleType("Cars", "Benson", 499,
      new VehicleColor.ColorPair(109, 25),
      new VehicleColor.ColorPair(109, 32),
      new VehicleColor.ColorPair(112, 32),
      new VehicleColor.ColorPair(10, 32),
      new VehicleColor.ColorPair(30, 44),
      new VehicleColor.ColorPair(32, 52),
      new VehicleColor.ColorPair(84, 66),
      new VehicleColor.ColorPair(84, 69)));

    types.add(new VehicleType("Cars", "BF Injection", 424,
      new VehicleColor.ColorPair(1, 0),
      new VehicleColor.ColorPair(2, 2),
      new VehicleColor.ColorPair(3, 2),
      new VehicleColor.ColorPair(3, 6),
      new VehicleColor.ColorPair(6, 16),
      new VehicleColor.ColorPair(15, 30),
      new VehicleColor.ColorPair(24, 53),
      new VehicleColor.ColorPair(35, 61)));

    types.add(new VehicleType("Cars", "Blade", 536,
      new VehicleColor.ColorPair(9, 1),
      new VehicleColor.ColorPair(12, 1),
      new VehicleColor.ColorPair(26, 96),
      new VehicleColor.ColorPair(30, 96),
      new VehicleColor.ColorPair(32, 1),
      new VehicleColor.ColorPair(37, 1),
      new VehicleColor.ColorPair(57, 96),
      new VehicleColor.ColorPair(71, 96)));

    types.add(new VehicleType("Cars", "Blista Compact", 496,
      new VehicleColor.ColorPair(74, 72),
      new VehicleColor.ColorPair(66, 72),
      new VehicleColor.ColorPair(53, 56),
      new VehicleColor.ColorPair(37, 19),
      new VehicleColor.ColorPair(22, 22),
      new VehicleColor.ColorPair(20, 20),
      new VehicleColor.ColorPair(9, 14),
      new VehicleColor.ColorPair(0, 0)));

    types.add(new VehicleType("Cars", "Bloodra", 504,
      new VehicleColor.ColorPair(51, 39),
      new VehicleColor.ColorPair(57, 38),
      new VehicleColor.ColorPair(45, 29),
      new VehicleColor.ColorPair(34, 9),
      new VehicleColor.ColorPair(65, 9),
      new VehicleColor.ColorPair(14, 1),
      new VehicleColor.ColorPair(12, 9),
      new VehicleColor.ColorPair(26, 1)));

    types.add(new VehicleType("Cars", "Bobcat", 422,
      new VehicleColor.ColorPair(96, 25),
      new VehicleColor.ColorPair(97, 25),
      new VehicleColor.ColorPair(101, 25),
      new VehicleColor.ColorPair(111, 31),
      new VehicleColor.ColorPair(113, 36),
      new VehicleColor.ColorPair(83, 57),
      new VehicleColor.ColorPair(67, 59)));

    types.add(new VehicleType("Cars", "Boxville", 498,
      new VehicleColor.ColorPair(11, 123),
      new VehicleColor.ColorPair(13, 120),
      new VehicleColor.ColorPair(20, 117),
      new VehicleColor.ColorPair(24, 112),
      new VehicleColor.ColorPair(27, 107),
      new VehicleColor.ColorPair(36, 105),
      new VehicleColor.ColorPair(37, 107),
      new VehicleColor.ColorPair(43, 93)));

    types.add(new VehicleType("Cars", "Boxville (Boxburg)", 609, new VehicleColor.ColorPair(36, 36)));

    types.add(new VehicleType("Cars", "Bravura", 401,
      new VehicleColor.ColorPair(41, 41),
      new VehicleColor.ColorPair(47, 47),
      new VehicleColor.ColorPair(52, 52),
      new VehicleColor.ColorPair(66, 66),
      new VehicleColor.ColorPair(74, 74),
      new VehicleColor.ColorPair(87, 87),
      new VehicleColor.ColorPair(91, 91),
      new VehicleColor.ColorPair(113, 113)));

    types.add(new VehicleType("Cars", "Broadway", 575,
      new VehicleColor.ColorPair(12, 1),
      new VehicleColor.ColorPair(19, 96),
      new VehicleColor.ColorPair(31, 64),
      new VehicleColor.ColorPair(25, 96),
      new VehicleColor.ColorPair(38, 1),
      new VehicleColor.ColorPair(51, 96),
      new VehicleColor.ColorPair(57, 1),
      new VehicleColor.ColorPair(66, 96)));

    types.add(new VehicleType("Cars", "Buccaneer", 518,
      new VehicleColor.ColorPair(2, 39),
      new VehicleColor.ColorPair(9, 39),
      new VehicleColor.ColorPair(17, 1),
      new VehicleColor.ColorPair(21, 1),
      new VehicleColor.ColorPair(33, 0),
      new VehicleColor.ColorPair(37, 0),
      new VehicleColor.ColorPair(41, 29),
      new VehicleColor.ColorPair(56, 29)));

    types.add(new VehicleType("Cars", "Buffalo", 402,
      new VehicleColor.ColorPair(10, 10),
      new VehicleColor.ColorPair(13, 13),
      new VehicleColor.ColorPair(22, 22),
      new VehicleColor.ColorPair(30, 30),
      new VehicleColor.ColorPair(39, 39),
      new VehicleColor.ColorPair(90, 90),
      new VehicleColor.ColorPair(98, 98),
      new VehicleColor.ColorPair(110, 110)));

    types.add(new VehicleType("Cars", "Bullet", 541,
      new VehicleColor.ColorPair(51, 1),
      new VehicleColor.ColorPair(58, 8),
      new VehicleColor.ColorPair(60, 1),
      new VehicleColor.ColorPair(68, 8),
      new VehicleColor.ColorPair(2, 1),
      new VehicleColor.ColorPair(13, 8),
      new VehicleColor.ColorPair(22, 1),
      new VehicleColor.ColorPair(36, 8)));

    types.add(new VehicleType("Cars", "Burrito", 482,
      new VehicleColor.ColorPair(41, 41),
      new VehicleColor.ColorPair(48, 48),
      new VehicleColor.ColorPair(52, 52),
      new VehicleColor.ColorPair(64, 64),
      new VehicleColor.ColorPair(71, 71),
      new VehicleColor.ColorPair(85, 85),
      new VehicleColor.ColorPair(10, 10),
      new VehicleColor.ColorPair(62, 62)));

    types.add(new VehicleType("Cars", "Bus", 431,
      new VehicleColor.ColorPair(71, 59),
      new VehicleColor.ColorPair(75, 59),
      new VehicleColor.ColorPair(92, 72),
      new VehicleColor.ColorPair(47, 74),
      new VehicleColor.ColorPair(55, 83),
      new VehicleColor.ColorPair(59, 83),
      new VehicleColor.ColorPair(71, 87),
      new VehicleColor.ColorPair(82, 87)));

    types.add(new VehicleType("Cars", "Cabbie", 438, new VehicleColor.ColorPair(6, 76)));

    types.add(new VehicleType("Cars", "Caddy", 457,
      new VehicleColor.ColorPair(58, 1),
      new VehicleColor.ColorPair(2, 1),
      new VehicleColor.ColorPair(63, 1),
      new VehicleColor.ColorPair(18, 1),
      new VehicleColor.ColorPair(32, 1),
      new VehicleColor.ColorPair(45, 1),
      new VehicleColor.ColorPair(13, 1),
      new VehicleColor.ColorPair(34, 1)));

    types.add(new VehicleType("Cars", "Cadrona", 527,
      new VehicleColor.ColorPair(52, 1),
      new VehicleColor.ColorPair(53, 1),
      new VehicleColor.ColorPair(66, 1),
      new VehicleColor.ColorPair(75, 1),
      new VehicleColor.ColorPair(76, 1),
      new VehicleColor.ColorPair(81, 1),
      new VehicleColor.ColorPair(95, 1),
      new VehicleColor.ColorPair(109, 1)));

    types.add(new VehicleType("Cars", "Camper", 483));
    types.add(new VehicleType("Cars", "Cement", 524));

    types.add(new VehicleType("Cars", "Cheetah", 415,
      new VehicleColor.ColorPair(20, 1),
      new VehicleColor.ColorPair(25, 1),
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(40, 1),
      new VehicleColor.ColorPair(62, 1),
      new VehicleColor.ColorPair(75, 1),
      new VehicleColor.ColorPair(92, 1),
      new VehicleColor.ColorPair(0, 1)));

    types.add(new VehicleType("Cars", "Clover", 542,
      new VehicleColor.ColorPair(13, 118),
      new VehicleColor.ColorPair(24, 118),
      new VehicleColor.ColorPair(31, 93),
      new VehicleColor.ColorPair(32, 92),
      new VehicleColor.ColorPair(45, 92),
      new VehicleColor.ColorPair(113, 92),
      new VehicleColor.ColorPair(119, 113),
      new VehicleColor.ColorPair(122, 113)));

    types.add(new VehicleType("Cars", "Club", 589,
      new VehicleColor.ColorPair(37, 37),
      new VehicleColor.ColorPair(31, 31),
      new VehicleColor.ColorPair(23, 23),
      new VehicleColor.ColorPair(22, 22),
      new VehicleColor.ColorPair(7, 7),
      new VehicleColor.ColorPair(124, 124),
      new VehicleColor.ColorPair(114, 114),
      new VehicleColor.ColorPair(112, 112)));

    types.add(new VehicleType("Cars", "Coach", 437,
      new VehicleColor.ColorPair(54, 7),
      new VehicleColor.ColorPair(79, 7),
      new VehicleColor.ColorPair(87, 7),
      new VehicleColor.ColorPair(95, 16),
      new VehicleColor.ColorPair(98, 20),
      new VehicleColor.ColorPair(105, 20),
      new VehicleColor.ColorPair(123, 20),
      new VehicleColor.ColorPair(125, 21)));

    types.add(new VehicleType("Cars", "Combine Harvester", 532));

    types.add(new VehicleType("Cars", "Comet", 480,
      new VehicleColor.ColorPair(73, 45),
      new VehicleColor.ColorPair(12, 12),
      new VehicleColor.ColorPair(2, 2),
      new VehicleColor.ColorPair(6, 6),
      new VehicleColor.ColorPair(4, 4),
      new VehicleColor.ColorPair(46, 46),
      new VehicleColor.ColorPair(53, 53)));

    types.add(new VehicleType("Cars", "DFT-30", 578, new VehicleColor.ColorPair(1, 1)));
    types.add(new VehicleType("Cars", "Dozer", 486, new VehicleColor.ColorPair(1, 1)));
    types.add(new VehicleType("Cars", "Dumper", 406, new VehicleColor.ColorPair(1, 1)));

    types.add(new VehicleType("Cars", "Dune Rider", 573,
      new VehicleColor.ColorPair(91, 38),
      new VehicleColor.ColorPair(115, 43),
      new VehicleColor.ColorPair(85, 6),
      new VehicleColor.ColorPair(79, 7),
      new VehicleColor.ColorPair(78, 8),
      new VehicleColor.ColorPair(77, 18),
      new VehicleColor.ColorPair(79, 18),
      new VehicleColor.ColorPair(86, 24)));

    types.add(new VehicleType("Cars", "Elegant", 507,
      new VehicleColor.ColorPair(37, 37),
      new VehicleColor.ColorPair(42, 42),
      new VehicleColor.ColorPair(53, 53),
      new VehicleColor.ColorPair(62, 62),
      new VehicleColor.ColorPair(7, 7),
      new VehicleColor.ColorPair(10, 10),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(15, 15)));

    types.add(new VehicleType("Cars", "Elegy", 562,
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(35, 1),
      new VehicleColor.ColorPair(17, 1),
      new VehicleColor.ColorPair(11, 1),
      new VehicleColor.ColorPair(116, 1),
      new VehicleColor.ColorPair(113, 1),
      new VehicleColor.ColorPair(101, 1),
      new VehicleColor.ColorPair(92, 1)));

    types.add(new VehicleType("Cars", "Emperor", 585,
      new VehicleColor.ColorPair(37, 37),
      new VehicleColor.ColorPair(42, 42),
      new VehicleColor.ColorPair(53, 53),
      new VehicleColor.ColorPair(62, 62),
      new VehicleColor.ColorPair(7, 7),
      new VehicleColor.ColorPair(10, 10),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(15, 15)));

    types.add(new VehicleType("Cars", "Enforcer", 427, new VehicleColor.ColorPair(0, 1)));

    types.add(new VehicleType("Cars", "Esperanto", 419,
      new VehicleColor.ColorPair(45, 75),
      new VehicleColor.ColorPair(47, 76),
      new VehicleColor.ColorPair(33, 75),
      new VehicleColor.ColorPair(13, 76),
      new VehicleColor.ColorPair(54, 75),
      new VehicleColor.ColorPair(69, 76),
      new VehicleColor.ColorPair(59, 75),
      new VehicleColor.ColorPair(87, 76)));

    types.add(new VehicleType("Cars", "Euros", 587,
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(40, 1),
      new VehicleColor.ColorPair(43, 1),
      new VehicleColor.ColorPair(53, 1),
      new VehicleColor.ColorPair(72, 1),
      new VehicleColor.ColorPair(75, 1),
      new VehicleColor.ColorPair(95, 1),
      new VehicleColor.ColorPair(101, 1)));

    types.add(new VehicleType("Cars", "FBI Rancher", 490, new VehicleColor.ColorPair(0, 0)));

    types.add(new VehicleType("Cars", "FBI Truck", 528));

    types.add(new VehicleType("Cars", "Feltzer", 533,
      new VehicleColor.ColorPair(73, 1),
      new VehicleColor.ColorPair(74, 1),
      new VehicleColor.ColorPair(75, 1),
      new VehicleColor.ColorPair(77, 1),
      new VehicleColor.ColorPair(79, 1),
      new VehicleColor.ColorPair(83, 1),
      new VehicleColor.ColorPair(84, 1),
      new VehicleColor.ColorPair(91, 1)));

    types.add(new VehicleType("Cars", "Fire Truck", 407, new VehicleColor.ColorPair(3, 1)));
    types.add(new VehicleType("Cars", "Fire Truck (with ladder)", 544, new VehicleColor.ColorPair(3, 1)));

    types.add(new VehicleType("Cars", "Flash", 565,
      new VehicleColor.ColorPair(37, 37),
      new VehicleColor.ColorPair(42, 42),
      new VehicleColor.ColorPair(53, 53),
      new VehicleColor.ColorPair(62, 62),
      new VehicleColor.ColorPair(7, 7),
      new VehicleColor.ColorPair(10, 10),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(15, 15)));

    types.add(new VehicleType("Cars", "Flatbed", 455,
      new VehicleColor.ColorPair(84, 15),
      new VehicleColor.ColorPair(84, 58),
      new VehicleColor.ColorPair(84, 31),
      new VehicleColor.ColorPair(32, 74),
      new VehicleColor.ColorPair(43, 31),
      new VehicleColor.ColorPair(1, 31),
      new VehicleColor.ColorPair(77, 31),
      new VehicleColor.ColorPair(32, 74)));

    types.add(new VehicleType("Cars", "Forklift", 530,
      new VehicleColor.ColorPair(110, 1),
      new VehicleColor.ColorPair(111, 1),
      new VehicleColor.ColorPair(112, 1),
      new VehicleColor.ColorPair(114, 1),
      new VehicleColor.ColorPair(119, 1),
      new VehicleColor.ColorPair(122, 1),
      new VehicleColor.ColorPair(4, 1),
      new VehicleColor.ColorPair(13, 1)));

    types.add(new VehicleType("Cars", "Fortune", 526,
      new VehicleColor.ColorPair(2, 39),
      new VehicleColor.ColorPair(9, 39),
      new VehicleColor.ColorPair(17, 1),
      new VehicleColor.ColorPair(21, 1),
      new VehicleColor.ColorPair(33, 0),
      new VehicleColor.ColorPair(37, 0),
      new VehicleColor.ColorPair(41, 29),
      new VehicleColor.ColorPair(56, 29)));

    types.add(new VehicleType("Cars", "Glendale", 466,
      new VehicleColor.ColorPair(67, 76),
      new VehicleColor.ColorPair(68, 76),
      new VehicleColor.ColorPair(78, 76),
      new VehicleColor.ColorPair(2, 76),
      new VehicleColor.ColorPair(16, 76),
      new VehicleColor.ColorPair(18, 76),
      new VehicleColor.ColorPair(25, 76),
      new VehicleColor.ColorPair(45, 88)));

    types.add(new VehicleType("Cars", "Glendale (beaten up)", 604,
      new VehicleColor.ColorPair(67, 76),
      new VehicleColor.ColorPair(68, 76),
      new VehicleColor.ColorPair(78, 76),
      new VehicleColor.ColorPair(2, 76),
      new VehicleColor.ColorPair(16, 76),
      new VehicleColor.ColorPair(18, 76),
      new VehicleColor.ColorPair(25, 76),
      new VehicleColor.ColorPair(45, 88)));

    types.add(new VehicleType("Cars", "Go Kart", 571,
      new VehicleColor.ColorPair(2, 35),
      new VehicleColor.ColorPair(36, 2),
      new VehicleColor.ColorPair(51, 53),
      new VehicleColor.ColorPair(91, 2),
      new VehicleColor.ColorPair(11, 22),
      new VehicleColor.ColorPair(40, 35)));

    types.add(new VehicleType("Cars", "Greenwood", 492,
      new VehicleColor.ColorPair(30, 26),
      new VehicleColor.ColorPair(77, 26),
      new VehicleColor.ColorPair(81, 27),
      new VehicleColor.ColorPair(24, 55),
      new VehicleColor.ColorPair(28, 56),
      new VehicleColor.ColorPair(49, 59),
      new VehicleColor.ColorPair(52, 69),
      new VehicleColor.ColorPair(71, 107)));

    types.add(new VehicleType("Cars", "Hermes", 474,
      new VehicleColor.ColorPair(97, 1),
      new VehicleColor.ColorPair(81, 1),
      new VehicleColor.ColorPair(105, 1),
      new VehicleColor.ColorPair(110, 1),
      new VehicleColor.ColorPair(91, 1),
      new VehicleColor.ColorPair(74, 1),
      new VehicleColor.ColorPair(84, 1),
      new VehicleColor.ColorPair(83, 1)));

    types.add(new VehicleType("Cars", "Hotdog", 588, new VehicleColor.ColorPair(1, 1)));

    types.add(new VehicleType("Cars", "Hotknife", 434,
      new VehicleColor.ColorPair(1, 1),
      new VehicleColor.ColorPair(12, 12),
      new VehicleColor.ColorPair(2, 2),
      new VehicleColor.ColorPair(6, 6),
      new VehicleColor.ColorPair(4, 4),
      new VehicleColor.ColorPair(46, 46),
      new VehicleColor.ColorPair(53, 53)));

    types.add(new VehicleType("Cars", "Hotring Racer (A)", 494,
      new VehicleColor.ColorPair(7, 94),
      new VehicleColor.ColorPair(36, 88),
      new VehicleColor.ColorPair(51, 75),
      new VehicleColor.ColorPair(53, 75),
      new VehicleColor.ColorPair(58, 67),
      new VehicleColor.ColorPair(75, 67),
      new VehicleColor.ColorPair(75, 61),
      new VehicleColor.ColorPair(79, 62)));

    types.add(new VehicleType("Cars", "Hotring Racer (B)", 502,
      new VehicleColor.ColorPair(83, 66),
      new VehicleColor.ColorPair(87, 74),
      new VehicleColor.ColorPair(87, 75),
      new VehicleColor.ColorPair(98, 83),
      new VehicleColor.ColorPair(101, 100),
      new VehicleColor.ColorPair(103, 101),
      new VehicleColor.ColorPair(117, 116),
      new VehicleColor.ColorPair(123, 36)));

    types.add(new VehicleType("Cars", "Hotring Racer (C) ", 503,
      new VehicleColor.ColorPair(36, 117),
      new VehicleColor.ColorPair(36, 13),
      new VehicleColor.ColorPair(42, 30),
      new VehicleColor.ColorPair(42, 33),
      new VehicleColor.ColorPair(54, 36),
      new VehicleColor.ColorPair(75, 79),
      new VehicleColor.ColorPair(92, 101),
      new VehicleColor.ColorPair(98, 109)));

    types.add(new VehicleType("Cars", "Huntley", 579,
      new VehicleColor.ColorPair(37, 37),
      new VehicleColor.ColorPair(42, 42),
      new VehicleColor.ColorPair(53, 53),
      new VehicleColor.ColorPair(62, 62),
      new VehicleColor.ColorPair(7, 7),
      new VehicleColor.ColorPair(10, 10),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(15, 15)));

    types.add(new VehicleType("Cars", "Hustler", 545,
      new VehicleColor.ColorPair(50, 1),
      new VehicleColor.ColorPair(47, 1),
      new VehicleColor.ColorPair(44, 96),
      new VehicleColor.ColorPair(40, 96),
      new VehicleColor.ColorPair(39, 1),
      new VehicleColor.ColorPair(30, 1),
      new VehicleColor.ColorPair(28, 96),
      new VehicleColor.ColorPair(9, 96)));

    types.add(new VehicleType("Cars", "Infernus", 411,
      new VehicleColor.ColorPair(12, 1),
      new VehicleColor.ColorPair(64, 1),
      new VehicleColor.ColorPair(123, 1),
      new VehicleColor.ColorPair(116, 1),
      new VehicleColor.ColorPair(112, 1),
      new VehicleColor.ColorPair(106, 1),
      new VehicleColor.ColorPair(80, 1),
      new VehicleColor.ColorPair(75, 1)));

    types.add(new VehicleType("Cars", "Intruder", 546,
      new VehicleColor.ColorPair(62, 37),
      new VehicleColor.ColorPair(78, 38),
      new VehicleColor.ColorPair(2, 62),
      new VehicleColor.ColorPair(3, 87),
      new VehicleColor.ColorPair(2, 78),
      new VehicleColor.ColorPair(113, 78),
      new VehicleColor.ColorPair(119, 62),
      new VehicleColor.ColorPair(7, 78)));

    types.add(new VehicleType("Cars", "Jester", 559,
      new VehicleColor.ColorPair(51, 1),
      new VehicleColor.ColorPair(58, 8),
      new VehicleColor.ColorPair(60, 1),
      new VehicleColor.ColorPair(68, 8),
      new VehicleColor.ColorPair(2, 1),
      new VehicleColor.ColorPair(13, 8),
      new VehicleColor.ColorPair(22, 1),
      new VehicleColor.ColorPair(36, 8)));

    types.add(new VehicleType("Cars", "Journey", 508, new VehicleColor.ColorPair(1, 1)));

    types.add(new VehicleType("Cars", "Landstalker", 400,
      new VehicleColor.ColorPair(4, 1),
      new VehicleColor.ColorPair(123, 1),
      new VehicleColor.ColorPair(113, 1),
      new VehicleColor.ColorPair(101, 1),
      new VehicleColor.ColorPair(75, 1),
      new VehicleColor.ColorPair(62, 1),
      new VehicleColor.ColorPair(40, 1),
      new VehicleColor.ColorPair(36, 1)));

    types.add(new VehicleType("Cars", "Lawn Mower", 572,
      new VehicleColor.ColorPair(94, 1),
      new VehicleColor.ColorPair(101, 1),
      new VehicleColor.ColorPair(116, 1),
      new VehicleColor.ColorPair(117, 1),
      new VehicleColor.ColorPair(4, 1),
      new VehicleColor.ColorPair(25, 1),
      new VehicleColor.ColorPair(30, 1),
      new VehicleColor.ColorPair(37, 1)));

    types.add(new VehicleType("Cars", "Linerunner", 403,
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(37, 1),
      new VehicleColor.ColorPair(30, 1),
      new VehicleColor.ColorPair(28, 1),
      new VehicleColor.ColorPair(25, 1),
      new VehicleColor.ColorPair(40, 1),
      new VehicleColor.ColorPair(101, 1),
      new VehicleColor.ColorPair(113, 1)));

    types.add(new VehicleType("Cars", "Majestic", 517,
      new VehicleColor.ColorPair(37, 36),
      new VehicleColor.ColorPair(36, 36),
      new VehicleColor.ColorPair(40, 36),
      new VehicleColor.ColorPair(43, 41),
      new VehicleColor.ColorPair(47, 41),
      new VehicleColor.ColorPair(51, 72),
      new VehicleColor.ColorPair(54, 75),
      new VehicleColor.ColorPair(55, 84)));

    types.add(new VehicleType("Cars", "Manana", 410,
      new VehicleColor.ColorPair(4, 1),
      new VehicleColor.ColorPair(9, 1),
      new VehicleColor.ColorPair(10, 1),
      new VehicleColor.ColorPair(25, 1),
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(40, 1),
      new VehicleColor.ColorPair(45, 1),
      new VehicleColor.ColorPair(84, 1)));

    types.add(new VehicleType("Cars", "Merit", 551,
      new VehicleColor.ColorPair(67, 1),
      new VehicleColor.ColorPair(72, 1),
      new VehicleColor.ColorPair(75, 1),
      new VehicleColor.ColorPair(83, 1),
      new VehicleColor.ColorPair(91, 1),
      new VehicleColor.ColorPair(101, 1),
      new VehicleColor.ColorPair(109, 1),
      new VehicleColor.ColorPair(20, 1)));

    types.add(new VehicleType("Cars", "Mesa", 500,
      new VehicleColor.ColorPair(75, 84),
      new VehicleColor.ColorPair(40, 84),
      new VehicleColor.ColorPair(40, 110),
      new VehicleColor.ColorPair(28, 119),
      new VehicleColor.ColorPair(25, 119),
      new VehicleColor.ColorPair(21, 119),
      new VehicleColor.ColorPair(13, 119),
      new VehicleColor.ColorPair(4, 119)));

    types.add(new VehicleType("Cars", "Monster (A)", 444, new VehicleColor.ColorPair(1, 1)));
    types.add(new VehicleType("Cars", "Monster (B)", 556, new VehicleColor.ColorPair(1, 1)));
    types.add(new VehicleType("Cars", "Monster (C)", 557,
      new VehicleColor.ColorPair(32, 36),
      new VehicleColor.ColorPair(32, 42),
      new VehicleColor.ColorPair(32, 53),
      new VehicleColor.ColorPair(32, 66),
      new VehicleColor.ColorPair(32, 14),
      new VehicleColor.ColorPair(32, 32)));

    types.add(new VehicleType("Cars", "Moonbeam", 418,
      new VehicleColor.ColorPair(119, 119),
      new VehicleColor.ColorPair(117, 127),
      new VehicleColor.ColorPair(114, 114),
      new VehicleColor.ColorPair(108, 108),
      new VehicleColor.ColorPair(95, 95),
      new VehicleColor.ColorPair(81, 81),
      new VehicleColor.ColorPair(61, 61),
      new VehicleColor.ColorPair(41, 41)));

    types.add(new VehicleType("Cars", "Mr Whoopee", 423,
      new VehicleColor.ColorPair(1, 16),
      new VehicleColor.ColorPair(1, 56),
      new VehicleColor.ColorPair(1, 17),
      new VehicleColor.ColorPair(1, 53),
      new VehicleColor.ColorPair(1, 5),
      new VehicleColor.ColorPair(1, 35)));

    types.add(new VehicleType("Cars", "Mule", 414,
      new VehicleColor.ColorPair(25, 1),
      new VehicleColor.ColorPair(28, 1),
      new VehicleColor.ColorPair(43, 1),
      new VehicleColor.ColorPair(67, 1),
      new VehicleColor.ColorPair(72, 1),
      new VehicleColor.ColorPair(9, 1),
      new VehicleColor.ColorPair(95, 1),
      new VehicleColor.ColorPair(24, 1)));

    types.add(new VehicleType("Cars", "Nebula", 516,
      new VehicleColor.ColorPair(116, 1),
      new VehicleColor.ColorPair(119, 1),
      new VehicleColor.ColorPair(122, 1),
      new VehicleColor.ColorPair(4, 1),
      new VehicleColor.ColorPair(9, 1),
      new VehicleColor.ColorPair(24, 1),
      new VehicleColor.ColorPair(27, 1),
      new VehicleColor.ColorPair(36, 1)));

    types.add(new VehicleType("Cars", "Newsvan", 582,
      new VehicleColor.ColorPair(41, 10),
      new VehicleColor.ColorPair(41, 20),
      new VehicleColor.ColorPair(49, 11),
      new VehicleColor.ColorPair(56, 123),
      new VehicleColor.ColorPair(110, 113),
      new VehicleColor.ColorPair(112, 116),
      new VehicleColor.ColorPair(114, 118),
      new VehicleColor.ColorPair(119, 101)));

    types.add(new VehicleType("Cars", "Oceanic", 467,
      new VehicleColor.ColorPair(51, 1),
      new VehicleColor.ColorPair(58, 8),
      new VehicleColor.ColorPair(60, 1),
      new VehicleColor.ColorPair(68, 8),
      new VehicleColor.ColorPair(2, 1),
      new VehicleColor.ColorPair(13, 8),
      new VehicleColor.ColorPair(22, 1),
      new VehicleColor.ColorPair(36, 8)));

    types.add(new VehicleType("Cars", "Packer", 443,
      new VehicleColor.ColorPair(4, 1),
      new VehicleColor.ColorPair(20, 1),
      new VehicleColor.ColorPair(24, 1),
      new VehicleColor.ColorPair(25, 1),
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(40, 1),
      new VehicleColor.ColorPair(54, 1),
      new VehicleColor.ColorPair(84, 1)));

    types.add(new VehicleType("Cars", "Patriot", 470, new VehicleColor.ColorPair(43, 0)));

    types.add(new VehicleType("Cars", "Perenial", 404,
      new VehicleColor.ColorPair(113, 39),
      new VehicleColor.ColorPair(119, 50),
      new VehicleColor.ColorPair(123, 92),
      new VehicleColor.ColorPair(109, 100),
      new VehicleColor.ColorPair(101, 101),
      new VehicleColor.ColorPair(95, 105),
      new VehicleColor.ColorPair(83, 110),
      new VehicleColor.ColorPair(66, 25)));

    types.add(new VehicleType("Cars", "Phoenix", 603,
      new VehicleColor.ColorPair(58, 1),
      new VehicleColor.ColorPair(69, 1),
      new VehicleColor.ColorPair(75, 77),
      new VehicleColor.ColorPair(18, 1),
      new VehicleColor.ColorPair(32, 1),
      new VehicleColor.ColorPair(45, 45),
      new VehicleColor.ColorPair(13, 1),
      new VehicleColor.ColorPair(34, 1)));

    types.add(new VehicleType("Cars", "Picador", 600,
      new VehicleColor.ColorPair(81, 8),
      new VehicleColor.ColorPair(32, 8),
      new VehicleColor.ColorPair(43, 8),
      new VehicleColor.ColorPair(67, 8),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(8, 90),
      new VehicleColor.ColorPair(2, 2),
      new VehicleColor.ColorPair(83, 13)));

    types.add(new VehicleType("Cars", "Police (LS)", 596, new VehicleColor.ColorPair(0, 1)));
    types.add(new VehicleType("Cars", "Police (LV)", 598, new VehicleColor.ColorPair(0, 1)));
    types.add(new VehicleType("Cars", "Police (SF)", 597, new VehicleColor.ColorPair(0, 1)));

    types.add(new VehicleType("Cars", "Pony", 413,
      new VehicleColor.ColorPair(87, 1),
      new VehicleColor.ColorPair(88, 1),
      new VehicleColor.ColorPair(91, 1),
      new VehicleColor.ColorPair(105, 1),
      new VehicleColor.ColorPair(109, 1),
      new VehicleColor.ColorPair(119, 1),
      new VehicleColor.ColorPair(4, 1),
      new VehicleColor.ColorPair(25, 1)));

    types.add(new VehicleType("Cars", "Premier", 426,
      new VehicleColor.ColorPair(37, 37),
      new VehicleColor.ColorPair(42, 42),
      new VehicleColor.ColorPair(53, 53),
      new VehicleColor.ColorPair(62, 62),
      new VehicleColor.ColorPair(7, 7),
      new VehicleColor.ColorPair(10, 10),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(15, 15)));

    types.add(new VehicleType("Cars", "Previon", 436,
      new VehicleColor.ColorPair(83, 1),
      new VehicleColor.ColorPair(87, 1),
      new VehicleColor.ColorPair(92, 1),
      new VehicleColor.ColorPair(95, 1),
      new VehicleColor.ColorPair(109, 1),
      new VehicleColor.ColorPair(119, 1),
      new VehicleColor.ColorPair(11, 1)));

    types.add(new VehicleType("Cars", "Primo", 547,
      new VehicleColor.ColorPair(122, 1),
      new VehicleColor.ColorPair(123, 1),
      new VehicleColor.ColorPair(125, 1),
      new VehicleColor.ColorPair(10, 1),
      new VehicleColor.ColorPair(24, 1),
      new VehicleColor.ColorPair(37, 1),
      new VehicleColor.ColorPair(55, 1),
      new VehicleColor.ColorPair(66, 1)));

    types.add(new VehicleType("Cars", "Quad", 471,
      new VehicleColor.ColorPair(120, 117),
      new VehicleColor.ColorPair(103, 111),
      new VehicleColor.ColorPair(120, 114),
      new VehicleColor.ColorPair(74, 91),
      new VehicleColor.ColorPair(120, 122),
      new VehicleColor.ColorPair(74, 83),
      new VehicleColor.ColorPair(120, 113),
      new VehicleColor.ColorPair(66, 71)));

    types.add(new VehicleType("Cars", "Rancher", 489,
      new VehicleColor.ColorPair(13, 118),
      new VehicleColor.ColorPair(14, 123),
      new VehicleColor.ColorPair(120, 123),
      new VehicleColor.ColorPair(112, 120),
      new VehicleColor.ColorPair(84, 110),
      new VehicleColor.ColorPair(76, 102)));

    types.add(new VehicleType("Cars", "Rancher (rnchlure)", 505,
      new VehicleColor.ColorPair(13, 118),
      new VehicleColor.ColorPair(14, 123),
      new VehicleColor.ColorPair(120, 123),
      new VehicleColor.ColorPair(112, 120),
      new VehicleColor.ColorPair(84, 110),
      new VehicleColor.ColorPair(76, 102)));

    types.add(new VehicleType("Cars", "Ranger", 599, new VehicleColor.ColorPair(0, 1)));

    types.add(new VehicleType("Cars", "Regina", 479,
      new VehicleColor.ColorPair(27, 26),
      new VehicleColor.ColorPair(59, 36),
      new VehicleColor.ColorPair(60, 35),
      new VehicleColor.ColorPair(55, 41),
      new VehicleColor.ColorPair(54, 31),
      new VehicleColor.ColorPair(49, 23),
      new VehicleColor.ColorPair(45, 32),
      new VehicleColor.ColorPair(40, 29)));

    types.add(new VehicleType("Cars", "Remington", 534,
      new VehicleColor.ColorPair(37, 37),
      new VehicleColor.ColorPair(42, 42),
      new VehicleColor.ColorPair(53, 53),
      new VehicleColor.ColorPair(62, 62),
      new VehicleColor.ColorPair(7, 7),
      new VehicleColor.ColorPair(10, 10),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(15, 15)));

    types.add(new VehicleType("Cars", "Rhino", 432, new VehicleColor.ColorPair(43, 0)));

    types.add(new VehicleType("Cars", "Roadtrain", 515,
      new VehicleColor.ColorPair(13, 76),
      new VehicleColor.ColorPair(24, 77),
      new VehicleColor.ColorPair(63, 78),
      new VehicleColor.ColorPair(42, 76),
      new VehicleColor.ColorPair(54, 77),
      new VehicleColor.ColorPair(39, 78),
      new VehicleColor.ColorPair(11, 76),
      new VehicleColor.ColorPair(62, 77)));

    types.add(new VehicleType("Cars", "Romero", 442,
      new VehicleColor.ColorPair(0, 0),
      new VehicleColor.ColorPair(11, 105),
      new VehicleColor.ColorPair(25, 109),
      new VehicleColor.ColorPair(36, 0),
      new VehicleColor.ColorPair(40, 36),
      new VehicleColor.ColorPair(75, 36),
      new VehicleColor.ColorPair(0, 36),
      new VehicleColor.ColorPair(0, 109)));

    types.add(new VehicleType("Cars", "Rumpo", 440,
      new VehicleColor.ColorPair(34, 34),
      new VehicleColor.ColorPair(32, 32),
      new VehicleColor.ColorPair(20, 20),
      new VehicleColor.ColorPair(110, 110),
      new VehicleColor.ColorPair(66, 66),
      new VehicleColor.ColorPair(84, 84),
      new VehicleColor.ColorPair(118, 118),
      new VehicleColor.ColorPair(121, 121)));

    types.add(new VehicleType("Cars", "S.W.A.T.", 601, new VehicleColor.ColorPair(1, 1)));

    types.add(new VehicleType("Cars", "Sabre", 475,
      new VehicleColor.ColorPair(2, 39),
      new VehicleColor.ColorPair(9, 39),
      new VehicleColor.ColorPair(17, 1),
      new VehicleColor.ColorPair(21, 1),
      new VehicleColor.ColorPair(33, 0),
      new VehicleColor.ColorPair(37, 0),
      new VehicleColor.ColorPair(41, 29),
      new VehicleColor.ColorPair(56, 29)));

    types.add(new VehicleType("Cars", "Sadler", 543,
      new VehicleColor.ColorPair(76, 8),
      new VehicleColor.ColorPair(32, 8),
      new VehicleColor.ColorPair(43, 8),
      new VehicleColor.ColorPair(67, 8),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(8, 90),
      new VehicleColor.ColorPair(2, 2),
      new VehicleColor.ColorPair(83, 13)));

    types.add(new VehicleType("Cars", "Sadler (beaten up)", 605,
      new VehicleColor.ColorPair(61, 8),
      new VehicleColor.ColorPair(32, 8),
      new VehicleColor.ColorPair(43, 8),
      new VehicleColor.ColorPair(67, 8),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(8, 90),
      new VehicleColor.ColorPair(2, 2),
      new VehicleColor.ColorPair(83, 13)));

    types.add(new VehicleType("Cars", "Sandking", 495,
      new VehicleColor.ColorPair(123, 124),
      new VehicleColor.ColorPair(119, 122),
      new VehicleColor.ColorPair(118, 117),
      new VehicleColor.ColorPair(116, 115),
      new VehicleColor.ColorPair(114, 108),
      new VehicleColor.ColorPair(101, 106),
      new VehicleColor.ColorPair(88, 99),
      new VehicleColor.ColorPair(5, 6)));

    types.add(new VehicleType("Cars", "Savanna", 567,
      new VehicleColor.ColorPair(97, 96),
      new VehicleColor.ColorPair(88, 64),
      new VehicleColor.ColorPair(90, 96),
      new VehicleColor.ColorPair(93, 64),
      new VehicleColor.ColorPair(97, 96),
      new VehicleColor.ColorPair(99, 81),
      new VehicleColor.ColorPair(102, 114),
      new VehicleColor.ColorPair(114, 1)));

    types.add(new VehicleType("Cars", "Securicar", 428, new VehicleColor.ColorPair(4, 75)));

    types.add(new VehicleType("Cars", "Sentinel", 405,
      new VehicleColor.ColorPair(11, 1),
      new VehicleColor.ColorPair(24, 1),
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(40, 1),
      new VehicleColor.ColorPair(75, 1),
      new VehicleColor.ColorPair(91, 1),
      new VehicleColor.ColorPair(123, 1),
      new VehicleColor.ColorPair(4, 1)));

    types.add(new VehicleType("Cars", "Slamvan", 535,
      new VehicleColor.ColorPair(3, 1),
      new VehicleColor.ColorPair(28, 1),
      new VehicleColor.ColorPair(31, 1),
      new VehicleColor.ColorPair(55, 1),
      new VehicleColor.ColorPair(66, 1),
      new VehicleColor.ColorPair(97, 1),
      new VehicleColor.ColorPair(123, 1),
      new VehicleColor.ColorPair(118, 1)));

    types.add(new VehicleType("Cars", "Solair", 458,
      new VehicleColor.ColorPair(91, 1),
      new VehicleColor.ColorPair(101, 1),
      new VehicleColor.ColorPair(109, 1),
      new VehicleColor.ColorPair(113, 1),
      new VehicleColor.ColorPair(4, 1),
      new VehicleColor.ColorPair(25, 1),
      new VehicleColor.ColorPair(30, 1),
      new VehicleColor.ColorPair(36, 1)));

    types.add(new VehicleType("Cars", "Stafford", 580,
      new VehicleColor.ColorPair(92, 92),
      new VehicleColor.ColorPair(81, 81),
      new VehicleColor.ColorPair(67, 67),
      new VehicleColor.ColorPair(66, 66),
      new VehicleColor.ColorPair(61, 61),
      new VehicleColor.ColorPair(53, 53),
      new VehicleColor.ColorPair(51, 51),
      new VehicleColor.ColorPair(47, 47),
      new VehicleColor.ColorPair(43, 43)));

    types.add(new VehicleType("Cars", "Stallion", 439,
      new VehicleColor.ColorPair(57, 8),
      new VehicleColor.ColorPair(8, 17),
      new VehicleColor.ColorPair(43, 21),
      new VehicleColor.ColorPair(54, 38),
      new VehicleColor.ColorPair(67, 8),
      new VehicleColor.ColorPair(37, 78),
      new VehicleColor.ColorPair(65, 79),
      new VehicleColor.ColorPair(25, 78)));

    types.add(new VehicleType("Cars", "Stratum", 561,
      new VehicleColor.ColorPair(57, 8),
      new VehicleColor.ColorPair(8, 17),
      new VehicleColor.ColorPair(43, 21),
      new VehicleColor.ColorPair(54, 38),
      new VehicleColor.ColorPair(67, 8),
      new VehicleColor.ColorPair(37, 78),
      new VehicleColor.ColorPair(65, 79),
      new VehicleColor.ColorPair(25, 78)));

    types.add(new VehicleType("Cars", "Stretch", 409, new VehicleColor.ColorPair(1, 1)));

    types.add(new VehicleType("Cars", "Sultan", 560,
      new VehicleColor.ColorPair(52, 39),
      new VehicleColor.ColorPair(9, 39),
      new VehicleColor.ColorPair(17, 1),
      new VehicleColor.ColorPair(21, 1),
      new VehicleColor.ColorPair(33, 0),
      new VehicleColor.ColorPair(37, 0),
      new VehicleColor.ColorPair(41, 29),
      new VehicleColor.ColorPair(56, 29)));

    types.add(new VehicleType("Cars", "Sunrise", 550,
      new VehicleColor.ColorPair(37, 37),
      new VehicleColor.ColorPair(42, 42),
      new VehicleColor.ColorPair(53, 53),
      new VehicleColor.ColorPair(62, 62),
      new VehicleColor.ColorPair(7, 7),
      new VehicleColor.ColorPair(10, 10),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(15, 15)));

    types.add(new VehicleType("Cars", "Super GT", 506,
      new VehicleColor.ColorPair(3, 3),
      new VehicleColor.ColorPair(6, 6),
      new VehicleColor.ColorPair(7, 7),
      new VehicleColor.ColorPair(52, 52),
      new VehicleColor.ColorPair(76, 76)));

    types.add(new VehicleType("Cars", "Sweeper", 574, new VehicleColor.ColorPair(26, 26)));

    types.add(new VehicleType("Cars", "Tahoma", 566,
      new VehicleColor.ColorPair(109, 1),
      new VehicleColor.ColorPair(30, 8),
      new VehicleColor.ColorPair(95, 1),
      new VehicleColor.ColorPair(84, 8),
      new VehicleColor.ColorPair(83, 1),
      new VehicleColor.ColorPair(72, 8),
      new VehicleColor.ColorPair(71, 1),
      new VehicleColor.ColorPair(52, 8)));

    types.add(new VehicleType("Cars", "Tampa", 549,
      new VehicleColor.ColorPair(74, 39),
      new VehicleColor.ColorPair(72, 39),
      new VehicleColor.ColorPair(75, 39),
      new VehicleColor.ColorPair(79, 39),
      new VehicleColor.ColorPair(83, 36),
      new VehicleColor.ColorPair(84, 36),
      new VehicleColor.ColorPair(89, 35),
      new VehicleColor.ColorPair(91, 35)));

    types.add(new VehicleType("Cars", "Tanker", 514,
      new VehicleColor.ColorPair(10, 1),
      new VehicleColor.ColorPair(25, 1),
      new VehicleColor.ColorPair(28, 1),
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(40, 1),
      new VehicleColor.ColorPair(54, 1),
      new VehicleColor.ColorPair(75, 1),
      new VehicleColor.ColorPair(113, 1)));

    types.add(new VehicleType("Cars", "Taxi", 420, new VehicleColor.ColorPair(6, 1)));

    types.add(new VehicleType("Cars", "Top Fun", 459,
      new VehicleColor.ColorPair(26, 26),
      new VehicleColor.ColorPair(28, 28),
      new VehicleColor.ColorPair(44, 44),
      new VehicleColor.ColorPair(51, 51),
      new VehicleColor.ColorPair(57, 57),
      new VehicleColor.ColorPair(72, 72),
      new VehicleColor.ColorPair(106, 106),
      new VehicleColor.ColorPair(112, 112)));

    types.add(new VehicleType("Cars", "Tornado", 576,
      new VehicleColor.ColorPair(67, 1),
      new VehicleColor.ColorPair(68, 96),
      new VehicleColor.ColorPair(72, 1),
      new VehicleColor.ColorPair(74, 8),
      new VehicleColor.ColorPair(75, 96),
      new VehicleColor.ColorPair(76, 8),
      new VehicleColor.ColorPair(79, 1),
      new VehicleColor.ColorPair(84, 96)));

    types.add(new VehicleType("Cars", "Towtruck", 525,
      new VehicleColor.ColorPair(1, 1),
      new VehicleColor.ColorPair(17, 20),
      new VehicleColor.ColorPair(18, 20),
      new VehicleColor.ColorPair(22, 30),
      new VehicleColor.ColorPair(36, 43),
      new VehicleColor.ColorPair(44, 51),
      new VehicleColor.ColorPair(52, 54)));

    types.add(new VehicleType("Cars", "Tractor", 531,
      new VehicleColor.ColorPair(2, 35),
      new VehicleColor.ColorPair(36, 2),
      new VehicleColor.ColorPair(51, 53),
      new VehicleColor.ColorPair(91, 2),
      new VehicleColor.ColorPair(11, 22),
      new VehicleColor.ColorPair(40, 35)));

    types.add(new VehicleType("Cars", "Trashmaster", 408, new VehicleColor.ColorPair(26, 26)));
    types.add(new VehicleType("Cars", "Tug", 583, new VehicleColor.ColorPair(1, 1)));

    types.add(new VehicleType("Cars", "Turismo", 451,
      new VehicleColor.ColorPair(123, 123),
      new VehicleColor.ColorPair(125, 125),
      new VehicleColor.ColorPair(36, 36),
      new VehicleColor.ColorPair(16, 16),
      new VehicleColor.ColorPair(18, 18),
      new VehicleColor.ColorPair(46, 46),
      new VehicleColor.ColorPair(61, 61),
      new VehicleColor.ColorPair(75, 75)));

    types.add(new VehicleType("Cars", "Uranus", 558,
      new VehicleColor.ColorPair(112, 1),
      new VehicleColor.ColorPair(116, 1),
      new VehicleColor.ColorPair(117, 1),
      new VehicleColor.ColorPair(24, 1),
      new VehicleColor.ColorPair(30, 1),
      new VehicleColor.ColorPair(35, 1),
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(40, 1)));

    types.add(new VehicleType("Cars", "Utility Van", 552,
      new VehicleColor.ColorPair(56, 56),
      new VehicleColor.ColorPair(49, 49),
      new VehicleColor.ColorPair(26, 124)));

    types.add(new VehicleType("Cars", "Vincent", 540,
      new VehicleColor.ColorPair(37, 37),
      new VehicleColor.ColorPair(42, 42),
      new VehicleColor.ColorPair(53, 53),
      new VehicleColor.ColorPair(62, 62),
      new VehicleColor.ColorPair(7, 7),
      new VehicleColor.ColorPair(10, 10),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(15, 15)));

    types.add(new VehicleType("Cars", "Virgo", 491,
      new VehicleColor.ColorPair(40, 65),
      new VehicleColor.ColorPair(71, 72),
      new VehicleColor.ColorPair(52, 66),
      new VehicleColor.ColorPair(64, 72),
      new VehicleColor.ColorPair(30, 72),
      new VehicleColor.ColorPair(60, 72)));

    types.add(new VehicleType("Cars", "Voodoo", 412,
      new VehicleColor.ColorPair(9, 1),
      new VehicleColor.ColorPair(10, 8),
      new VehicleColor.ColorPair(11, 1),
      new VehicleColor.ColorPair(25, 8),
      new VehicleColor.ColorPair(27, 1),
      new VehicleColor.ColorPair(29, 8),
      new VehicleColor.ColorPair(30, 1),
      new VehicleColor.ColorPair(37, 8)));

    types.add(new VehicleType("Cars", "Walton", 478,
      new VehicleColor.ColorPair(72, 1),
      new VehicleColor.ColorPair(66, 1),
      new VehicleColor.ColorPair(59, 1),
      new VehicleColor.ColorPair(45, 1),
      new VehicleColor.ColorPair(40, 1),
      new VehicleColor.ColorPair(39, 1),
      new VehicleColor.ColorPair(35, 1),
      new VehicleColor.ColorPair(20, 1)));

    types.add(new VehicleType("Cars", "Washing", 421,
      new VehicleColor.ColorPair(4, 1),
      new VehicleColor.ColorPair(13, 1),
      new VehicleColor.ColorPair(25, 1),
      new VehicleColor.ColorPair(30, 1),
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(40, 1),
      new VehicleColor.ColorPair(75, 1),
      new VehicleColor.ColorPair(95, 1)));

    types.add(new VehicleType("Cars", "Willard", 529,
      new VehicleColor.ColorPair(37, 37),
      new VehicleColor.ColorPair(42, 42),
      new VehicleColor.ColorPair(53, 53),
      new VehicleColor.ColorPair(62, 62),
      new VehicleColor.ColorPair(7, 7),
      new VehicleColor.ColorPair(10, 10),
      new VehicleColor.ColorPair(11, 11),
      new VehicleColor.ColorPair(15, 15)));

    types.add(new VehicleType("Cars", "Windsor", 555,
      new VehicleColor.ColorPair(51, 1),
      new VehicleColor.ColorPair(58, 1),
      new VehicleColor.ColorPair(60, 1),
      new VehicleColor.ColorPair(68, 1),
      new VehicleColor.ColorPair(2, 1),
      new VehicleColor.ColorPair(13, 1),
      new VehicleColor.ColorPair(22, 1),
      new VehicleColor.ColorPair(36, 1)));

    types.add(new VehicleType("Cars", "Yankee", 456,
      new VehicleColor.ColorPair(84, 63),
      new VehicleColor.ColorPair(91, 63),
      new VehicleColor.ColorPair(102, 65),
      new VehicleColor.ColorPair(105, 72),
      new VehicleColor.ColorPair(110, 92),
      new VehicleColor.ColorPair(121, 93),
      new VehicleColor.ColorPair(12, 95),
      new VehicleColor.ColorPair(23, 1)));

    types.add(new VehicleType("Cars", "Yosemite", 554,
      new VehicleColor.ColorPair(53, 32),
      new VehicleColor.ColorPair(15, 32),
      new VehicleColor.ColorPair(45, 32),
      new VehicleColor.ColorPair(34, 30),
      new VehicleColor.ColorPair(65, 32),
      new VehicleColor.ColorPair(14, 32),
      new VehicleColor.ColorPair(12, 32),
      new VehicleColor.ColorPair(43, 32)));

    types.add(new VehicleType("Cars", "ZR-350", 477,
      new VehicleColor.ColorPair(92, 1),
      new VehicleColor.ColorPair(94, 1),
      new VehicleColor.ColorPair(101, 1),
      new VehicleColor.ColorPair(121, 1),
      new VehicleColor.ColorPair(0, 1),
      new VehicleColor.ColorPair(22, 1),
      new VehicleColor.ColorPair(36, 1),
      new VehicleColor.ColorPair(75, 1)));

    types.add(new VehicleType("Trailers", "Airplane Stairs", 608, new VehicleColor.ColorPair(1, 1)));
    types.add(new VehicleType("Trailers", "Baggage A", 606));
    types.add(new VehicleType("Trailers", "Baggage B", 607));
    types.add(new VehicleType("Trailers", "Filled trailer", 450, new VehicleColor.ColorPair(1, 1)));
    types.add(new VehicleType("Trailers", "Plough", 610));
    types.add(new VehicleType("Trailers", "Street Clean", 611));
    types.add(new VehicleType("Trailers", "Trailer with random picture", 435, new VehicleColor.ColorPair(1, 1)));
    types.add(new VehicleType("Trailers", "Trailer with roof", 591, new VehicleColor.ColorPair(1, 1)));
    types.add(new VehicleType("Trailers", "Xoomer Trailer", 584, new VehicleColor.ColorPair(1, 1)));

    types.add(new VehicleType("Boats", "Coast Guard", 472,
      new VehicleColor.ColorPair(56, 15),
      new VehicleColor.ColorPair(56, 53)));

    types.add(new VehicleType("Boats", "Dinghy", 473,
      new VehicleColor.ColorPair(56, 15),
      new VehicleColor.ColorPair(56, 53)));

    types.add(new VehicleType("Boats", "Jetmax", 493, new VehicleColor.ColorPair(36, 13)));
    types.add(new VehicleType("Boats", "Launch", 595, new VehicleColor.ColorPair(112, 20)));
    types.add(new VehicleType("Boats", "Marquis", 484,
      new VehicleColor.ColorPair(12, 35),
      new VehicleColor.ColorPair(50, 32),
      new VehicleColor.ColorPair(40, 26),
      new VehicleColor.ColorPair(66, 36)));

    types.add(new VehicleType("Boats", "Predator", 430, new VehicleColor.ColorPair(46, 36)));
    types.add(new VehicleType("Boats", "Reefer", 453, new VehicleColor.ColorPair(56, 56)));
    types.add(new VehicleType("Boats", "Speeder", 452,
      new VehicleColor.ColorPair(1, 3),
      new VehicleColor.ColorPair(1, 5),
      new VehicleColor.ColorPair(1, 16),
      new VehicleColor.ColorPair(1, 22),
      new VehicleColor.ColorPair(1, 35),
      new VehicleColor.ColorPair(1, 44),
      new VehicleColor.ColorPair(1, 53),
      new VehicleColor.ColorPair(1, 57)));

    types.add(new VehicleType("Boats", "Squalo", 446));
    types.add(new VehicleType("Boats", "Tropic", 454, new VehicleColor.ColorPair(26, 26)));
    types.add(new VehicleType("Boats", "Vortex", 539,
      new VehicleColor.ColorPair(96, 67),
      new VehicleColor.ColorPair(86, 70),
      new VehicleColor.ColorPair(79, 74),
      new VehicleColor.ColorPair(70, 86),
      new VehicleColor.ColorPair(61, 98),
      new VehicleColor.ColorPair(75, 75),
      new VehicleColor.ColorPair(75, 91)));

    types.add(new VehicleType("Helicopters", "Cargobob", 548, new VehicleColor.ColorPair(1, 1)));
    types.add(new VehicleType("Helicopters", "Police Maverick", 497, new VehicleColor.ColorPair(0, 1)));
    types.add(new VehicleType("Helicopters", "Hunter", 425, new VehicleColor.ColorPair(43, 0)));
    types.add(new VehicleType("Helicopters", "Leviathan", 417));
    types.add(new VehicleType("Helicopters", "Maverick", 487,
      new VehicleColor.ColorPair(26, 14),
      new VehicleColor.ColorPair(29, 42),
      new VehicleColor.ColorPair(26, 57),
      new VehicleColor.ColorPair(54, 29),
      new VehicleColor.ColorPair(26, 3),
      new VehicleColor.ColorPair(3, 29),
      new VehicleColor.ColorPair(12, 39),
      new VehicleColor.ColorPair(74, 35)));

    types.add(new VehicleType("Helicopters", "News Chopper", 488,
      new VehicleColor.ColorPair(2, 26),
      new VehicleColor.ColorPair(2, 29)));

    types.add(new VehicleType("Helicopters", "Raindance", 563, new VehicleColor.ColorPair(1, 6)));
    types.add(new VehicleType("Helicopters", "Seasparrow", 447, new VehicleColor.ColorPair(75, 2)));
    types.add(new VehicleType("Helicopters", "Sparrow", 469, new VehicleColor.ColorPair(1, 3)));

    types.add(new VehicleType("Planes", "Andromada", 592,
      new VehicleColor.ColorPair(1, 1)));

    types.add(new VehicleType("Planes", "AT-400", 577,
      new VehicleColor.ColorPair(1, 3),
      new VehicleColor.ColorPair(8, 7),
      new VehicleColor.ColorPair(8, 10),
      new VehicleColor.ColorPair(8, 16),
      new VehicleColor.ColorPair(23, 31),
      new VehicleColor.ColorPair(40, 44)));

    types.add(new VehicleType("Planes", "Beagle", 511,
      new VehicleColor.ColorPair(3, 90),
      new VehicleColor.ColorPair(4, 90),
      new VehicleColor.ColorPair(7, 68),
      new VehicleColor.ColorPair(8, 66),
      new VehicleColor.ColorPair(12, 60),
      new VehicleColor.ColorPair(27, 97),
      new VehicleColor.ColorPair(34, 51),
      new VehicleColor.ColorPair(37, 51)));

    types.add(new VehicleType("Planes", "Cropduster", 512,
      new VehicleColor.ColorPair(17, 39),
      new VehicleColor.ColorPair(15, 123),
      new VehicleColor.ColorPair(32, 112),
      new VehicleColor.ColorPair(45, 88),
      new VehicleColor.ColorPair(52, 71),
      new VehicleColor.ColorPair(57, 67),
      new VehicleColor.ColorPair(61, 96),
      new VehicleColor.ColorPair(96, 96)));

    types.add(new VehicleType("Planes", "Dodo", 593,
      new VehicleColor.ColorPair(51, 1),
      new VehicleColor.ColorPair(58, 8),
      new VehicleColor.ColorPair(60, 1),
      new VehicleColor.ColorPair(68, 8),
      new VehicleColor.ColorPair(2, 1),
      new VehicleColor.ColorPair(13, 8),
      new VehicleColor.ColorPair(22, 1),
      new VehicleColor.ColorPair(38, 8)));

    types.add(new VehicleType("Planes", "Hydra", 520));
    types.add(new VehicleType("Planes", "Nevada", 553,
      new VehicleColor.ColorPair(38,9),
      new VehicleColor.ColorPair(55,23),
      new VehicleColor.ColorPair(61,74),
      new VehicleColor.ColorPair(71,87),
      new VehicleColor.ColorPair(91,87),
      new VehicleColor.ColorPair(98,114),
      new VehicleColor.ColorPair(102,119),
      new VehicleColor.ColorPair(111,3)));

    types.add(new VehicleType("Planes", "Rustler", 476,
      new VehicleColor.ColorPair(6,7),
      new VehicleColor.ColorPair(7,6),
      new VehicleColor.ColorPair(1,6),
      new VehicleColor.ColorPair(89,91),
      new VehicleColor.ColorPair(119,117),
      new VehicleColor.ColorPair(103,102),
      new VehicleColor.ColorPair(77,87),
      new VehicleColor.ColorPair(71,77)));

    types.add(new VehicleType("Planes", "Shamal", 519, new VehicleColor.ColorPair(1,1)));
    types.add(new VehicleType("Planes", "Skimmer", 460,
      new VehicleColor.ColorPair(1,3),
      new VehicleColor.ColorPair(1,9),
      new VehicleColor.ColorPair(1,18),
      new VehicleColor.ColorPair(1,30),
      new VehicleColor.ColorPair(17,23),
      new VehicleColor.ColorPair(46,23),
      new VehicleColor.ColorPair(46,32),
      new VehicleColor.ColorPair(57,34)));

    types.add(new VehicleType("Planes", "Stunt Plane", 513,
      new VehicleColor.ColorPair(38,51),
      new VehicleColor.ColorPair(21,36),
      new VehicleColor.ColorPair(21,34),
      new VehicleColor.ColorPair(30,34),
      new VehicleColor.ColorPair(54,34),
      new VehicleColor.ColorPair(55,20),
      new VehicleColor.ColorPair(48,18),
      new VehicleColor.ColorPair(51,6)));

    types.add(new VehicleType("RC", "RC Cam (drivable)", 594));
    types.add(new VehicleType("RC", "RC Bandit", 441,
      new VehicleColor.ColorPair(2, 96),
      new VehicleColor.ColorPair(79, 42),
      new VehicleColor.ColorPair(82, 54),
      new VehicleColor.ColorPair(67, 86),
      new VehicleColor.ColorPair(126, 96),
      new VehicleColor.ColorPair(70, 96),
      new VehicleColor.ColorPair(110, 54),
      new VehicleColor.ColorPair(67, 98)));

    types.add(new VehicleType("RC", "RC Baron", 464, new VehicleColor.ColorPair(14, 75)));
    types.add(new VehicleType("RC", "RC Goblin", 501, new VehicleColor.ColorPair(14, 75)));
    types.add(new VehicleType("RC", "RC Raider", 465, new VehicleColor.ColorPair(14, 75)));
    types.add(new VehicleType("RC", "RC Tiger", 564));

    types.add(new VehicleType("Tram", "Tram", 449, new VehicleColor.ColorPair(1, 74)));
    types.add(new VehicleType("Train", "Freight", 537, new VehicleColor.ColorPair(1, 1)));
    types.add(new VehicleType("Train", "Brown Streak", 538, new VehicleColor.ColorPair(1, 1)));

    types.add(new VehicleType("Waggons", "streakc", 570, new VehicleColor.ColorPair(1, 1)));
    types.add(new VehicleType("Waggons", "freiflat", 569));
    types.add(new VehicleType("Waggons", "freibox", 590));

    types = Collections.unmodifiableList(types);
  }


  public static List<VehicleType> getTypes()
  {
    return types;
  }

  public static VehicleType getType(int id)
  {
    Optional<VehicleType> first = types.stream().filter(type -> type.id == id).findFirst();
    return first.orElse(null);
  }

}
