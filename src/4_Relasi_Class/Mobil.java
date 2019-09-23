/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo4;

/**
 *
 * @author ASUS
 */
public class Mobil {
    private String nama;
    private String merk;
    private int biaya;
    
    Mobil(){
        
    }
    public Mobil(String merk,String nama, int biaya) {    
        this.nama = nama;
        this.merk = merk;     
        this.biaya = biaya;     
    } 
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getMerk(){
        return merk;
    }
    public void setBiaya(int biaya){
       this.biaya = biaya;
    }
    public int getBiaya(){
       return biaya;
    }
    
    public int hitungBiayaMobil(int hari){
        return biaya *hari;
    }
}
