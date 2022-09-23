package ru.dragon.task.main.controller;

public class UserRequest {
    private String commandName;
    private int coast;
    
    
    public UserRequest(String comandName){
        this.commandName = comandName;
    }
    
    public UserRequest(String comandName, int coast){
    
        this.commandName = comandName;
        this.coast = coast;
    }
    
    
    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }
 

    
    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }


}