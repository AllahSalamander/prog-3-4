package AbstractClassses;

import Constants.Force;
import Constants.Places;
import Interfaces.Entity;

public abstract class Essence implements Entity {
    private Force forceName;
    private Places location;

    public Essence(Force forceName) {
        this.forceName = forceName;
    }

    public String getForceName() {
        return forceName.getName();
    }

    public void setForceName(Force forceName) {
        this.forceName = forceName;
    }

    public String getLocation() {
        return location.getName();
    }

    public void setLocation(Places location) {
        this.location = location;
    }

    @Override
    public abstract String tell();

}