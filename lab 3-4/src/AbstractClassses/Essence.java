package AbstractClassses;

import Constants.force;
import Constants.places;
import Interfaces.Entity;

public abstract class Essence implements Entity {
    private force forceName;
    private places location;

    public Essence(force forceName) {
        this.forceName = forceName;
    }

    public String getForceName() {
        return forceName.getName();
    }

    public void setForceName(force forceName) {
        this.forceName = forceName;
    }

    public String getLocation() {
        return location.getName();
    }

    public void setLocation(places location) {
        this.location = location;
    }

    @Override
    public abstract String tell();

}