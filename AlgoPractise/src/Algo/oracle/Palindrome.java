package Algo.oracle;

public class Palindrome {

	public static void main(String[] args){
		String name ="malayalam".trim();
		String[] nameArray = name.split("");
		Double mid=Math.ceil(name.length()/2);
		boolean isPoly=true;		
		for(int i=0;i<name.length();i++){
			
			if(name.charAt(i)!=name.charAt(name.length()-1-i)){
				isPoly=false;
			}
		}
		if(isPoly){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
}
