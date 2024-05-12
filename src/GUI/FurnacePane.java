package GUI;

import blocks.NullBlock;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class FurnacePane extends VBox {
    private BlockPane input;
    private BlockPane output;
    private Text visual;
    public FurnacePane(){
        super();
        Text in = new Text("Furnace:");
        super.getChildren().add(in);
        input = new BlockPane(new  NullBlock());
        super.getChildren().add(input);
        Text out = new Text("--->");
        super.getChildren().add(out);
        output = new BlockPane(new NullBlock());
        super.getChildren().add(output);
    }
}
