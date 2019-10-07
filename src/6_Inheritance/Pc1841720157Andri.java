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
public class Pc1841720157Andri extends Komputer1841720157Andri{

    public int ukuranMonitor;

    public Pc1841720157Andri() {

    }

    public Pc1841720157Andri(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        this.tampilData();
        System.out.println("Ukuran Motor      : " + ukuranMonitor);
    }
}
