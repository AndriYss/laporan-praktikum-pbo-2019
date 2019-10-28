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
public class Sarjana1841720157Andri extends Mahasiswa1841720157Andri implements ICumlaude1841720157Andri {

    public Sarjana1841720157Andri(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan Sikripsi");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
}
