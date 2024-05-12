package GUI;

import blocks.AbstractSolidBlock;
import blocks.Block;
import blocks.SandBlock;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class BlockPane extends StackPane {
    public static final int DIM_SQUARE = 50;
    private static final String FONT_NAME = "Verdana";
    private static final int FONT_SIZE = 18;
    private static final FontWeight FONT_WEIGHT = FontWeight.BOLD;
    private static final Color BLOCK_BORDER = Color.BLACK;
    private static final Color FONT_FILL = Color.BLACK;
    private static final Color FONT_BORDER = Color.BLACK;
    private Block dispBlock;
    private Rectangle guiBlock;
    private Font defaultFont;
    private Text blockName;

    public BlockPane(Block b){
        dispBlock = b;
        guiBlock = new Rectangle();
        defaultFont = Font.font(FONT_NAME,FONT_WEIGHT,FONT_SIZE);
        blockName = new Text();
        initialize(b);
        this.getChildren().addAll(this.guiBlock,this.blockName);
    }
    private void initialize(Block b){
        guiBlock.setX(0);
        guiBlock.setY(0);
        guiBlock.setWidth(DIM_SQUARE);
        guiBlock.setHeight(DIM_SQUARE);
        guiBlock.setFill(getColor(b));
        guiBlock.setStroke(BLOCK_BORDER);
        blockName.setText(String.valueOf(b.display()));
        blockName.setFont(defaultFont);
        blockName.setFill(FONT_FILL);
        blockName.setStroke(FONT_BORDER);
    }
    public static Color getColor(Block in) {
        Color appo = new Color(0, 0, 0, 0);
        switch (in.display()) {
            case 'S':
                appo = Color.YELLOW;
                break;
            case 'R':
                appo = Color.GRAY;
                break;
            case '⚔':
                appo = Color.ANTIQUEWHITE;
                break;
            case 'G':
                appo = Color.LIGHTBLUE;
                break;
            case 'A':
                appo = Color.WHITE;
                break;
        }
        return appo;
    }
    public void changeBlock(Block bn){
        dispBlock=bn;
        initialize(bn);
    }
}
