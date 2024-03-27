package Main;
import UI.*;
import blocks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map m = new Map();
        for(int i=0; i<10; i++){
            /* System.out.print("Enter row: ");
            Scanner myObj = new Scanner(System.in);
            int row = myObj.nextInt();

            System.out.print("Enter column: ");
            int col = myObj.nextInt();

            System.out.println("placing at: "+row+" - "+col);

             */
            Block insert = new SandBlock();
            m.insert_iter(insert,0,i);
        }
        m.addRiver();
        Block test1 = new SandBlock();
        m.insert_iter(test1,0,3);
        m.display_on_out();
    }
}
