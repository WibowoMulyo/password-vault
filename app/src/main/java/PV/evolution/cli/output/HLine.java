/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PV.evolution.cli.output;

/**
 *
 * @author Wibowo
 */
import PV.evolution.cli.Component;

public class HLine implements Component{
  private int width;

  public HLine(int width){
    this.width = width;
  }
  
  @Override
  public void draw(){
    System.out.print("+");
    for(int i = 0; i < this.width; i++){
      System.out.print("=");
    }
    System.out.println("+");
  }
}

