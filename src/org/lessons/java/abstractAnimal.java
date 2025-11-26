package org.lessons.java;

public abstract class abstractAnimal {
  protected String name;
  protected int height;

  public abstractAnimal(String newName, int newHeight){
    this.name = newName;
    this.height = newHeight;
  }

  public void dormi(){
    System.out.println("Zzz");
  }
}
