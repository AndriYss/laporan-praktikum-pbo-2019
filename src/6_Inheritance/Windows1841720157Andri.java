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
public class Windows1841720157Andri extends Leptop1841720157Andri {

    public String fitur;

    public Windows1841720157Andri() {

    }

    public Windows1841720157Andri(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        System.out.println("===================Windows======================");
        super.tampilLaptop();
        System.out.println("Fitur               : " + fitur);
    }
}
