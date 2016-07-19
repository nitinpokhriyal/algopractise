package Sort;

import java.util.Arrays;
/**
 * sort array using unsort and sorted portion.
 * */

public class InsertionSort {
	/**
	 * runs untill ith iteration  out of nth element
	 * */
	public void sort(Integer[] args){
		int temp;
		for(int i=1;i<args.length;i++){
			 temp=args[i];
			int j;
			 for(j=i-1;j>=0 && temp<args[j];j--){
				 args[j+1]=args[j];
			 }
			 args[j+1]=temp;
		}
		System.out.println(Arrays.toString(args));
	}
	
	public static void main(String[] args){
		InsertionSort sort=new InsertionSort();
		sort.sort(new Integer[]{67,10,78,2,45,6,8});
	}

}
