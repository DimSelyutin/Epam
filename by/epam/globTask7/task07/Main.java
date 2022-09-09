package by.epam.globTask7.task07;

public class Main {
    public static void main(String[] args) {
        Triangle tr = new Triangle();


        System.out.printf("We have a rectangle with coordinates: [%s;%s],[%s;%s],[%s;%s]",tr.getCoordinates()[0],tr.getCoordinates()[1],tr.getCoordinates()[2],tr.getCoordinates()[3],tr.getCoordinates()[4],tr.getCoordinates()[5]);
        System.out.printf("\nSquare of triangle: %.1f", tr.getSquareTriangle());
    }
}
