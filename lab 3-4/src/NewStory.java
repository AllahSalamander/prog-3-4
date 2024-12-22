import Constants.force;
import Constants.places;
import Constants.vocations;
import Entities.EvilPower;
import Objects.Dress;
import Objects.Wallet;
import Persons.Human;

public class NewStory {
    public void tellStory (EvilPower evilPower, Human human, Wallet wallet, Dress dress) {
        evilPower.setLocation(places.HOME);
        System.out.println(evilPower.tell());
        System.out.println(evilPower.induce());
        System.out.println(evilPower.engage());
        System.out.println(human.leave());
        evilPower.setForceName(force.THIS);
        System.out.println(evilPower.push());
        human.setLocation(places.GUINEA);
        System.out.println(human.goToShip());
        human.setVocation(vocations.SAILOR);
        System.out.println(human.goToWork());
        System.out.println(human.chose());
        Human.printStatus(wallet, dress);
        human.setLocation(places.VESSEL);
        if (human.getMoney() >= 500) {
            human.setVocation(vocations.BARIN);
        } else {
            human.setVocation(vocations.CAPTAIN);
        }
        System.out.println(human.currentPosition());
    }
}
