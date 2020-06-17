package org.kurolek.newMavenHibernate.entity;

import java.util.HashSet;
import java.util.Set;

public class WeaponType {
    private long id;
    private String name;
    private Set<Weapon> weapons = new HashSet<>(0);

    public WeaponType(Long id) {
        this.id = id;
    }

    public WeaponType() {
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

    public Set<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(Set<Weapon> weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "WeaponType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
