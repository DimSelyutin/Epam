package ru.dragon.task.main.main;

import ru.dragon.task.main.controller.CaveController;
import ru.dragon.task.main.controller.UserRequest;
import ru.dragon.task.main.controller.UserResponce;
import ru.dragon.task.main.view.ConsoleOutPut;

public class Main {
    public static void main(String[] args) {
        ConsoleOutPut out = new ConsoleOutPut();
        CaveController caveC = new CaveController();

        UserRequest request = new UserRequest("ALL");

        UserResponce responce = new UserResponce();

        System.out.println(caveC.doAction(request));
        // out.printTreasure();
        
    }   
}
