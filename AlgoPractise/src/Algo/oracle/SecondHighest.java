package Algo.oracle;

public class SecondHighest {
	
	public static void main(String[] args){
		Integer[] integerArray=new Integer[]{5,6,3,8,23,6,9};
		
		SecondHighest highest=new SecondHighest();
		highest.sort(integerArray,2);
		
		
	}
	
	public void sort(Integer[] integerArray,int high){
		
		int length=integerArray.length;
		for(int i=0;i<length-1;i++){
			if(integerArray[i]<integerArray[i+1]){
				int temp=integerArray[i];
				integerArray[i] = integerArray[i+1];
				integerArray[i+1]= temp;
			}
		}
		System.out.println(integerArray[length-high]);
	}

}
