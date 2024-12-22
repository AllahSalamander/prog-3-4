import Constants.force;
import Entities.EvilPower;
import Exceptions.InvalidArgumentException;
import Exceptions.InvalidTypeException;
import Objects.Dress;
import Objects.Wallet;
import Persons.Human;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InvalidArgumentException, InvalidTypeException {
        Random random = new Random();

        ArrayList<Human> people = new ArrayList<>();
        people.add(new Human("Я", random.nextInt(1000)));
        people.add(new Human("Пётр", 300));
        people.add(new Human("Анна", 800));

        for (Human person : people) {
            System.out.println(person.tell());
        }

        System.out.println("");

        Human human = people.get(0);

        EvilPower evilPower = new EvilPower(force.EVIL);
        Wallet wallet = new Wallet(human.getMoney());
        Dress dress = new Dress(human.getMoney());

        NewStory newStory = new NewStory();
        newStory.tellStory(evilPower, human, wallet, dress);
    }
}