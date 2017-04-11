/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author kamalanathanr
 */
public class FXMLDocumentController implements Initializable, ControlledScreen {
    
    @FXML
    private Label label;
    private ScreenController myController;
    
    @FXML
    private void goToScreen2(ActionEvent event) {
        System.out.println("You clicked me!");
         myController.setScreen(JavaFXApplication4.screen2ID);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void setScreenParent(ScreenController screenParent) {
        //throw new UnsupportedOperationException("Not supported yet.");
        myController = screenParent;
    }
    
}
