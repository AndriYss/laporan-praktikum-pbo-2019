package Pbo3;

public class KoperasiDemo {

    public static void main(String[] args) {
        Anggota1841720157Andri anggota1 = new Anggota1841720157Andri("Andri Yoga", "Jl.semanggi");
        System.out.println("Simpanan " + anggota1.getNama() + ":Rp" + anggota1.getSimpanan());

        anggota1.setNama("Andri Yoga");
        anggota1.setAlamat("jl.semanggi barat no 16a");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + ":Rp" + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + ":Rp" + anggota1.getSimpanan());
    }
}
