

package Pbo;

public class Sepeda1841720157Andri {
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    private String mWarna;
    
    public void setWarnaAndri(String newValue){
        mWarna = newValue;
    }
    
    public void setMerekAndri(String newValue){
        mMerek = newValue;
    }
    
    public void gantiGearAndri(int newValue){
        mGear = newValue;
    }
    
    public void tambahKecepatanAndri(int plus){
        mKecepatan = mKecepatan + plus;
    }
    
    public void remAndri(int min){
        mKecepatan = mKecepatan - min;
    }
    
    public void cetakStatusAndri(){
        System.out.println("Merek: " + mMerek);
        System.out.println("Warna: "+mWarna);
        System.out.println("Kecepatan: " + mKecepatan + "km/h");
        System.out.println("Gear:" + mGear);
    }
}

