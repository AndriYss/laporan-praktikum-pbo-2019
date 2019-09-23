/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo4;

/**
 *
 * @author WINDOWS 10
 */
public class Mahasiswa {
    private String nama;  
    private String kelas; 
    private String matkul; 
    private int kodeDosen; 
    private MataKuliah mataKuliah; 
 
    public Mahasiswa() { 
    
    } 
    
    public Mahasiswa(String nama, String kelas, String matkul, int kodeDosen) {  
        this.nama = nama; 
        this.kelas = kelas; 
        this.matkul = matkul; 
        this.kodeDosen = kodeDosen;  
    }
    public String getNama() { 
        return nama;  
    } 
    public void setNama(String nama) {  
        this.nama = nama;  
    } 
    public String getKelas() { 
        return kelas;  
    } 
    public void setKelas(String kelas) {
        this.kelas = kelas;  
    } 
    public String getMatkul() {  
        return matkul; 
    } 
    public void setMatkul(String matkul) { 
        this.matkul = matkul;  
    } 
    public int getKodeDosen() {  
        return kodeDosen; 
    } 
    public void setKodeDosen(int kodeDosen) { 
        this.kodeDosen = kodeDosen;  
    } 
    public MataKuliah getMataKuliah() { 
        return mataKuliah;  
    } 
    public void setMataKuliah(MataKuliah mataKuliah) { 
        this.mataKuliah = mataKuliah;  
    } 
    public String info(){ 
        String info = ""; 
        info += " mata kuliah " + matkul + "\n"; return info;  } 
}
