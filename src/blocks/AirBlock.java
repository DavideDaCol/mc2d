package blocks;

public class AirBlock extends AbstractBlock {
    private char content;
    private boolean falls_with_gravity;
    private boolean fall_through;

    public AirBlock() {
        super();
        this.content = '.';
        this.falls_with_gravity=false;
        this.fall_through=true;
    }


    public char display() {
        return this.content;
    }
    public boolean getGravity(){
        return this.falls_with_gravity;
    }

    public boolean getThrough(){
        return this.fall_through;
    }
}
