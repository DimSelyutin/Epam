package by.epam.globTask7.task04;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Station {
    public String[] station() {
        File file = new File("E:/GitHub/Epam/Epam-1/by/epam/globTask7/task04/Station.txt");
        
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
}
