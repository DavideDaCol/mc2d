package GUI;

import Controller.MainSimpleController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;

public class MainGUI extends BorderPane {
    private MapPane g;
    private ButtonListPane bl;
    private InventoryPane ib;
    private FurnacePane fp;

    public MainGUI(MainSimpleController mc){
        super();
        g = new MapPane();
        super.setCenter(g);
        ib = new InventoryPane();
        super.setTop(ib);
        bl = new ButtonListPane(mc);
        super.setLeft(bl);
        fp = new FurnacePane();
        super.setRight(fp);
    }

    public MapPane getMapPane(){
        return g;
    }
    public InventoryPane getInventoryPane() {
        return this.ib;
    }
    public FurnacePane getFurnacePane(){
        return this.fp;
    }
}
