/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PV.evolution.cli.input;

/**
 *
 * @author Wibowo
 */

import PV.evolution.cli.Component;
import java.util.Scanner;

public class Input implements Component{
  protected String label;
  private Scanner input;
  private String value;

  public Input(String label){
    this.label = label;
    this.input = new Scanner(System.in);
  }

  @Override
  public void draw(){
    System.out.print("|  " + this.label + " : ");
    this.value = this.input.nextLine();
  }

  public String getValue(){
    return this.value;
  }

  public int getValueInt(){
    return Integer.parseInt(this.value);
  }
  
  public double getValueDouble(){
    return Double.parseDouble(this.value);
  }
}

