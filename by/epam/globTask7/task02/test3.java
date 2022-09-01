package by.epam.task7.main.task2.main;


public class Task72 {
  
    public static void main(String args[]){
        student(10);                        

    }

    public static void student(int studentCount){           //метод инициализации студентов(приним. кол-во студентов) и инициализирует начальные переменные
      
        Student[] student = new Student[studentCount];
      
        for (int i = 0; i < student.length; i++) {
          
            student[i] = new Student();
          
        }

        for (int i = 0; i < student.length; i++) {
          
            student[i].excellentPrint();
          
        }
    }
}

