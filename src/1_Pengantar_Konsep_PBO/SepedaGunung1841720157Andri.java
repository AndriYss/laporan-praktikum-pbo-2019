
package Pbo;

public class SepedaGunung1841720157Andri extends Sepeda1841720157Andri{
     private String mTipeSuspensi;
    
    public void setTipeSuspensiAndri(String newValue){
        mTipeSuspensi = newValue;
    }
    
    public void cetakStatusAndri(){
        super.cetakStatusAndri();
        System.out.println("Tipe suspensi" +mTipeSuspensi);
    }
}
