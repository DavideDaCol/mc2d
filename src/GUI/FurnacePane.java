package GUI;

import blocks.Block;
import blocks.NullBlock;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class FurnacePane extends VBox {
    private static final String FONT_NAME = "Verdana";
    private static final int FONT_SIZE = 18;
    private static final FontWeight FONT_WEIGHT = FontWeight.BOLD;
    BlockPane input;
    BlockPane output;
    Font defaultFont;
    private Text visual;
    public FurnacePane(){
        super();
        super.setAlignment(Pos.CENTER);
        Text in = makeText1();
        super.getChildren().add(in);
        input = new BlockPane(new  NullBlock());
        super.getChildren().add(input);
        Text out = new Text("--->");
        out.setFont(defaultFont);
        super.getChildren().add(out);
        output = new BlockPane(new NullBlock());
        super.getChildren().add(output);
    }

    public Text makeText1(){
        Text in = new Text("Furnace:");
        defaultFont = Font.font(FONT_NAME,FONT_WEIGHT,FONT_SIZE);
        in.setFont(defaultFont);
        return in;
    }

    public BlockPane getInput() {
        return input;
    }

    public BlockPane getOutput() {
        return output;
    }
}
