package GUI;

import javafx.scene.layout.BorderPane;

public class MainGUI extends BorderPane {
    public MainGUI(MapPane mp, ButtonListPane blp, FurnacePane fp){
        super();
        super.setCenter(mp);
        super.setLeft(blp);
        super.setRight(fp);
    }
}
