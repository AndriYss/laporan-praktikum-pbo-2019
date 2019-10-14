/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo7;

/**
 *
 * @author WINDOWS 10
 */
public class Segitiga1841720157Andri {
        private int sudut; 
    public int totalSudut(int sudutA) { 
        System.out.println("Total Sudut Segitiga    : " + (sudut = 180 - sudutA));  
        return sudut; 
    } 
    public int totalSudut(int sudutA, int sudutB) { 
        System.out.println("Total Sudut Segitiga    : " + (sudut = 180 - (sudutA + sudutB))); 
        return sudut; 
    } 
    public int keliling(int sisiA, int sisiB, int sisiC) { 
        int keliling; 
        System.out.println("Keliling Segitiga       : " + (keliling = sisiA + sisiB + sisiC)); 
        return keliling; 
    } 
    public double keliling(int sisiA, int sisiB) {     
        double c;      
        System.out.println("Sisi c Segitiga         : " + (c = Math.sqrt((sisiA * sisiA) + (sisiB * sisiB))));    
        return c;     
    } 
}
