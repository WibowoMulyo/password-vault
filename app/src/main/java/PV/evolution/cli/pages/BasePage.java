package PV.evolution.cli.pages;

import PV.evolution.cli.Component;
import PV.evolution.cli.input.SelectInput;
import PV.evolution.cli.output.HLine;
import PV.evolution.cli.output.Label;
import PV.evolution.cli.output.Space;
import PV.evolution.models.PasswordStore;
import java.util.ArrayList;

/**
 *
 * @author Wibowo
 */
public abstract class BasePage {
  public String title;
  public int width;
  protected final HLine hline;
  protected final Space space;
  protected final Label label;
  protected ArrayList<Component> components = new ArrayList<>();
  
  public BasePage(String title, int width){
    this.width = width;
    this.title = title;
    this.hline = new HLine(width);
    this.space = new Space(width);
    this.label = new Label(title.toUpperCase(), width);
  }

  public void draw(){
    this.drawHeader();
    this.space.draw();
    this.drawContent();
  }

  public void drawHeader(){
    this.hline.draw();
    this.space.draw();
    this.label.draw();
    this.space.draw();
    this.hline.draw();
  }

  public abstract void drawContent();

  public void drawFooter(){
    this.space.draw();
    this.hline.draw();
  }

}
