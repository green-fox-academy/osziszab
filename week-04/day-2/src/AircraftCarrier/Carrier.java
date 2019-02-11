package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    List<Aircraft> carrier;
    int storedAmmo;
    int HP;

    public Carrier(List<Aircraft> aircrafts, int storedAmmo, int HP) {
        this.carrier = carrier;
        this.storedAmmo = storedAmmo;
        this.HP = HP;
    }

    public void addAircraft(Aircraft aircraft) {
        carrier.add(aircraft);
    }

    public void fill() {
        for (Aircraft aircraft : carrier) {
            if (aircraft.isPriority()) {
                this.storedAmmo = aircraft.refill(this.storedAmmo);
            }
        }
        if (this.storedAmmo < 0) {
            throw new IllegalArgumentException("The aircraft has no ammo.");
        }
        for (Aircraft aircraft : this.carrier) {
            if (!aircraft.isPriority()) {
                this.storedAmmo = aircraft.refill(this.storedAmmo);
            }
        }
    }

    public void fight(Carrier anotherCarrier) {
        for (Aircraft aircraft : this.carrier) {
            anotherCarrier.HP -= aircraft.fight();
        }
        if (anotherCarrier.HP < 0) {
            anotherCarrier.HP = 0;
        }
    }

    public int calculateTotalDamage() {
        int damage = 0;
        for (Aircraft aircraft : this.carrier) {
            damage += aircraft.fight();
        }
        return damage;
    }

    public void getStatus() {
        if (this.HP == 0) {
            System.out.println("It's dead Jim :(");
        }
        String status = "HP: " + this.HP + ", Aircraft count: " + this.carrier.size() + ", Ammo Storage: " + this.storedAmmo + ", Total damage: " + this.calculateTotalDamage() + System.lineSeparator() + "Aircrafts: " + System.lineSeparator();
        System.out.println(status);
        for (Aircraft aircraft : this.carrier) {
            System.out.println(aircraft.getStatus());
        }
    }
}
