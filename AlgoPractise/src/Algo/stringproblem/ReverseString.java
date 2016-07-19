package Algo.stringproblem;

public class ReverseString {

	   public String reverseString(String s) {
	        char[] sArray= s.toCharArray();
	        char[] newCharArray=new char[sArray.length];
	        int i=0;
	        while(i<sArray.length){
	        	newCharArray[i]=sArray[sArray.length-i-1];
	        	i++;
	        }
	        
	        return String.valueOf(newCharArray);
	    }
	
	   public static void main(String[] args){
		   ReverseString newString=new ReverseString();
		   System.out.println(newString.reverseString("hello"));
	   }
	   
}
