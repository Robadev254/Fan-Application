package com.example.fans;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FanApplication extends Application {
    @Override
    public void start(Stage stage) {
        Pane firstFan = fan();
        Pane secondFan = fan();
        Pane thirdFan = fan();
        Pane fourthFan = fan();
        GridPane gridPane = new GridPane();
        gridPane.add(firstFan, 0, 0);
        gridPane.add(secondFan, 0, 1);
        gridPane.add(thirdFan, 1, 0);
        gridPane.add(fourthFan, 1, 1);
        Scene scene = new Scene(gridPane, 200, 200);
        stage.setTitle("Fans");
        stage.setScene(scene);
        stage.show();
    }
    private Pane fan() {
        Pane pane = new Pane();
        Arc arcOne = fanBlade(0);
        Arc arcTwo = fanBlade(90);
        Arc arcThree = fanBlade(180);
        Arc arcFour = fanBlade(-90);
        Circle fanCircle = new Circle(50, 50, 45);
        fanCircle.setFill(Color.TRANSPARENT);
        fanCircle.setStroke(Color.BLACK);
        pane.getChildren().addAll(arcOne, arcTwo, arcThree, arcFour, fanCircle);
        return pane;
    }
    private Arc fanBlade(double angle) {
        Arc arc = new Arc(50, 50, 40, 40, angle, 45);
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.BLACK); // Set blade color
        return arc;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
