/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MTransaksi {
    private int idTransaksi;
    private String kodePelanggan;
    private String kodeMobil;
    private String tglSewa;
    private String tglKembali;
    private int lamaSewa;
    private String total;

    public MTransaksi(int idTransaksi, String kodePelanggan, String kodeMobil, String tglSewa, String tglKembali, int lamaSewa, String total) {
        this.idTransaksi = idTransaksi;
        this.kodePelanggan = kodePelanggan;
        this.kodeMobil = kodeMobil;
        this.tglSewa = tglSewa;
        this.tglKembali = tglKembali;
        this.lamaSewa = lamaSewa;
        this.total = total;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public String getKodeMobil() {
        return kodeMobil;
    }

    public void setKodeMobil(String kodeMobil) {
        this.kodeMobil = kodeMobil;
    }

    public String getTglSewa() {
        return tglSewa;
    }

    public void setTglSewa(String tglSewa) {
        this.tglSewa = tglSewa;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
