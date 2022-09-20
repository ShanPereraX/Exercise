/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import window.Window;
import controller.*;

/**
 *
 * @author lakshan
 */
public class Demo {
    public static void main(String [] args){
        Controller c =new Controller();
        
        Window w1 = new Window(c);
        w1.setTitle("Frame 1");
        Window w2 = new Window(c);
        w2.setTitle("Frame 2");
        
        c.list.add(w1);
        c.list.add(w2);
        
    }
    
            
            
            
}
