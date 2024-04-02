package blocks;

public class NullBlock extends AbstractSolidBlock implements SmeltableBlock{
    public NullBlock(){
        this.content = ' ';
        this.falls_with_gravity = false;
        this.fall_through = false;
    }
    public Block smelt() {
        return new NullBlock();
    }
}
