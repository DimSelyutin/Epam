package by.epam.globTask6.main;


public class Task620 {
	public static void main(String[] args) {
		String str = "     Lorem     Ipsum is     simply dummy text    of the            printing and typesetting industry     ";
		
	    String str2 = "";
	    
	    do{
	        
	        str = str.replace("  "," ");
	        
	        }
	        
	    while (str.contains("  "));
	    
	    
	        // или str.replaceAll("\\s+","")

	    str2 = str.trim();
		System.out.println(str2.replace(" ", "."));
	}
}

