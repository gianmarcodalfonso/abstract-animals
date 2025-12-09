package org.lessons.java;

public class Aquila extends abstractAnimal implements Ivolante{
  protected int wingWidth;

  // getter
  public int getWingWidth(){
    return this.wingWidth;
  }

  // setter
  public void setWingWidth(int newWingWidth){
    this.wingWidth = newWingWidth;
  }

  public Aquila(String name, int height, int newWingWidth){
    super(name, height);
    this.wingWidth = newWingWidth;
  }

  @Override
  public void verso() {
    System.out.println("Suono acuto");
  }

  @Override
  public void mangia() {
    System.out.println("Mangia lepri");
  }

}
