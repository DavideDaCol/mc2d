package UI;

import blocks.*;

public class MainView {
    private Map MainMap;
    private Furnace MainFurnace;
    private Inventory MainInventory;
    public MainView(){
        MainMap = new Map();
        MainMap.randFill();
        MainFurnace = new Furnace();
        MainInventory = new Inventory();
    }
    public void display_on_out(){
        MainMap.display_on_out();
        MainFurnace.display_on_out();
        MainInventory.display_on_out();
    }
    public void move_into_furnace(MapCoordinates c){
        int row=c.getRow();
        int col=c.getCol();
        if(MainMap.isSmeltable(row,col)){
            SmeltableBlock smeltIn = MainMap.smeltableBlockPos(row,col);
            MainFurnace.setInput(smeltIn);
            MainMap.insert(new AirBlock(),row,col);
        }
    }
    public void smelt(){
        Block b = MainFurnace.smelt();
        MainInventory.add_block(b);
    }
    public void move_into_furnace_from_inventory(int i){
        SmeltableBlock move = MainInventory.get_smeltable_item(i);
        if(move!=null){
            MainFurnace.setInput(move);
        }
    }
    public void move_into_inventory_from_furnace(){
        SmeltableBlock in = MainFurnace.getInput();
        if((in!=null)) {
            MainInventory.add_block(in);
            MainFurnace.setInput(new NullBlock());
        }
    }
    public void pick_up_block(MapCoordinates c){
        int row=c.getRow();
        int col=c.getCol();
        if(MainMap.map[row][col].is_pickable()) {
            MainInventory.add_block(MainMap.map[row][col]);
        }
    }
    public void toggle_inventory_comparator(){

    }
}
