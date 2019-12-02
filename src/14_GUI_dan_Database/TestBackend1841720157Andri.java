/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author WINDOWS 10
 */
import backend.*;

public class TestBackend1841720157Andri {
    public static void main(String[] args){
        Kategori1841720157Andri kat1 = new Kategori1841720157Andri("Novel", "Koleksi buku novel");
        Kategori1841720157Andri kat2 = new Kategori1841720157Andri("Referensi", "Buku referensi ilmiah");
        Kategori1841720157Andri kat3 = new Kategori1841720157Andri("Komik", "Komik anak-anak");
        
        kat1.save();
        kat2.save();
        kat3.save();

        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        kat3.delete();

        for(Kategori1841720157Andri k : new Kategori1841720157Andri().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        for(Kategori1841720157Andri k : new Kategori1841720157Andri().search("ilmiah")){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}
