package com.leetcode.array.easy;

public class PlantFlower {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		System.out.println(3%2);
		if(flowerbed.length>0){
			if(n==1){
				return flowerbed[0]==0?true:false;
			}else{
				if((flowerbed[0]==1 && n==0)){
					return false;
				}else if(flowerbed[0]==0 && n==0){
					return true;
                }
			}
		}else{
			return false;
		}
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if(((i-1>-1 && flowerbed[i-1]==0) || i==0) && (i+1<flowerbed.length  && flowerbed[i+1]==0)){
                	count++;   
                    flowerbed[i]=1;
                    i=i+1;
                }else if(i==flowerbed.length-1 && flowerbed[i-1]==0){
                	count++;   
                    flowerbed[i]=1;
                    
                }
            }
        }
        return (count>=n);
    }
	public static void main(String[] args) {
		PlantFlower flower=new PlantFlower();
		flower.canPlaceFlowers(new int[]{0}, 0);
	}
}
