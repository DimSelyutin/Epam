package ru.dragon.task.main.bean;

import java.io.Serializable;
import java.util.Objects;


public class Treasure implements Serializable{
    static final long SerialVersionUID = -4862926644813433707L;
    
    private String[] rareArr = {"Common", "Rare", "Epic", "Legendary"};
    private String[] treasureArr = {"Armor",  "Jewel", "Magic-item", "Gold","Egg"};


    private String treasureName;
    private String rare;
    private String typeTreasure;
    private float mass;
    private int coast;


    public Treasure(){
        this.treasureName = "Treasure Name";
        this.rare = rareArr[0];
        this.typeTreasure = treasureArr[0];
        this.mass = 1;
        this.coast = 1;
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
        return "Treasure{ Name: "+treasureName+", Rare: "+ rare+", Treasure Type: "+typeTreasure+", Weight: "+mass+", Coast: "+coast;
    }

    @Override
    public int hashCode() {
        return Objects.hash(treasureName, rare, typeTreasure,mass,coast);
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Treasure treasure = (Treasure) obj;
        return Objects.equals(treasureName, treasure.treasureName) &&Objects.equals(rare, treasure.rare) && Objects.equals(typeTreasure, treasure.typeTreasure) && 
        mass == treasure.mass && coast
         == treasure.coast;
    }
}