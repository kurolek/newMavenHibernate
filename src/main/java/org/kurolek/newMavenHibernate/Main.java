package org.kurolek.newMavenHibernate;

import org.hibernate.SessionFactory;
import org.kurolek.newMavenHibernate.entity.Weapon;
import org.kurolek.newMavenHibernate.entity.WeaponDetails;
import org.kurolek.newMavenHibernate.entity.WeaponType;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory =
                HibernateFactory.getSessionFactory();
        EntityManager entityManager = sessionFactory.createEntityManager();


        WeaponType weaponType = new WeaponType();
        weaponType.setName("Sword");
        entityManager.getTransaction().begin();
        entityManager.persist(weaponType);
        entityManager.getTransaction().commit();

        Weapon weapon = new Weapon();
        weapon.setName("Sword of power");
        weapon.setWeaponType(weaponType);

        WeaponDetails weaponDetails= new WeaponDetails();
        weaponDetails.setAttackSpeedMult(1.0);
        weaponDetails.setCritMult(1.1);
        weaponDetails.setDamage(27);
        weaponDetails.setWeight(13);


        weapon.setWeaponDetails(weaponDetails);
        weaponDetails.setWeapon(weapon);

        entityManager.getTransaction().begin();
        entityManager.persist(weapon);
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        entityManager.persist(weaponDetails);
        entityManager.getTransaction().commit();





        List<Weapon> weaponList = new ArrayList<>();

        for (int i = 0; i<3; i++){
            weaponList.add(new Weapon());
            weaponList.get(i).setWeaponType(weaponType);
            weaponList.get(i).setName("Sword of dark +" + i);
            weaponList.get(i).setWeaponDetails(new WeaponDetails());
            weaponList.get(i).getWeaponDetails().setWeapon(weaponList.get(i));
            weaponList.get(i).getWeaponDetails().setWeight(12);
            weaponList.get(i).getWeaponDetails().setDamage(31 + ((i) * 3));
            weaponList.get(i).getWeaponDetails().setCritMult(1.15 + ((i) * 0.03));
            weaponList.get(i).getWeaponDetails().setAttackSpeedMult(0.95 + ((i) * 0.02));

            entityManager.getTransaction().begin();
            entityManager.persist(weaponList.get(i).getWeaponDetails());
            entityManager.persist(weaponList.get(i));
            entityManager.getTransaction().commit();
        }

        weaponList.add(weapon);

        List<Weapon> weaponListFromDb = new ArrayList<>();

        for(long i = 0; i<weaponList.size();i++){
            weaponListFromDb.add(entityManager.find(Weapon.class, i+1));
            System.out.println(weaponListFromDb.get((int) i).toString());
        }





    }

}
