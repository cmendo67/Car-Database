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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.*;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.*;

/**
 * This class is responsible for making all my design for the gui when clicking
 * the buttons for the methods which you would like to click on.
 */
public  class LinkedListDisplay extends BorderPane {

    public static Stage stage2;
    public static Stage stage3;
    public static Stage stage4;
    public static Stage stage5;
    public static Stage stage6;
    public static Stage stage7;
    public static Stage stage8;
    public static Stage stage9;
    public static Stage stage10;
    public static Stage stage11;
    public static Stage stage12;
    public static Stage stage13;
    public static Stage stage14;
    public static Stage stage15;
    public static Stage stage16;
    public static Stage stage17;
    public static Stage stage18;

    //default constructor
    public LinkedListDisplay(){

    }

    /**
     * The LinkedListDisplay constructor takes in the LINKEDLIST list in order to access my link list.
     * Therefore, with my (list), I would use list to implement all my methods. In this constructor, all my gui code is implememented
     * in this constructor.
     * @param list
     */
    public LinkedListDisplay(LinkedList list) {
        this.getStylesheets().add("CarDatabase/Style/Styles.css");
        this.getStyleClass().add("add3");

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

        VBox linkedListTitle = new VBox(10);
        linkedListTitle.getChildren().add(text);
        linkedListTitle.setAlignment(Pos.CENTER);

        this.setTop(linkedListTitle);

        //create GridPane ;
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);


        this.setCenter(pane);

        //create a button for my first option(play)
        Button addButton = new Button("ADD");
        addButton.getStyleClass().add("menu2buttoncolor");

        //create a second button for second option(clear)
        Button clearButton = new Button("CLEAR");
        clearButton.getStyleClass().add("menu2buttoncolor");

        //create a third button for third option(deletefirst)
        Button deleteFirst = new Button("DELETEFIRST");
        deleteFirst.getStyleClass().add("menu2buttoncolor");

        //create a fourth button for fourth option(deletelast)
        Button deleteLast = new Button("DELETELAST");
        deleteLast.getStyleClass().add("menu2buttoncolor");

        //create a fifth button for fifth option(size)
        Button size = new Button("SIZE");
        size.getStyleClass().add("menu2buttoncolor");

        //create a sixth button for the sixth option(size sublist)
        Button size2 = new Button("SIZE SUBLIST");
        size2.getStyleClass().add("menu2buttoncolor");

        //create a seventh button for seventh option(delete)
        Button delete = new Button("DELETE");
        delete.getStyleClass().add("menu2buttoncolor");

        //create a eigth button for eigth option(get)
        Button get = new Button("GET");
        get.getStyleClass().add("menu2buttoncolor");

        //create a ninth button for ninth option(get sublist)
        Button get2 = new Button("GET SUBLIST");
        get2.getStyleClass().add("menu2buttoncolor");

        //create a tenth button for tenth option(regroup)
        Button regroup = new Button("REGROUP");
        regroup.getStyleClass().add("menu2buttoncolor");

        //create a eleventh button for eleventh option(display gui)
        Button displayGuiList = new Button("DISPLAY GUI");
        displayGuiList.getStyleClass().add("menu2buttoncolor");

        //Insert my buttons in a vbox
        VBox startBox = new VBox(13);
        startBox.getChildren().addAll(addButton, clearButton, deleteFirst, deleteLast, size, size2,
                delete, get, get2, regroup,displayGuiList);
        startBox.setAlignment(Pos.CENTER);

        this.setCenter(startBox);


        //use set on action when you click on addButton
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                BorderPane addPane = new BorderPane();
                addPane.getStylesheets().add("CarDatabase/Style/Styles.css");
                addPane.getStyleClass().add("title");

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

                addPane.setTop(menuTitle);

                //create Text Field
                TextField field = new TextField();
                field.setCache(true);
                field.setText("Enter Franchise");
                field.setFont(Font.font(null, FontWeight.BOLD, 30));

                Reflection reflect2 = new Reflection();
                reflect2.setFraction(0.7f);
                field.setEffect(reflect2);
                field.setTranslateY(0);

                TextField field2 = new TextField();

                field2.setCache(true);
                field2.setText("Enter model:");
                field2.setFont(Font.font(null, FontWeight.BOLD, 30));

                field2.setEffect(reflect2);
                field2.setTranslateY(0);

                TextField field3 = new TextField();

                field3.setCache(true);
                field3.setText("Enter year Of Model:");
                field3.setFont(Font.font(null, FontWeight.BOLD, 30));

                field3.setEffect(reflect2);
                field3.setTranslateY(0);

                Text a = new Text();
                a.setFont(Font.font(25));
                a.setFill(BLACK);

                VBox fieldBox = new VBox(150);
                fieldBox.getChildren().addAll(field, field2, field3);
                fieldBox.setAlignment(Pos.CENTER);

                addPane.setLeft(fieldBox);

                Button enter = new Button("ENTER");
                enter.getStyleClass().add("enter");
                enter.setAlignment(Pos.CENTER);

                Button exit = new Button("EXIT");
                exit.getStyleClass().add("enter");
                exit.setAlignment(Pos.BOTTOM_RIGHT);

