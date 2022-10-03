package ru.dragon.task.main.bean;

import java.io.Serializable;
import java.util.Arrays;


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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((treasureName == null) ? 0 : treasureName.hashCode());
        result = prime * result + ((rare == null) ? 0 : rare.hashCode());
        result = prime * result + ((typeTreasure == null) ? 0 : typeTreasure.hashCode());
        result = prime * result + Float.floatToIntBits(mass);
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
        Treasure other = (Treasure) obj;
        if (treasureName == null) {
            if (other.treasureName != null)
                return false;
        } else if (!treasureName.equals(other.treasureName))
            return false;
        if (rare == null) {
            if (other.rare != null)
                return false;
        } else if (!rare.equals(other.rare))
            return false;
        if (typeTreasure == null) {
            if (other.typeTreasure != null)
                return false;
        } else if (!typeTreasure.equals(other.typeTreasure))
            return false;
        if (Float.floatToIntBits(mass) != Float.floatToIntBits(other.mass))
            return false;
        if (coast != other.coast)
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Treasure [treasureName=" + treasureName + ", rare=" + rare + ", typeTreasure=" + typeTreasure
                + ", mass=" + mass + ", coast=" + coast + "]";
    }
}