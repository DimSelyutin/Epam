package ru.dragon.task.main.logic;

import java.io.Serializable;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import java.util.TreeSet;

import ru.dragon.task.main.bean.Treasure;

public class CaveLogic implements Serializable{


    public CaveLogic(){

    }

    public Set<Treasure> allTreasure(List<Treasure> treasure){
        // List<Treasure> treasureByName = new ArrayList<>();
        
        Set<Treasure> treasureByName = new TreeSet<Treasure>(new Comparator<Treasure>(){
            public int compare(Treasure s1, Treasure s2) {
                return s1.toString().compareTo(s2.toString());
            }
        });
        
        treasureByName.addAll(treasure);
        return treasureByName;
    }
}