                addPane.setCenter(enter);
                addPane.setRight(exit);

                if (!field.getText().isEmpty() && !field2.getText().isEmpty() && !field3.getText().isEmpty()) {

                    enter.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            String one = "";
                            String two = "";
                            String three = "";
                            for (int i = 0; i < field.getText().length(); i++) {
                                if (i == 0) {
                                    String s = field.getText().toUpperCase();
                                    char c = s.charAt(i);
                                    one += c;
                                }
                                else {
                                    String s2 = field.getText().toLowerCase();
                                    one += s2.charAt(i);
                                }
                            }
                            for (int i = 0; i < field2.getText().length(); i++) {
                                if (i == 0) {
                                    String s = field2.getText().toUpperCase();
                                    char c = s.charAt(i);
                                    two += c;
                                }
                                else {
                                    String s2 = field2.getText().toLowerCase();
                                    two += s2.charAt(i);
                                }
                            }


                            list.add(one, two, field3.getText());

                            BorderPane addPane2 = new BorderPane();
                            addPane2.getStylesheets().add("CarDatabase/Style/Styles.css");
                            addPane2.getStyleClass().add("dodge");

                            Text textEmpty = new Text();
                            textEmpty.setX(10.0f);
                            textEmpty.setY(10.0f);
                            textEmpty.setCache(true);
                            textEmpty.setText("INFORMATION ADDED");
                            textEmpty.setFill(Color.YELLOW);
                            textEmpty.setStroke(Color.BLACK);
                            textEmpty.setFont(Font.font(null, FontWeight.BOLD, 80));

                            Reflection reflectEmpty = new Reflection();
                            reflectEmpty.setFraction(0.7f);
                            textEmpty.setEffect(reflect);
                            textEmpty.setTranslateY(0);

                            //create a button for my first option(play)
                            Button clear = new Button("CLOSE WINDOW");
                            clear.getStyleClass().add("quit3buttoncolor");

                            VBox menuEmpty = new VBox(10);
                            menuEmpty.getChildren().addAll(textEmpty, clear);
                            menuEmpty.setAlignment(Pos.CENTER);

                            addPane2.setTop(menuEmpty);

                            addPane2.setCenter(clear);

                            clear.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event) {
                                    stage2.close();
                                }
                            });
                            System.out.println(list.getHead().getRight().getRight().getCategory3());

                            Scene scene = new Scene(addPane2, 1000, 500);
                            stage2 = new Stage();
                            stage2.setTitle("INFO ADDED"); // Set the stage title
                            stage2.setScene(scene); // Place the scene in the stage
                            stage2.show(); //
                        }
                    });

                }

                //use set on action when you click on exit
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        stage3.close();
                    }
                });
                // I have to add BoardDisplay in a scene in order for it to show in a window
                Scene scene = new Scene(addPane, 1500, 710);
                stage3 = new Stage();
                stage3.setTitle("ADD"); // Set the stage title
                stage3.setScene(scene); // Place the scene in the stage
                stage3.show(); //
                System.out.println("HI");
            }
        });

        //use set on action when you click on clearButton
        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list.clear();
                System.out.println(list.getHead());

                BorderPane clearPane = new BorderPane();
                clearPane.getStylesheets().add("CarDatabase/Style/Styles.css");
                clearPane.getStyleClass().add("clear");

                Text clearText = new Text();
                clearText.setX(0);
                clearText.setY(0);
                clearText.setCache(true);
                clearText.setText("LIST CLEARED");
                clearText.setFill(Color.RED);
                clearText.setStroke(Color.BLACK);
                clearText.setFont(Font.font(null, FontWeight.BOLD, 80));

                Reflection reflectEmpty = new Reflection();
                reflectEmpty.setFraction(0.7f);
                clearText.setEffect(reflectEmpty);
                clearText.setTranslateY(0);

                //create a button for my first option(play)
                Button clear = new Button("CLOSE WINDOW");
                clear.getStyleClass().add("quit2buttoncolor");

                VBox menuEmpty = new VBox(10);
                menuEmpty.getChildren().addAll(clearText, clear);
                menuEmpty.setAlignment(Pos.CENTER);

                clearPane.setTop(menuEmpty);

                clearPane.setCenter(clear);

                //use set on action when you click on clear
                clear.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        stage4.close();
                    }
                });
                Scene scene = new Scene(clearPane, 800, 500);
                stage4 = new Stage();
                stage4.setTitle("TESLA"); // Set the stage title
                stage4.setScene(scene); // Place the scene in the stage
                stage4.show(); //
            }
        });

        //use set on action when you click on deleteFirst
        deleteFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list.deleteFirst();
                System.out.println(list.getHead());

                BorderPane deletePane = new BorderPane();
                deletePane.getStylesheets().add("CarDatabase/Style/Styles.css");
                deletePane.getStyleClass().add("audir8");

                Text deleteText = new Text();
                deleteText.setX(0);
                deleteText.setY(0);
                deleteText.setCache(true);
                deleteText.setText("FIRST NODE DELETED");
                deleteText.setFill(Color.BLACK);
