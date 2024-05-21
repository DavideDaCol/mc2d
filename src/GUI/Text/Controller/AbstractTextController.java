package GUI.Text.Controller;

import GUI.Text.TextPrinter;

public abstract class AbstractTextController {
    TextPrinter tp;
    public TextPrinter getTp(){
        return this.tp;
    }
    public abstract void updatePrinter();
    public void update_and_display(){
        this.updatePrinter();
        tp.display_on_out();
    }
}
