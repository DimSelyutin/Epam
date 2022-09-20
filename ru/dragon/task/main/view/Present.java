package ru.dragon.task.main.view;

import ru.dragon.task.main.logic.Command;

public class Present {
   private Command getTreasureFromCave;

   public Present(Command getTreasureFromCave){
    this.getTreasureFromCave = getTreasureFromCave;
   }

   public void getTreasure(){
    getTreasureFromCave.execute();
   }

}
