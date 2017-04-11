/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication4;

import java.util.HashMap;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 *
 * @author kamalanathanr
 */
public class ScreenController extends StackPane {
    private HashMap<String, Node> screens = new HashMap<>();//Screen Navigation table
     
    public ScreenController() {
        super();
    }
    
     //Add the screen to the Navigation Table
    public void addScreen(String name, Node screen) {
        screens.put(name, screen);//adds the description and the screenID of the screen
    }
    
    //Returns the Node with the appropriate name
    public Node getScreen(String name) {
        return screens.get(name);//send the screen where Desciption is taken as search key
    }
    
       public boolean loadScreen(String name, String resource) {
        try {
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource(resource));
            System.out.println("1");
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("2");
            ControlledScreen myScreenControler = ((ControlledScreen) myLoader.getController());
            System.out.println("3");
            myScreenControler.setScreenParent(this);
            System.out.println("4");
            addScreen(name, loadScreen);
            System.out.println("5");
            return true;
        } catch (Exception e) {
            System.out.println("Rockfort Rajhsh"+e.getMessage());
            return false;
        }
    }
     
       public boolean setScreen(final String name) {       
        if (screens.get(name) != null) {   //screen loaded            

            if (!getChildren().isEmpty()) {    //if there is more than one screen
                   getChildren().remove(0);                    //remove the displayed screen
                        getChildren().add(0, screens.get(name));     //add the screen

            } else {
                getChildren().add(screens.get(name));       //no one else been displayed, then just show
            }
            return true;
        } else {
            System.out.println("screen hasn't been loaded!!! \n");
            return false;
        }
       }
     
        public boolean unloadScreen(String name) {
        if (screens.remove(name) == null) {
            System.out.println("Screen didn't exist");
            return false;
        } else {
            return true;
        }
    }
}
