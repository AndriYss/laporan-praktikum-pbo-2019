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
public class Owner1841720157Andri {
     public void pay(Payable1841720157Andri p){
        System.out.println("Total payment = "+p.getPaymentAmount());
        if(p instanceof ElectricityBill1841720157Andri){
            ElectricityBill1841720157Andri eb = (ElectricityBill1841720157Andri) p;
            System.out.println(""+eb.getBillInfo());
        }else if(p instanceof PermanentEmployee1841720157Andri){
            PermanentEmployee1841720157Andri pe = (PermanentEmployee1841720157Andri) p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee1841720157Andri e){
        System.out.println(""+e.getEmployeeInfo());
        if(e instanceof PermanentEmployee1841720157Andri)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
