package by.epam.globTask7.task05.main;

import java.util.Random;

public class Counter {
    private int numberStart;
    private int numberEnd;
    private int count;

    

    public Counter(){
        numberStart = 1;
        numberEnd = 10;
    }

    public void setCounterRandom(){
        Random rand = new Random();
        numberStart = rand.nextInt(0,100);
        while (numberStart>numberEnd) {
            numberEnd = rand.nextInt(0,100);
        }
    }
    public void setNumberStart(int _numberStart){
        this.numberStart = _numberStart;
    }
    public void setNumberEnd(int _numberEnd){
        this.numberEnd = _numberEnd;
    }

    public int getCount() {
        return count;
    }


    public int getNumberStart(){
        return numberStart;
    }
    public int getNumberEnd(){
        return numberEnd;
    }


    public void numberMinusOne(){
        numberEnd += 1;
    }

    public void numberPlus(){
        numberStart += 1;
    }

    public void counterPrint(){
        System.out.println("Counter now: "+count);
    }

    public void counter(){
        count = numberStart;
        while (count <= numberEnd) {
            System.out.println(count++);
            
        }
    }
}


