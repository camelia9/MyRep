package p7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.*;

public class Words {

	public static void main(String[] args) {
		 List<String>WordList= new ArrayList<String>();
	       String fileName="cuv.txt";
	       try{
	          FileReader inputFile = new FileReader(fileName);
	          BufferedReader bufferReader = new BufferedReader(inputFile);
	          String line;
	          while ((line = bufferReader.readLine()) != null)   {
	            WordList.add(line);
	          }
	          bufferReader.close();
	       }catch(Exception e){
	          System.out.println("Error while reading file line by line:" + e.getMessage());                      
	       }
	       
	       Map<String, Integer> frequency= new LinkedHashMap<String, Integer>();
	       
	       for(int i=0;i<WordList.size(); i++)
	       {
	    	   if(frequency.containsKey(WordList.get(i)))
	    		   frequency.put(WordList.get(i), frequency.get(WordList.get(i)) + 1);
	    	   else
	    		   frequency.put(WordList.get(i),1);
	       }
	       
	       System.out.println("The duplicates are:");
	       
	       for(String k: frequency.keySet())
	    	   if(frequency.get(k)==2)
	    		   System.out.println(k);
	       
	       System.out.println("The distinct words are:");
	       
	       for(String j: frequency.keySet())
	    		   System.out.println(j);
	      
	       System.out.println("frequency table in the order the words appear in the given word list");
	       
	       for(String q: frequency.keySet()){
 		   System.out.println(q + " " + frequency.get(q));
 		   }
 		   
 	  System.out.println("Word list in alphabetical order");
 	  
 	  Collections.sort(WordList);
 	  
 	  for(int i=0;i<WordList.size(); i++){
 		  System.out.println(WordList.get(i));
 	  }
 	  
 	  System.out.println("the frequency table in the alphabetical order");
 	  
 	  Map<String, Integer> treeMap = new TreeMap<String, Integer>(frequency);
 	  
 	  for(String r: treeMap.keySet()){
 		   System.out.println(r+" "+frequency.get(r));

	}
	       
	       }}
