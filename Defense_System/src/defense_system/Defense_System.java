/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defense_system;

import Defense_Units.Helicopter;
import Defense_Units.Submarine;
import Defense_Units.Tank;
import MainController.MainController;
import System.Observer;

/**
 *
 * @author tharu
 */
public class Defense_System {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observer observer=new Observer();
        MainController mainController=new MainController(observer);
        observer.addDefenseObserver(new Helicopter(mainController,1));
        observer.addDefenseObserver(new Tank(mainController,2));
        observer.addDefenseObserver(new Submarine(mainController,3));
    }
    
}
