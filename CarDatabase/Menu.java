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


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * The Purpose of this class was to seperate my game menu gui code with my board display gui code.
 * This class displays my game Menu to start my game.
 */
public class Menu extends LinkedListDisplay {

    public static Stage stageSecond;

    /**
     * This method creates my start menu to start testing my code.
     */
    public Menu() {
        //BorderPane has access to my csss file to get my images for my background game menu.
        this.getStylesheets().add("CarDatabase/Style/styles.css");
        this.getStyleClass().add("menu");

        //create a button for my first option(GO)
        Button startButton = new Button("GO");
        startButton.getStyleClass().add("quitbuttoncolor");

        //create a second button for second option(EXIT)
        Button exitButton = new Button("EXIT");
        exitButton.getStyleClass().add("quitbuttoncolor");

        //Insert my buttons in a vbox
        VBox startBox = new VBox(10);
        startBox.getChildren().addAll(startButton, exitButton);
        startBox.setAlignment(Pos.CENTER);

        //use set on action when you click on start Linked List
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                //when you click on go, list of methods should pop out and show you buttons that allows to click on any method.
                //I have to instantiate LinkedListDisplay in order to show my options of buttons.
                //I also have to instantiate LinkedList in order to have access to my list.
                LinkedList list = list();
                LinkedListDisplay linkList = new LinkedListDisplay(list);
                // I have to add LinkedList in a scene in order for it to show in a window
                Scene scene = new Scene(linkList, 2000, 1000);
                stageSecond = new Stage();
                stageSecond.setTitle("LINKED List"); // Set the stage title
                stageSecond.setScene(scene); // Place the scene in the stage
                stageSecond.show(); //
                Main.stage.close();

            }
        });
        //use set on action when you click on exit
        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

        //create Title
        Text text = new Text();
        text.setX(10.0f);
        text.setY(10.0f);
        text.setCache(true);
        text.setText("LINKEDLIST");
        text.setFill(Color.BLACK);
        text.setFont(Font.font(null, FontWeight.BOLD, 80));

        Reflection reflect = new Reflection();
        reflect.setFraction(0.7f);
        text.setEffect(reflect);
        text.setTranslateY(0);

        VBox menuTitle = new VBox(10);
        menuTitle.getChildren().add(text);
        menuTitle.setAlignment(Pos.CENTER);

        //Add menuTitle title and my buttons into border pane(this)
//        this.setTop(menuTitle);
        this.setTop(menuTitle);
        this.setCenter(startBox);
    }

    /**
     * This method return my linked list that I created i order to test my methods
     * and have a list of linked lists to display in GUI.
     *
     * @return returns my Linked list
     */
    public static LinkedList list() {

        LinkedList<String, String, Integer> list = new LinkedList(1);

        list.add("Ford", " SVT Cobra", 2003);
        list.add("Ford", "Shelby Gt 500", 2020);
        list.add("Ford", "SVT LIGHTNING", 1993);
        list.add("Nissan", "350 Z", 2006);
        list.add("Nissan", "370 Z", 2019);
        list.add("Chevrolet", "Camaro SS", 2016);
        list.add("Chevrolet", "Corvette Zo6", 2016);
        list.add("BMW", "E92 M3", 2013);
        list.add("BMW", "X5", 2007);
        list.add("DODGE", "CHALLENGER DEMON", 2018);
        list.add("DODGE", "CHARGER HELLCAT", 2016);

        return list;
    }
}
