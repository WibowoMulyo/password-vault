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

public class Label implements Component{
  public String text;
  private int width; 

  public Label(String text, int width){
    this.width = width;
    this.text = text;
  }

  @Override
  public void draw(){
    int length = this.width - this.text.length() - 2; 
    System.out.print("|  " + this.text);
    for(int i = 0; i < length; i++) {
      System.out.print(" ");
    }
    System.out.println("|");
  }
}

