package Controller;

import GUI.MapPane;
import UI.Map;

import static UI.Map.DIM_COLS;
import static UI.Map.DIM_ROWS;

public class MapSimpleController implements SimpleController{
    Map ml;
    MapPane mp;
    public MapSimpleController(Map a, MapPane ab){
        this.ml=a;
        this.mp=ab;
        redraw();
    }
    public void redraw(){
        for(int i=0; i<DIM_ROWS; i++){
            for(int j=0; j<DIM_COLS; j++){
                this.mp.setCell(i,j,this.ml.getBlock(i,j));
            }
        }
    }

    public Map getMl() {
        return ml;
    }

    public MapPane getMp() {
        return mp;
    }
}
