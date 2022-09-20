/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import window.Window;

import java.util.ArrayList;

/**
 *
 * @author lakshan
 */
public class Controller {
    public ArrayList<Window> list = new ArrayList<>();
   
    public Controller(){
    }
    
    public void passValue(int value,Window w){
        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i).equals(w)){
             list.get(i).getText().setText(value+"");
             list.get(i).getSlider().setValue(value);
            }
        }
    }
    
    
}
