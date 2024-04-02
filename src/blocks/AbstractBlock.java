package blocks;

public abstract class AbstractBlock implements Block {
    protected char content;
    protected boolean falls_with_gravity;
    protected boolean fall_through;
    protected String blockname;
    public AbstractBlock(){

    }

    public char display() {
        return this.content;
    }

    public boolean getGravity() {
        return this.falls_with_gravity;
    }

    public boolean getThrough() {
        return this.fall_through;
    }

    public String toString(){
        return this.blockname+" ["+this.content+"]";
    }
}
