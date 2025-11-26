package org.lessons.java;

public class Cane extends abstractAnimal{
  protected boolean hasPedigree;

  // getter
  public boolean getHasPedigree(){
    return this.hasPedigree;
  }

  // setter
  public void setHasPedigree(boolean newHasPedigree){
    this.hasPedigree = newHasPedigree;
  }

  public Cane(String name, int height, boolean newHasPedigree){
    super(name, height);
    this.hasPedigree = newHasPedigree;
  }

  @Override
  public void verso() {
    System.out.println("Bau bau!");
  }

  @Override
  public void mangia() {
    System.out.println("Mangia croccantini");
  }

}
