package Algo.ge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountWords{

	public void countWords(int count,String words){
		
		Map<String,Integer> map=new TreeMap<String,Integer>();
		String[] splitWords=words.split(" ");
		List<Integer> wordCountList=new ArrayList<Integer>();
		for(String s:splitWords){
			int counter=0;
			if(map.containsKey(s)){
				 counter=map.get(s);
			}
			counter++;
			map.put(s,counter);			
		}
		
		Map<String,Integer> sortedMap=sortByValue(map);
		int countVal=0;
		for(String key:sortedMap.keySet()){
			countVal++;
			System.out.println(key +" key is and value is =" + map.get(key));
			if(countVal==count){
				break;
			}
		}
		
		
		
		/*for(String key:map.keySet()){
			System.out.println("key is " + key +" value is "+ map.get(key));
			if(sortedMap.size()<1){
				sortedMap.put(key, map.get(key));
			}else{
				sortedMap.get(key)
			}
		}
	*/	
	
	}
	
	public static void main(String[] args){
		String words="this is my country What is your country";
		CountWords countWords=new CountWords();
		countWords.countWords(2, words);
	}
	
	public static <K, V extends Comparable<? super V>> Map<K, V> 
    sortByValue( Map<K, V> map )
{
    List<Map.Entry<K, V>> list =
        new LinkedList<Map.Entry<K, V>>( map.entrySet() );
    Collections.sort( list, new Comparator<Map.Entry<K, V>>()
    {
        public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 )
        {
             return o2.getValue().compareTo(o1.getValue());
            	
        }
    } );

    Map<K, V> result = new LinkedHashMap<K, V>();
    for (Map.Entry<K, V> entry : list)
    {
        result.put( entry.getKey(), entry.getValue() );
    }
    return result;
}
	
}
