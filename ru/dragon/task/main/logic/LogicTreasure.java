package ru.dragon.task.main.logic;

import java.io.Serializable;
import java.util.List;

import ru.dragon.task.main.bean.Treasure;

public class LogicTreasure implements Serializable{

    List<Treasure> treasure;

    public void putInCave(Treasure treasure){

        this.treasure.add(treasure);

    }

    public void removeFromCave(Treasure treasure){

        this.treasure.remove(treasure);
        
    }
}
