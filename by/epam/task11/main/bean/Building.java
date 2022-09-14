package by.epam.task11.main.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Building implements Serializable{

    private List<Flat> flats;
    

    public List<Flat> getFlats() {
        return flats;
    }


    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }


    public Building(){
        flats = new ArrayList<>();
    }
    Building(List<Flat> flats){
        this.flats = flats;
    }

    public List<Flat> createFlat() throws IOException{
        int objamiunt = 15;
        List<Flat> flat = new ArrayList<>();
        for (int i = 0; i < objamiunt; i++) {
            flat.add(new Flat());
        }
        return flat;
    }


    public void addFlat(Flat flat){
        flat.add(flat);
    }

    public void removeFlat(Flat flat){
        flat.remove(flat);
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
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
}
