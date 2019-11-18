/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo12;

/**
 *
 * @author WINDOWS 10
 */
import  java.util.ArrayList; 
public class InputData1841720157Andri {
    ArrayList<Mahasiswa1841720157Andri> ListMahasiswa;
    public InputData1841720157Andri(){
        ListMahasiswa=new ArrayList();
    }
    public void isiData(String Nim,String Nama, String Alamat){
        Mahasiswa1841720157Andri mhs = new Mahasiswa1841720157Andri (Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    public ArrayList<Mahasiswa1841720157Andri> getData(){
        return ListMahasiswa;
    }
}