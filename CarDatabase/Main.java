/**
 * Name: Carlos Mendoza
 * CIN:304972595
 *
 * Description: For this assignment we will be designing custom nodes with
 * three categories on which to group.We will be implementing a new version
 * of a linked list that has possible sublists descending from each node. We
 * will also be creating a gui because we need to show a visual representation
 * of my linked list structure.
 */
package CarDatabase;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * This is the main class where it runs my whole code and extends Application.
 */
public class Main extends Application {

    public static Stage stage;

    /**
     * The start method instantiates Menu and adds it to a scene.
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Instantiate game menu to run my game
        Menu linked = new Menu();
        //Add GameMenu into a scene in order for it to show my game
        Scene scene = new Scene(linked, 600, 500);
        stage = new Stage();
        stage.setTitle("LINKED LIST"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); //


    }
}

