/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PV.evolution.cli.output;

/**
 *
 * @author Wibowo
 */

public class Label {
  public String text;
  private int width; 

  public Label(String text, int width){
    this.width = width;
    this.text = text;
  }

  public void draw(){
    int length = this.width - this.text.length() - 2; 
    System.out.print("|  " + this.text);
    for(int i = 0; i < length; i++) {
      System.out.print(" ");
    }
    System.out.println("|");
  }
}

