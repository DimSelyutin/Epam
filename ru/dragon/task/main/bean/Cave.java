package ru.dragon.task.main.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ru.dragon.task.main.clienaplication.GenerateTreasure;

public class Cave implements Serializable{
    private List<Treasure> treasures = new ArrayList<Treasure>();

    public Cave(){

    }

    public Cave(int num){
        for (int i = 0; i < num; i++) {
            treasures.add(new GenerateTreasure().getNewTreasure());

        }
    }
    
    public List<Treasure> getTreasures(){
        return treasures;
    }

    public List<Treasure> setTreasures(){
        return treasures;
    }

    @Override
    public String toString() {
        
        return "ListTreasure{"+ treasures+"}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)return true;        
        if (obj == null || getClass() != obj.getClass()) return false;
        Cave cave = (Cave) obj;
        return Objects.equals(treasures, cave.treasures);
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(treasures);
    }
}
