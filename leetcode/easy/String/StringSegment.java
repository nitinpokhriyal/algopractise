package com.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringSegment {
	public static void main(String[] args) {
		StringSegment ss = new StringSegment();
		/*
		 * int ans=ss.countSegments(", , , ,        a, eaefa");
		 * System.out.println(ans);
		 */

		 //String p=ss.mostCommonWord("Bob hit a ball, the hit BALL! flew far after it was hit.", new String[]{"hit"});
		//String p = ss.mostCommonWord("a, a, a, a, b,b,b,c, c", new String[] { "a" });
		String[] p=ss.reorderLogFiles(new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"});
		
		System.out.println(Arrays.toString(p));
	}

	public int countSegments(String s) {
		if (s == " " || s.length() == 0)
			return 0;
		if (s.length() == 1)
			return 1;
		String[] ss = s.split(" ");
		int count = 0;
		for (String st : ss) {

			if (!st.equals("")) {
				count++;
			}
		}
		return count;
	}

	public String mostCommonWord(String paragraph, String[] banned) {
		List<String> bannedWords = new ArrayList<String>();

		for (int i = 0; i < banned.length; i++)
			bannedWords.add(banned[i]);

		String ans = null;
		int max = Integer.MIN_VALUE;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String word : paragraph.split("[ !?',;.']+")) {
			word = word.toLowerCase();
			if (!bannedWords.contains(word)) {
				int cnt = map.getOrDefault(word, 0) + 1;
				map.put(word, cnt);
				if (max < cnt) {
					ans = word;
					max = cnt;
				}
			}
		}
		return ans;
	}
	
	
    public String[] reorderLogFiles(String[] logs) {
        int i=0;
        int j=logs.length-1;
        String digitRegex = "[0-9 ]+";
        String alphaRegex="[a-zA-Z ]+";
        while(i<j){
            int a=logs[i].indexOf(" ");
            boolean adigit=false;
            if(a>-1){
                String iString=logs[i].substring(a+1,logs[i].length());
                adigit=iString.matches(digitRegex);
            }
            
            int b=logs[j].indexOf(" ");
            boolean bString=false;
            if(b>-1){
                String jString=logs[j].substring(b+1,logs[j].length());
                bString=jString.matches(alphaRegex);
            }
            if(adigit && bString){
                String temp=logs[i];
                logs[i]=logs[j];
                logs[j]=temp;
                i++;
                j--;
            }else if(adigit && !bString){
                j--;
            }else if(!adigit && bString){
                i++;
            }else{
            	
            }
        }
        return logs;
    }
}
