package epam.by.task6.main;

import java.util.Scanner;

// Дана строка, в которой нет начальных и конечных пробелов. Необходимо изменить ее так, чтобы длина 
// строки стала равна заданной длине, больше чем текущая длина строки. Это следует сделать путем вставки 
// между словами дополнительных пробелов. Количество пробелов между отдельными словами не должно 
// отличаться более чем на один пробел (то есть пробелы добавляются равномерно).
//Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has  been the industry's standard
public class Task620 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x=0;
        String str = "Lorem Ipsum is simply dummy text of the";
        
        
        while (x < str.length()) {
            System.out.println("Enter sting more then "+str.length()+":");
            while(!sc.hasNextInt()){
                sc.nextLine();
                System.out.println("Enter the number!");
                
            }
            x = sc.nextInt();                                                           //необходимое кол-во символов
        }

        

        String[] str2 = str.split(" ");


        for (int i = 0, count = 0; count<x-str.length()+str2.length-1; i++) {           ///count - счетчик пробелов которое необходимо поставить
            if (i>str2.length-1) {
                i = -1;
            } else {
                str2[i] += ".";
                System.out.println(str2[i]);
                count++;
            }
        }

        
        String strCorect = String.join("", str2);                                       //соединение строки обратно
        System.out.println(strCorect + "Length of sting is:" + strCorect.length());

    }
}
