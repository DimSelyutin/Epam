package epam.by.task6.main;


public class Task620 {
	public static void main(String[] args) {
		String str = "     Lorem     Ipsum is     simply dummy text    of the            printing and typesetting industry     ";
		System.out.println(str);
	    str = str.trim();
	    do{
	        
	        str = str.replace("  "," ");
	        
	        }
	        
	    while (str.contains("  "));
	    
	    
	        // или str.replaceAll("\\s+","")

	    
		System.out.println(str.replace(" ", " "));
	}
}

