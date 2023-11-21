package subclasses;

import enums.LampType;

public class Lamp {
    private LampType lampType;
    private boolean battery;
    private int globRating;

    public Lamp(LampType lampType, boolean battery, int globRating) {
        this.lampType = lampType;
        this.battery = battery;
        this.globRating = globRating;
    }

    public LampType getLampType() {
        return lampType;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "lampType=" + lampType +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
