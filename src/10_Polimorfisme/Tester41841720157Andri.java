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
public class Tester41841720157Andri {

    public static void main(String[] args) {
        Owner1841720157Andri ow = new Owner1841720157Andri();
        ElectricityBill1841720157Andri eBill = new ElectricityBill1841720157Andri(5, "R-1");
        ow.pay(eBill);
        System.out.println("------------------------------");

        PermanentEmployee1841720157Andri pEmp = new PermanentEmployee1841720157Andri("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("------------------------------");

        InternshipEmployee1841720157Andri iEmp = new InternshipEmployee1841720157Andri("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("------------------------------");
        ow.showMyEmployee(iEmp);
    }
}
