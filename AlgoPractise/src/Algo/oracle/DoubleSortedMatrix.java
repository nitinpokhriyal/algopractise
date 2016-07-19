package Algo.oracle;

public class DoubleSortedMatrix {

	public Integer countTotalNegative(Integer[][] doubleArray,int row,int column){
		int count=0;
		int incRow=0;
		int incCol=column-1;
		while(incCol>=0 && incRow<row){
			System.out.println("incRow==" + incRow +" incCol ==" + incCol +"=doubleArray[incRow][incCol]");
			int val=doubleArray[incRow][incCol];
			if(val<0){
				count=count+incCol+1;
				incRow++;
			}else{
				incCol--;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		Integer[][] doubleArray=new Integer[][]{{-3,-2,-1,1},{-2,2,3,4},{-1,5,7,8}};
		DoubleSortedMatrix matrix=new DoubleSortedMatrix();
		int result=matrix.countTotalNegative(doubleArray,3,4);
		System.out.println(result);
	}
	
	
}
