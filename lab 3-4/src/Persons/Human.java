package Persons;

import AbstractClassses.Person;
import Entities.EvilPower;
import Interfaces.Creature;
import Objects.Dress;
import Objects.Wallet;

public class Human extends Person implements Creature {
    public Human(String name, int money) {
        super(name, money);
    }

    public String leave() {
        return this.getName() + " остался глух к добрым советам, увещаниям и запрету отца";
    }

    public String goToShip() {
        return this.getName() + " сел на корабль, отправлявшийся в " + this.getLocation();
    }

    public static void printStatus(Wallet wallet, Dress dress) {
        System.out.println(wallet.getStatus());
        System.out.println(dress.getStatus());
    }

    @Override
    public String goHome() {
        return this.getName() + " решил, что так больше не может продолжаться и вернулся домой";
    }

    @Override
    public String goToWork() {
        if (this.getMoney() >= 500) {
            return this.getName() + " не стал " + this.getVocation();
        }
        return this.getName() + " стал " + this.getVocation();
    }

    @Override
    public String chose() {
        if (this.getMoney() >= 500) {
            return this.getName() + " выбрал худший путь";
        }
        return this.getName() + " выбрал быть счастливым";
    }

    @Override
    public String currentPosition() {
        if (this.getMoney() >= 500) {
            return this.getName() + " являлся на " + this.getLocation() + " " + this.getVocation() + "\n" + this.getName() + " ничего не делал и ничему не научился";
        }
        return this.getName() + " получил опыт на работе и стал опытным " + this.getVocation();
    }

    @Override
    public String tell() {
        return "Привет, меня зовут " + this.getName() + ", у меня на балансе: " + this.getMoney();
    }

}