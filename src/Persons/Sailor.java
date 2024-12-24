package Persons;

import AbstractClassses.Person;

import java.util.ArrayList;
import java.util.Collection;

public class Sailor extends Person {

    public Sailor(String name, int lucky) {
        super(name, lucky);
    }

    public static <team extends Person> int getTotalLucky(Collection<team> entities) {
        int totalLucky = 0;
        for (team entity : entities) {
            if (entity != null) {
                totalLucky += entity.getValuable();
            }
        }
        return totalLucky;
    }

    protected static String danger() {
        return "Капитан, справа по курсу вражеский корабль!";
    }

    @Override
    public String tell() {
        return "Я - " + this.getName() + ", моя удача составляет: " + this.getValuable();
    }
}
