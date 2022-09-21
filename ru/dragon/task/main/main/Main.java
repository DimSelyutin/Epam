package ru.dragon.task.main.main;

import java.io.Serializable;
import java.util.Scanner;

import ru.dragon.task.main.bean.Cave;
import ru.dragon.task.main.logic.CaveLogic;
import ru.dragon.task.main.view.Present;



public class Main implements Serializable{
    public static void main(String[] args) {
        System.out.println("Choose the number of command: \n1. Watch all treasure.\n2. Watch the the most precious treasure.\n3. Enter self coast of treasure.");
        Present print = new Present();
        Scanner sc = new Scanner(System.in);
        Cave cv = new Cave(5);
        CaveLogic cLogic = new CaveLogic();

        while (!sc.hasNextInt()) {
            System.out.println("Enter a number of command!");
            sc.nextLine();
        }
        int x = sc.nextInt();


        switch (x) {

            case 1:
                print.viewTreasure(cLogic.allTreasure(cv.getCave()));
                
                break;
        
            default:
                break;
        }
        
        


    }
 
}
