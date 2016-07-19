package Sort;

import java.util.Arrays;
/*
 * compare and swap with each item
 * */

public class BubbleSort {
	
	public void sort(Integer[] args){
		int temp;
		for(int i=0;i<args.length-1;i++){
			for(int j=1;j<args.length-i;j++){
				if(args[j-1]>args[j]){
					temp=args[j-1];
					args[j-1]=args[j];
					args[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(args));
	}
	
	public static void main(String[] args){
		BubbleSort sort=new BubbleSort();
		sort.sort(new Integer[]{55,4,67,3,6});
	}

}
