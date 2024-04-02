package blocks;

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
    public void smelt(){
        if (!(input instanceof NullBlock)) {
            System.out.println("Smelting "+ input.toString()+" into "+output.toString());
            this.input = new NullBlock();
            System.out.println("No inventory where to store the smelted "+output.toString());
            this.output = new NullBlock();
        }
    }

    public void setInput(SmeltableBlock userInput){
        this.input=userInput;
        this.output=this.input.smelt();
    }
}
