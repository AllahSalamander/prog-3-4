package Objects;

import Constants.Places;
import Constants.ShipType;
import Interfaces.Ship;

public class newShip implements Ship {
    private ShipType type;
    private Places place;

    public newShip(ShipType type , Places place) {
        this.type = type;
        this.place = place;
    }

    @Override
    public String sink() {
        return this.getType() + " терпит крушение у берегов " + this.getPlace();
    }

    @Override
    public String notEnoughTeamSize() {
        return ShipType.SHIP.getName() + " остаётся в порту";
    }

    @Override
    public String go() {
        return this.getType() + " собирается отправиться в " + this.getPlace();
    }

    public ShipType getType() {
        return type;
    }

    public Places getPlace() {
        return place;
    }

    public void setType(ShipType newType) {
        this.type = newType;
    }

    public void setPlace(Places newPlace) {
        this.place = newPlace;
    }
}
