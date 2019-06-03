import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Scene extends Application{

    BubbleSort bubbleSort;
    ChoiceSort choiceSort;
    InsertSort insertSort;
    MergerSort mergerSort;
    QuickSort quickSort;
    SwapSort swapSort;

    int num = 0;

    public static void main(String[] args){
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SortArray");

        BorderPane mainl = new BorderPane();
        mainl.setPadding(new Insets(15,15,15,15));

        final int[] array = new int[80];
        final Random random = new Random();
        for(int i =0; i < 80; i++){
            array[i] = random.nextInt(600);
        }

//        Button rand = new Button("Рандом");
//        rand.setAlignment(Pos.BOTTOM_CENTER);
        final Button buttonBubble = new Button("BubbleSort");
        Button buttonChoice = new Button("ChoiceSort");
        Button buttonInsert = new Button("InsertSort");
        Button buttonMerge = new Button("MergeSort");
        Button buttonQuick = new Button("QuickSort");
        final Button buttonSwap = new Button("SwapSort");

//        HBox hBox1 = new HBox();
//        hBox1.setAlignment(Pos.CENTER);
//        hBox1.getChildren().add(rand);
        HBox hBox2 = new HBox();
        hBox2.setAlignment(Pos.CENTER);
        hBox2.setSpacing(15);
        hBox2.getChildren().addAll(buttonBubble,buttonChoice,buttonInsert);
        HBox hBox3 = new HBox();
        hBox3.setAlignment(Pos.CENTER);
        hBox3.setSpacing(15);
        hBox3.getChildren().addAll(buttonMerge,buttonQuick,buttonSwap);
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.getChildren().addAll(hBox2,hBox3);

        buttonBubble.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                num++;
                bubbleSort = new BubbleSort(array);
                bubbleSort.chcolor(num);
                bubbleSort.showRect();
                for(int i =0; i < 80; i++){
                    array[i] = random.nextInt(600);
                }
            }
        });

        buttonChoice.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                choiceSort = new ChoiceSort(array);
                num++;
                choiceSort.chcolor(num);
                choiceSort.showRect();
                for(int i =0; i < 80; i++){
                    array[i] = random.nextInt(600);
                }
            }
        });

        buttonInsert.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                insertSort = new InsertSort(array);
                num++;
                insertSort.chcolor(num);
                insertSort.showRect();
                for(int i = 0; i < 80; i++){
                    array[i] = random.nextInt(600);
                }
            }
        });

        buttonMerge.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                mergerSort = new MergerSort(array);
                num++;
                mergerSort.chcolor(num);
                mergerSort.showRect();
                for(int i =0; i < 80; i++){
                    array[i] = random.nextInt(600);
                }
            }
        });

        buttonQuick.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                quickSort = new QuickSort(array);
                num++;
                quickSort.chcolor(num);
                quickSort.showRect();
                for(int i =0; i < 80; i++){
                    array[i] = random.nextInt(600);
                }
            }
        });

        buttonSwap.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                num++;
                swapSort = new SwapSort(array);
                swapSort.chcolor(num);
                swapSort.showRect();
                for(int i =0; i < 80; i++){
                    array[i] = random.nextInt(600);
                }
            }
        });

        HBox buttons = new HBox();
        buttons.setSpacing(10);
        Button rand = new Button("Random");
        Button read = new Button("Read array");
        Button sort = new Button("Sort");
        buttons.getChildren().addAll(rand,read,sort);

        VBox l = new VBox();
        final Label label = new Label("Введіть масив:");
        final HBox textF = new HBox();
        final TextField textField = new TextField();
        final TextField textField1 = new TextField();
        final TextField textField2 = new TextField();
        final TextField textField3 = new TextField();
        final TextField textField4 = new TextField();
        final TextField textField5 = new TextField();
        final TextField textField6 = new TextField();
        final TextField textField7 = new TextField();
        final TextField textField8 = new TextField();
        final TextField textField9 = new TextField();
        textF.getChildren().addAll(textField,textField1,textField2,textField3
        ,textField4,textField5,textField6,textField7,textField8,textField9);
        l.setSpacing(10);
        l.getChildren().addAll(label,textF,buttons);

        final String [] ar = new String[10];
        final  int[] a = new int[10];

        rand.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                for (int i = 0; i < 10; i++){
                    a[i] = random.nextInt(1000);
                }
                textField.setText("" + a[0]);
                textField1.setText("" + a[1]);
                textField2.setText("" + a[2]);
                textField3.setText("" + a[3]);
                textField4.setText("" + a[4]);
                textField5.setText("" + a[5]);
                textField6.setText("" + a[6]);
                textField7.setText("" + a[7]);
                textField8.setText("" + a[8]);
                textField9.setText("" + a[9]);

            }
        });
        read.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                ar[0] = textField.getText();
                ar[1] = textField1.getText();
                ar[2] = textField2.getText();
                ar[3] = textField3.getText();
                ar[4] = textField4.getText();
                ar[5] = textField5.getText();
                ar[6] = textField6.getText();
                ar[7] = textField7.getText();
                ar[8] = textField8.getText();
                ar[9] = textField9.getText();
                for (int i = 0; i < 10; i++){
                    a[i] = Integer.parseInt(ar[i]);
                }
            }
        });

        sort.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                for(int i = 0; i < a.length; i++){
                    int x = 0;
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[j] < a[i]) {
                            x = a[j];
                            a[j] = a[i];
                            a[i] = x;
                        }
                    }
                }
                textField.setText("" + a[0]);
                textField1.setText("" + a[1]);
                textField2.setText("" + a[2]);
                textField3.setText("" + a[3]);
                textField4.setText("" + a[4]);
                textField5.setText("" + a[5]);
                textField6.setText("" + a[6]);
                textField7.setText("" + a[7]);
                textField8.setText("" + a[8]);
                textField9.setText("" + a[9]);

            }
        });

        mainl.setTop(vBox);
        mainl.setCenter(l);
        primaryStage.setScene(new javafx.scene.Scene(mainl,500,300));
        primaryStage.show();
    }

}
