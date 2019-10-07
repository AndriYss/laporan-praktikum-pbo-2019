/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo6;

/**
 *
 * @author WINDOWS 10
 */
public class Inheritance11841720157Andri {
        public static void main(String[] args) {
        Manager1841720157Andri M = new Manager1841720157Andri();
        M.nama = "Vivin";
        M.alamat = "Jl. Vinolia";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManager();
        
        Staff1841720157Andri S = new Staff1841720157Andri();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaff1841720157Andri();
    }
}
