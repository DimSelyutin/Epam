package ru.dragon.task.main.clientaplication;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.Random;

import ru.dragon.task.main.bean.Treasure;

public class GenerateTreasure implements Serializable {
    

    /**
     *  trPath, itemsArr may be helper :) 
     */
    private String trPath = "E:/GitHub/Epam/Epam-1/ru/dragon/task/main/clientaplication/treasures.txt";
    private int[] itemsArr = {0,30,60,80,85,86,88};
    



    private Treasure newTreasure;


    public Treasure getNewTreasure() {

        return newTreasure;

    }


    public GenerateTreasure(){
        generate();                                                                             //метод генерации сокровища
    }

    private Treasure generate(){

        Random rand = new Random();
        int randName = 0;
        int randTreasure = 0;

            //корректировка под БД
            boolean x = true;
            while (x) {
                x = false;
                randName = rand.nextInt(1,89);
                for (int j : itemsArr) {
                    if (randName == j) {
                        x = false;
                    }
                }
            }

            //ппроверка параметра
            if (randName < 31) {
                randTreasure = 0;
            } else if(randName < 61){
                randTreasure = 1;
            } else if (randName < 81) {
                randTreasure = 2;
            } else if(randName < 86){
                randTreasure = 3;
            } else if(randName < 88){
                randTreasure = 4;
            }

            //инициализация обьекта
            try {
              newTreasure = (new Treasure(Files.readAllLines(Paths.get(trPath)).get(randName),
                            rand.nextInt(0,3),
                            randTreasure, 
                            rand.nextFloat(1,10), 
                            rand.nextInt(1,1000)));
            } catch (IOException e) {
                System.out.println("Database Error!");
                e.printStackTrace();
            }

        return newTreasure;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((newTreasure == null) ? 0 : newTreasure.hashCode());
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
        GenerateTreasure other = (GenerateTreasure) obj;
        if (newTreasure == null) {
            if (other.newTreasure != null)
                return false;
        } else if (!newTreasure.equals(other.newTreasure))
            return false;
        return true;
    }

}