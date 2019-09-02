
package Pbo;

public class Motor {
    private String merk;
    private String warna;
    private String corak;
    private double harga;
    
    public void setMerk(String newValue){
        merk = newValue;
    }
    public void setWarna(String newValue){
        warna = newValue;
    }
    public void setCorak(String newValue){
        corak = newValue;
    }
    public void daftarHarga(double newValue){
        harga = newValue;
    }
    public void cetakStatus(){
        System.out.println("Merk: "+merk);
        System.out.println("Warna: "+warna);
        System.out.println("Corak: "+corak);
        System.out.println("Harga Rp.: "+harga);
    }
}
