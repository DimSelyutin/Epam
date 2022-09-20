package ru.dragon.task.main;

import java.io.Serializable;


import ru.dragon.task.main.bean.Cave;

import ru.dragon.task.main.logic.Command;
import ru.dragon.task.main.logic.GetTreasure;
import ru.dragon.task.main.view.Present;



public class Main implements Serializable{
    public static void main(String[] args) {
        Cave cv = new Cave(6);
            
        Command setTreasures = new GetTreasure(cv);

        Present see = new Present(setTreasures);

        see.getTreasure();
    }


}
