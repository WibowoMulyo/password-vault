/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PV.evolution.cli.output;

import PV.evolution.cli.Component;

/**
 *
 * @author Wibowo
 */

public class Space implements Component{
  private int width;

  public Space(int width){
    this.width = width;
  }
  
  @Override
  public void draw(){
    System.out.print("|");
    for(int i = 0; i < this.width; i++){
      System.out.print(" ");
    }
    System.out.println("|");
  }
  
}
