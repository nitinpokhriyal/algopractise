package Sort;

import java.util.Arrays;

public class HeapSort {
	private Integer[] heapData;
	private int currentPosition = -1;
	
	public HeapSort(int size){
		heapData=new Integer[size];
	}
	
	public void sort(int[] array){
		heapify(array);
		for(int i=0;i<currentPosition;i++){
			int firstVal=heapData[0];
			heapData[0]=heapData[currentPosition-i];
			heapData[currentPosition-i]=firstVal;
			fixDown(0,currentPosition-i-1);
		}
	}
	
	public void fixDown(int start,int end){
		if(end<0)end=currentPosition;
		while(start<=end){
			int lChild=2*start +1;
			int rChild=2*start+2;
			if(lChild<=end){
				int childToSwap;
				if(rChild>end){
					childToSwap = lChild;
				}else{
					childToSwap = (heapData[lChild]>heapData[rChild]? lChild:rChild);
				}
				if(heapData[start]<heapData[childToSwap]){
					int temp=heapData[start];
					heapData[start]=heapData[childToSwap];
					heapData[childToSwap] = temp;
				}else{
					break;
				}
				start = childToSwap;
			}else{
				break;
			}
		}
	}
	
	public void heapify(int[] array){
		int arrayLength=array.length;
		for(int i=0;i<arrayLength;i++){
			insert(array[i]);
		}
		System.out.println(heapData);
	}
	
	public void insert(int data){
		heapData[++currentPosition]=data;
		fixUp(currentPosition);
	}
	
	public void fixUp(int currIndex){
		int parentIndex = (currIndex-1)/2;
		while(parentIndex>=0 && heapData[parentIndex]<heapData[currIndex]){
			int temp=heapData[currIndex];
			heapData[currIndex]=heapData[parentIndex];
			heapData[parentIndex]=temp;
			currIndex=parentIndex;
			parentIndex=(currIndex-1)/2;
		}
	}

	public static void main(String[] args){
		int[] array={73,16,40,1,46,28,12,21,22,44,66,90,7};
		HeapSort heapSort=new HeapSort(array.length);
		
		
		heapSort.sort(array);
		System.out.println(heapSort.heapData);
		HeapSort another =new HeapSort(array.length);
		another.heapify(array);
		System.out.println(another);
		HeapSort another1 =new HeapSort(array.length);
		another1.sort(array);
		System.out.println(another1);
		
		//[73, 46, 40, 22, 66, 90, 12, 1, 21, 16, 44, 28, null]
		//[90, 66, 73, 22, 46, 40, 12, 1, 21, 16, 44, 28, 7]
	}
	
	@Override
	public String toString() {
		return Arrays.deepToString(this.heapData);
	}
}
