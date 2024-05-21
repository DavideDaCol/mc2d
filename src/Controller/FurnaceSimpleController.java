package Controller;

import GUI.BlockPane;
import GUI.FurnacePane;
import UI.Furnace;
import blocks.NullBlock;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class FurnaceSimpleController implements SimpleController{
    private Furnace fl;
    private FurnacePane fp;
    public FurnaceSimpleController(Furnace a, FurnacePane ab){
        this.fl=a;
        this.fp=ab;
        redraw();
    }
    public void redraw(){
        this.fp.getChildren().clear();
        this.fp.getChildren().addAll(new Text("Furnace:"),new BlockPane(fl.getInput()),new Text("--->"), new BlockPane(fl.getOutput()));
    }

    public Furnace getFl() {
        return fl;
    }

    public FurnacePane getFp() {
        return fp;
    }
}
