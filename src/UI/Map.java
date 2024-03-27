package UI;

import blocks.*;

public class Map {
    private Block[][] map;
    private final int dimMap = 10;

    public Map() {
        map = new Block[dimMap][dimMap];
        for (int i = 0; i < dimMap; i++) {
            for (int j = 0; j < dimMap; j++) {
                map[i][j] = new AirBlock();
            }
        }
    }

    public void display_on_out() {
        for (int i = 0; i < dimMap; i++) {
            for (int j = 0; j < dimMap; j++) {
                System.out.print(this.map[i][j].display() + " ");
            }
            System.out.println();
        }
    }

    public void change_cell(int x, int y, char type) {
        if (x >= dimMap || y >= dimMap || x < 0 || y < 0) {
            System.out.println("coordinates are out of bounds (0<=val<50)");
        } else {
            this.map[x][y] = new AirBlock();
        }
    }
    public void swap(int row, int col){
        if (row > dimMap-1 || col > dimMap || row < 0 || col < 0) {
            System.out.println("swap is out of bounds");
        } else {
            Block appo = this.map[row][col];
            this.map[row][col] = this.map[row+1][col];
            this.map[row+1][col] = appo;
        }
    }
    public void insert_iter(Block place, int p1, int p2){
        int row = p1;
        int col = p2;
        if (row >= dimMap || col >= dimMap || row < 0 || col < 0) {
            System.out.println("coordinates are out of bounds (0<=val<" + dimMap +")");
        } else {
            this.map[row][col] = place;
            if(this.map[row][col].getGravity()){
                while((row<dimMap-1)&&(this.map[row+1][col].getThrough())){
                    swap(row,col);
                    row++;
                }
            }
        }
    }
    public void insert_rec(Block place, int row, int col){
        if (row >= dimMap || col >= dimMap || row < 0 || col < 0) {
            System.out.println("coordinates are out of bounds (0<=val<" + dimMap +")");
        } else {
            this.map[row][col] = place;
            if(row<dimMap-1&&this.map[row][col].getGravity()&&this.map[row+1][col].getThrough()){
                swap(row,col);
                insert_rec(place,row+1,col);
            }
        }
    }
    private void addRowsOfWater(){
        for(int i=0; i<dimMap; i++){
            Block water = new WaterBlock();
            insert_iter(water,0,i);
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
}
