package Algo.stringproblem;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	public int[] removeDuplicates(int[] A) {
		if (A.length < 2)
			return A;
	 
		int j = 0;
		int i = 1;
	 
		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
			} else {
				j++;
				A[j] = A[i];
				i++;
			}
		}
	 
		int[] B = Arrays.copyOf(A, j + 1);
	 
		return B;
    }
	
	public static void main(String[] args){
		int[] nums={5,5,5,30,40,50,66,90,90};
		RemoveDuplicateFromArray duplicate=new RemoveDuplicateFromArray();
		System.out.println(Arrays.toString(duplicate.removeDuplicates(nums)));
	}
	
}
