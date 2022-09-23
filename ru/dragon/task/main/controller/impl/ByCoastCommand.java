package ru.dragon.task.main.controller.impl;




import java.util.List;

import ru.dragon.task.main.bean.Treasure;
import ru.dragon.task.main.command.Command;
import ru.dragon.task.main.command.CommandName;
import ru.dragon.task.main.controller.UserRequest;
import ru.dragon.task.main.controller.UserResponce;
import ru.dragon.task.main.dto.CartOfTreasure;
import ru.dragon.task.main.logic.CaveLogic;

public class ByCoastCommand implements Command{
    private final CaveLogic cv = CaveLogic.getInstance();

    @Override
    public UserResponce execute(UserRequest request) {
        String cmd = request.getCommandName();
        int coast = request.getCoast();
        
        UserResponce responce = new UserResponce();
        CartOfTreasure cot = new CartOfTreasure();
        CommandName cmdName = CommandName.valueOf(cmd);



        List<Treasure> treasure3 = cv.selfCoastTreasure(cot.getCAVE(), coast);
        responce.setComandName(cmdName.BY_COAST.toString());
        

        responce.setListTreasure(treasure3);
        return responce;
    }
    
    






}