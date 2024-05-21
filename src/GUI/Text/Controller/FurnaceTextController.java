package GUI.Text.Controller;

import GUI.Text.FurnacePrinter;
import GUI.Text.MainPrinter;
import UI.Furnace;
import UI.Map;

public class FurnaceTextController extends AbstractTextController{
    private Furnace furn;
    public FurnaceTextController(Furnace textfurn){
        super();
        this.furn=textfurn;
        this.tp=new FurnacePrinter();
    }
    public void updatePrinter() {
        FurnacePrinter appo = (FurnacePrinter) this.tp;
        appo.update(this.furn.getInput(),this.furn.getOutput());
    }
}
