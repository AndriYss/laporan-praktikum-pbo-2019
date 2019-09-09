/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo2;

/**
 *
 * @author ASUS
 */
public class BarangDuaDemo1841720157Andri {
    public static void main(String[]args){
        BarangDua1841720157Andri br = new BarangDua1841720157Andri();

        br.kode = "QWERTY";
        br.namaBarang = "Handphone Samsung";
        br.hargaDasar = 1500000;
        br.diskon(10);
        br.tampilBarang();
        System.out.println("Total Harga : " + br.hitungHargaJual());
    }
}
