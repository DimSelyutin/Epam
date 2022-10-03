package ru.dragon.task.main.controller;

import java.io.Serializable;
import java.util.List;

import ru.dragon.task.main.bean.Treasure;

public class UserResponce implements Serializable{



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
    
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listTreasure == null) ? 0 : listTreasure.hashCode());
        result = prime * result + ((comandName == null) ? 0 : comandName.hashCode());
        result = prime * result + ((treasure == null) ? 0 : treasure.hashCode());
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserResponce other = (UserResponce) obj;
        if (listTreasure == null) {
            if (other.listTreasure != null)
                return false;
        } else if (!listTreasure.equals(other.listTreasure))
            return false;
        if (comandName == null) {
            if (other.comandName != null)
                return false;
        } else if (!comandName.equals(other.comandName))
            return false;
        if (treasure == null) {
            if (other.treasure != null)
                return false;
        } else if (!treasure.equals(other.treasure))
            return false;
        if (message == null) {
            if (other.message != null)
                return false;
        } else if (!message.equals(other.message))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "UserResponce [listTreasure=" + listTreasure + ", comandName=" + comandName + ", treasure=" + treasure
                + ", message=" + message + "]";
    }

}