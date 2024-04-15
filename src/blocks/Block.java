package blocks;

public interface Block extends InventoryBlock{
    public char display();
    public boolean getGravity();
    public boolean getThrough();
    public boolean is_pickable();
    public void display_in_inventory();
}
