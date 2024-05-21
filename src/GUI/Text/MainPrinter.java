package GUI.Text;

public class MainPrinter implements TextPrinter{
    MapPrinter MainMap;
    FurnacePrinter MainFurnace;
    InventoryPrinter MainInventory;

    @Override
    public void display_on_out(){
        MainMap.display_on_out();
        MainFurnace.display_on_out();
        MainInventory.display_on_out();
    }
    public void update(MapPrinter a, FurnacePrinter b, InventoryPrinter c){
        this.MainMap=a;
        this.MainFurnace=b;
        this.MainInventory=c;
    }
}
