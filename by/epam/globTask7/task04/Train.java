package by.epam.globTask7.task04;

import java.util.Random;

public class Train {
    public String[] stationName = {"Moscowsaya"," Lesnaya", "Proletars", "Park", "Zhilaya"};
    public int[] trainNumberArr = {5, 6, 8, 10, 12};

    private String station;



    public Train(){
        Random rand = new Random();
        setTrainNumber(trainNumberArr[rand.nextInt(0,5)]);
        setStation(stationName[rand.nextInt(0,4)]);
        departure = timeGenerate()[0] + ":"+timeGenerate()[1];
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

    
    

    private int[] timeGenerate(){
        int[] timing = new int[2];
        Random rand = new Random();

        timing[0] = rand.nextInt(0,24);
        timing[1] = rand.nextInt(0,60);

        return timing;
    }




    

}
