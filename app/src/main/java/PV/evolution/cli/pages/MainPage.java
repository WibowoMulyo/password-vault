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
        import PV.evolution.models.DataPassword;
        import java.util.Iterator;
        import java.util.logging.Level;
        import java.util.logging.Logger;

        public class MainPage extends BasePage{
            SelectInput pageSelect;

            public MainPage(int width){
                super("Aplikasi Penyimpanan Password", width);
                this.components.add(new Label("Selamat datang di aplikasi Password Vault", this.width));
                this.components.add(new Label("Simpan password anda dengan aman di sini", this.width));
                this.components.add(new Space(this.width));
                String [] pages = {"Input Password", "Tampil Password", "Keluar Aplikasi"};
                this.pageSelect = new SelectInput("Pilih halaman berikut:", pages, this.width);
                this.components.add(this.pageSelect);   
            }   

            @Override
            public void drawContent() {
                Iterator loop = this.components.iterator();

                while (loop.hasNext()) {
                    Component widget = (Component) loop.next();
                    widget.draw();
                }

                int select = this.pageSelect.getValue();
                switch (select) {
                    case 1 -> {
                        drawFooter();
                        new InputPage(this.width).draw();
                        new MainPage(this.width).draw();
                    }
                    case 2 -> {
                        drawFooter();
                        new PasswordListPage(this.width).draw();
                    }
                    case 3 -> {
                        new Label("Menyimpan data ... ...", this.width).draw();
                        DataPassword.saveCSVData();
                        new Label("Terima kasih telah menggunakan aplikasi", this.width).draw();
                        drawFooter();
                        System.exit(0);
                    }
                    default -> new MainPage(this.width).draw();
                }
            }
        }