/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo4;

/**
 *
 * @author ASUS
 */
        public class MainPercobaan2{
    public static void main(String[] args) {
        
        Mobil m = new Mobil(); 
        m.setNama("ANDRI");
        m.setMerk("Avanza");      
        m.setBiaya(350000);      
        Sopir s = new Sopir();   
        s.setNama("John Doe");   
        s.setBiaya(200000);      
        Pelanggan p = new Pelanggan();  
        p.setNama("John doe");       
        p.setMobil(m);       
        p.setSopir(s);      
        p.setHari(2);      
        System.out.println(" Biaya Total = " + p.hitungBiayaTotal());
    }
}

