package Algo.oracle;

public class PalindromeInteger {
	
	public int reverse(int n){
		int revNum=0;
		while(n>0){
			int reminder=n%10;
			revNum=(revNum*10)+reminder;
			int remNumber=n/10;
			n=remNumber;
		}		
		System.out.println(revNum);
		return revNum;
	}
	
	public static void main(String[] args){
		PalindromeInteger palindrome = new PalindromeInteger();
		int numberToBeReverse=45687654;
		int reverseNum=palindrome.reverse(numberToBeReverse);
		if(reverseNum==numberToBeReverse){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
}
