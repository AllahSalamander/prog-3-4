package Constants;

public enum items {
    DRESS("приличное платье"),
    PURSE("кошельке"),
    MONEY("деньги");

    private final String name;
    items(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}