//                deleteText.setStroke(Color.BLACK);
                deleteText.setFont(Font.font(null, FontWeight.BOLD, 60));

                Reflection reflectDelete = new Reflection();
                reflectDelete.setFraction(0.7f);
                deleteText.setEffect(reflectDelete);
                deleteText.setTranslateY(0);

                //create a button for my first option(play)
                Button clear = new Button("CLOSE WINDOW");
                clear.getStyleClass().add("quit4buttoncolor");

                VBox menuEmpty = new VBox(10);
                menuEmpty.getChildren().addAll(deleteText, clear);
                menuEmpty.setAlignment(Pos.CENTER);

                deletePane.setTop(menuEmpty);

                deletePane.setCenter(clear);

                //use set on action when you click on clear
                clear.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        stage5.close();
                    }
                });
                Scene scene = new Scene(deletePane, 800, 500);
                stage5 = new Stage();
                stage5.setTitle("AUDI R8"); // Set the stage title
                stage5.setScene(scene); // Place the scene in the stage
                stage5.show(); //
            }
        });

        //use set on action when you click on deleteLast
        deleteLast.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list.deleteLast();
                System.out.println(list.getHead());

                BorderPane deletePane = new BorderPane();
                deletePane.getStylesheets().add("CarDatabase/Style/Styles.css");
                deletePane.getStyleClass().add("gt500");

                Text deleteText = new Text();
                deleteText.setX(0);
                deleteText.setY(0);
                deleteText.setCache(true);
                deleteText.setText("LAST NODE DELETED");
                deleteText.setFill(Color.BLACK);
//                deleteText.setStroke(Color.BLACK);
                deleteText.setFont(Font.font(null, FontWeight.BOLD, 60));

                Reflection reflectDelete = new Reflection();
                reflectDelete.setFraction(0.7f);
                deleteText.setEffect(reflectDelete);
                deleteText.setTranslateY(0);

                //create a button for my first option(play)
                Button clear = new Button("CLOSE WINDOW");
                clear.getStyleClass().add("quit5buttoncolor");

                VBox menuEmpty = new VBox(10);
                menuEmpty.getChildren().addAll(deleteText, clear);
                menuEmpty.setAlignment(Pos.CENTER);

                deletePane.setTop(menuEmpty);

                deletePane.setCenter(clear);

                //use set on action when you click on clear
                clear.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        stage6.close();
                    }
                });
                Scene scene = new Scene(deletePane, 800, 500);
                stage6 = new Stage();
                stage6.setTitle("GT500"); // Set the stage title
                stage6.setScene(scene); // Place the scene in the stage
                stage6.show(); //
            }
        });

        //use set on action when you click on delete
        delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                BorderPane addPane = new BorderPane();
                addPane.getStylesheets().add("CarDatabase/Style/Styles.css");
                addPane.getStyleClass().add("corvette");

                //create Title
                Text text = new Text();
                text.setX(10.0f);
                text.setY(10.0f);
                text.setCache(true);
                text.setText("LINKEDLIST");
                text.setFill(Color.DARKORANGE);
                text.setStroke(Color.BLACK);
                text.setFont(Font.font(null, FontWeight.BOLD, 80));

                Reflection reflect = new Reflection();
                reflect.setFraction(0.7f);
                text.setEffect(reflect);
                text.setTranslateY(0);

                VBox menuTitle = new VBox(10);
                menuTitle.getChildren().add(text);
                menuTitle.setAlignment(Pos.CENTER);

                addPane.setTop(menuTitle);

                //create Text Field
                TextField field = new TextField();

                field.setCache(true);
                field.setText("ENTER MAIN INDEX:");
                field.setFont(Font.font(null, FontWeight.BOLD, 30));


                Reflection reflect2 = new Reflection();
                reflect2.setFraction(0.7f);
                field.setEffect(reflect2);
                field.setTranslateY(0);

                TextField field2 = new TextField();

                field2.setCache(true);
                field2.setText("ENTER SUB INDEX:");
                field2.setFont(Font.font(null, FontWeight.BOLD, 30));

                field2.setEffect(reflect2);
                field2.setTranslateY(0);

                VBox fieldBox = new VBox(150);
                fieldBox.getChildren().addAll(field, field2);
                fieldBox.setAlignment(Pos.CENTER);

                addPane.setLeft(fieldBox);

                Button enter = new Button("ENTER");
                enter.getStyleClass().add("enter2");
                enter.setAlignment(Pos.CENTER);

                Button exit = new Button("EXIT");
                exit.getStyleClass().add("enter2");
                exit.setAlignment(Pos.BOTTOM_RIGHT);

                addPane.setCenter(enter);
                addPane.setBottom(exit);

                if (!field.getText().isEmpty() && !field2.getText().isEmpty()) {

                    //use set on action when you click on enter
                    enter.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {

                            list.delete(Integer.parseInt(field.getText()), Integer.parseInt(field2.getText()));

                            BorderPane addPane2 = new BorderPane();
                            addPane2.getStylesheets().add("CarDatabase/Style/Styles.css");
                            addPane2.getStyleClass().add("corvette2");

                            Text textEmpty = new Text();
                            textEmpty.setX(10.0f);
                            textEmpty.setY(10.0f);
                            textEmpty.setCache(true);
                            textEmpty.setText("SPECIFIC NODE DELETED");
                            textEmpty.setFill(Color.BLACK);
                            textEmpty.setStroke(Color.WHITE);
                            textEmpty.setFont(Font.font(null, FontWeight.BOLD, 80));

                            Reflection reflectEmpty = new Reflection();
                            reflectEmpty.setFraction(0.7f);
                            textEmpty.setEffect(reflect);
                            textEmpty.setTranslateY(0);

                            //create a button for my first option(play)
                            Button clear = new Button("CLOSE WINDOW");
                            clear.getStyleClass().add("enter2");

                            VBox menuEmpty = new VBox(10);
                            menuEmpty.getChildren().addAll(textEmpty, clear);
                            menuEmpty.setAlignment(Pos.CENTER);

                            addPane2.setTop(menuEmpty);

                            addPane2.setBottom(clear);

                            clear.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event) {
                                    stage7.close();
                                }
                            });
                            System.out.println(list.getHead().getRight().getRight().getCategory3());

                            Scene scene = new Scene(addPane2, 1200, 600);
                            stage7 = new Stage();
                            stage7.setTitle("corvette2"); // Set the stage title
                            stage7.setScene(scene); // Place the scene in the stage
                            stage7.show(); //
                        }
                    });

                }

                //use set on action when you click on exit
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        stage8.close();
                    }
                });
                // I have to add BoardDisplay in a scene in order for it to show in a window
                Scene scene = new Scene(addPane, 1200, 800);
                stage8 = new Stage();
                stage8.setTitle("corvette"); // Set the stage title
                stage8.setScene(scene); // Place the scene in the stage
                stage8.show(); //
                System.out.println("HI");
            }
        });

