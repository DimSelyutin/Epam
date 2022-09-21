package ru.dragon.task.main.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ru.dragon.task.main.clienaplication.GenerateTreasure;

public class Cave implements Serializable{
    private List<Treasure> cave = new ArrayList<Treasure>();

    
    
    public Cave(){
        
    }
    
    public Cave(int num){
        for (int i = 0; i < num; i++) {
            cave.add(new GenerateTreasure().getNewTreasure());
            
        }
    }



    
    public List<Treasure> getCave() {
        return cave;
    }
    public void setCave(List<Treasure> cave) {
        this.cave = cave;
    }

    public void putInCave(Treasure treasure){
        this.cave.add(treasure);
    }

    public void takeFromCave(Treasure treasure){
        this.cave.remove(treasure);
    }




    @Override
    public String toString() {
        
        return "ListTreasure{"+ cave+"}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)return true;        
        if (obj == null || getClass() != obj.getClass()) return false;
        Cave cave = (Cave) obj;
        return Objects.equals(cave, cave.cave);
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(cave);
    }
}
