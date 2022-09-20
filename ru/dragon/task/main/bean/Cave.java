package ru.dragon.task.main.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ru.dragon.task.clienapl.GenerateTreasure;

public class Cave implements Serializable{
    private List<Treasure> treasures = new ArrayList<>();
    public Cave(int num){
        for (int i = 0; i < num; i++) {
            // new GenerateTreasure();
            treasures.add(new GenerateTreasure().getNewTreasure());

        }
    }
    
    public List<Treasure> getTreasures(){
        return treasures;
    }

    public List<Treasure> setTreasures(){
        return treasures;
    }


}
