
package Pbo2;
/**
 *
 * @author ASUS
 */
public class TestBarang1841720157Andri {
    public static void main(String[] args) {
        Barang1841720157Andri brg1=new Barang1841720157Andri();
        brg1.namaBrg="Pensil";
        brg1.jenisBrg="ATK";
        brg1.stok=10;
        brg1.tampilBarang();
        
        System.out.println("Stok Baru adalah "+ brg1.tambahStok(20));
    }
}
