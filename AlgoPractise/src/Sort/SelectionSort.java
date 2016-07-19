package Sort;

import java.util.Arrays;

public class SelectionSort {
	/**
	 * compare and keep track of minindex value and switch after each iteration
	 * */

	public Integer[] sort(Integer[] arg1){
		Integer minIndex=0;
		Integer swapVal;
		Integer val;
		for(int i=0;i<arg1.length;i++){
			minIndex=i;
			for(int j=i+1;j<arg1.length;j++){
				if(arg1[j]<arg1[minIndex]){
					minIndex=j;
				}
			}
			if(minIndex!=i){
				swapVal=arg1[i];
				arg1[i]=arg1[minIndex];
				arg1[minIndex]=swapVal;
			}
		}
		return arg1;
	}


	public static void main(String[] args){
		Integer[] arguments={4,55,6,22,10};
		SelectionSort sort=new SelectionSort();
		Integer[] returnVal=sort.sort(arguments);
		System.out.println(Arrays.toString(returnVal));
		
	}
}
