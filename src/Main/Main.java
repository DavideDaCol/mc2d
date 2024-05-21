package Main;
import GUI.Text.Controller.FurnaceTextController;
import GUI.Text.Controller.InventoryTextController;
import GUI.Text.Controller.MainTextController;
import GUI.Text.Controller.MapTextController;
import UI.*;
import UI.MapCoordinates;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        MainView m = new MainView();
//        m.display_on_out();
//        for (int i = 0 ; i < 10 ; i++){
//            System.out.print("Enter row and then column, or enter '9' and then '9' for smelting: ");
//            Scanner myObj = new Scanner(System.in);
//            int row = myObj.nextInt();
//            int col = myObj.nextInt();
//            if (row == 9 && col == 9){
//                m.smelt();
//            }else{
//                MapCoordinates c = new MapCoordinates(row,col);
//                m.move_into_furnace(c);
//            }
//            m.display_on_out();
//        }
//        MainView m = new MainView();
//        m.display_on_out();
//        for (int i = 0 ; i < 10 ; i++){
//            System.out.println("Enter row and then column to pick that block");
//            System.out.println("Enter '9' and the item number to move the item to the furnace");
//            System.out.println("Enter '99' and then '9' to smelt");
//            System.out.println("Enter '99' and then '0' to toggle the inventory sorting");
//            System.out.println("Enter '99' and then any number to take from the furnace into the inventory");
//            Scanner myObj = new Scanner(System.in);
//            int row = myObj.nextInt();
//            int col = myObj.nextInt();
//            if (row == 9){
//                m.move_into_furnace_from_inventory(col);
//            }else if( row == 99 ){
//                if (col == 9) {
//                    m.smelt();
//                }else if (col == 0){
//                    System.out.println("non avevo voglia");
//                }else {
//                    m.move_into_inventory_from_furnace();
//                }
//            } else{
//                MapCoordinates c = new MapCoordinates(row,col);
//                m.pick_up_block(c);
//            }
//            m.display_on_out();
//        }
//    }
        MainTextController mn = new MainTextController();
        mn.update_and_display();
    }
}
