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
                responce.setComandName(cmdName.ALL.toString());
                responce.setListTreasure((List<Treasure>) treasure);
                break;

            case MOST_ESPENSIVE:
                Treasure treasure2 = cv.mostPreciusTreasure(cot.getCave());
                responce.setComandName(cmdName.MOST_ESPENSIVE.toString());

                responce.setTreasure(treasure2);
                break;

            case BY_COAST:
            int coast = request.getCoast();
                List<Treasure> treasure3 = cv.selfCoastTreasure(cot.getCave(), coast);
                responce.setComandName(cmdName.BY_COAST.toString());

                responce.setListTreasure(treasure3);
                break;

        
            default:
                break;
        }

        return responce;
    }

    private CartOfTreasure CartOfTreasure() {
        return null;
    }
}
