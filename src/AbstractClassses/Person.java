package AbstractClassses;
import Constants.Places;
import Constants.Vocations;
import Exceptions.InvalidArgumentException;
import Interfaces.Entity;

import java.util.Objects;

public abstract class Person implements Entity {
    private final String name;
    private final int valuable; // Деньги на конец путешествия
    private Places location;
    private Vocations vocation;

    public Person(String name, int valuable) {
        if (name == null || name.isEmpty()) {
            throw new InvalidArgumentException();
        }
        this.name = name;
        this.valuable = valuable;
    }
    public void walksTo(Places placesName){
        location = placesName;
    }

    public int getValuable() {
        return valuable;
    }

    public String getName() {
        return name;
    }

    public void setLocation(Places location) {
        this.location = location;
    }

    public String getLocation() {
        return location.getName();
    }

    public void setVocation(Vocations vocation) {
        this.vocation = vocation;
    }

    public String getVocation() {
        return vocation.getName();
    }


    @Override
    public abstract String tell();

    @Override
    public String toString() {
        return "Name: " + name + ", Money: " + valuable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person person) {
            return Objects.equals(person.getName(), this.getName()) && person.getValuable() == this.getValuable();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, valuable);
    }

}