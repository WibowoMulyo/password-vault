/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PV.evolution.cli.input;

/**
 *
 * @author Wibowo
 */

public class SelectInput extends Input {
  private String[] selection;
  private int width;
  private Input input;

  public SelectInput(String label, String[] selection, int width){
    super(label);
    this.selection = selection;
    this.width = width;
  }

  @Override
  public void draw(){
    int length = this.width - super.label.length() - 2;
    
    System.out.print("|  " + super.label);
    for(int i = 0; i < length; i++){
      System.out.print(" ");
    }
    System.out.println("|");

    for(int i = 0; i < this.selection.length; i++){
      int length2 = this.width - this.selection[i].length() - 8;
      System.out.print("|    " + "[" + (i+1) + "] " + this.selection[i]);
      for(int j = 0; j < length2; j++){
        System.out.print(" ");
      }
      System.out.println("|");
    }

    System.out.print("|  Pilihan : ");
  }

  @Override
  public int getValueInt(){
    return super.getValueInt();
  }
  
}
