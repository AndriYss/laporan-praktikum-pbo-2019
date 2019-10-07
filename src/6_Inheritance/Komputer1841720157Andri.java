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
public class Komputer1841720157Andri {
        public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;
    
    public Komputer1841720157Andri(){
        
    }
    public Komputer1841720157Andri(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
    }
    public void tampilData(){
        System.out.println("Merk                : "+merk);
        System.out.println("Kecepatan Prosesor  : "+kecProsesor);
        System.out.println("Size Memory         : "+sizeMemory);
        System.out.println("Jenis Prosesor      : "+jnsProsesor);
    }
}
