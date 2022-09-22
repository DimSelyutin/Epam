package ru.dragon.task.main.controller;

import java.util.List;

import ru.dragon.task.main.bean.Treasure;
import ru.dragon.task.main.logic.CaveLogic;

public class ByCoastCommand implements Command{
    private CaveLogic thCvLogic;

    public ByCoastCommand(CaveLogic cvLogic){
        this.thCvLogic = cvLogic;
    }

    @Override
    public void execute(List<Treasure> tr) {
        thCvLogic.selfCoastTreasure(tr);
        
    }

    // @Override
    // public void execute(UserRequest comandName) {
    //     // TODO Auto-generated method stub
        
    // }



}
