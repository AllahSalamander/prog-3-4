package Objects;

import Interfaces.Status;

public record Wallet(int money) implements Status {
    @Override
    public String getStatus() {
        if (money >= 500) {
            return "В кошельке водились деньги";
        } else if (money >= 0) {
            return "Кошелек был дырявый";
        }
        return "У меня кредит";
    }
}
