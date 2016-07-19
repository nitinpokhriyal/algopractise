package Algo.oracle;

import java.util.Arrays;

public class MergeSortedList {
	
	public void sort(Integer[] array1,Integer[] array2){
		Integer[] newArray=new Integer[array1.length+array2.length];
		
		int i=0,j=0,k=0;
		while(array1.length>i && array2.length>j){
			if(array1[i]<array2[j]){
				newArray[k]=array1[i];
				k++;
				i++;
			}else {
				newArray[k]=array2[j];
				j++;
				k++;
			}
		}
		
		while(array1.length>i){
			newArray[k]=array1[i];
			i++;
			k++;
		}
		
		while(array2.length>j){
			newArray[k]=array2[j];
			j++;
			k++;
		}
		
		System.out.println(Arrays.toString(newArray));
	}
	
	
	
	public static void main(String[] args){
		Integer[] array1=new Integer[]{8,10,11,29,50};
		Integer[] array2=new Integer[]{4,15,19,25,60};
		MergeSortedList sortedArray=new MergeSortedList();
		sortedArray.sort(array1, array2);
	}

}
