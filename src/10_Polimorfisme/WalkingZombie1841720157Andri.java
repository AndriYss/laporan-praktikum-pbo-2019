/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo10;

/**
 *
 * @author WINDOWS 10
 */
public class WalkingZombie1841720157Andri extends Zombie1841720157Andri{
        public WalkingZombie1841720157Andri(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void heal(){
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }   
    public void destroyed(){
        health -= health*0.19;
    }
    public String getZombieInfo(){
        String info = "Walking Zombie Data = ";
        info += super.getZombieInfo()+"\n";
        return info;
    }
}
