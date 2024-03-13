package Main;
import data.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map m = new Map();
        for(int i=0; i<10; i++){
            System.out.print("Enter row: ");
            Scanner myObj = new Scanner(System.in);
            int row = myObj.nextInt();

            System.out.print("Enter column: ");
            int col = myObj.nextInt();

            System.out.print("Enter block type: ");
            char blockType = myObj.next().charAt(0);

            System.out.println("placing at: "+row+" - "+col);
            Block insert = new Block(blockType);
            m.insert_rec(insert,row,col);
            m.display_on_out();
        }
    }
}
