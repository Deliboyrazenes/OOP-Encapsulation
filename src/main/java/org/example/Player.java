package org.example;

import org.apache.http.impl.client.CloseableHttpClient;

public class Player {
    private  String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        if (healthPercentage>100){
            healthPercentage=100;
        } else if (healthPercentage<0) {
            healthPercentage=0;
        }
        this.name = name;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;

    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void loseHealth(int damage){
        healthPercentage = healthPercentage- damage;
        if(healthPercentage<0){
            healthPercentage=0;
            System.out.println(name + " Player has been knocked out of game");
        }

    }

    public void restoreHealth(int healthPotion){
        healthPercentage = healthPercentage + healthPotion;
        if (healthPercentage>100){
            healthPercentage = 100;
        }
    }


}
