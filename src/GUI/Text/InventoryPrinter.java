package GUI.Text;

import blocks.Block;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class InventoryPrinter implements TextPrinter{
    Collection<Block> invSpace;
    @Override
    public void display_on_out(){
        Iterator<Block> iter = this.invSpace.iterator();
        while (iter.hasNext()) {
            iter.next().display_in_inventory();
        }
        System.out.println();
    }
    public void update(Collection<Block> inv){
        this.invSpace = inv;
    }
}
