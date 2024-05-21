package com.company;


import Controller.FurnaceSimpleController;
import Controller.InventorySimpleController;
import Controller.MainSimpleController;
import Controller.MapSimpleController;
import GUI.*;
import UI.Furnace;
import UI.Inventory;
import UI.MainView;
import UI.Map;
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
        MainSimpleController mc = new MainSimpleController(new MainView());
        MainGUI layout = mc.getMainGUI();
        Scene scene = new Scene(layout);
        stage.setTitle("MC2D");
        stage.setScene(scene);
        stage.show();

    }
}
