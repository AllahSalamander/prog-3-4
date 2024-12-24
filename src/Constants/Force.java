package Constants;

public enum Force {
    EVIL("Злая сила"),
    THIS("Эта же сила"),
    THATONE("сила");

    private final String name;

    Force(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}