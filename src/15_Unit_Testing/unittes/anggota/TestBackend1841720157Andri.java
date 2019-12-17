/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.anggota;

/**
 *
 * @author WINDOWS 10
 */
public class TestBackend1841720157Andri {

    public static void main(String[] args) {
        Anggota1841720157Andri agt1 = new Anggota1841720157Andri("andri", "Blitar", "45364564");
        Anggota1841720157Andri agt2 = new Anggota1841720157Andri("Cahya", "Bali", "1456356564");
        Anggota1841720157Andri agt3 = new Anggota1841720157Andri("Fuad", "Malang", "1564546563");

        agt1.save();
        agt2.save();
        agt3.save();

        agt2.setAlamat("kota malang");
        agt2.save();

        agt3.delete();

        for (Anggota1841720157Andri k : new Anggota1841720157Andri().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", telp: " + k.getTelepon() + ", alamat: " + k.getAlamat());
        }

        for (Anggota1841720157Andri k : new Anggota1841720157Andri().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", telp: " + k.getTelepon() + ", alamat: " + k.getAlamat());
        }
    }

}
