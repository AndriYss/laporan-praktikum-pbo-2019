/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo3;

/**
 *
 * @author WINDOWS 10
 */
public class Anggota {
    private String noKtp;
    private String nama;
    private int lmtPeminjaman;
    private int jmlPeminjaman;
    
    public Anggota(String ktp, String nama, int lmtPeminjaman){
        this.noKtp = noKtp;
        this.nama = nama;
        this.lmtPeminjaman = lmtPeminjaman;
        this.jmlPeminjaman = 0;
    }
    public String getNoKtp(){
        return noKtp;
    }
    public String getNama(){
        return nama;
    }
    public int getLmtPeminjaman(){
        return lmtPeminjaman;
    }
    public int getJmlhPinjaman() {
    return jmlPeminjaman;
    }
    public void pinjam(int uang){
        if(uang>lmtPeminjaman){
            System.out.println("Sorry, jumlah pinjaman melebihi limit.");
    }else{
        jmlPeminjaman += uang;
        }
    }
    public void angsur(int uang){
        if(uang<jmlPeminjaman*0.1){
        jmlPeminjaman -= uang;
        }else{
            System.out.println("Sorry, angsuran harus 10% dari jumlah pinjaman");
        }
    }
}

