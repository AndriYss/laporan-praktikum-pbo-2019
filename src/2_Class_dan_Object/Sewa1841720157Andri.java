/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo2;
/**
 *
 * @author ASUS
 */
public class Sewa1841720157Andri {
    private String id;
    private String namaMember;
    private String namaGame;
    private int harga;
    public int lamasewa;
    
    public void setid(String nilaiid){
        id = nilaiid;
    }
    public void setNamaMember(String nm){
        namaMember=nm;
    }
    public void setNamaGame(String ng){
        namaGame=ng;
    }
    public int sethg(int angka){
        harga = angka;
        return harga;
    }
    public int setharga(int sewa){
        harga=harga*sewa;
        return harga;
    }
    public void tampilData(){
        System.out.println("ID              : " + id);
        System.out.println("Nama Member     : " + namaMember);
        System.out.println("Nama Game       : " + namaGame);
        System.out.println("Harga           : " + harga);
    }
}
