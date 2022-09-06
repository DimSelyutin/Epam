package by.epam.globTask7.task04;


public class Task74 {
    public static void main(String[] args) {

        Train[] train = new Train[5];
        for (int i = 0; i < train.length; i++) {            
            train[i] = new Train();
        }
                                                            //запись в масив масивов
        int[][] trainNumberId = new int[5][5];
        for (int i = 0; i < trainNumberId.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    trainNumberId[i][j] = i;
                } else if(j == 1){
                    trainNumberId[i][j] = train[i].getTrainNumber();
                }
            }
        }

                                                                        //sort
        for (int i = 0; i < trainNumberId[0].length; i++) {
            int current = trainNumberId[i][1];
            int coun = trainNumberId[i][0];
            int j = i;
            while (j>0 && trainNumberId[j-1][1]>current) {
                trainNumberId[j][1] = trainNumberId[j-1][1];
                trainNumberId[j][0] = trainNumberId[j-1][0];
                j--;
            }

            trainNumberId[j][1] = current;
            trainNumberId[j][0] = coun;
        }


        int id = 0;
        for (int i = 0; i < train.length; i++) {
            id = trainNumberId[i][0];
            System.out.println(train[id].getTrainNumber()+ "\n Время отправления: "+train[id].getDeparture()+"\n"+ train[id].getStation());
        }

    }
}
