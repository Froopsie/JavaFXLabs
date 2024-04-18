package com.example.javafxlabs;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class Lab1 extends Application {
    @Override
    public void start(Stage primaryStage) {


        GridPane pane = new GridPane();
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.setAlignment(Pos.CENTER);

        //       pane.setPadding(new Insets(5,5,5,5));
        URL urlGiraffe = this.getClass().getResource("Giraffe.png");
        Image imgGiraffe = new Image(String.valueOf(urlGiraffe));
        ImageView imageView1 = new ImageView(imgGiraffe);
        imageView1.setFitHeight(200);


        pane.add(imageView1, 1, 0);

        URL urlChicken = this.getClass().getResource("chicken.png");
        Image imgChicken = new Image(String.valueOf(urlChicken));
        pane.getChildren().add(new ImageView(imgChicken));

        URL urlDog = this.getClass().getResource("labImagesOnGrib/dog.png");
        Image imgDog = new Image(String.valueOf(urlDog));
        pane.getChildren().add(new ImageView(imgDog));

        URL urlRooster = this.getClass().getResource("labImagesOnGrib/rooster.png");
        Image imgRooster = new Image(String.valueOf(urlRooster));
        pane.getChildren().add(new ImageView(imgRooster));

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
