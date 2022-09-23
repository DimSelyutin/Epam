package ru.dragon.task.main.view;



import java.util.List;

import ru.dragon.task.main.bean.Treasure;
import ru.dragon.task.main.controller.UserResponce;

public class ConsoleOutPut {
    public void printTreasure(UserResponce responce){
        try {
            for (Treasure tr : responce.getListTreasure()) {
                System.out.println(tr.getTreasureName()+"\t"+tr.getRare()+"\t"+tr.getTypeTreasure()+"\t\t"+tr.getCoast());
            }
        } catch (Exception e) {
            Treasure tr = responce.getTreasure();
            System.out.println(tr.getTreasureName()+"\t"+tr.getRare()+"\t"+tr.getTypeTreasure()+"\t\t"+tr.getCoast());

        }

        
    }
    
    
}
