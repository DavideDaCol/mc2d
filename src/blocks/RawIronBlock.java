package blocks;

public class RawIronBlock extends AbstractSolidBlock implements SmeltableBlock{
    public RawIronBlock(){
        super();
        this.content='R';
        this.blockname="Raw Iron";
    }
    public Block smelt() {
        return new IronSwordBlock();
    }
}
