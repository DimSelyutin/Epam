package ru.dragon.task.main.controller;

import java.util.List;

import ru.dragon.task.main.bean.Treasure;
import ru.dragon.task.main.logic.CaveLogic;


public class AllTreasureCommand implements Command {

    private CaveLogic cvLogic;


    // public AllTreasureCommand(CaveLogic cv){
    //     this.cvLogic = cv;
    // }


    @Override
    public void execute(UserRequest comandName) {
        comandName.getCommandName();
    }



   

   

    
}
