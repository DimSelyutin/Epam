package ru.dragon.task.main.dto;

import java.util.List;

import ru.dragon.task.main.bean.Cave;
import ru.dragon.task.main.bean.Treasure;


public class CartOfTreasure {
    public static Cave cave = new Cave(10);
    
    public CartOfTreasure() {
        
    }

    public static List<Treasure> getCave(){
        
        return cave.getCave();
    }
}