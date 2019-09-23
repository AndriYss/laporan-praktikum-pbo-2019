/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo4;

/**
 *
 * @author WINDOWS 10
 */
public class TugasMain {
        public static void main(String[] args) {
        
        System.out.println("Selamat Hari Rabu");
        System.out.println("---------------------------------------------------");
        Mahasiswa mahasiswa = new Mahasiswa("Andri Yoga Susila", "TI-2C", "Praktikum PBO", 8); 
        Dosen dosen = new Dosen("bapak Habibie ","PBO", 1234); 
        MataKuliah matakuliah = new MataKuliah(dosen, mahasiswa); 
        RuangKelas test = new RuangKelas(mahasiswa, dosen, "TI-2C");  
        test.test();  
        System.out.println("---------------------------------------------------");
    } 
}
