package by.epam.globTask7.task04;


import java.util.Random;

public class Train {
    public String[] stationName = {"Moscowsaya"," Lesnaya", "Proletars", "Park", "Zhilaya"};
    public int[] trainNumberArr = {5, 6, 8, 10, 12, 7, 9};

    private String station;



    public Train(){
        Random rand = new Random();
        setTrainNumber(trainNumberArr[rand.nextInt(0,7)]);
        setStation(stationName[rand.nextInt(0,4)]);
        departure = timeGenerate();
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

    
    

    private String timeGenerate(){
        Random rand = new Random();

        float timing = 0;
        timing = rand.nextInt(0,86400);             //generation time in seconds

        float hours = timing/3600;                                 //select hour
        String _hours = (int)hours+"";                             //целое число                           
        String _minutes = "";   
                                            
        if (hours<10) {
            _hours = 0 +""+ (int)hours; 
        }


        float minutes = (int)(Math.abs(hours - (Math.round(hours)))*60);    //выделение минут с точкой
        _minutes = (int)minutes +"";                                        //минуты без точки

        if (minutes<10) {
            _minutes = 0 + ""+(int)minutes;
        }

        String time = _hours+":"+_minutes;                                   //слияние 
        return  time;
    }




    

}
