package org.lessons.java;

public class Delfino extends abstractAnimal{
  protected int registeredSpeed;

  public Delfino(String name, int height, int newRegisterdSpeed){
    super(name, height);
    this.registeredSpeed = newRegisterdSpeed;
  }

  @Override
  public void verso() {
    System.out.println("Gihgihgihgihgihgih gih gih gih!");
  }

  @Override
  public void mangia() {
    System.out.println("Mangia calamari");
  }

}
