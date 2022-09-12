package by.epam.globTask7.task04;


import java.util.Arrays;
import java.util.Random;

import by.epam.globTask7.task04.model.Logic;



public class Train {
    Logic st = new Logic();
    public int[] trainNumberArr = {5, 6, 8, 10, 12, 7, 9};

    private String station;



    public Train(){
        Random rand = new Random();
        setTrainNumber(trainNumberArr[rand.nextInt(0,7)]);
        setStation(st.station()[rand.nextInt(0,st.station().length)]);
        departure = new Logic().timeGenerate();
    }



    
    public String getStation() {
        return station;
    }
    public void setStation(String station) {
        this.station = station;
    }



    private int trainNumber;

    public int getTrainNumber() {
        return trainNumber;
    }
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    

    private String departure;

    public String getDeparture() {
        return departure;
    }
    public void setDeparture(String departure) {
        this.departure = departure;
    }


}
