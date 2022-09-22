package ru.dragon.task.main.main;

import java.util.List;

import ru.dragon.task.main.bean.Treasure;
import ru.dragon.task.main.controller.Command;

public class CaveController {
    private Command getAllTrCommand;
    private Command getByCoastTrCommand;
    private Command getMostEspensiveTrCommand;

    public CaveController(Command getAllTr,Command getByCoastTr, Command getMostExpensiveTr){
        this.getAllTrCommand = getAllTr;
        this.getByCoastTrCommand = getByCoastTr;
        this.getMostEspensiveTrCommand = getMostExpensiveTr;
    }

    public void getAllTr(List<Treasure> tr){
        getAllTrCommand.execute(tr);
    }
    // public void getByCoastTr(){
    //     // getAllTrCommand.execute(List<Treasure> tr, int x);
    // }
    public void getMostExpensiveTr(List<Treasure> tr){
        getAllTrCommand.execute(tr);
    }
}
