package by.epam.globTask7.task08.main;


import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class GetName implements Serializable{
    private String cardName;
    private String cardSurname;
    

    public String getCardSurname() {
        return cardSurname;
    }


    public String getCradName() {
        return cardName;
    }


    int nameLines = 15;
    private String pathName = "E:/GitHub/Epam/Epam-1/by/epam/globTask7/task08/main/dataBase.txt";

    public GetName() throws IOException{

        Random rand = new Random();

        cardName = Files.readAllLines(Paths.get(pathName)).get(rand.nextInt(0,14));
        
        if (cardName.substring(cardName.length()-1).equals("a")) {
            cardSurname = ""+Files.readAllLines(Paths.get(pathName)).get(rand.nextInt(15,29))+"a";
        } else {
            cardSurname = ""+Files.readAllLines(Paths.get(pathName)).get(rand.nextInt(15,29));
        }
    }

    
    
}
