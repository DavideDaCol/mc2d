package blocks;

public abstract class AbstractBlock implements Block {
    protected char content;
    protected boolean falls_with_gravity;
    protected boolean fall_through;
    protected boolean pickable;
    protected String blockname;
    private static int code;
    protected int id;
    public AbstractBlock(){
        this.pickable=false;
        code++;
        this.id=code;
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
    public boolean is_pickable(){
        return this.pickable;
    }

    public String toString(){
        return this.blockname+" ["+this.content+"]";
    }

    public int getId() {
        return this.id;
    }

    public void display_in_inventory(){
        System.out.print("["+this.content+"] ");
    }
}
