package Constants;

public enum vocations{
    SAILOR("простым матросом"),
    SEAFARER("моряком"),
    NAVIGATOR("штурманом"),
    MATE("помощником капитана"),
    CAPTAIN("капитаном"),
    BARIN("запровским барином");

    private String name;
    vocations(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}