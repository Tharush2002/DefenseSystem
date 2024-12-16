/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

/**
 *
 * @author tharu
 */
public interface Observable{
   public void notifyAreaClear(String text);
   public void notifyMsgToUnits(String msg);
   public void update(int Position);
   public int getSCount();
   public int getACount();
   public int getFCount();
   public int getOCount();
}
