package GUI;

import UI.Inventory;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class InventoryPane extends HBox {
    private Text dispText;
    private HBox container;
    public InventoryPane (){
        super();
        this.dispText=new Text();
        this.container=new HBox();
        this.getChildren().addAll(this.dispText,this.container);
    }
}
