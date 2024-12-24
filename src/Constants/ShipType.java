package Constants;

public enum ShipType {
    SHIP("корабль"),
    VESSEL("судно"),
    FIGHTER("вражеский корабль"),
    PIRATE("корабль пиратов");

    private final String name;
    ShipType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
