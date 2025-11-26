package org.lessons.java;

public abstract class abstractAnimal {
  protected String name;
  protected int height;

  // getter
  public String getName(){
    return this.name;
  }

  public int getHeight(){
    return this.height;
  }

  // setter
  public void setHeight(int newHeight){
    this.height = newHeight;
  }

  public abstractAnimal(String newName, int newHeight){
    this.name = newName;
    this.height = newHeight;
  }

  public void dormi(){
    System.out.println("Zzz");
  }

  public abstract void verso();
  public abstract void mangia();
}
