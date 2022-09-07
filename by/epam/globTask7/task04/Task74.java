package by.epam.globTask7.task04;

import java.util.Scanner;

public class Task74 {
    public static void main(String[] args) {
        Train[] train = new Train[5];
        for (int i = 0; i < train.length; i++) {
            train[i] = new Train();
        }
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of action:\n1. Sort about number of train\n2. Sort about station\n3. Show tran information\n ");
        int x = sc.nextInt();


        switch (x) {

            case 1:
                int[][] array = train[0].trainSort(train);
                int id = 0;
                for (int i = 0; i < array.length; i++) {
                    id = array[i][0];
                    System.out.println("Train number: "+train[id].getTrainNumber()+ "\nВремя отправления: "+train[id].getDeparture()+"\n"+"Station: "+ train[id].getStation()+"\n");
                }
            break;


            case 2:
                String st[][] = train[0].sortStation(train);
                int count = 0;
                for (int i = 0; i < st.length; i++) {
                    count = Integer.parseInt(st[0][i]);

                    System.out.println("Train number: "+train[count].getTrainNumber()+ "\nВремя отправления: "+train[count].getDeparture()+"\n"+"Station: "+ train[count].getStation()+"\n");
                }
            break;


            case 3:
                System.out.println("Enter train number: ");
                int choice = sc.nextInt();
                boolean bool = true;
                for (int i = 0; i < train.length; i++) {
                    if(train[i].getTrainNumber() == choice){
                        System.out.println("Train number: "+train[i].getTrainNumber()+ "\nВремя отправления: "+train[i].getDeparture()+"\n"+ train[i].getStation()+"\n");
                        bool = false;
                    }
                }
                if (bool) {
                    System.out.println("Train number not found!");
                }
            break;


            default:
                    System.out.println("Your choice is not valid.");
                break;
        }
    }

    


   

    

}
