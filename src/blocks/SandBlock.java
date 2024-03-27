package blocks;

public class SandBlock extends AbstractBlock{
    public SandBlock(){
        this.content='S';
        this.falls_with_gravity=true;
        this.fall_through=false;
    }
}
