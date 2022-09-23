package ru.dragon.task.main.controller;




import ru.dragon.task.main.command.Command;
import ru.dragon.task.main.logic.CaveLogic;

public class ByCoastCommand implements Command{
    private CaveLogic thCvLogic;

    public ByCoastCommand(CaveLogic cvLogic){
        this.thCvLogic = cvLogic;
    }

    @Override
    public void execute(UserRequest request) {
        // TODO Auto-generated method stub
        
    }






}