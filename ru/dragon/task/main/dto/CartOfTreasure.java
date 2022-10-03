package ru.dragon.task.main.dto;

import java.util.List;

import ru.dragon.task.main.bean.Cave;
import ru.dragon.task.main.bean.Treasure;



public class CartOfTreasure {
    public static Cave CAVE = new Cave(100);
    
    public List<Treasure> getCAVE() {
        return CAVE.getCave();
    }

    public static void setCAVE(Cave cave) {
        CAVE = cave;
    }

    public CartOfTreasure() {
       
    }

}