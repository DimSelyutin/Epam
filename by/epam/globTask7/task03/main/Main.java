package by.epam.globTask7.task03.main;


public class Main {
  
    public static void main(String args[]){
        student(10);                        

    }

    public static void student(int studentCount){           //метод инициализации студентов(приним. кол-во студентов) и инициализирует начальные переменные
      
        Student[] student = new Student[studentCount];
      
        for (int i = 0; i < student.length; i++) {
            
            student[i] = new Student();
          
        }

        for (int i = 0; i < student.length; i++) {
          
            excellentPrint(student[i]);
          
        }
    }

    public static void excellentPrint(Student student){    //метод выводящий только отличников
      
        int count=0;
        for (int i = 0; i < student.getPerformance().length; i++) {
          
            if (student.getPerformance()[i] >= 9) {
                count++;
              
            }
        
          
            if (count == 5) {
                System.out.println("Student name: "+student.getName()+" "+student.getSurname()+"\nGroup number: " + student.groupNumber);
                System.out.println("Student ratings: ");
              
                for (int j = 0; j < student.getPerformance().length; j++) {
                  
                    System.out.print(student.getPerformance()[j]+ "\t");
                  
                }
              
                System.out.println();
              
            }
          
          
          
          
        }
    }
}

