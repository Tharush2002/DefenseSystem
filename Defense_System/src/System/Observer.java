/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.util.ArrayList;

/**
 *
 * @author tharu
 */
public class Observer{
    private int Position=0;
    private ArrayList<Observable> observablelist=new ArrayList();
    
    public void addDefenseObserver(Observable object){
        observablelist.add(object);
    }
    
    public void notifyAreaClear(String text){
        for(Observable ob:observablelist){
            ob.notifyAreaClear(text);
        }
    }

    public void notifyMsgToUnits(String msg) {
        for(Observable ob:observablelist){
            ob.notifyMsgToUnits(msg);
        }
    }
    
    public Observable returnObject(int index){
        return observablelist.get(index);
    }
    
    public void setPosition(int Position){
        this.Position=Position;
        notifyPosition();
        
    }
    
    public void notifyPosition(){
        for(Observable ob : observablelist){
            ob.update(Position);
        }
    }    
}
