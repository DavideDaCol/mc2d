package Controller;

import GUI.MainGUI;
import UI.MainView;
import UI.MapCoordinates;
import blocks.Block;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MainSimpleController implements SimpleController{
    MainView mainlogic;
    MainGUI mainGUI;
    Collection<SimpleController> controllerslist;
    public MainSimpleController(MainView a){
        this.mainlogic=a;
        this.mainGUI=new MainGUI(this);
        this.controllerslist = new ArrayList<SimpleController>();
        SimpleController mainmap = new MapSimpleController(a.getMainMap(),this.mainGUI.getMapPane());
        SimpleController mainfurn = new FurnaceSimpleController(a.getMainFurnace(),this.mainGUI.getFurnacePane());
        SimpleController maininv = new InventorySimpleController(a.getMainInventory(),this.mainGUI.getInventoryPane());
        this.controllerslist.add(mainmap);
        this.controllerslist.add(mainfurn);
        this.controllerslist.add(maininv);
        redraw();
    }

    public void redraw() {
        for (SimpleController iter : this.controllerslist) {
            iter.redraw();
        }
    }
    public void smelt(){
        this.mainlogic.smelt();
        redraw();
    }
    public void move_into_inventory_from_furnace(){
        this.mainlogic.move_into_inventory_from_furnace();
        redraw();
    }
    public void move_into_furnace_from_inventory(int i){
        this.mainlogic.move_into_furnace_from_inventory(i);
        redraw();
    }
    public void pick_up_block(int row, int col){
        this.mainlogic.pick_up_block(new MapCoordinates(row,col));
        redraw();
    }

    public MainView getMainlogic() {
        return mainlogic;
    }

    public MainGUI getMainGUI() {
        return mainGUI;
    }
}

