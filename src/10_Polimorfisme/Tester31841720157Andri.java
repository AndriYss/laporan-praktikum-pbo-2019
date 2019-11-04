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
public class Tester31841720157Andri {

    public static void main(String[] args) {
        PermanentEmployee1841720157Andri pEmp = new PermanentEmployee1841720157Andri("Dedik", 500);
        InternshipEmployee1841720157Andri iEmp = new InternshipEmployee1841720157Andri("Sunarto", 5);
        ElectricityBill1841720157Andri eBill = new ElectricityBill1841720157Andri(5, "A-1");
        Employee1841720157Andri e[] = {pEmp, iEmp};
        Payable1841720157Andri p[] = {pEmp, eBill};
        //Employee1841720157Andri e2[] = {pEmp, iEmp, eBill};      
    }
}
