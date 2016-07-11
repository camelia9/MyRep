package p6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Words {
	public static void main(String[] args) {		 
		       System.out.println("Reading File from Java code");
		       String fileName="words.txt";
		       try{
		          FileReader inputFile = new FileReader(fileName);
		          BufferedReader bufferReader = new BufferedReader(inputFile);
		          String line;
		          List<String>WordList= new ArrayList<>();
		          while ((line = bufferReader.readLine()) != null)   {
		            WordList.add(line);
		          }
		          bufferReader.close();
		       }catch(Exception e){
		          System.out.println("Error while reading file line by line:" + e.getMessage());                      
		       }
		       
		       Map<String, Integer>frequency= new LinkedHashMap<String, Integer>();
		       
		       for(int i=0;i<WordList.size(); i++)
		       {
		    	   if(frequency.containsKey(WordList.get(i)))
		    		   frequency.put(key, frequency.get(key) + 1);
		    	   else
		    		   frequency.put(key,1);
		       }
		       
		       System.out.println("The duplicates are:");
		       
		       int flag=0;
		       
		       for(String k: frequency.keySet()){
		    	   if(frequency.get(k)>=2){
		    		   System.out.println(k);
		    		   if(flag==0)
		    			   flag=1;
		       }
		    	   
		    	 if(flag==0)
		    		 System.out.println(There are no duplicates");
		    		 
		       
		       System.out.println("The distinct words are:");
		       
		       for(String k: frequency.keySet()){
		    		   System.out.println(k);
		     }
		       
		       System.out.println("frequency table in the order the words appear in the given word list");
		       
		       for(String k: frequency.keySet()){
	    		   System.out.println(k + " " + frequency.get(k));
	    		   
	    	  System.out.println("Word list in alphabetical order");
	    	  
	    	  Collections.sort(WordList);
	    	  
	    	  for(int i=0;i<WordList.size(); i++)
	    		  System.out.println(WordList.get(i));
	    	  
	    	  System.out.println("the frequency table in the alphabetical order");
	    	  
	    	  Map<String, String> treeMap = new TreeMap<String, String>(frequency);
	    	  
	    	  for(String k: treeMap.keySet()){
	    		   System.out.println(k);
	     }	  
}
