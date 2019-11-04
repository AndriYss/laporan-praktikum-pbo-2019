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
public class Plant1841720157Andri {
        public void doDestroy1841720157Andri (Destroyable1841720157Andri d){
        if (d instanceof WalkingZombie1841720157Andri){
            WalkingZombie1841720157Andri wz = (WalkingZombie1841720157Andri) d;
            wz.destroyed();
        }else if (d instanceof JumpingZombie1841720157Andri){
            JumpingZombie1841720157Andri jz = (JumpingZombie1841720157Andri) d;
            jz.destroyed();
        }else if (d instanceof Barrier1841720157Andri){
            Barrier1841720157Andri b = (Barrier1841720157Andri) d;
            b.destroyed();
        }
    }
}
