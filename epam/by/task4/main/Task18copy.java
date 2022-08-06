package epam.by.task4.main;

import java.util.Scanner;
import java.util.Random;
//делал на телефоне поэтому простое решение ;)
public class Task18copy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Введите значение 1 и 2");
		int[] arr =new int[10];
		int a = (int)(Math.random()*9);
		int b;
		    do{
		        b = (int)Math.random()*9;  
		    } while(a==b);
		int as = sc.nextInt();
		int sb = sc.nextInt();
		arr[a]=as;
		arr[b]=sb;
		
		int count=0;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]!=0){
		        count=i;
		    }
		    arr[i]=(int)(Math.random()*5)+1;
		    
		}
		if(count>=1 && count<=7 ){
		    arr[count+1]=1;
		    arr[count+2]=10-arr[count]-1;
		}
		System.out.println("Итоговый массив:");		
                    for(int d : arr){
		        System.out.println(d);
		    }
	}
}