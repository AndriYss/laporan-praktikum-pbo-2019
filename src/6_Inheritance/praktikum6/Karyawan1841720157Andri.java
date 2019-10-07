/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo6Praktikum6;

/**
 *
 * @author WINDOWS 10
 */
public class Karyawan1841720157Andri {

    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan1841720157Andri() {

    }

    public Karyawan1841720157Andri(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }

    public void tampilDataKaryawan() {
        System.out.println("Nama                = " + nama);
        System.out.println("Alamat              = " + alamat);
        System.out.println("Jenis Kelamin       = " + jk);
        System.out.println("Umur                = " + umur);
        System.out.println("Gaji                = " + gaji);
    }
}
