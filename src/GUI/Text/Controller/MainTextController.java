package GUI.Text.Controller;

import GUI.Text.FurnacePrinter;
import GUI.Text.InventoryPrinter;
import GUI.Text.MainPrinter;
import GUI.Text.MapPrinter;
import UI.MainView;

public class MainTextController extends AbstractTextController{
    private MapTextController mtc;
    private FurnaceTextController ftc;
    private InventoryTextController itc;
    private MainView mv;
    public MainTextController(){
        this.mv = new MainView();
        this.mtc=new MapTextController(mv.getMainMap());
        this.ftc=new FurnaceTextController(mv.getMainFurnace());
        this.itc=new InventoryTextController(mv.getMainInventory());
        this.tp=new MainPrinter();
    }
    @Override
    public void updatePrinter() {
        mtc.updatePrinter();
        ftc.updatePrinter();
        itc.updatePrinter();
        MainPrinter appo = (MainPrinter) this.tp;
        appo.update((MapPrinter)mtc.getTp(),(FurnacePrinter)ftc.getTp(),(InventoryPrinter)itc.getTp());
    }
}
