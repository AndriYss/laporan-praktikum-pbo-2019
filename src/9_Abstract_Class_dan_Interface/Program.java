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
public class Program {
       public static void main(String[] args) {
        Kucing1841720157Andri kucingKampung = new Kucing1841720157Andri();
        Ikan1841720157Andri lumbalumba = new Ikan1841720157Andri();
        
        Orang1841720157Andri ani = new Orang1841720157Andri("Ani");
        Orang1841720157Andri budi = new Orang1841720157Andri("Budi");
        
        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbalumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}