//        Label sizeList = new Label();
        Text sizeList = new Text();
        //use set on action when you click on size
        size.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list.size();
                System.out.println(list.size());
                BorderPane deletePane = new BorderPane();
                deletePane.getStylesheets().add("CarDatabase/Style/Styles.css");
                deletePane.getStyleClass().add("bmw");

                Text deleteText = new Text();
                deleteText.setX(0);
                deleteText.setY(0);
                deleteText.setCache(true);
                deleteText.setText("SIZE UPDATED");
                deleteText.setFill(Color.RED);
                deleteText.setStroke(Color.BLUE);
                deleteText.setFont(Font.font(null, FontWeight.BOLD, 100));

                Reflection reflectDelete = new Reflection();
                reflectDelete.setFraction(0.7f);
                deleteText.setEffect(reflectDelete);
                deleteText.setTranslateY(0);

                //create a button for my first option(play)
                Button clear = new Button("CLOSE WINDOW");
                clear.getStyleClass().add("quit6buttoncolor");

                sizeList.setX(0);
                sizeList.setY(0);
                sizeList.setCache(true);
                sizeList.setText("SIZE UPDATED");
                sizeList.setFill(Color.RED);
                sizeList.setStroke(Color.BLUE);
                sizeList.setFont(Font.font(null, FontWeight.BOLD, 180));

                Reflection reflectList = new Reflection();
                reflectList.setFraction(0.7f);
                sizeList.setEffect(reflectDelete);
                sizeList.setTranslateY(0);

                sizeList.setText(" " + list.size());

                VBox menuEmpty = new VBox(10);
                menuEmpty.getChildren().addAll(deleteText, clear);
                menuEmpty.setAlignment(Pos.CENTER);

                deletePane.setTop(menuEmpty);

                deletePane.setBottom(clear);

                deletePane.setCenter(sizeList);

                //use set on action when you click on clear
                clear.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        stage9.close();
                    }
                });
                Scene scene = new Scene(deletePane, 800, 500);
                stage9 = new Stage();
                stage9.setTitle("BMW"); // Set the stage title
                stage9.setScene(scene); // Place the scene in the stage
                stage9.show(); //
            }
        });


        Text subList = new Text();
