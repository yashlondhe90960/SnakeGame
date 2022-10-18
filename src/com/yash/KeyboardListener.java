package com.yash;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class KeyboardListener extends KeyAdapter{
    public void keyPressed(KeyEvent e){
        switch (e.getKeyCode()){
            case 39:   //->Right
                //if it's not the opposite direction
                if(ThreadsController.directionSnakeGame!=2)
                    ThreadsController.directionSnakeGame=1;
                break;
            case 38:   //->Top
                if(ThreadsController.directionSnakeGame!=4)ThreadsController.directionSnakeGame=3;
                break;
            case 37: //left
                if(ThreadsController.directionSnakeGame!=1)
                    ThreadsController.directionSnakeGame=2;
                break;
            case 40:   //->Bottom
            if(ThreadsController.directionSnakeGame!=3)
                ThreadsController.directionSnakeGame=4;
            break;

            default: break;
        }
    }
}
