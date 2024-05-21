package Controller;

import GUI.BlockPane;
import GUI.InventoryPane;
import UI.Inventory;
import blocks.Block;

import java.util.Iterator;

public class InventorySimpleController implements SimpleController {
    Inventory il;
    InventoryPane ip;
    public InventorySimpleController(Inventory a, InventoryPane ab){
        this.il=a;
        this.ip=ab;
        redraw();
    }
    public void  redraw(){
        this.ip.getChildren().clear();
        Iterator<Block> hope = this.il.getIter();
        while(hope.hasNext()){
            this.ip.getChildren().add(new BlockPane(hope.next()));
        }
    }
}
