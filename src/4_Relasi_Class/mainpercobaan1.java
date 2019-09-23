/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo4;
/**
 *
 *
 */
public class mainpercobaan1 {
    public static void main(String[] args) {
        Laptop L=new Laptop("Thinkpad",new Processor("intel i5",3));
        
        Processor p=new Processor("intel i5",3);
        L.info();
        Processor p1=new Processor();
        p1.setMerk("Intel i5");
        p1.setChace(4);
        Laptop L1=new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
}
