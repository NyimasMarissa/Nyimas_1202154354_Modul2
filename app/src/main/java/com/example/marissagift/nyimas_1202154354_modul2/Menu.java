package com.example.marissagift.nyimas_1202154354_modul2;

/**
 * Created by HP on 2/18/2018.
 */

public class Menu {
    private int img_res;
    private String menu, harga;

    public Menu(int img_res, String menu, String harga){
        this.setImg_res(img_res);
        this.setMenu(menu);
        this.setHarga(harga);
    }
        //setter dan getter
    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) { this.img_res = img_res;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    }
