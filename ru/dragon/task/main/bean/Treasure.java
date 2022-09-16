package ru.dragon.task.main.bean;

import java.io.Serializable;


public class Treasure implements Serializable{
    
    private String[] rareArr = {"Common", "Rare", "Epic", "Legendary"};
    private String[] treasureArr = {"Armor",  "Jewel", "Magic-item", "Gold","Egg"};


    private String treasureName;
    private String rare;
    private String typeTreasure;
    private float mass;
    private int coast;
    
    
    
    Treasure(){
        this.treasureName = "Treasure Name";
        this.rare = rareArr[0];
        this.typeTreasure = treasureArr[0];
        this.mass = 1;
        this.coast = 10;
    }


    public Treasure(String tName,int rareInd, int type, float mass, int coast){
        this.treasureName = tName;
        this.rare = rareArr[rareInd];
        this.typeTreasure = treasureArr[type];
        this.mass = mass;
        this.coast = coast;
    }
    
    public String getTreasureName() {
        return treasureName;
    }

    public void setTreasureName(String treasureName) {
        this.treasureName = treasureName;
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


    public float getMass() {
        return mass;
    }
    public void setMass(float mass) {
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
