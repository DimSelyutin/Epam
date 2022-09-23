package ru.dragon.task.main.view;

import java.util.List;

import ru.dragon.task.main.bean.Treasure;

public class ConsoleOutPut {
    public void printTreasure(List<Treasure> treasures){
        for (Treasure tr : treasures) {
            System.out.println(tr.getTreasureName());
        }
    }
}
