/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MMobil {
    private int idMobil;
    private String kodeMobil;
    private String brand;
    private String model;
    private String nopol;
    private String harga;
    private String status;

    public MMobil(int idMobil, String kodeMobil, String brand, String model, String nopol, String harga, String status) {
        this.idMobil = idMobil;
        this.kodeMobil = kodeMobil;
        this.brand = brand;
        this.model = model;
        this.nopol = nopol;
        this.harga = harga;
        this.status = status;
    }

    public int getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(int idMobil) {
        this.idMobil = idMobil;
    }

    public String getKodeMobil() {
        return kodeMobil;
    }

    public void setKodeMobil(String kodeMobil) {
        this.kodeMobil = kodeMobil;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}