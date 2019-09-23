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
public class Dosen {
     private String nama;  
    private String matkul;  
    private int kodeDosen; 
 
    public Dosen() {
        
    } 
    public Dosen(String nama, String matkul, int kodeDosen) { 
        this.nama = nama;  
        this.matkul = matkul; 
        this.kodeDosen = kodeDosen;  
    } 
    public String getNama() { 
        return nama;  
    } 
    public void setNama(String nama) { 
        this.nama = nama;  
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
    public String info(){ 
        String info = ""; 
        info += ", Dosen yg mengajar " + getNama(); 
        return info;  
    } 
}
