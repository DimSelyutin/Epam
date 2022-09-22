package ru.dragon.task.main.controller;

import ru.dragon.task.main.bean.Treasure;
import ru.dragon.task.main.logic.CaveLogic;
import java.util.List;

public class TrAllCommand implements Command {

    private CaveLogic thCvLogic;

    public TrAllCommand(CaveLogic cvLogic){
        this.thCvLogic = cvLogic;
    }

    public void execute(List<Treasure> tr) {
        thCvLogic.allTreasure(tr);
        
    }


    
}
