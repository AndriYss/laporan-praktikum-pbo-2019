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
public class ProgramPercobaan2 {

    public static void main(String[] args) {
       Rektor1841720157Andri pakRektor = new Rektor1841720157Andri();
        
        //Mahasiswa1841720157Andri mahasiswaBiasa = new Mahasiswa1841720157Andri ("Charlie");
        Sarjana1841720157Andri sarjanaCumlaude = new Sarjana1841720157Andri("Dini");
        PascaSarjana1841720157Andri masterCumlaude = new PascaSarjana1841720157Andri("Elok");

        //pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
        
        pakRektor.beriSertifikatMawapres(masterCumlaude);
        //pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
    }
}
