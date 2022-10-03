package ru.dragon.task.main.controller;

import java.io.Serializable;

public class UserRequest implements Serializable {


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


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((commandName == null) ? 0 : commandName.hashCode());
        result = prime * result + coast;
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
        UserRequest other = (UserRequest) obj;
        if (commandName == null) {
            if (other.commandName != null)
                return false;
        } else if (!commandName.equals(other.commandName))
            return false;
        if (coast != other.coast)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "UserRequest [commandName=" + commandName + ", coast=" + coast + "]";
    }
}
