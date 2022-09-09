package by.epam.globTask7.task07;

public class Triangle {
    Coordinates coord = new Coordinates();
    
    
    

    public Triangle(){
        firstSide = (int)Math.sqrt(Math.pow((coord.getCoord1()-coord.getCoord3()),2)+Math.pow((coord.getCoord2()-coord.getCoord4()),2));
        secondSide = (int)Math.sqrt(Math.pow((coord.getCoord3()-coord.getCoord5()),2)+Math.pow((coord.getCoord4()-coord.getCoord6()),2));
        thirdSide = (int)Math.sqrt(Math.pow((coord.getCoord5()-coord.getCoord1()),2)+Math.pow((coord.getCoord6()-coord.getCoord2()),2));
        p = (firstSide+secondSide+thirdSide)/2;
        squareTriangle = Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide));
        
        
    }

    private double p;
    public void setP(double poluPerimetr) {
        this.p = poluPerimetr;
    }
    public double getP() {
        return p;
    }



    private double firstSide;

    public double getFirstSide() {
        return firstSide;
    }
    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }




    private double secondSide;

    public double getSecondSide() {
        return secondSide;
    }
    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }




    private double thirdSide;

    public double getThirdSide() {
        return thirdSide;
    }
    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    private double squareTriangle;

    public double getSquareTriangle() {
        return squareTriangle;
    }
    public void setSquareTriangle(double squareTriangle) {
        this.squareTriangle = squareTriangle;
    }

  
    public int[] getCoordinates(){
        int []coordinate = {coord.getCoord1(),coord.getCoord2(),coord.getCoord3(),coord.getCoord4(),coord.getCoord5(),coord.getCoord6()};
        return coordinate;
    }

    public void centrMedian() {
        
    }
}
