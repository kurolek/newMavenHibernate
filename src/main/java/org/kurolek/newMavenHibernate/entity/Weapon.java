package org.kurolek.newMavenHibernate.entity;

public class Weapon {
    private long id;
    private String name;
    private WeaponType weaponType;
    private WeaponDetails weaponDetails;

    public Weapon() {
    }

    public Weapon(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponDetails getWeaponDetails() {
        return weaponDetails;
    }

    public void setWeaponDetails(WeaponDetails weaponDetails) {
        this.weaponDetails = weaponDetails;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weaponType=" + weaponType +
                ", weaponDetails=" + weaponDetails +
                '}';
    }
}
