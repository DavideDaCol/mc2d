package GUI;

import blocks.AirBlock;
import blocks.Block;
import blocks.RawIronBlock;
import blocks.SandBlock;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import UI.Map;

import java.util.Random;

import static UI.Map.DIM_COLS;
import static UI.Map.DIM_ROWS;

public class MapPane extends GridPane {
    public MapPane(){
        super();
        this.setAlignment(Pos.CENTER);
        initialize_air();
    }
    public void initialize_air(){
        for (int i=0; i<Map.DIM_ROWS; i++){
            for (int j=0; j<Map.DIM_COLS; j++){
                BlockPane ins = new BlockPane(new AirBlock());
                this.add(ins,j,i);
            }
        }
    }
    public static Node getElementAt(GridPane gp, int i, int j) {
        for (Node x :gp. getChildren()) {
            if ((GridPane.getRowIndex(x) == i) && (GridPane.getColumnIndex(x) == j)) {
                return x;
            }
        }
        return null;
    }
    public BlockPane get_block_at_coord(int row, int col){
        BlockPane bro;
        if(row>=0&&row<10&&col>=0&&col<10){
            bro = (BlockPane)MapPane.getElementAt(this,col,row);
        } else bro = null;
        return bro;
    }
    public void setCell(int row, int col, Block b){ //il metodo passa le coordinate nel modo giusto!
        if(row>=0&&row<10&&col>=0&&col<10){
            BlockPane change = get_block_at_coord(col,row); // javafx maledetto
            change.changeBlock(b);
        }
    }

    public void randFillTest(){
        Random rand = new Random();
        int filler = 1+rand.nextInt(DIM_COLS*DIM_ROWS);
        for (int i = 0 ; i < filler; i++){
            Block nb = new SandBlock();
            int row = rand.nextInt(DIM_ROWS);
            int col = rand.nextInt(DIM_COLS);
            int choose = rand.nextInt(2); //randomizes block choice, 0 is sand 1 is iron
            if(choose==1){
                nb = new RawIronBlock();
            }
            this.setCell(row,col,nb);
        }
    }
}
