/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PV.evolution.cli.output;

/**
 *
 * @author Wibowo
 */

public class Space {
  private int width;

  public Space(int width){
    this.width = width;
  }
  
  public void draw(){
    System.out.print("|");
    for(int i = 0; i < this.width; i++){
      System.out.print(" ");
    }
    System.out.println("|");
  }
  
}
