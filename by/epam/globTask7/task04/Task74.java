package by.epam.task7.task4;


public class Task74 {
    public static void main(String[] args) {
        Train[] train = new Train[5];
        for (int i = 0; i < train.length-1; i++) {
            train[i] = new Train();
        }
        int count=0;
        int[] init = new int[5];
        for (int i = 0; i < train.length-1; i++) {
            for (int j = 0; j < train.length-1; j++) {
                for (int j2 = 0; j2 < init.length-1; j2++) {
                    if(train[j].getTrainNumber() < train[j2].getTrainNumber()){
                        count = train[j].getTrainNumber();
                    }
                }
            }
            System.out.println(count);
        }
        
    }
}
