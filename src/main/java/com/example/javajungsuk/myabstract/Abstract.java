package com.example.javajungsuk.myabstract;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class House{
  private String roof = "House roof";
  private String wall = "House wall";
  private Door door;


  void openDoor() {
    System.out.println("Basic door opened");
  }

  void closeDoor() {
    System.out.println("Basic door closed");
  }
}

interface Door {
  void openDoor();

  void closeDoor();
}

class BasicHouse extends House {

}

class MyHouse extends House {
  String roof = "";
  @Override
  public void setRoof(String roof) {
    this.roof = roof;
  }

  @Override
  public String getRoof() {
    return roof;
  }

  @Override
  void openDoor() {
    getDoor().openDoor();
  }

  @Override
  void closeDoor() {
    getDoor().closeDoor();
  }
}

class MyDoor implements Door {

  @Override
  public void openDoor() {
    System.out.println("My Door Opened");
  }

  @Override
  public void closeDoor() {
    System.out.println("My Door Closed");
  }
}

public class Abstract {
  public static void main(String[] args) {
    House basicHouse = new BasicHouse();
    basicHouse.openDoor();
    basicHouse.closeDoor();
    System.out.println("basicHouse.getRoof() = " + basicHouse.getRoof());


    House myHouse = new MyHouse();
    myHouse.setDoor(new MyDoor());
    myHouse.openDoor();
    myHouse.closeDoor();
    myHouse.setRoof("myHouse");
    System.out.println("myHouse.getWall() = " + myHouse.getWall());
    System.out.println("myHouse.getRoof() = " + myHouse.getRoof());
  }
}
