package org.kurolek.newMavenHibernate.entity;

public class WeaponDetails {

    private long id;
    private int damage;
    private double weight;
    //critical hit chance (critMult * base chance)
    private double critMult;
    //attack speed (attackSpeedMult * attack speed)
    private double attackSpeedMult;
    private Weapon weapon;


    public WeaponDetails(long id) {
        this.id = id;
    }

    public WeaponDetails() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCritMult() {
        return critMult;
    }

    public void setCritMult(double critMult) {
        this.critMult = critMult;
    }

    public double getAttackSpeedMult() {
        return attackSpeedMult;
    }

    public void setAttackSpeedMult(double attackSpeedMult) {
        this.attackSpeedMult = attackSpeedMult;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "WeaponDetails{" +
                "id=" + id +
                ", damage=" + damage +
                ", weight=" + weight +
                ", critMult=" + critMult +
                ", attackSpeedMult=" + attackSpeedMult +
                '}';
    }
}
