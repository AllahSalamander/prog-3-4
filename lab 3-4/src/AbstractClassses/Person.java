package AbstractClassses;
import Constants.places;
import Constants.vocations;
import Exceptions.InvalidArgumentException;
import Interfaces.Entity;

import java.util.Objects;

public abstract class Person implements Entity {
    private final String name;
    private final int money; // Деньги на конец путешествия
    private places location;
    private vocations vocation;

    public Person(String name, int money) {
        if (name == null || name.isEmpty()) {
            throw new InvalidArgumentException();
        }
        this.name = name;
        this.money = money;
    }
    public void walksTo(places placesName){
        location = placesName;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setLocation(places location) {
        this.location = location;
    }

    public String getLocation() {
        return location.getName();
    }

    public void setVocation(vocations vocation) {
        this.vocation = vocation;
    }

    public String getVocation() {
        return vocation.getName();
    }


    @Override
    public abstract String tell();

    @Override
    public String toString() {
        return "Name: " + name + ", Money: " + money;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person person) {
            return Objects.equals(person.getName(), this.getName()) && person.getMoney() == this.getMoney();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money);
    }

}