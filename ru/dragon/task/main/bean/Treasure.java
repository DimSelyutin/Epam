package ru.dragon.task.main.bean;

import java.io.Serializable;

public class Treasure implements Serializable{
    
    private String[] typesTreas = {"Coins", "Armor", "Table-item", "Jewel", "Magic-item", "Egg"};

    private String rare;
    private String typeTreasure;
    private int mass;
    private int coast;

    
    
    Treasure(){
        this.rare = "common";
        this.typeTreasure = typesTreas[0];
        this.mass = 1;
        this.coast = 10;
    }
    
    Treasure(String rare, int type,int mass, int coast){
        this.rare = rare;
        this.typeTreasure = typesTreas[type];
        this.mass = mass;
        this.coast = coast;
    }
    
    public String getRare() {
        return rare;
    }
    public void setRare(String rare) {
        this.rare = rare;
    }


    public String getTypeTreasure() {
        return typeTreasure;
    }
    public void setTypeTreasure(String typeTreasure) {
        this.typeTreasure = typeTreasure;
    }


    public int getMass() {
        return mass;
    }
    public void setMass(int mass) {
        this.mass = mass;
    }


    public int getCoast() {
        return coast;
    }
    public void setCoast(int coast) {
        this.coast = coast;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
}
