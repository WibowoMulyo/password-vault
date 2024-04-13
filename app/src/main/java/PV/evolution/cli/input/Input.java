/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PV.evolution.cli.input;

/**
 *
 * @author Wibowo
 */

import java.util.Scanner;

public class Input {
  protected String label;
  private Scanner input = new Scanner(System.in);
  private String value;

  public Input(String label){
    this.label = label;
  }

  public void draw(){
    System.out.print("|  " + this.label + " : ");
  }

  public String getValue(){
    this.value = input.nextLine();
    return this.value;
  }

  public int getValueInt(){
    this.value = input.nextLine();
    return Integer.parseInt(this.value);
  }
  
  public double getValueDouble(){
    this.value = input.nextLine();
    return Double.parseDouble(this.value);
  }
}

