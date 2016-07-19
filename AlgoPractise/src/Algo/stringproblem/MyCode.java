package Algo.stringproblem;

import java.io.*;
import java.util.*;
class MyCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("Hello Java");
        MyCode code=new MyCode();
        String[] array1=new String[]{"Amazon", "Microsoft","Google"};
        String[] array2 = new String[]{"Am", "cro", "Na", "e", "abc"};
        String[] output=code.printNameWithSymbol(array2,array1);
        System.out.println(Arrays.toString(output));
       // System.out.println("Microsoft".substring(3,2));
    }
    
    
    public String[] printNameWithSymbol(String[] symbols, String[] names){
        String[] symbolWithComp=new String[names.length];
        Integer lengthSymbols=symbols.length;
        if(lengthSymbols!=null && lengthSymbols>0){
            int i=0;
            while(i<names.length){
                String name =names[i];
                	for(int j=0;i<lengthSymbols;j++){
                		if(name.contains(symbols[j]) && symbols[j].length()+name.indexOf(symbols[j])<=name.length()){
                			//String newName=name.substring(name.indexOf(symbols[j]),symbols[j].length()+name.indexOf(symbols[j]));
                			String newName=name.replace(symbols[j],"["+ symbols[j] +"]");
                			symbolWithComp[i]=newName;
                			break;
                		}
                	}
                
                i++;
            }
        }
        return symbolWithComp;
    }
    
   
} 