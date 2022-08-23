package epam.by.task6.main;

import java.util.Scanner;

public class Task6122 {
    public static void main(String[] args) {
        
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-'(=";
        String message = "vujgvmCfb tj ufscfu ouib z/vhm jdjuFyqm jt fscfuu uibo jdju/jnqm fTjnqm tj scfuuf ibou fy/dpnqm yDpnqmf jt cfuufs boui dbufe/dpnqmj uGmb tj fuufsc ouib oftufe/ bstfTq jt uufscf uibo otf/ef uzSfbebcjmj vout/dp djbmTqf dbtft (ubsfo djbmtqf hifopv up csfbl ifu t/svmf ipvhiBmu zqsbdujdbmju fbutc uz/qvsj Fsspst tipvme wfsof qbtt foumz/tjm omfttV mjdjumzfyq odfe/tjmf Jo fui dfgb pg hvjuz-bncj gvtfsf fui ubujpoufnq up ftt/hv Uifsf vmetip fc pof.. boe sbcmzqsfgf zpom pof pvt..pcwj xbz pu pe ju/ Bmuipvhi uibu bzx bzn puo cf wjpvtpc bu jstug ttvomf sfzpv( i/Evud xOp tj scfuuf ibou /ofwfs uipvhiBm fsofw jt fopgu cfuufs boui iu++sjh x/op gJ ifu nfoubujpojnqmf tj eibs pu mbjo-fyq tju( b bec /jefb Jg fui foubujpojnqmfn jt fbtz up bjo-fyqm ju znb cf b hppe jefb/ bnftqbdftO bsf pof ipoljoh sfbuh efbj .. fu(tm pe psfn gp tfuip";
        String prob = "";
        int l = 0;


        
        String[] str = message.split(" ");
        String newStr = "";
        
        for (int i = 0,j=6; i < str.length; i++) {
            if (str[i].length()-1 < 2) {
            
                newStr += new StringBuilder(str[i]).reverse().toString()+ " ";
                
            } else {
            
                newStr += str[i].substring(str[i].length()-3);
                newStr += str[i].substring(0,str[i].length()-3)+ " ";
                
            }
        }


        System.out.println(letters.length());
        for (int i = 0; i < newStr.length()-1; i++) {
        
            prob = newStr.charAt(i)+"";
            
            if (prob.equals(" ")) {
            
                System.out.print(" ");
                
            } else if(prob.equals("/")){
            
                System.out.println(".");
                
            } else if(prob.equals("+") || prob.equals(".")){
            
                System.out.print("");
                
            } else {
            
            
                l = letters.indexOf(prob);
                if (l<=0) {
                
                    l = letters.length();
                    System.out.print(letters.charAt(l));
                    
                } else {
                
                    System.out.print(letters.charAt(l-1));
                    
                }
                
                
            }
            
            
        }
        

    }
}
