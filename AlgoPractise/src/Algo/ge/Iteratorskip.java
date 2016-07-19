package Algo.ge;

import java.util.ArrayList;
import java.util.List;



public class Iteratorskip implements java.util.Iterator<String>{

	List<String> listValues=null;
	int cursor=0;
	int end;
	
	public Iteratorskip(List<String> values){
		this.listValues=values;
		end=values.size();
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(this.cursor<=this.end){
			return true;
		}
			return false;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		
		String val=null;
		if(this.hasNext() || cursor==0){
			val=listValues.get(cursor);
		}
		cursor=cursor+2;
		return val;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		listValues.remove(cursor);
	}

	
	public static void main(String[] args){
		List<String> newList=new ArrayList<String>();
		newList.add("a");
		newList.add("b");
		newList.add("c");
		newList.add("d");
		newList.add("e");
		Iteratorskip skip = new Iteratorskip(newList);
		while(skip.hasNext()){
			System.out.println(skip.next());
		}
	}
	
}
