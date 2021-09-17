import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class DataSearch {
	public static void main(String[] args){
		 File file = new File("F:\\list.txt");
		 HashMap<String, Integer> my_dict = new HashMap<>();
		 int linenumber=1;
		 try {
			 Scanner sc = new Scanner(file);
			 while (sc.hasNextLine())
				{
					
					my_dict.put(sc.nextLine(),linenumber);
					 linenumber+=1;
					}
			 System.out.println("Enter name to be search:");
			 Scanner nm = new Scanner(System.in);
			   String input = nm.next().trim();
			   if(my_dict.containsKey(input)) {
				   System.out.println("word found in dictornary");
			   }
			   
			   
			   else 
			   {
				   int i=0;
				   for (Map.Entry<String, Integer> set : my_dict.entrySet())
				   {
                      if(set.getKey().equalsIgnoreCase(input)) {
                    	  i=1;
                    	  System.out.println("word found in dictornary1");
						   break;
					   }
					   
					   
			        }
				 
				   if(i==0) {
				   System.out.println("word not found in dictornary");}
			   }
			 
		}catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException while reading input file:"+e.getMessage());
			
		}catch (Exception e) {
			System.err.println("Exception while reading input file:"+e.getMessage());
		
		}
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}