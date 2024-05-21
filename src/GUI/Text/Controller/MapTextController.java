package GUI.Text.Controller;

import GUI.Text.MainPrinter;
import GUI.Text.MapPrinter;
import UI.Map;

public class MapTextController extends AbstractTextController{

    private Map map;
    public MapTextController(Map textmap){
        super();
        this.map=textmap;
        this.tp=new MapPrinter();
    }
    public void updatePrinter() {
        MapPrinter appo = (MapPrinter) this.tp;
        appo.update(this.map.getMap());
    }
}
