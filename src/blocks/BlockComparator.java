package blocks;

import java.util.Comparator;

public class BlockComparator implements Comparator<Block> {
    @Override
    public int compare(Block o1, Block o2) {
        if(o1.getId()>o2.getId()){
            return -1;
        } else if (o1.getId()>o2.getId()){
            return 1;
        } else return 0;
    }
}
