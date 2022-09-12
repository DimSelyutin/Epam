package by.epam.task11.main.bean;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Flat implements Serializable{
    private static final long serialVersionUID = 1L;

    private int number;
    private int square;
    private int floor;
    private int room;
    private String street;
    private String flatType;
    private int exploit;
    private String path = "E:/GitHub/Epam/Epam-1/by/epam/task11/main/model/database.txt";



    public String getPath(){
        return path;
    }
    
    Flat(int _number, int _square, int _floor, int _room, String _street){
        number = _number;
        square = _square;
        floor = _floor;
        room = _room;
        street = _street;
        flatType = "Panel";
        exploit = 5;
    }

    Random rand = new Random();


    public Flat() throws IOException{
        number = rand.nextInt(1,50);
        square = rand.nextInt(46,59);
        floor = rand.nextInt(1,9);
        room = rand.nextInt(1,5);
        street = Files.readAllLines(Paths.get(path)).get(rand.nextInt(0,14));
        flatType = Files.readAllLines(Paths.get(path)).get(rand.nextInt(15,18));
        exploit = 5;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }


    public int getSquare() {
        return square;
    }
    public void setSquare(int square) {
        this.square = square;
    }


    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }


    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }


    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }


    public String getFlatType() {
        return flatType;
    }
    public void setFlatType(String flatType) {
        this.flatType = flatType;
    }

    
    public int getExploit() {
        return exploit;
    }
    public void setExploit(int exploit) {
        this.exploit = exploit;
    }



    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(number,square,floor,room,street,flatType,exploit);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Room number: "+number+"Square: "+square+"Floor: "+floor+"Rooms amount: "+street+"Type of flat: "+flatType+"Exploitation time: "+exploit;
    }

    public Flat add(Flat flat) {
        flat.add(flat);
        return flat;
    }

    public void remove(Flat flat) {
        flat.remove(flat);
    }


}
