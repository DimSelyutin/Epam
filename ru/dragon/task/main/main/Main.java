package ru.dragon.task.main.main;

import java.util.Scanner;

import ru.dragon.task.main.controller.CaveController;
import ru.dragon.task.main.controller.UserRequest;
import ru.dragon.task.main.view.ConsoleOutPut;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsoleOutPut out = new ConsoleOutPut();
        CaveController caveC = new CaveController();
        System.out.println("Enter a number of type command:\n 1. Show all treasure;\n 2. Show most espensive treasure;\n 3. Enter self coast of treasure;");
        
        while (!sc.hasNextInt()) {
            System.out.println("Enter a number of command!");
            sc.nextLine();
        }
        int x = sc.nextInt();
        switch(x){
            case 1:
                UserRequest request = new UserRequest("ALL",600);
                out.printTreasure(caveC.doAction(request));

                break;

            case 2:
                request = new UserRequest("MOST_ESPENSIVE");
                out.printTreasure(caveC.doAction(request));
                break;
            case 3:
                System.out.println("Enter your coast:");
                while (!sc.hasNextInt()) {
                    System.out.println("Enter a coast!");
                    sc.nextLine();
                }
                x = sc.nextInt();
                request = new UserRequest("BY_COAST",x);
                out.printTreasure(caveC.doAction(request));
                break;
            default:
            break;
        }
        
    }   
}
