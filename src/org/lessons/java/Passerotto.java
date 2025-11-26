package org.lessons.java;

public class Passerotto extends abstractAnimal{
  protected boolean hasNest;

  public Passerotto(String name, int height, boolean newHasNest){
    super(name, height);
    this.hasNest = newHasNest;
  }

  @Override
  public void verso() {
    System.out.println("Chip chip!");
  }

  @Override
  public void mangia() {
    System.out.println("Mangia vermi");
  }

}
