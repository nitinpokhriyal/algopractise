package Algo.oracle;

public class BuySell {
	
	public void buysell(Integer[] input,int i){
		
		doBusiness(input, i);
		
	}
	
	public void doBusiness(Integer[] input,int i){
		int noofDays=input.length;
		Integer buyDay=null;
		Integer sellDay=null;
		while(i<noofDays-1){
			if(input[i-1]<input[i]){
				buyDay=i-1;
				while(i<noofDays && input[buyDay]<input[i] ){
					i++;
				}
				sellDay=i-1;
				System.out.println(buyDay +","+ sellDay);
				buyDay=null;sellDay=null;
			}else{
				if(buyDay!=null){
				sellDay=i;
				System.out.println(buyDay +","+ sellDay);
				buyDay=null;sellDay=null;
				}else{
					buyDay=i;
				}
			}
			i++;
		}

	}

	public static void main(String[] args){
		BuySell buySell=new BuySell();
		buySell.buysell(new Integer[]{100,180,260,310,40,535,695},1);
		buySell.buysell(new Integer[]{23,13,25,29,33,19,34,45,65,67},1);
	//	buySell.buysell(new Integer[]{10,9,8,6,4,2,1},1);
	}
	
}
