package Entities;

import AbstractClassses.Essence;
import Constants.force;
import Interfaces.Entity;
import Interfaces.Interactive;

public class EvilPower extends Essence implements Interactive {
    public EvilPower(force force) {
        super(force);
    }

    public String induce() {
        return this.getForceName() + " побудила меня бежать из " + this.getLocation();
    }

    public String engage() {
        return this.getForceName() + " вовлекла меня в нелепую затею составить состояние";
    }

    public String push() {
        return this.getForceName() + " толкнула меня на несчастное предприятие";
    }

    @Override
    public String interact(Entity entity) {
        return this.getForceName() + " interacts with " + entity.tell();
    }

    @Override
    public String tell() {
        return "Та самая " + this.getForceName();
    }
}
