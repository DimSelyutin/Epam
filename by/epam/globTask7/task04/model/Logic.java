package by.epam.globTask7.task04.model;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import by.epam.globTask7.task04.Train;


public class Logic {
    public String[] station() {
        File file = new File("E:/GitHub/Epam/Epam-1/by/epam/globTask7/task04/model/Station.txt");
        
        int count= 0;
        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
        {
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        String[] station = new String[count];


        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
        {
            for (int i = 0; i < station.length; i++) {
                station[i] = sc.nextLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return station;
    }


    public String timeGenerate(){
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
    
    public String[][] sortStation(Train[] train){
        String[][] arr = new String[train.length][train.length];

        for (int i = 0; i < arr.length; i++) {                                                               //создание масива станций
            for (int j = 0; j < 2; j++) {

                if (j == 1) {
                    arr[j][i] = train[i].getStation()+i;
                } else {
                    arr[j][i] = i+"";
                }

            }
        }

        Arrays.sort(arr[1]);                                                                              //сортировка по станциям

        for (int i = 0; i < arr.length; i++) {                                                              //запись id обьектов
            for (int j = 0; j < 2; j++) {

                if (j==1) {

                    arr[j-1][i] = arr[j][i].substring(arr[j][i].length()-1, arr[j][i].length());
                    arr[j][i] = arr[j][i].substring(0, arr[j][i].length()-2);
                    
                }

            }
        }

        
        for (int i = 1; i < arr.length; i++) {                  //сортировка по времени одинаковых остановок
            String set = "";
            int count = Integer.parseInt(arr[0][i]);
            int count2 = Integer.parseInt(arr[0][i-1]);


            if (train[count].getStation().equals(train[count2].getStation())) {
                      
                if (train[count].getDeparture().compareTo(train[count2].getDeparture())<0) {
                    set = arr[0][i];
                    arr[0][i] = arr[0][i-1];
                    arr[0][i-1] = set;
                }

            }
            

        }
        
        return arr;
    }


    public int[][] trainSort(Train[] train){
        
        //запись в двумерный масив
        int[][] trainNumberId = new int[5][5];
        for (int i = 0; i < trainNumberId.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    trainNumberId[i][j] = i;
                } else if(j == 1){
                    trainNumberId[i][j] = train[i].getTrainNumber();
                }
            }
        }

                                                                        //sort
        for (int i = 0; i < trainNumberId[0].length; i++) {
            int current = trainNumberId[i][1];
            int coun = trainNumberId[i][0];
            int j = i;
            while (j>0 && trainNumberId[j-1][1]>current) {
                trainNumberId[j][1] = trainNumberId[j-1][1];
                trainNumberId[j][0] = trainNumberId[j-1][0];
                j--;
            }

            trainNumberId[j][1] = current;
            trainNumberId[j][0] = coun;
        }

        return trainNumberId;
    }
}
