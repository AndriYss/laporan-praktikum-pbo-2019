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
public class MataKuliah {
    private Dosen dosen;  private Mahasiswa mahasiswa; 
 
    public MataKuliah() { 
    
    } 
 
    public MataKuliah(Dosen dosen, Mahasiswa mahasiswa) { 
        this.dosen = dosen;  
        this.mahasiswa = mahasiswa;  
    } 
    public Dosen getDosen() {  
        return dosen;  
    } 
    public void setDosen(Dosen dosen) { 
        this.dosen = dosen;  
    } 
    public Mahasiswa getMahasiswa() {  
        return mahasiswa; 
    } 
    public void setMahasiswa(Mahasiswa mahasiswa) { 
        this.mahasiswa = mahasiswa;  
    } 
    public String test(){ 
        String info = ""; 
        info += " mata kuliah " + mahasiswa.getMatkul() + "\n"; if (dosen != null) {  
        info += dosen.info() + "\n";  
        }  
            return info;  
    } 
}
