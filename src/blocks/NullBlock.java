package blocks;

public class NullBlock extends AbstractSolidBlock implements SmeltableBlock{
    public NullBlock(){
        super();
        this.content = ' ';
        this.falls_with_gravity = false;
        this.fall_through = false;
        this.pickable=false;
    }
    public Block smelt() {
        return new NullBlock();
    }
}