//use set on action when you click on size2
        size2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                BorderPane addPane = new BorderPane();
                addPane.getStylesheets().add("CarDatabase/Style/Styles.css");
                addPane.getStyleClass().add("gtr");

                //create Title
                Text text = new Text();
                text.setX(10.0f);
                text.setY(10.0f);
                text.setCache(true);
                text.setText("LINKEDLIST");
                text.setFill(Color.RED);
                text.setStroke(Color.BLACK);
                text.setFont(Font.font(null, FontWeight.BOLD, 80));

                Reflection reflect = new Reflection();
                reflect.setFraction(0.7f);
                text.setEffect(reflect);
                text.setTranslateY(0);

                VBox menuTitle = new VBox(10);
                menuTitle.getChildren().add(text);
                menuTitle.setAlignment(Pos.CENTER);

                addPane.setTop(menuTitle);

                //create Text Field
                TextField field = new TextField();

                field.setCache(true);
                field.setText("ENTER SUBLIST INDEX:");
                field.setFont(Font.font(null, FontWeight.BOLD, 30));


                Reflection reflect2 = new Reflection();
                reflect2.setFraction(0.7f);
                field.setEffect(reflect2);
                field.setTranslateY(0);

                VBox fieldBox = new VBox(150);
                fieldBox.getChildren().addAll(field);
                fieldBox.setAlignment(Pos.CENTER);

                addPane.setLeft(fieldBox);

                Button enter = new Button("ENTER");
                enter.getStyleClass().add("enter3");
                enter.setAlignment(Pos.CENTER);

                Button exit = new Button("EXIT");
                exit.getStyleClass().add("enter3");
                exit.setAlignment(Pos.BOTTOM_RIGHT);

                addPane.setCenter(enter);
                addPane.setBottom(exit);

                if (!field.getText().isEmpty()) {

                    //use set on action when you click on enter
                    enter.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {

                            BorderPane addPane2 = new BorderPane();
                            addPane2.getStylesheets().add("CarDatabase/Style/Styles.css");
                            addPane2.getStyleClass().add("gtr2");

                            Text textEmpty = new Text();
                            textEmpty.setX(10.0f);
                            textEmpty.setY(10.0f);
                            textEmpty.setCache(true);
                            textEmpty.setText("SUBLIST SIZE");
                            textEmpty.setFill(Color.RED);
                            textEmpty.setStroke(Color.BLACK);
                            textEmpty.setFont(Font.font(null, FontWeight.BOLD, 80));

                            Reflection reflectEmpty = new Reflection();
                            reflectEmpty.setFraction(0.7f);
                            textEmpty.setEffect(reflect);
                            textEmpty.setTranslateY(0);

                            subList.setX(0);
                            subList.setY(0);
                            subList.setCache(true);
                            subList.setText("SIZE UPDATED");
                            subList.setFill(Color.RED);
                            subList.setStroke(Color.BLACK);
                            subList.setFont(Font.font(null, FontWeight.BOLD, 180));

                            Reflection reflectList = new Reflection();
                            reflectList.setFraction(0.7f);
                            subList.setEffect(reflectEmpty);
                            subList.setTranslateY(0);

                            subList.setText(" " +list.size(Integer.parseInt(field.getText())));

                            //create a button for my first option(close window)
                            Button clear = new Button("CLOSE WINDOW");
                            clear.getStyleClass().add("enter3");

                            VBox menuEmpty = new VBox(10);
                            menuEmpty.getChildren().addAll(textEmpty, clear);
                            menuEmpty.setAlignment(Pos.CENTER);

                            addPane2.setTop(menuEmpty);

                            addPane2.setBottom(clear);

                            addPane2.setCenter(subList);

                            //use set on action when you click on clear
                            clear.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event) {
                                    stage10.close();
                                }
                            });
                            System.out.println(list.getHead().getRight().getRight().getCategory3());

                            Scene scene = new Scene(addPane2, 1200, 600);
                            stage10 = new Stage();
                            stage10.setTitle("gtr"); // Set the stage title
                            stage10.setScene(scene); // Place the scene in the stage
                            stage10.show(); //
                        }
                    });

                }

                //use set on action when you click on exit
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        stage11.close();
                    }
                });
                // I have to add BoardDisplay in a scene in order for it to show in a window
                Scene scene = new Scene(addPane, 1200, 800);
                stage11 = new Stage();
                stage11.setTitle("gtr2"); // Set the stage title
                stage11.setScene(scene); // Place the scene in the stage
                stage11.show(); //
                System.out.println("HI");
            }
        });

        Text text2 = new Text();
        //use set on action when you click on get
        get.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                BorderPane addPane = new BorderPane();
                addPane.getStylesheets().add("CarDatabase/Style/Styles.css");
                addPane.getStyleClass().add("ferrari");

                //create Title
                Text text = new Text();
                text.setX(10.0f);
                text.setY(10.0f);
                text.setCache(true);
                text.setText("LINKEDLIST");
                text.setFill(Color.RED);
                text.setStroke(Color.BLACK);
                text.setFont(Font.font(null, FontWeight.BOLD, 80));

                Reflection reflect = new Reflection();
                reflect.setFraction(0.7f);
                text.setEffect(reflect);
                text.setTranslateY(0);

                VBox menuTitle = new VBox(10);
                menuTitle.getChildren().add(text);
                menuTitle.setAlignment(Pos.CENTER);

                addPane.setTop(menuTitle);

                //create Text Field
                TextField field = new TextField();

                field.setCache(true);
                field.setText("ENTER MAIN INDEX:");
                field.setFont(Font.font(null, FontWeight.BOLD, 30));


                Reflection reflect2 = new Reflection();
                reflect2.setFraction(0.7f);
                field.setEffect(reflect2);
                field.setTranslateY(0);

                TextField field2 = new TextField();

                field2.setCache(true);
                field2.setText("Enter CATEGORY(1-3):");
                field2.setFont(Font.font(null, FontWeight.BOLD, 30));

                field2.setEffect(reflect2);
                field2.setTranslateY(0);

                VBox fieldBox = new VBox(150);
                fieldBox.getChildren().addAll(field, field2);
                fieldBox.setAlignment(Pos.CENTER);

                addPane.setLeft(fieldBox);

                Button enter = new Button("ENTER");
                enter.getStyleClass().add("enter4");
                enter.setAlignment(Pos.CENTER);

                Button exit = new Button("EXIT");
                exit.getStyleClass().add("enter4");
                exit.setAlignment(Pos.BOTTOM_RIGHT);

                addPane.setCenter(enter);
                addPane.setRight(exit);

                if (!field.getText().isEmpty() && !field2.getText().isEmpty()) {

                    //use set on action when you click on enter
                    enter.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {

                            text2.setX(0);
                            text2.setY(0);
                            text2.setCache(true);
                            text2.setText("SIZE UPDATED");
                            text2.setFill(Color.WHITE);
                            text2.setStroke(Color.BLACK);
                            text2.setFont(Font.font(null, FontWeight.BOLD, 90));


                            Reflection ref = new Reflection();
                            ref.setFraction(0.7f);
                            text2.setEffect(ref);
                            text2.setTranslateY(0);

                            text2.setText(" " +  list.get(Integer.parseInt(field.getText()), Integer.parseInt(field2.getText())));

//                            list.get(Integer.parseInt(field.getText()),Integer.parseInt(field2.getText()) );

                            BorderPane addPane2 = new BorderPane();
                            addPane2.getStylesheets().add("CarDatabase/Style/Styles.css");
                            addPane2.getStyleClass().add("ferrariinterior");

                            Text textEmpty = new Text();
                            textEmpty.setX(10.0f);
                            textEmpty.setY(10.0f);
                            textEmpty.setCache(true);
                            textEmpty.setText("Chosen Category Value");
                            textEmpty.setFill(Color.BLACK);
                            textEmpty.setFont(Font.font(null, FontWeight.BOLD, 80));

                            Reflection reflectEmpty = new Reflection();
                            reflectEmpty.setFraction(0.7f);
                            textEmpty.setEffect(reflect);
                            textEmpty.setTranslateY(0);

                            //create a button for my first option(play)
                            Button clear = new Button("CLOSE WINDOW");
                            clear.getStyleClass().add("enter4");

                            VBox menuEmpty = new VBox(10);
                            menuEmpty.getChildren().addAll(textEmpty, clear);
                            menuEmpty.setAlignment(Pos.CENTER);

                            addPane2.setTop(menuEmpty);

                            addPane2.setBottom(clear);

                            addPane2.setCenter(text2);


                            //use set on action when you click on clear
                            clear.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event) {
                                    stage12.close();
                                }
                            });
                            System.out.println(list.getHead().getRight().getRight().getCategory3());

                            Scene scene = new Scene(addPane2, 1000, 800);
                            stage12 = new Stage();
                            stage12.setTitle("FERRARI2"); // Set the stage title
                            stage12.setScene(scene); // Place the scene in the stage
                            stage12.show(); //
                        }
                    });

                }

                //use set on action when you click on exit
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        stage13.close();
                    }
                });
                // I have to add BoardDisplay in a scene in order for it to show in a window
                Scene scene = new Scene(addPane, 1500, 800);
                stage13 = new Stage();
                stage13.setTitle("FERRARI"); // Set the stage title
                stage13.setScene(scene); // Place the scene in the stage
                stage13.show(); //
                System.out.println("HI");
            }
        });

            Text getText = new Text();
        //use set on action when you click on get2
        get2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                BorderPane addPane = new BorderPane();
                addPane.getStylesheets().add("CarDatabase/Style/Styles.css");
                addPane.getStyleClass().add("track");

                //create Title
                Text text = new Text();
                text.setX(10.0f);
                text.setY(10.0f);
                text.setCache(true);
                text.setText("LINKEDLIST");
                text.setFill(Color.WHITE);
                text.setFont(Font.font(null, FontWeight.BOLD, 80));

                Reflection reflect = new Reflection();
                reflect.setFraction(0.7f);
                text.setEffect(reflect);
                text.setTranslateY(0);

                VBox menuTitle = new VBox(10);
                menuTitle.getChildren().add(text);
                menuTitle.setAlignment(Pos.CENTER);

                addPane.setTop(menuTitle);

                //create Text Field
                TextField field = new TextField();

                field.setCache(true);
                field.setText("ENTER MAIN INDEX:");
                field.setFont(Font.font(null, FontWeight.BOLD, 30));


                Reflection reflect2 = new Reflection();
                reflect2.setFraction(0.7f);
                field.setEffect(reflect2);
                field.setTranslateY(0);

                TextField field2 = new TextField();

                field2.setCache(true);
                field2.setText("ENTER SUBINDEX:");
                field2.setFont(Font.font(null, FontWeight.BOLD, 30));

                field2.setEffect(reflect2);
                field2.setTranslateY(0);

                TextField field3 = new TextField();

                field3.setCache(true);
                field3.setText("ENTER CATEGORY:");
                field3.setFont(Font.font(null, FontWeight.BOLD, 30));

                field3.setEffect(reflect2);
                field3.setTranslateY(0);

                VBox fieldBox = new VBox(150);
                fieldBox.getChildren().addAll(field, field2, field3);
                fieldBox.setAlignment(Pos.CENTER);

                addPane.setLeft(fieldBox);

                Button enter = new Button("ENTER");
                enter.getStyleClass().add("enter5");
                enter.setAlignment(Pos.CENTER);

                Button exit = new Button("EXIT");
                exit.getStyleClass().add("enter5");
                exit.setAlignment(Pos.BOTTOM_RIGHT);

                addPane.setCenter(enter);
                addPane.setRight(exit);

                if (!field.getText().isEmpty() && !field2.getText().isEmpty() && !field3.getText().isEmpty()) {

                    //use set on action when you click on enter
                    enter.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {


                            BorderPane addPane2 = new BorderPane();
                            addPane2.getStylesheets().add("CarDatabase/Style/Styles.css");
                            addPane2.getStyleClass().add("bmwinterior");

                            Text textEmpty = new Text();
                            textEmpty.setX(10.0f);
                            textEmpty.setY(10.0f);
                            textEmpty.setCache(true);
                            textEmpty.setText("CURRENT NODE");
                            textEmpty.setFill(Color.WHITE);
                            textEmpty.setStroke(Color.WHITE);
                            textEmpty.setFont(Font.font(null, FontWeight.BOLD, 80));

                            getText.setX(0);
                            getText.setY(0);
                            getText.setCache(true);
                            getText.setText("SIZE UPDATED");
                            getText.setFill(Color.WHITE);
                            getText.setStroke(Color.BLACK);
                            getText.setFont(Font.font(null, FontWeight.BOLD, 90));

                            Reflection reflectEmpty = new Reflection();
                            reflectEmpty.setFraction(0.7f);
                            textEmpty.setEffect(reflect);
                            textEmpty.setTranslateY(0);

                            getText.setEffect(reflectEmpty);
                            getText.setTranslateY(0);

                            getText.setText(" " +  list.get(Integer.parseInt(field.getText()), Integer.parseInt(field2.getText()), Integer.parseInt(field3.getText())));

                            //create a button for my first option(close window)
                            Button clear = new Button("CLOSE WINDOW");
                            clear.getStyleClass().add("enter5");

                            VBox menuEmpty = new VBox(10);
                            menuEmpty.getChildren().addAll(textEmpty, clear);
                            menuEmpty.setAlignment(Pos.CENTER);

                            addPane2.setTop(menuEmpty);

                            addPane2.setBottom(clear);

                            addPane2.setCenter(getText);

                            //use set on action when you click on clear
                            clear.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event) {
                                    stage14.close();
                                }
                            });
                            System.out.println(list.getHead().getRight().getRight().getCategory3());

                            Scene scene = new Scene(addPane2, 1200, 700);
                            stage14 = new Stage();
                            stage14.setTitle("Bmw Interior"); // Set the stage title
                            stage14.setScene(scene); // Place the scene in the stage
                            stage14.show(); //
                        }
                    });

                }

                //use set on action when you click on exit
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        stage15.close();
                    }
                });
                // I have to add BoardDisplay in a scene in order for it to show in a window
                Scene scene = new Scene(addPane, 1500, 710);
                stage15 = new Stage();
                stage15.setTitle("Track"); // Set the stage title
                stage15.setScene(scene); // Place the scene in the stage
                stage15.show(); //
                System.out.println("HI");
            }
        });


        //use set on action when you click on regroup
        regroup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                BorderPane addPane = new BorderPane();
                addPane.getStylesheets().add("CarDatabase/Style/Styles.css");
                addPane.getStyleClass().add("mclaren");

                //create Title
                Text text = new Text();
                text.setX(10.0f);
                text.setY(10.0f);
                text.setCache(true);
                text.setText("LINKEDLIST");
                text.setFill(Color.WHITE);
                text.setStroke(Color.BLACK);
                text.setFont(Font.font(null, FontWeight.BOLD, 80));

                Reflection reflect = new Reflection();
                reflect.setFraction(0.7f);
                text.setEffect(reflect);
                text.setTranslateY(0);

                VBox menuTitle = new VBox(10);
                menuTitle.getChildren().add(text);
                menuTitle.setAlignment(Pos.CENTER);

                addPane.setTop(menuTitle);

                //create Text Field
                TextField field = new TextField();

                field.setCache(true);
                field.setText("GROUPING CATEGORY:");
                field.setFont(Font.font(null, FontWeight.BOLD, 40));


                Reflection reflect2 = new Reflection();
                reflect2.setFraction(0.7f);
                field.setEffect(reflect2);
                field.setTranslateY(0);

                field.setEffect(reflect2);
                field.setTranslateY(0);

                VBox fieldBox = new VBox(150);
                fieldBox.getChildren().addAll(field);
                fieldBox.setAlignment(Pos.CENTER);

                addPane.setLeft(fieldBox);

                Button enter = new Button("ENTER");
                enter.getStyleClass().add("enter6");
                enter.setAlignment(Pos.CENTER);

                Button exit = new Button("EXIT");
                exit.getStyleClass().add("enter6");
                exit.setAlignment(Pos.BOTTOM_RIGHT);

                addPane.setCenter(enter);
                addPane.setRight(exit);

                if (!field.getText().isEmpty()) {

                    //use set on action when you click on enter
                    enter.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {

                            list.regroup(Integer.parseInt(field.getText()));

                            BorderPane addPane2 = new BorderPane();
                            addPane2.getStylesheets().add("CarDatabase/Style/Styles.css");
                            addPane2.getStyleClass().add("mclareninterior");

                            Text textEmpty = new Text();
                            textEmpty.setX(10.0f);
                            textEmpty.setY(10.0f);
                            textEmpty.setCache(true);
                            textEmpty.setText("LIST HAS BEEN REGROUPED");
                            textEmpty.setFill(Color.ORANGE);
                            textEmpty.setStroke(Color.BLACK);
                            textEmpty.setFont(Font.font(null, FontWeight.BOLD, 60));

                            Reflection reflectEmpty = new Reflection();
                            reflectEmpty.setFraction(0.7f);
                            textEmpty.setEffect(reflect);
                            textEmpty.setTranslateY(0);

                            //create a button for my first option(play)
                            Button clear = new Button("CLOSE WINDOW");
                            clear.getStyleClass().add("enter7");

                            VBox menuEmpty = new VBox(10);
                            menuEmpty.getChildren().addAll(textEmpty, clear);
                            menuEmpty.setAlignment(Pos.CENTER);

                            addPane2.setCenter(menuEmpty);

                            addPane2.setBottom(clear);

                            //use set on action when you click on clear
                            clear.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event) {
                                    stage16.close();
                                }
                            });
