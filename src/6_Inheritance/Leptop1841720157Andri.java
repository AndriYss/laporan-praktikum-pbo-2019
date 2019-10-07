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
public class Leptop1841720157Andri extends Komputer1841720157Andri{

    public String jnsBatrei;

    public Leptop1841720157Andri() {

    }

    public Leptop1841720157Andri(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilLaptop() {
        this.tampilData();
        System.out.println("Jenis Baterai       : " + jnsBatrei);
    }
}
