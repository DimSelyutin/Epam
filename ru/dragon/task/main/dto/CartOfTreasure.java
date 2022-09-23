package ru.dragon.task.main.dto;

import java.util.List;

import ru.dragon.task.main.bean.Cave;
import ru.dragon.task.main.bean.Treasure;


public class CartOfTreasure {
    Cave cave = new Cave(10);

    public CartOfTreasure() {

    }

    public List<Treasure> getCave(){
        
        return cave.getCave();
    }
}