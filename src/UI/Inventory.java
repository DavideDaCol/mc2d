package UI;

import blocks.Block;
import blocks.SmeltableBlock;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
    private ArrayList<Block> invSpace;
    public Inventory(){
        invSpace = new ArrayList<>();
    }
    public void display_on_out(){
        Iterator<Block> iter = this.invSpace.iterator();
        while (iter.hasNext()) {
            iter.next().display_in_inventory();
        }
        System.out.println();
    }
    public void add_block(Block b){
        this.invSpace.add(b);
    }

    public boolean is_smeltable(int index){
        return (this.invSpace.get(index) instanceof SmeltableBlock);
    }

    public SmeltableBlock get_smeltable_item(int index){
        if(is_smeltable(index)){
            return ((SmeltableBlock)this.invSpace.get(index));
        }
        return null;
    }
}
