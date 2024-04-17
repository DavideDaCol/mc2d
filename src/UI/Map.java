package UI;

import blocks.*;
import java.util.Random;

public class Map {
    protected Block[][] map;
    protected final int DIM_ROWS = 10;
    protected final int DIM_COLS = 10;

    public Map() {
        map = new Block[DIM_ROWS][DIM_COLS];
        for (int i = 0; i < DIM_ROWS; i++) {
            for (int j = 0; j < DIM_COLS; j++) {
                map[i][j] = new AirBlock();
            }
        }
    }

    public void display_on_out() {
        for (int i = 0; i < DIM_ROWS; i++) {
            for (int j = 0; j < DIM_COLS; j++) {
                System.out.print(this.map[i][j].display() + " ");
            }
            System.out.println();
        }
    }

    public void change_cell(int x, int y) {
        if (x >= DIM_ROWS || y >= DIM_COLS || x < 0 || y < 0) {
            System.out.println("coordinates are out of bounds (0<=val<50)");
        } else {
            this.map[x][y] = new AirBlock();
        }
    }
    public void swap(int row, int col){
        if (row > DIM_ROWS-1 || col > DIM_COLS || row < 0 || col < 0) {
            System.out.println("swap is out of bounds");
        } else {
            Block appo = this.map[row][col];
            this.map[row][col] = this.map[row+1][col];
            this.map[row+1][col] = appo;
        }
    }
    public void insert(Block place, int row, int col){
        if (row >= DIM_ROWS || col >= DIM_COLS || row < 0 || col < 0) {
            System.out.println("coordinates are out of bounds");
        } else {
            this.map[row][col] = place;
            move(row,col);
            for(int i =0; i<DIM_ROWS; i++){
                move(i,row);
            }
        }
    }
    public void move(int row, int col){
        if (row >= DIM_ROWS || col >= DIM_COLS || row < 0 || col < 0) {
            System.out.println("coordinates are out of bounds");
        } else {
            if(this.map[row][col].getGravity()){
                while((row<DIM_ROWS-1)&&(this.map[row+1][col].getThrough())){
                    swap(row,col);
                    row++;
                }
            }
        }
    }

    private void addRowsOfWater(){
        for(int i=0; i<DIM_ROWS; i++){
            Block water = new WaterBlock();
            insert(water,0,i);
        }
    }
    public void addRiver(){
        addRowsOfWater();
    }

    public void addSea(){
        for (int i=0; i<3; i++){
            addRowsOfWater();
        }
    }
    private boolean isSmeltable(int row, int col){
        return this.map[row][col] instanceof SmeltableBlock;
    }
    public SmeltableBlock smeltableBlockPos(int row, int col) throws BlockErrorException{
        return (SmeltableBlock)this.map[row][col];
    }
    public void randFill(){
        Random rand = new Random();
        int filler = 1+rand.nextInt(DIM_COLS*DIM_ROWS);
        for (int i = 0 ; i < filler; i++){
            Block b = new SandBlock();;
            int row = rand.nextInt(DIM_ROWS);
            int col = rand.nextInt(DIM_COLS);
            int choose = rand.nextInt(2); //randomizes block choice, 0 is sand 1 is iron
            if(choose==1){
                b = new RawIronBlock();
            }
            insert(b,row,col);
        }
        Block f = new TorchBlock();
        insert(f, 9,4);
    }
    private boolean isPickable(int row, int col){
        return this.map[row][col].is_pickable();
    }
    public Block gimme_pickable(int row, int col) throws BlockErrorException{
        if(!(this.map[row][col].is_pickable())){
            throw new BlockErrorException();
        }
        return this.map[row][col];
    }
}