package by.epam.task11.main.view;

import java.util.List;

import by.epam.task11.main.bean.Flat;


public class Present {
    public Present(){
    }


    public void table(){
        System.out.println("Room number\tRooms\tFloor\tStreet\t\t\tSquare\tHouse Type");
    }


    public void printFlat(List<Flat> flats){
        for (Flat _s : flats) {
            System.out.println(_s.getNumber()+"\t\t"+_s.getRoom()+"\t"+_s.getFloor()+"\t"+_s.getStreet()+"\t"+_s.getSquare()+"\t"+_s.getFlatType());
        }

    }
}
