package GUI;

import blocks.AirBlock;
import blocks.Block;
import blocks.NullBlock;
import blocks.SandBlock;
import javafx.event.EventHandler;
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
    public ButtonListPane(MapPane mp, InventoryPane ip){
        super();
        row1 = new HBox();
        pickrow = new TextField();
        pickcol = new TextField();

        pick = new Button("Pick");
        pick.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                int row = Integer.parseInt(pickrow.getText());
                int col = Integer.parseInt(pickcol.getText());
                BlockPane appo = mp.get_block_at_coord(row,col);
                mp.setCell(row,col,new AirBlock());
            }
        });
        row1.getChildren().addAll(pickrow,pickcol,pick);
        row2 = new HBox();
        moveFP = new TextField();
        FP = new Button("Move to Furnace");
        FP.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        });
        row2.getChildren().addAll(moveFP,FP);
        smelt = new Button("Smelt");
        moveBack = new Button("Move Back");
        sortMethod = new Button("Toggle Inventory Sorting");
        super.getChildren().addAll(row1,row2,smelt,moveBack,sortMethod);
    }
}
