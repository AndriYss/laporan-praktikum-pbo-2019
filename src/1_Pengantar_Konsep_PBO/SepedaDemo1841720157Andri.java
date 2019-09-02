
package Pbo;

public class SepedaDemo1841720157Andri {
    public static void main(String[] args) {
        
        Sepeda1841720157Andri spd1 = new Sepeda1841720157Andri();
        Sepeda1841720157Andri spd2 = new Sepeda1841720157Andri();
        SepedaGunung1841720157Andri spd3= new SepedaGunung1841720157Andri();
        
        spd1.setMerekAndri("Polygon");
        spd1.setWarnaAndri("Hitam");
        spd1.tambahKecepatanAndri(10);
        spd1.gantiGearAndri(2);
        spd1.cetakStatusAndri();
        
        spd2.setMerekAndri("United");
        spd2.tambahKecepatanAndri(10);
        spd2.remAndri(5);
        spd2.tambahKecepatanAndri(10);
        spd2.remAndri(8);
        spd2.tambahKecepatanAndri(2);
        spd2.cetakStatusAndri();
        
        spd3.setMerekAndri("Klinee");
        spd3.tambahKecepatanAndri(5);
        spd3.gantiGearAndri(7);
        spd3.setTipeSuspensiAndri("Gas suspension");
        spd3.cetakStatusAndri();
    }
}
