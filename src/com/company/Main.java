package com.company;


import GUI.*;
import blocks.Block;
import blocks.GlassBlock;
import blocks.RawIronBlock;
import blocks.SandBlock;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static UI.Map.DIM_COLS;
import static UI.Map.DIM_ROWS;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BlockPane a = new BlockPane(new SandBlock());
        BlockPane b = new BlockPane(new RawIronBlock());
        BlockPane c = new BlockPane(new GlassBlock());
        InventoryPane test = new InventoryPane();
        test.getChildren().addAll(a,b,c);
        FurnacePane mainFurnace = new FurnacePane();
        MapPane mainmap = new MapPane();
        mainmap.randFillTest();
        MainGUI mainview = new MainGUI(mainmap,new ButtonListPane(mainmap,test),mainFurnace);
        Group root = new Group(mainview);
        Scene scene = new Scene(root, 700, 700);
        stage.setTitle("MC2D");
        stage.setScene(scene);
        stage.show();
    }
}
