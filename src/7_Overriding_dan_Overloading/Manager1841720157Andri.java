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
public class Manager1841720157Andri extends Karyawan1841720157Andri {

    private double tunjangan;
    private String bagian;
    private Staff1841720157Andri st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setSt(Staff1841720157Andri[] st) {
        this.st = st;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public Staff1841720157Andri[] getSt() {
        return st;
    }

    public void viewStaff() {
        int i;
        System.out.println("---------------------");

        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("---------------------");

    }

    public void lihatInfo() {

        System.out.println("Manager : " + this.getBagian());
        System.out.println("NIP : " + this.getNip());
        System.out.println("Nama : " + this.getNama());
        System.out.println("Golongan : " + this.getGolongan());
        System.out.printf("Tunjangan :%.0f\n", this.getTunjangan());
        System.out.printf("Gaji :%.0f\n", this.getGaji());
        System.out.println("Bagian : " + this.getBagian());

        this.viewStaff();
    }

    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}
