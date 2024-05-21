package UI;

import blocks.Block;
import blocks.NullBlock;
import blocks.SmeltableBlock;

public class Furnace {
    private SmeltableBlock input;
    private Block output;
    public Furnace(){
        this.input=new NullBlock();
        this.output=new NullBlock();
    }
    public void display_on_out(){
        System.out.println("|| "+this.input.display()+" --> "+this.output.display()+" ||");
    }

    public void setInput(SmeltableBlock sb){
        this.input = sb;
        this.output = sb.smelt();
    }
    public SmeltableBlock getInput(){
        return this.input;
    }
    public Block getOutput(){
        return this.output;
    }

    public SmeltableBlock pickInput(){
        SmeltableBlock i = this.input;
        this.input = new NullBlock();
        this.output = new NullBlock();
        return i;
    }

    public Block smelt() {
        if (!(this.input instanceof NullBlock)) {
            System.out.println("Smelting "+input.toString()+" into "+this.output.toString());
            Block r = this.output;
            this.input = new NullBlock();
            this.output = new NullBlock();
            return r;
        }
        return this.input;
    }
}
