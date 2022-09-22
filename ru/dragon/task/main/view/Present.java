package ru.dragon.task.main.view;


import java.util.List;
import java.util.Set;

import ru.dragon.task.main.bean.Treasure;

public class Present {
     public Present(){

     }
     public void viewTreasure(Set<Treasure> set){
          for (Treasure treasure : set) {
               System.out.printf("|%1s|%30s|%20s|%n",treasure.getTreasureName(),treasure.getTypeTreasure(),treasure.getCoast()+" coins");
          }
     }

     public void viewTreasure(Treasure treasure){
          System.out.printf("|%1s|%30s|%20s|%n",treasure.getTreasureName(),treasure.getTypeTreasure(),treasure.getCoast()+" coins");
     }

     public void viewTreasure(List<Treasure> treasureOfCoast){
          for (Treasure treasure : treasureOfCoast) {
               System.out.printf("|%1s|%30s|%20s|%n",treasure.getTreasureName(),treasure.getTypeTreasure(),treasure.getCoast()+" coins");
          }
     }

}
