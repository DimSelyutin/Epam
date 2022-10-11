package ru.dragon.task.main.view;




import ru.dragon.task.main.bean.Treasure;
import ru.dragon.task.main.controller.UserResponce;

public class ConsoleOutPut {
    public void printTreasure(UserResponce responce){
        //all and byCoast

            if (responce.getListTreasure() != null) {
                for (Treasure tr : responce.getListTreasure()) {
                    System.out.println(tr.getTreasureName()+"\t"+tr.getRare()+"\t"+tr.getTypeTreasure()+"\t\t"+tr.getCoast());
                }
            } else {
            }
   //most espensive
            if (responce.getTreasure() != null && responce.getListTreasure() == null) {
                Treasure tr = responce.getTreasure();
                System.out.println(tr.getTreasureName()+"\t"+tr.getRare()+"\t"+tr.getTypeTreasure()+"\t\t"+tr.getCoast());
            } else {
                System.out.println(responce.getMessage());

            }
        



        
    }
    
    
}
