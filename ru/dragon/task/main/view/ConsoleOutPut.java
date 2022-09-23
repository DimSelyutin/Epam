package ru.dragon.task.main.view;



import ru.dragon.task.main.bean.Treasure;
import ru.dragon.task.main.controller.UserResponce;

public class ConsoleOutPut {
    public void printTreasure(UserResponce userResponce){

        for (Treasure tr : userResponce.getListTreasure()) {
            System.out.println(tr.getTreasureName()+"\t"+tr.getRare()+"\t"+tr.getTypeTreasure()+"\t\t"+tr.getCoast());
        }
    }
}
