/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo10;

/**
 *
 * @author WINDOWS 10
 */
public class Tester21841720157Andri {

    public static void main(String[] args) {
        PermanentEmployee1841720157Andri pEmp = new PermanentEmployee1841720157Andri("Dedik", 500);
        Employee1841720157Andri e;
        e = pEmp;
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("------------------");
        System.out.println("" + pEmp.getEmployeeInfo());
    }
}
