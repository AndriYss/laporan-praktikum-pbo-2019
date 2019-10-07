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
public class Manager1841720157Andri extends Karyawan1841720157Andri {

    public int tunjangan;

    public Manager1841720157Andri() {

    }

    public void tampilDataManager() {
        super.tampilDataKaryawan();
        System.out.println("Tunjangan    = " + tunjangan);
        System.out.println("Total Gaji   = " + (super.gaji + tunjangan));
    }
}
