package Constants;

public enum places {
    HOME("родительский дом"),
    GUINEA("Гвинея"),
    SHIP("корабль"),
    VESSEL("судно");
    
    private final String name;
    places(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}