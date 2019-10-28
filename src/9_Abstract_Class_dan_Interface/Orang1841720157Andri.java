/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo9;

/**
 *
 * @author WINDOWS 10
 */
public class Orang1841720157Andri {
    private String nama;
    private Hewan1841720157Andri hewanPeliharaan;

    public Orang1841720157Andri(String nama)
    {
        this.nama = nama;
    }
    public void  peliharaHewan(Hewan1841720157Andri hewanPeliharaan) {
        
            this.hewanPeliharaan    = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku "+ this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara : ");
        this.hewanPeliharaan.bergerak();
        System.out.println("------------------------------------------");
    }
}
