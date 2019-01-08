package com.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLog {

	public static void main(String[] args) {
		SortLog log = new SortLog();
		String[] p = log.reorderLogFiles(
				new String[] { "a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo" });

		System.out.println(Arrays.toString(p));
	}

	public String[] reorderLogFiles(String[] logs) {
		List<String> letterLogs = new ArrayList<>(logs.length);
		List<String> digitLogs = new ArrayList<>();

		for (String log : logs) {
			if(Character.isDigit(log.charAt(log.indexOf(' ')+1))){
				digitLogs.add(log);
			}else{
				letterLogs.add(log);
			}
		}
		
		
		Collections.sort(letterLogs,(log1,log2)->{
			int idx1=log1.indexOf(' ');
			int idx2=log2.indexOf(' ');
			String id1=log1.substring(0,idx1);
			String id2=log2.substring(0,idx2);
			String msg1=log1.substring(idx1+1,log1.length());
			String msg2=log2.substring(idx2+1,log2.length());
			
			int result=msg1.compareTo(msg2);
			return result==0?id1.compareTo(id2):result;
		});
		
		letterLogs.addAll(digitLogs);
		return letterLogs.toArray(new String[0]);
	}
}
