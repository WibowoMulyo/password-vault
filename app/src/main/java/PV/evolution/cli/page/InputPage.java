/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PV.evolution.cli.page;

/**
 *
 * @author Wibowo
 */

import PV.evolution.cli.input.*;
import PV.evolution.cli.output.*;
import PV.evolution.models.*;

public class InputPage {
  public String title;
  public int width;

  private final HLine hline;
  private final Space space;
  private final Label label;

  public InputPage(String title, int width){
    this.width = width;
    this.title = title;
    this.hline = new HLine(width);
    this.space = new Space(width);
    this.label = new Label(title.toUpperCase(), width);
  }

  public void draw() throws Exception{
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

  private void drawContent() throws Exception{ 
    this.label.text = "Inputan Password Baru";
    this.label.draw();
    
    Input judulInput = new Input("Judul Password");
    judulInput.draw();
    String judul = judulInput.getValue();
    
    Input usernameInput = new Input("Username");
    usernameInput.draw();
    String username = usernameInput.getValue();
    
    Input passwordInput = new Input("Password");
    passwordInput.draw();
    String password = passwordInput.getValue();

    String [] kategori = {"Belum terkategori", "Aplikasi Web", "Aplikasi Mobile", "Akun Lainnya"};
    SelectInput pageSelect = new SelectInput("Kategori", kategori, this.width);
    pageSelect.draw();
    int select = pageSelect.getValueInt() - 1;
    
    PasswordStore data = new PasswordStore(judul, username, password, select);
    DataPassword.passData.add(data);
    
    this.label.text = "---- ----";
    this.label.draw();
    this.label.text = "Input password berhasil dibuat!";
    this.label.draw();
    this.drawFooter();
    
    MainPage mainPage = new MainPage("WELCOME", 100);
    mainPage.draw();
  }

  public void drawFooter(){
    this.space.draw();
    this.hline.draw();
  }
}