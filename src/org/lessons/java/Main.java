package org.lessons.java;

public class Main {
  public static void main(String[] args) {
  Cane cane1 = new Cane("Charlie", 110, false);
  Passerotto passerotto1 = new Passerotto("Ugo", 10, true);
  Aquila aquila1 = new Aquila("Rah", 70, 230);
  Delfino delfino1 = new Delfino("Birillo", 180, 55);


  System.out.println("Cane");
  cane1.dormi();
  cane1.mangia();
  cane1.verso();
  
  System.out.println("Aquila");
  aquila1.dormi();
  aquila1.mangia();
  aquila1.verso();
  
  System.out.println("Passerotto");
  passerotto1.dormi();
  passerotto1.mangia();
  passerotto1.verso();
  
  System.out.println("Delfino");
  delfino1.dormi();
  delfino1.mangia();
  delfino1.verso();

  System.out.println("-------------------");

  faivolare(aquila1);
  faivolare(passerotto1);
  fainuotare(delfino1);

  }

  static void faivolare(Ivolante animaleVolante){
    animaleVolante.vola();
  }

  static void fainuotare(Inuotante animaleNuotante){
    animaleNuotante.nuota();
  }
}
