package Constants;

public enum Places {
    HOME("родительский дом"),
    GUINEA("Гвинея"),
    SHIP("корабль"),
    VESSEL("судно");
    
    private final String name;
    Places(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}