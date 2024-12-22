package Constants;

public enum force {
    EVIL("Злая сила"),
    THIS("Эта же сила"),
    THATONE("сила");

    private final String name;

    force(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}