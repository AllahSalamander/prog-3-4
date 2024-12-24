import Constants.Force;
import Entities.EvilPower;
import Exceptions.InvalidArgumentException;
import Exceptions.InvalidTypeException;
import Persons.Human;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InvalidArgumentException, InvalidTypeException {
        Random random = new Random();

        Human human = new Human("Я", random.nextInt(1000));

        EvilPower evilPower = new EvilPower(Force.EVIL);

        NewStory newStory = new NewStory();
        newStory.tellStory(evilPower, human, random);
    }
}