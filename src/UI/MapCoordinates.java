package UI;

public class MapCoordinates {
    private int row;
    private int col;
    public MapCoordinates(int r, int c){
        this.row=r;
        this.col=c;
    }
    public boolean inBounds(Map m){
        return (!(this.row >= m.DIM_ROWS || this.col >= m.DIM_COLS || this.row < 0 || this.col < 0));
    }
    public int getRow(){
        return this.row;
    }
    public int getCol(){
        return this.col;
    }
}
