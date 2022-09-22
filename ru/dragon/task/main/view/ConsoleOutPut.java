package ru.dragon.task.main.view;
import java.util.List;
import java.util.Set;

import ru.dragon.task.main.bean.Treasure;

public class ConsoleOutPut {
    private static final ConsoleOutPut instance = new ConsoleOutPut();

    public static ConsoleOutPut getInstance() {
        return instance;
    }

    public ConsoleOutPut(){
        
    }

    public void printTreasure(Set<Treasure> set){
        for (Treasure treasure  : set) {
            System.out.println(treasure);
        }
    }
}
