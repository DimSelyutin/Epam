package ru.dragon.task.main.main;

import java.io.Serializable;
import java.util.Scanner;

import ru.dragon.task.main.bean.Cave;
import ru.dragon.task.main.logic.CaveLogic;
import ru.dragon.task.main.view.Present;



public class Main implements Serializable{
    public static void main(String[] args) {
        
        Cave cv = new Cave(5);
        
        Present print = new Present();
        
        CaveLogic cLogic = new CaveLogic();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose the number of command: \n1. Watch all treasure.\n2. Watch the the most precious treasure.\n3. Enter self coast of treasure.");
        while (!sc.hasNextInt()) {
            System.out.println("Enter a number of command!");
            sc.nextLine();
        }
        int x = sc.nextInt();


        switch (x) {

            case 1:
            // print.viewTreasure(command(cv.getCave()));
                print.viewTreasure(cLogic.allTreasure(cv.getCave()));
                break;
            case 2:
                print.viewTreasure(cLogic.mostPreciusTreasure(cv.getCave()));
                break;
            case 3: 
                System.out.println("Enter coast of treasure:");
                int coast = sc.nextInt();
                print.viewTreasure(cLogic.selfCoastTreasure(cv.getCave(),coast));
                break;
            default:
                break;
        }
        
        


    }
 
}
