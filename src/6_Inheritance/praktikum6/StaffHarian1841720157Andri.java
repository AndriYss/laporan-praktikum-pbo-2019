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
public class StaffHarian1841720157Andri extends Staff1841720157Andri {

    public int jmlJamKerja;

    public StaffHarian1841720157Andri() {

    }

    public StaffHarian1841720157Andri(String nama, String alamat, String jk, int umur,
            int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }

    public void tampilStaffHarian() {
        System.out.println("===================Data Staff Harian===============");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja    = " + jmlJamKerja);
        System.out.println("Gaji Bersih         = " + (gaji * jmlJamKerja + lembur - potongan));
    }
}
