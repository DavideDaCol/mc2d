package UI;

import blocks.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class Inventory {
    private ArrayList<Block> invSpace;
    private Comparator<Block> comp;
    public Inventory(){
        invSpace = new ArrayList<>();
        comp = new AlphabeticalBlockComparator();
    }
    public void display_on_out(){
        Iterator<Block> iter = this.invSpace.iterator();
        while (iter.hasNext()) {
            iter.next().display_in_inventory();
        }
        System.out.println();
    }
    public Collection<Block> getInventory(){
        return this.invSpace;
    }
    public void add_block(Block b){
        this.invSpace.add(b);
        this.sort_inventory();
    }
    public void remove_block(Block b){
        this.invSpace.remove(b);
        this.sort_inventory();
    }

    private boolean is_smeltable(int index){
        return (this.invSpace.get(index) instanceof SmeltableBlock);
    }

    public SmeltableBlock get_smeltable_item (int index) throws BlockErrorException {
        SmeltableBlock b;
        if(is_smeltable(index)){
            b = ((SmeltableBlock)this.invSpace.get(index));
        } else{
            b = new NullBlock();
            throw new BlockErrorException();
        }
        return b;
    }
    public void sort_inventory(){
        this.invSpace.sort(this.comp);
    }
    public void swap_comp(){
        if(this.comp instanceof AlphabeticalBlockComparator){
            this.comp = new BlockComparator();
        } else this.comp = new AlphabeticalBlockComparator();
    }
    public Iterator<Block> getIter(){
        return this.invSpace.iterator();
    }
}
