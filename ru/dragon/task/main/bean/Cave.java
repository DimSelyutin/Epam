package ru.dragon.task.main.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ru.dragon.task.main.logic.GenerateTreasure;

public class Cave implements Serializable{
    private List<Treasure> treasures = new ArrayList<>();
    public Cave(int num){
        for (int i = 0; i < num; i++) {
            treasures.addAll(new GenerateTreasure().generate());
        }
    }
    
    public List<Treasure> getTreasures(){
        return treasures;
    }

    public List<Treasure> setTreasures(){
        return treasures;
    }


}
