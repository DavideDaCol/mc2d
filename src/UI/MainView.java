package UI;

import blocks.*;

public class MainView {
    private Map MainMap;
    private Furnace MainFurnace;
    public MainView(){
        MainMap = new Map();
        MainMap.randFill();
        MainFurnace = new Furnace();
    }
    public void mainUI() {
        MainMap.display_on_out();
        MainFurnace.display_on_out();
    }
    public void display_on_out(){
        MainMap.display_on_out();
        MainFurnace.display_on_out();
    }
    public void move_into_furnace(int row, int col){
        if(MainMap.isSmeltable(row,col)){
            SmeltableBlock smeltIn = MainMap.smeltableBlockPos(row,col);
            MainFurnace.setInput(smeltIn);
            MainMap.insert(new AirBlock(),row,col);
        }
    }
    public void smelt(){
        MainFurnace.smelt();
    }

}
