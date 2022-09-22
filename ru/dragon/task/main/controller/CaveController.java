package ru.dragon.task.main.controller;

import java.util.List;
import java.util.Set;

import ru.dragon.task.main.bean.Treasure;
import ru.dragon.task.main.dto.CartOfTreasure;
import ru.dragon.task.main.logic.CaveLogic;

public class CaveController {
    public UserResponce findAllTreasure(UserRequest request){
        String cmd = request.getCommandName();
        CommandName cmdName = CommandName.valueOf(cmd);
        CaveLogic cv = new CaveLogic();
        CartOfTreasure cot = CartOfTreasure();

        UserResponce responce = null;
        switch (cmdName) {
            case ALL:
                Set<Treasure> treasure = cv.allTreasure(cot.getCave());
                responce.setListTreasure((List<Treasure>) treasure);
                break;

            case MOST_ESPENSIVE:
                Treasure treasure2 = cv.mostPreciusTreasure(cot.getCave());
                responce.setTreasure(treasure2);
                break;

            case BY_COAST:
                List<Treasure> treasure3 = cv.selfCoastTreasure(cot.getCave(), 400);
                responce.setListTreasure(treasure3);
                break;

        
            default:
                break;
        }

        return null;
    }

    private CartOfTreasure CartOfTreasure() {
        return null;
    }
}
