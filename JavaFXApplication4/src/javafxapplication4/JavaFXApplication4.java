/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author kamalanathanr
 */
public class JavaFXApplication4 extends Application {
    
    public static String screen1ID = "main";//Description about the screen
    public static String screen1File = "FXMLDocument.fxml"; //its relavent filename
    
    public static String screen2ID = "SecondController";
    public static String screen2File = "Second.fxml";
    
    
    @Override
    public void start(Stage stage) throws Exception {
        ScreenController mainContainer = new ScreenController();
        mainContainer.loadScreen(JavaFXApplication4.screen1ID, JavaFXApplication4.screen1File);
        mainContainer.loadScreen(JavaFXApplication4.screen2ID, JavaFXApplication4.screen2File);
        
       mainContainer.setScreen(JavaFXApplication4.screen1ID);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
