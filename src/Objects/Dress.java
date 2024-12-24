package Objects;

import Interfaces.Status;

public record Dress(int money) implements Status {
    @Override
    public String getStatus() {
        if (money >= 500) {
            return "На плечах было приличное платье";
        } else if (0 <= money) {
            return "На мне было только полотенце";
        }
        return "На мне не было одежды";
    }
}
