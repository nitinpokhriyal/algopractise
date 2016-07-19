package Sort;

public class MergeSort {
	 private int[] array;
	    private int[] tempMergArr;
	    private int length;
	 
	public int[] sort(int[] inputArray){
		int inputArrayLength=inputArray.length;
		if(inputArrayLength<=1){
			return inputArray;
		}
		int midLength=inputArrayLength/2;
		
		int[] leftArray=new int[midLength];
		int[] rightArray=new int[inputArrayLength-midLength];
		for(int i=0;i<midLength;i++){
			leftArray[i]=inputArray[i];
		}
		int midindex=0;
		for(int j=midLength;j<inputArrayLength;j++){
			rightArray[midindex]=inputArray[j];
			midindex++;
		}
		
		leftArray=sort(leftArray);
		rightArray=sort(rightArray);
		int[] newArray=mergeSort(leftArray,rightArray);
		return newArray;
	}
	
	private int[] mergeSort(int[] leftArray,int[] rightArray){
		
		int k=0,i=0,j=0;
		int[] newArray=new int[leftArray.length+rightArray.length];
		
		while(i<leftArray.length && j<rightArray.length){
			if(leftArray[i]<rightArray[j]){
				newArray[k]=leftArray[i];
				i++;
			}else{
				newArray[k]=rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<leftArray.length){
			newArray[k]=leftArray[i];
			k++;
			i++;
		}
		
		while(j<rightArray.length){
			newArray[k]=rightArray[j];
			j++;
			k++;
		}
		return newArray;
	}

	
	public static void main(String[] args){
		int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        MergeSort mms = new MergeSort();
        int[] output=mms.sort(inputArr);
        for(int i:output){
            System.out.print(i);
            System.out.print(" ");
        }
	}
	
}
