/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo4;

/**
 *
 * @author ANDRI
 */
public class Processor {
    private String merk;
    private double chace;
  public Processor(){
        this.merk=merk;
        this.chace=chace;
    }
  public Processor(String merk,double chace){
      this.merk=merk;
        this.chace=chace;
  }  
  public void setChace(double chace){
      this.chace=chace;
  }
  public double getChace(double chace){
      return chace;
  }
  public void setMerk(String merk){
      this.merk=merk;
  }
  public String getMerk(String merk){
      return merk;
  }
  public void info(){
      System.out.printf("Merk Processor= %s\n", merk);
      System.out.printf("Chace Memory= %.2c\n", chace);
  }
}