//                            System.out.println(list.getHead().getRight().getRight().getCategory3());

                            Scene scene = new Scene(addPane2, 1000, 800);
                            stage16 = new Stage();
                            stage16.setTitle("MCLAREN INTERIOR"); // Set the stage title
                            stage16.setScene(scene); // Place the scene in the stage
                            stage16.show(); //
                        }
                    });

                }

                //use set on action when you click on exit
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        stage17.close();
                    }
                });
                // I have to add BoardDisplay in a scene in order for it to show in a window
                Scene scene = new Scene(addPane, 1500, 800);
                stage17 = new Stage();
                stage17.setTitle("MCLAREN"); // Set the stage title
                stage17.setScene(scene); // Place the scene in the stage
                stage17.show(); //
                System.out.println("HI");
            }
        });



        Text nodeText = new Text();
        //use set on action when you click on displayGuiList+
        displayGuiList.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                BorderPane addPane = new BorderPane();
                addPane.getStylesheets().add("CarDatabase/Style/Styles.css");
                addPane.getStyleClass().add("fordgt");

                GridPane nodePane = new GridPane();
                nodePane.setAlignment(Pos.CENTER);
                nodePane.setVgap(10);
                nodePane.setHgap(10);

                Node current;
                Node current2;

                current = list.getHead();
                current2 = list.getHead();

                int i = 0;
                int x = 0;
                int y = 0;

                System.out.println("list size: "+list.size());
