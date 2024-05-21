package GUI;

import Controller.MainSimpleController;
import UI.MapCoordinates;
import blocks.AirBlock;
import blocks.Block;
import blocks.NullBlock;
import blocks.SandBlock;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Random;

import static UI.Map.DIM_COLS;
import static UI.Map.DIM_ROWS;

public class ButtonListPane extends VBox {
    HBox row1;
    TextField pickrow;
    TextField pickcol;
    Button pick;
    HBox row2;
    TextField moveFP;
    Button FP;
    Button smelt;
    Button moveBack;
    Button sortMethod;
    public ButtonListPane(MainSimpleController mc){
        super();
        this.setAlignment(Pos.CENTER_LEFT);
        row1 = new HBox();
        pickrow = new TextField();
        pickcol = new TextField();

        pick = new Button("Pick");
        pick.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                int row = Integer.parseInt(pickrow.getText());
                int col = Integer.parseInt(pickcol.getText());
                mc.pick_up_block(row,col);
            }
        });
        row1.getChildren().addAll(pickrow,pickcol,pick);
        row2 = new HBox();
        moveFP = new TextField();
        FP = new Button("Move to Furnace");
        FP.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                int move = Integer.parseInt(moveFP.getText());
                mc.move_into_furnace_from_inventory(move);
            }
        });
        row2.getChildren().addAll(moveFP,FP);
        smelt = new Button("Smelt");
        smelt.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                mc.smelt();
            }
        });
        moveBack = new Button("Move Back");
        moveBack.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                mc.move_into_inventory_from_furnace();
            }
        });
        sortMethod = new Button("Toggle Inventory Sorting");
        sortMethod.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                // hehe no
            }
        });
        super.getChildren().addAll(row1,row2,smelt,moveBack,sortMethod);
    }
}
