package ru.dragon.task.main.controller;

import java.util.List;

import ru.dragon.task.main.bean.Treasure;

public class UserResponce {
    private List<Treasure> listTreasure;

    private String comandName;
    private Treasure treasure;
    private String message;
    
    
    
    
    public UserResponce(){
        
    }
    
    
    
    public Treasure getTreasure() {
        return treasure;
    }
    
    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }
    
    

    public List<Treasure> getListTreasure() {
        return listTreasure;
    }
    
    public void setListTreasure(List<Treasure> listTreasure) {
        this.listTreasure = listTreasure;
    }
    
    
    
    public String getComandName() {
        return comandName;
    }
    
    public void setComandName(String comandName) {
        this.comandName = comandName;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String string) {
        this.message = message;
    }
}