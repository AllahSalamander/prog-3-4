package Constants;

public enum Vocations {
    SAILOR("простым матросом"),
    SEAFARER("моряком"),
    NAVIGATOR("штурманом"),
    MATE("помощником капитана"),
    CAPTAIN("капитаном"),
    BARIN("запровским барином");

    private final String name;
    Vocations(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}