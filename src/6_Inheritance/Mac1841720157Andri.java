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
public class Mac1841720157Andri extends Leptop1841720157Andri {

    public String security;

    public Mac1841720157Andri() {

    }

    public Mac1841720157Andri(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }

    public void tampilMac() {
        System.out.println("===================Mac=========================");
        super.tampilLaptop();
        System.out.println("Security            : " + security);
    }
}
