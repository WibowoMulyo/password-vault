/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PV.evolution.cli.pages;

/**
 *
 * @author Wibowo
 */

import PV.evolution.cli.Component;
import PV.evolution.cli.input.*;
import PV.evolution.cli.output.*;
import PV.evolution.models.*;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputPage extends BasePage {
    private Input nameInput;
    private Input usernameInput;
    private Input passInput;
    private SelectInput catInput;
    private PasswordStore passStr;

    public InputPage(int width) {
        super("Inputan Password Baru", width);

        this.nameInput = new Input("Judul Password");
        this.components.add(nameInput);

        this.usernameInput = new Input("Username");
        this.components.add(usernameInput);

        this.passInput = new Input("Password");
        this.components.add(passInput);

        String[] kategori = {"Belum terkategori", "Aplikasi Web", "Aplikasi Mobile", "Akun Lainnya"};
        this.catInput = new SelectInput("Kategori", kategori, this.width);
        this.components.add(catInput);

        this.components.add(new Label("---- ----", this.width));
        this.components.add(new Label("Input password berhasil dibuat!", this.width));
    }

    @Override
    public void drawContent() {
        Iterator loop = this.components.iterator();

        while (loop.hasNext()) {
            Component widget = (Component) loop.next();
            widget.draw();
        }

        // Menunggu input semua nilai diisi
        if (!nameInput.getValue().isEmpty() && !usernameInput.getValue().isEmpty() && !passInput.getValue().isEmpty() && catInput.getValue() != 0) {
            int id = DataPassword.passData.size() + 1;
            String name = this.nameInput.getValue();
            String username = this.usernameInput.getValue();
            String password = this.passInput.getValue();
            int select = this.catInput.getValue() - 1;

            this.passStr = new PasswordStore(id, name, username, password, select);
            DataPassword.passData.add(passStr);
            DataPassword.saveCSVData();

            drawFooter();
        }
    }

}