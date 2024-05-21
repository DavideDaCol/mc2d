package GUI.Text;

import blocks.Block;
import blocks.SmeltableBlock;

public class FurnacePrinter implements TextPrinter{
    private SmeltableBlock input;
    private Block output;
    @Override
    public void display_on_out(){
        System.out.println("|| "+this.input.display()+" --> "+this.output.display()+" ||");
    }
    public void update(SmeltableBlock in, Block out){
        this.input=in;
        this.output=out;
    }
}
