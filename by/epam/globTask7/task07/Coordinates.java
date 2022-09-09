package by.epam.globTask7.task07;

import java.io.Serializable;
import java.util.Random;

public class Coordinates implements Serializable{
    
    Random rand = new Random();
    
    private int coord1;
    private int coord2;
    private int coord3;
    private int coord4;
    private int coord5;
    private int coord6;

    public Coordinates(){
        int p;
        int firstSide;
        int secondSide;
        int thirdSide;


        
        
        do{
            coord1 = rand.nextInt(0,10);
            coord2 = rand.nextInt(0,10);
            do {
                coord3 = rand.nextInt(0,10);
                coord4 = rand.nextInt(0,10);
            }  while (coord1 == coord3);
            do {
                coord5 = rand.nextInt(0,10);
                coord6 = rand.nextInt(0,10);
            } while((coord1-coord5)*(coord4-coord6)-(coord3-coord5)*(coord2-coord6)==0);
            
            firstSide = (int)Math.sqrt(Math.pow((coord1-coord3),2)+Math.pow((coord2-coord4),2));
            secondSide = (int)Math.sqrt(Math.pow((coord3-coord5),2)+Math.pow((coord4-coord6),2));
            thirdSide = (int)Math.sqrt(Math.pow((coord5-coord1),2)+Math.pow((coord6-coord2),2));
            p = (firstSide+secondSide+thirdSide)/2;
        } while (Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide))==0);


    }

    
    public int getCoord1() {
        return coord1;
    }

    public int getCoord2() {
        return coord2;
    }

    public int getCoord3() {
        return coord3;
        }

    public int getCoord4() {
        return coord4;
    }

    public int getCoord5() {
        return coord5;
    }

    public int getCoord6() {
        return coord6;
    }


}
