
package Pbo4;
public class Laptop {
    private String merk;
    private Processor proc;
 
 public Laptop(){
     this.merk=merk;
     this.proc=proc;
 }
  public Laptop(String merk,Processor proce){
      proc=proce;
      this.merk=merk;
  }
  public void info(){
      System.out.println("Merk laptop = "+merk);
       proc.info();
  }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public String getMerk() {
        return merk;
    }

    public Processor getProc() {
        return proc;
    }
  
}
