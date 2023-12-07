package com.avara.creational.prototype;

public class PrototypeMain {
  public static void main(String[] args) {

    Weapon gun = new Gun();
    gun.setName("PowerfulGun");
    Weapon sword = new Sword();
    sword.setName("PowerfulSword");

    System.out.println("Gun name: " + gun.getName());
    System.out.println("Address: " + gun);
    System.out.println("Sword name: " + sword.getName());
    System.out.println("Address: " +sword);

    Weapon cloneGun = gun.clone("CloneGun");
    Weapon cloneSword = sword.clone("CloneSword");

    System.out.println("Clone Gun name: " + cloneGun.getName());
    System.out.println("Address: " + cloneGun);
    System.out.println("Clone Sword name: " + cloneSword.getName());
    System.out.println("Address: " + cloneSword);

  }
}
