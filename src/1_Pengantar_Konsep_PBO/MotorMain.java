
package Pbo;

public class MotorMain {
    public static void main(String[] args) {
        
        Motor bj1 = new Motor();
        Motor bj2 = new Motor();
      
        bj1.setMerk("yamaha");
        bj1.setWarna("red");
        bj1.setCorak("blue");
        bj1.daftarHarga(20000000);
        bj1.cetakStatus();
        
        bj2.setMerk("Honda");
        bj2.setWarna("Putih");
        bj2.setCorak("merah maron");
        bj2.daftarHarga(250000);
        bj2.cetakStatus();
    }
}
