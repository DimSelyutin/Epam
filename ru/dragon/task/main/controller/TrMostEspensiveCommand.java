package ru.dragon.task.main.controller;

import java.util.List;

import ru.dragon.task.main.bean.Treasure;
import ru.dragon.task.main.logic.CaveLogic;

public class TrMostEspensiveCommand implements Command{

    private CaveLogic thCvLogic;

    public TrMostEspensiveCommand(CaveLogic cvLogic){
        this.thCvLogic = cvLogic;
    }

    public void execute(List<Treasure> tr) {
        thCvLogic.mostPreciusTreasure(tr);
        
    }
}
