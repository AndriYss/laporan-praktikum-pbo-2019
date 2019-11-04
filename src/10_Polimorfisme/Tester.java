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
public class Tester {

    public static void main(String[] args) {
        WalkingZombie1841720157Andri wz = new WalkingZombie1841720157Andri(100, 1);
        JumpingZombie1841720157Andri jz = new JumpingZombie1841720157Andri(100, 2);
        Barrier1841720157Andri b = new Barrier1841720157Andri(100);
        Plant1841720157Andri p = new Plant1841720157Andri();
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy1841720157Andri(wz);
            p.doDestroy1841720157Andri(jz);
            p.doDestroy1841720157Andri(b);
        }
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
    }
}
