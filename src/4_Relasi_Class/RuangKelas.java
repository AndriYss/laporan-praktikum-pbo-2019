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
public class RuangKelas {
   private Mahasiswa mahasiswa;  private Dosen dosen;  private String kelas;  private MataKuliah mataKuliah; 
 
    public RuangKelas() {  
    
    } 
    public RuangKelas(Mahasiswa mahasiswa, Dosen dosen, String kelas) {  
        this.mahasiswa = mahasiswa;  
        this.dosen = dosen;  
        this.kelas = kelas; 
    } 
    public Mahasiswa getMahasiswa() { 
        return mahasiswa;  
    } 
    public void setMahasiswa(Mahasiswa mahasiswa) { 
        this.mahasiswa = mahasiswa;  
    } 
    public Dosen getDosen() { 
        return dosen;  
    } 
    public void setDosen(Dosen dosen) { 
        this.dosen = dosen;  
    } 
    public String getKelas() { 
        return kelas;  
    } 
    public void setKelas(String kelas) { 
        this.kelas = kelas;  
    } 
    public MataKuliah getMataKuliah() { 
        return mataKuliah;  
    } 
    public void setMataKuliah(MataKuliah mataKuliah) { 
        this.mataKuliah = mataKuliah;  
    } 
    public void test(){  
        String info = "";  
        info += "Di kelas " + kelas + "\n"; 
            if (kelas == mahasiswa.getKelas()) {  
                info += "Mahasiswa bernama " + mahasiswa.getNama(); 
            } else {  
                info += "Tidak ada Mahasiswa" + "\n"; 
        }  
        System.out.println(info); 

        System.out.println("Mengikuti mata kuliah " + mahasiswa.getMatkul()); 
        System.out.println("Dosen yang mengajar " + dosen.getNama()); 
    }  
}
