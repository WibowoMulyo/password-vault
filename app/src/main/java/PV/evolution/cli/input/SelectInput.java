/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PV.evolution.cli.input;

import PV.evolution.cli.Component;
import PV.evolution.cli.output.Label;

/**
 *
 * @author Wibowo
 */

public class SelectInput implements Component {
  private String[] selection;
  private int width;
  private int value;
  private Label label;
  private Input input;

  public SelectInput(String label, String[] selection, int width){
    this.selection = selection;
    this.width = width;
    this.label = new Label(label, width);
    this.input = new Input("Pilihan");
  }
  
@Override
public void draw(){
    this.label.draw();

    for(int i = 0; i < this.selection.length; ++i) {
        this.label.text = "  [" + (i + 1) + "] " + this.selection[i];
        this.label.draw();
    }

    
    this.input.draw();   
    this.value = this.input.getValueInt();
}

  
  public int getValue(){
    return this.value;
  }
}
