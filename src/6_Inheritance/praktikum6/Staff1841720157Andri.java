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
public class Staff1841720157Andri extends Karyawan1841720157Andri {
    
    public int lembur, potongan;
    
    public Staff1841720157Andri(){
        
    }
    public Staff1841720157Andri(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan){
        super(nama,alamat,jk,umur,gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Lembur              = "+lembur);
        System.out.println("Potongan            = "+potongan);
        System.out.println("Total Gaji          = "+(gaji+lembur-potongan));
    }
}