//                Node current3 = list.getHead().right;
//
//                while(current3 != null) {
//                    System.out.println(current3.getCategory2());
//                    current3 = current3.down;
//                }
                while(i != list.size()){
                    if(current != null){

                        Label firstNode = new Label("FRANCHISE:" + current.getCategory1());
                        Label secondNode= new Label("NAME OF VEHCLE:" + current.getCategory2());
                        Label thirdNode = new Label("YEAR" + current.getCategory3());
                        firstNode.setTextFill(WHITE);
                        firstNode.setCache(true);
                        firstNode.setFont(Font.font(null,FontWeight.BOLD,19));
                        firstNode.setAlignment(Pos.CENTER_LEFT);

                        secondNode.setTextFill(WHITE);
                        secondNode.setCache(true);
                        secondNode.setFont(Font.font(null,FontWeight.BOLD,19));
                        secondNode.setAlignment(Pos.CENTER_LEFT);

                        thirdNode.setTextFill(WHITE);
                        thirdNode.setCache(true);
                        thirdNode.setFont(Font.font(null,FontWeight.BOLD,19));
                        secondNode.setAlignment(Pos.CENTER_LEFT);

                        VBox nodeBox = new VBox();
                        nodeBox.setAlignment(Pos.CENTER);
                        nodeBox.getChildren().addAll(firstNode,secondNode,thirdNode);

                        nodePane.add(nodeBox,y,x);

//                        System.out.println(y +""+x);

                        addPane.setCenter(nodePane);


                        current = current.down;
                        x = x + 1;
                    }

                    else{
                        current2 = current2.right;
                        current = current2;
                        i = i + 1;
                            y = y + 1;

                            x = 0;
                    }
                }
                Scene scene = new Scene(addPane, 1200, 600);
                stage18 = new Stage();
                stage18.setTitle("FORD GT"); // Set the stage title
                stage18.setScene(scene); // Place the scene in the stage
                stage18.show(); //
            }
        });
    }
}