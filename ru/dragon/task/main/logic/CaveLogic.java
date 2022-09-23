package ru.dragon.task.main.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ru.dragon.task.main.bean.Treasure;

public class CaveLogic implements Serializable{
    static final long SerialVersionUID = -4862926644813433707L;

    private static CaveLogic INSTANCE;

    private CaveLogic(){

    }

    public List<Treasure> allTreasure(List<Treasure> treasure){
      
        List<Treasure> treasureByName = new ArrayList<>();
        Collections.sort(treasure, new Comparator<Treasure>(){
            public int compare(Treasure s1, Treasure s2) {
                return s1.toString().compareTo(s2.toString());
            }
        });
        
        treasureByName.addAll(treasure);

        return treasureByName;
    }


    public Treasure mostPreciusTreasure(List<Treasure> treasures){

        int indexMax = 0;

        for (int i = 1; i < treasures.size(); i++) {
            if (treasures.get(indexMax).getCoast()<treasures.get(i).getCoast()) {
                indexMax = i;
            }

        }

        return treasures.get(indexMax);
        
    }


    public List<Treasure> selfCoastTreasure(List<Treasure> treasures, int coast){

        List<Treasure> treasureOfCoast = new ArrayList<>();
        
        for (int i = 1; i < treasures.size(); i++) {
            if (treasures.get(i).getCoast() >= coast) {
                treasureOfCoast.add(treasures.get(i));
            }
        }

        return treasureOfCoast;
        
    }

    public static CaveLogic getInstance() {
        if(INSTANCE == null){
            INSTANCE = new CaveLogic();
        }
        return INSTANCE;
    }


}