package GUI.Text.Controller;

import GUI.Text.InventoryPrinter;
import GUI.Text.MainPrinter;
import UI.Inventory;
import UI.Map;

public class InventoryTextController extends AbstractTextController{
    private Inventory inv;
    public InventoryTextController(Inventory textinv){
        super();
        this.inv=textinv;
        this.tp=new InventoryPrinter();
    }
    public void updatePrinter() {
        InventoryPrinter appo = (InventoryPrinter) this.tp;
        appo.update(this.inv.getInventory());
    }
}
