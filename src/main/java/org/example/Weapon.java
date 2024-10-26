package org.example;

public enum Weapon {
    SWORD(10,1);
    private int damage;
    private double attackSpeed;

    Weapon (int damage,double attackSpeed){
        this.attackSpeed = attackSpeed;
        this.damage = damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public int getDamage() {
        return damage;
    }
}
