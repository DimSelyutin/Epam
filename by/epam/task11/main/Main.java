package by.epam.task11.main;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import by.epam.task11.main.bean.Building;
import by.epam.task11.main.bean.Flat;
import by.epam.task11.main.logic.LogicFlat;
import by.epam.task11.main.view.Present;


public class Main implements Serializable {
    private static List<Flat> searchRoom;


    public static void main(String[] args) throws IOException {
        
        Present d = new Present();
        List<Flat> flat = new Building().createFlat();
        //a
        System.out.println("For search flats by room amount, enter amount:");
        int room1 = checkNum();
        searchRoom = new LogicFlat().searchRoom(flat,room1);

        d.table();
        d.printFlat(searchRoom);
        

        
        //b
        System.out.println("\nFor search by room amount and flat range, enter amount and flat gap from ... to ...:");
        System.out.print("Enter amount_ ");
        int room2 = checkNum();

        System.out.print("Enter start floor_ ");
        int pos1 = checkNum();

        System.out.print("Enter last floor_ ");
        int pos2 = checkNum();

        searchRoom = new LogicFlat().serachRoomFlat(flat,room2,pos1,pos2);
        d.table();
        d.printFlat(searchRoom);



        //c
        System.out.println("\nFor search of room square, enter start square: ");
        int square = checkNum();

        searchRoom = new LogicFlat().serachSquare(flat,square);
        d.table();
        d.printFlat(searchRoom);

    }

    
    private static int checkNum(){
        Scanner sc = new Scanner(System.in);
        int num =0;
        while (!sc.hasNextInt()) {
            System.out.println("Введите число!");
            sc.nextLine();
        }   
        num = sc.nextInt();
        return num;
    }
}
