package AircraftCarrier;

import java.sql.SQLOutput;

public  class Aircraft {

    int maxAmmo;
    int baseDamage;
    int currentAmmo;
    int allDamage = fight();

    protected Aircraft (int maxAmmo, int baseDamage, int currentAmmo){
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.currentAmmo = currentAmmo;
    }

    protected int fight (){
        int damage = currentAmmo*baseDamage;
        return damage;
    }

    protected int refill (int givenAmmo){
        if(givenAmmo > maxAmmo){
            givenAmmo -= maxAmmo;
            currentAmmo = maxAmmo;
            return givenAmmo;
        }else{
            currentAmmo = givenAmmo;
            return 0;
        }
    }

    protected void getType (){
        System.out.println(this.getClass().getSimpleName());
    }

    protected String getStatus (){
        String status = "Type : " + this.getClass().getSimpleName() + "," + " Ammo : " + currentAmmo + "," + " Base damage : " + baseDamage + "," + " All damage : " + allDamage);
        return status;
    }

    protected boolean isPriority (){
        return getClass().getSimpleName().equals("F35");
    }
}

