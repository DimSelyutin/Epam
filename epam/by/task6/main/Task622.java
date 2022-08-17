import java.util.Scanner;
// Дана строка, в которой нет начальных и конечных пробелов. Необходимо изменить ее так, чтобы длина 
// строки стала равна заданной длине, больше чем текущая длина строки. Это следует сделать путем вставки 
// между словами дополнительных пробелов. Количество пробелов между отдельными словами не должно 
// отличаться более чем на один пробел (то есть пробелы добавляются равномерно).
class Task661 {
    public static void main(String[] args){
        String str = new String("Lorem Ipsum is simply dummy text of the printing and typesetting industry");
        
        Scanner sc = new Scanner(System.in);
        
        char[] ch = str.toCharArray();
        int count = 0;
        do {
            System.out.println("Строка больше введенного значения "+str.length()+" символов: ");
            count = sc.nextInt();
        } while (count < str.length());

      
       for (int i = 0; i < str.length(); i++) {
         if (Character.toString(ch[i]) == " ") {
            System.out.println("sda");
         }
       }


        
    }
}
