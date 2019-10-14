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
public class Perkalianku1841720157Andri {
       void perkalian(int a, int b){
        System.out.println(a * b);
    }
    
    void perkalian (double a, double b){
        System.out.println( a * b );
    }
    
    public static void main(String[] args) {
        Perkalianku1841720157Andri objek = new Perkalianku1841720157Andri();
        
        objek.perkalian(25, 43);
        objek.perkalian(34.56 , 23.7);
    }
} 

