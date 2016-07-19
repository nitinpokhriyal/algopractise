package Algo.ms;
/**
 * count length of word before any palindome words occur in string
 * */

public class CountWordBeforePalindrome {

	public int test(String orginalWord){
		
		int lengthOfWord=orginalWord.length();
		int i=0;
		String words=orginalWord;
		while(i<lengthOfWord){
			String[] splitWord=words.split("");
			boolean found=true;
			for(int j=1;j<splitWord.length;j++){
				if(!splitWord[j].equals(splitWord[splitWord.length-j])){
					i++;
					found=false;
					break;
				}
			}
			if(found){
				break;
			}
			words=orginalWord.substring(i,orginalWord.length());
			//lengthOfWord=words.length();
		}
		return i;
	}
	
	public static void main(String[] args){
		String word="dabbad";
		CountWordBeforePalindrome palindrome=new CountWordBeforePalindrome();
		System.out.println(palindrome.test(word));
	}
	
}
