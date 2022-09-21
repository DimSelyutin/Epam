package ru.dragon.task.main.view;


import java.util.Set;

import ru.dragon.task.main.bean.Treasure;

public class Present {
     public Present(){

     }
     public void viewTreasure(Set<Treasure> set){
          for (Treasure treasure : set) {
               System.out.printf("|%1s|%30s|%n",treasure.getTreasureName(),treasure.getTypeTreasure(),treasure.getCoast()+" coins");
               // System.out.println(treasure.getTreasureName()+""+treasure.getTypeTreasure()+""+treasure.getCoast());
          }
     }

}
