package ru.dragon.task.main.bean;

import java.io.Serializable;
import java.util.List;

public class Cave implements Serializable{
    private List<Treasure> treasures;

    public void getTreasures(){
        
    }

    public List<Treasure> setTreasures(){
        return treasures;
    }
}
