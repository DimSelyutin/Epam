package by.epam.globTask7.task03.main;

import java.util.Random;

public class Student {
  
    public String[] nameStrings = {"Alex", "Dmitriy","Oleg","Liza", "Olga","Nastya"};
    public String[] surnameStrings = {"Petrov", "Grozny","Semanchuk","Buzovskiy", "Kreed","Evleevich"};

    private String surname;
    private String name;
    public int groupNumber;
    private int[] performance = new int[5];
  
  
    public Student(){                           //конструктор инициализирующий все переенные класса
      
        Random rand = new Random();
      
        for (int i = 0; i < performance.length; i++) {
          
            performance[i] = rand.nextInt(8,11);
          
        }
        
        groupNumber = rand.nextInt(1,5);
        
        surname = surnameStrings[rand.nextInt(1,surnameStrings.length-1)];
      
        name = nameStrings[rand.nextInt(1,nameStrings.length-1)];
        
    }

  
  
    public String getSurname() {
        return surname;
    }
  
  
    public void setSurname(String _surname){
        surname = _surname;
    }
  
  
    public String getName() {
        return name;
    }
  
  
    public void setName(String _name){
        name = _name;
    }

  
    public int[] getPerformance(){    //возвращает массив оценок
        return performance;
    }
    
  
    public void excellentPrint(){    //метод выводящий только отличников
      
        int count=0;
        for (int i = 0; i < performance.length; i++) {
          
            if (performance[i] >= 9) {
                count++;
              
            }
          
          
          
            if (count == 5) {
                System.out.println("Student name: "+getName()+" "+getSurname()+"\nGroup number: " + groupNumber);
                System.out.println("Student ratings: ");
              
                for (int j = 0; j < performance.length; j++) {
                  
                    System.out.print(performance[j]+ "\t");
                  
                }
              
                System.out.println();
              
            }
          
          
          
          
        }
    }
    
    
}   
