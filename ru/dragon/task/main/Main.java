package ru.dragon.task.main;

import java.io.Serializable;


import ru.dragon.task.main.bean.Cave;
import ru.dragon.task.main.bean.Treasure;



public class Main implements Serializable{
    public static void main(String[] args) {
        Cave cv = new Cave(5);
        
        for (Treasure f : cv.getTreasures()) {
            System.out.println(f.getTreasureName()+"\t | \t"+f.getRare());
        }
    }

    // List <Treasure> = new GenerateTreasure();

}
