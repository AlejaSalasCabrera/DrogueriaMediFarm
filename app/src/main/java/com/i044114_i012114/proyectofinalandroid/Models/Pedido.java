package com.i044114_i012114.proyectofinalandroid.Models;

/**
 * Created by ACER on 28/11/2017.
 */

public class Pedido {
    private int id_pedi;
    private int id_usa;
    private int id_produc;

    private String name;
    private  String cantidad;
    private  String url;

    public int getId_pedi() {
        return id_pedi;
    }

    public void setId_pedi(int id_pedi) {
        this.id_pedi = id_pedi;
    }

    public int getId_usa() {
        return id_usa;
    }

    public void setId_usa(int id_usa) {
        this.id_usa = id_usa;
    }

    public int getId_produc() {
        return id_produc;
    }

    public void setId_produc(int id_produc) {
        this.id_produc = id_produc;
    }
}
