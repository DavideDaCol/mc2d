package data;

public class Block {
    private char content;
    private boolean falls_with_gravity;
    private boolean fall_through;

    public Block() {
        this.content = '.';
        this.falls_with_gravity=false;
        this.fall_through=true;
    }

    public Block(char input) {
        this.content = input;
        this.falls_with_gravity=true;
        this.fall_through=false;
    }

    public char display() {
        return this.content;
    }
    public boolean getGravity(){
        return this.falls_with_gravity;
    }

    public boolean getThrough(){
        return this.fall_through;
    }
}
