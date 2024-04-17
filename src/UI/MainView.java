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
        try {
            SmeltableBlock smeltIn = MainMap.smeltableBlockPos(row, col);
            MainFurnace.setInput(smeltIn);
            MainMap.insert(new AirBlock(), row, col);
        } catch(BlockErrorException p){
           System.out.println("blocco non smeltable");
        }
    }
    public void smelt(){
        Block b = MainFurnace.smelt();
        MainInventory.add_block(b);
    }
    public void move_into_furnace_from_inventory(int i){
        try {
            SmeltableBlock move = MainInventory.get_smeltable_item(i);
            if (move != null) {
                MainFurnace.setInput(move);
                MainInventory.remove_block(move);
            }
        } catch(BlockErrorException c){
            System.out.println("can't move non-smeltable block");
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
        try {
            MainInventory.add_block(MainMap.gimme_pickable(row,col));
            MainMap.map[row][col] = new AirBlock();
            for(int i = MainMap.DIM_ROWS-2; i>=0; i--){
                if(MainMap.map[i][col].getGravity()){
                        System.out.println(MainMap.map[i + 1][col].toString());
                        int j = i;
                    while(MainMap.map[j+1][col].getThrough()){
                        MainMap.swap(j,col);
                        j++;
                    }
                    if(MainMap.map[j+1][col].display()=='T'){
                        Block b = new AirBlock();
                        MainMap.insert(b,j,col);
                    }
                }
            }
        } catch (BlockErrorException v){
            System.out.println("can't pick given block");
        }
    }
    public void toggle_inventory_comparator(){

    }
}
