package packagename;

import java.io.*;  

class MyException extends Exception {  
    public static void main(String[] args){  
    	System.out.println("Hello World!");
        doStuff();  
    }  
       
    static void doStuff()  {  
        try{  
            throw new MyException();  
        }  
        catch (MyException me){  
               
        }  
    }  
}