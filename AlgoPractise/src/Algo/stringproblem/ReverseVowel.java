package Algo.stringproblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseVowel {

	public String reverse(String word){
		//String[] vowels={"a","e","i","o","u"};
		List<String> vowels=new ArrayList<String>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		Integer stringIndex =null;
		int wordLength=word.length();
		int i=0;
		int j=wordLength-1;
		char[] wordChars=word.toCharArray();
		while(i<wordLength){
			char wordChar=wordChars[i];
				if(vowels.contains(String.valueOf(wordChar).toLowerCase())){
					while(j>i){
						char newWordChar=wordChars[j];
						if(vowels.contains(String.valueOf(newWordChar).toLowerCase())){
							char temp=wordChars[i];
							wordChars[i]=newWordChar;
							wordChars[j]=temp;
							j--;
							break;
						}
						j--;
					}
				}
			i++;
		}
		return String.valueOf(wordChars);
	}
	
	public String reverseNew(String input){
		char[] newArray=input.toCharArray();
		int j=newArray.length-1;
		List<String> vowels=new ArrayList<String>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		for(int i=0;i<newArray.length;i++){
			if(i>=j){
				break;
			}
			if(vowels.contains(String.valueOf(newArray[i]).toLowerCase())){
				boolean found=false;
				while(!found){
					if(vowels.contains(String.valueOf(newArray[j]).toLowerCase())){
						found=true;
						char temp=newArray[i];
						newArray[i]=newArray[j];
						newArray[j]=temp;
					}
					j--;
				}
			}
		}
		return String.valueOf(newArray);
	}
	
	public static void main(String[] args){
		ReverseVowel vowel=new ReverseVowel();
		String answer=vowel.reverseNew("leetcode");
		System.out.println(answer);
	}
	
}
