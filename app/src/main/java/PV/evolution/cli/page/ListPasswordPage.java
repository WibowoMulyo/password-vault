/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PV.evolution.cli.page;

/**
 *
 * @author Wibowo
 */
import PV.evolution.cli.output.*;
import PV.evolution.models.*;

public class ListPasswordPage {
    private final String title;
    private final int width;
    private final HLine hline;
    private final Space space;
    private final Label label;
    private final int judulWidth = 20; // Lebar kolom untuk judul password
    private final int usernameWidth = 30; // Lebar kolom untuk username
    private final int categoryWidth = 20; // Lebar kolom untuk kategori

    public ListPasswordPage(String title, int width) {
        this.title = title;
        this.width = width;
        this.hline = new HLine(width);
        this.space = new Space(width);
        this.label = new Label(title, width);
    }

    public void draw() {
        drawHeader();
        space.draw();
        drawContent();
        drawFooter();
    }

    private void drawHeader() {
        hline.draw();
        space.draw();
        label.draw();
        space.draw();
        hline.draw();
    }

    private void drawContent() {
        int totalPasswords = DataPassword.passData.size();
        label.text = "Terdapat " + totalPasswords + " tersimpan.";
        label.draw();
        space.draw();

        // Print list password
        for (PasswordStore passwordStore : DataPassword.passData) {
            StringBuilder passwordEntry = new StringBuilder("| ");
            // Mengatur lebar kolom untuk judul password
            String judul = passwordStore.name.length() > judulWidth ?
                          passwordStore.name.substring(0, judulWidth - 3) + "..." :
                          passwordStore.name;
            passwordEntry.append(judul);
            passwordEntry.append(" ".repeat(judulWidth - judul.length() + 1)).append("| ");

            // Mengatur lebar kolom untuk username
            String username = passwordStore.username.length() > usernameWidth ?
                             passwordStore.username.substring(0, usernameWidth - 3) + "..." :
                             passwordStore.username;
            passwordEntry.append(username);
            passwordEntry.append(" ".repeat(usernameWidth - username.length() + 1)).append("| ");

            // Mengatur lebar kolom untuk kategori
            String category = passwordStore.getCategory().length() > categoryWidth ?
                             passwordStore.getCategory().substring(0, categoryWidth - 3) + "..." :
                             passwordStore.getCategory();
            passwordEntry.append(category);
            passwordEntry.append(" ".repeat(categoryWidth - category.length() + 1)).append("|");

            new Label(passwordEntry.toString(), width).draw();
        }
    }

    private void drawFooter() {
        space.draw();
        hline.draw();
    }
}
