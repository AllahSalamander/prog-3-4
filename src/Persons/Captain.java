package Persons;

import AbstractClassses.Person;

public class Captain extends Person {

    public Captain(String name, int lucky) {
        super(name, lucky);
    }

    public String newTeam() {
        return this.getName() + " набирает к себе в команду удачливых матросов! (нужно хотя бы 5)";
    }

    public String getTeam(int teamSize) {
        if (teamSize >= 5) {
            return this.getName() + " набрал необходимое количество членов экипажа, корабль отправляется в " + this.getLocation();
        } else {
            return "Необходимое количество членов экипажа не набрано";
        }
    }

    public String shipwreck(int totalLucky, int crewSize) {
        if (totalLucky > crewSize * 500) {
            return "Хорошие новости, удача на корабле превысила " + (crewSize * 500 + this.getValuable()) + "!\nКорабль со всеми пассажирами успешно добирается до пункта назначения";
        } else {
            return Sailor.danger() + "\nКоманда капитана оказалась недостаточно удачливой...\nНа корабль напали пираты и потопили его";
        }
    }

    @Override
    public String tell() {
        return "Arrr! I'm Captain, my lucky is more than 10000000000000";
    }
}
