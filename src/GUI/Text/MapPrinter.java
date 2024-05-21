package GUI.Text;

import blocks.Block;
import blocks.NullBlock;

import static UI.Map.DIM_COLS;
import static UI.Map.DIM_ROWS;

public class MapPrinter implements TextPrinter{
    private Block[][] content;
    @Override
    public void display_on_out() {
        for (int i = 0; i < DIM_ROWS; i++) {
            for (int j = 0; j < DIM_COLS; j++) {
                System.out.print(this.content[i][j].display() + " ");
            }
            System.out.println();
        }
    }
    public void update(Block[][] orig){
        this.content= orig;
    }
}
