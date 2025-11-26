package org.lessons.java;

public class Passerotto extends abstractAnimal{
  protected boolean hasNest;

  // getter
  public boolean getHasNest(){
    return this.hasNest;
  }

  // setter
  public void setHasNest(boolean newHasNest){
    this.hasNest = newHasNest;
  }

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
