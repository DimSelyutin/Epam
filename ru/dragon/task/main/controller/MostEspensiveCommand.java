package ru.dragon.task.main.controller;

import java.util.List;

import ru.dragon.task.main.bean.Treasure;
import ru.dragon.task.main.logic.CaveLogic;

public class MostEspensiveCommand implements Command{

    private CaveLogic thCvLogic;

    public MostEspensiveCommand(CaveLogic cvLogic){
        this.thCvLogic = cvLogic;
    }

    // public void execute(List<Treasure> tr) {
    //     thCvLogic.mostPreciusTreasure(tr);
        
    // }

    @Override
    public void execute(UserRequest comandName) {
        // TODO Auto-generated method stub
        
    }

    
}
