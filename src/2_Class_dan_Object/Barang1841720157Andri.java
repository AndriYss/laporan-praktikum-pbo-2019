
package Pbo2;

/**
 *
 * @author ASUS
 */
public class Barang1841720157Andri {
    public String namaBrg;
    public String jenisBrg;
    public int stok;

    public void tampilBarang(){
    System.out.println("Nama Barang  : "+namaBrg);
    System.out.println("Nama Barang  : "+jenisBrg);
    System.out.println("Nama Barang  : "+stok);
    }
    public int tambahStok(int brgMasuk){
    int stokBaru = brgMasuk+stok;
    return stokBaru;
    }
}   
