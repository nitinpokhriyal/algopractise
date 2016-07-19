package Algo.oracle;
import java.util.Arrays;


public class StringSwap {

	public String swap(String text){
		if(text==null){
			return null;
		}
		String[] textSplitArray=text.split(" ");
		int splitTextLen=textSplitArray.length;
		
		for(int i=0;i<splitTextLen-1;i++){
			String  reverse=null;
			reverse=textSplitArray[0];
				for(int j=0;j<splitTextLen-1-i;j++){
					textSplitArray[j]=textSplitArray[j+1];
				}
				textSplitArray[splitTextLen-1-i]= reverse.concat(" ");
			System.out.println(Arrays.toString(textSplitArray));
		}
		return Arrays.toString(textSplitArray);
	}
	
	
	
	public static void main(String[] args){
		StringSwap swap=new StringSwap();
		swap.swap("I am an Indian");
	}
}
