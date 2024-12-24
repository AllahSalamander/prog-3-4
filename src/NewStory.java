import Constants.Force;
import Constants.Places;
import Constants.ShipType;
import Constants.Vocations;
import Entities.EvilPower;
import Objects.Dress;
import Objects.newShip;
import Objects.Wallet;
import Persons.Captain;
import Persons.Human;
import Persons.Sailor;

import java.util.ArrayList;
import java.util.Random;

public class NewStory {
    public void tellStory (EvilPower evilPower, Human human, Random random) {
        evilPower.setLocation(Places.HOME);
        System.out.println(evilPower.tell());
        System.out.println(evilPower.induce());
        System.out.println(evilPower.engage());
        System.out.println(human.leave());
        evilPower.setForceName(Force.THIS);
        System.out.println(evilPower.push());

        newShip newShip = new newShip(ShipType.SHIP, Places.GUINEA);

        Captain captain = new Captain("Джек Воробей", 10000);
        captain.setLocation(Places.GUINEA);
        System.out.println(captain.newTeam());
        ArrayList<Sailor> sailors = new ArrayList<>();
        for (int i = 0; i < random.nextInt(1,11); i++ ) {
            sailors.add(new Sailor("Матрос №" + (i + 1), random.nextInt(1000)));
        }

        int totalLucky = Sailor.getTotalLucky(sailors);
        int shipSize = sailors.size();

        System.out.println(captain.getTeam(shipSize));
        
        if (shipSize > 4) {
            human.setLocation(Places.GUINEA);
            System.out.println(human.goToShip());
            newShip.setType(ShipType.SHIP);
            System.out.println(newShip.go());
            System.out.println(captain.shipwreck(totalLucky, shipSize));
            if (totalLucky >= 500 * shipSize) {
                human.setVocation(Vocations.SAILOR);
                System.out.println(human.goToWork());
                System.out.println(human.chose());
                Wallet wallet = new Wallet(human.getValuable());
                Dress dress = new Dress(human.getValuable());
                Human.printStatus(wallet, dress);
                human.setLocation(Places.VESSEL);
                if (human.getValuable() >= 500) {
                    human.setVocation(Vocations.BARIN);
                } else {
                    human.setVocation(Vocations.CAPTAIN);
                }
                System.out.println(human.currentPosition());
            } else {
                System.out.println(newShip.sink());
            }
        } else {
            System.out.println(newShip.notEnoughTeamSize());
            System.out.println(human.goHome());
        }
    }
}
