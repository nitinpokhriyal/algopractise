package com.leetcode.string.easy;

public class RepeatedStringMatch {

	public static void main(String[] args) {
		RepeatedStringMatch match=new RepeatedStringMatch();
		int cnt=match.repeatedStringMatch("aaaaaaaaaaaaaaaaaaaaaab","ba");
		System.out.println(cnt);
	}
	
	public int repeatedStringMatch(String A, String B) {
		int lenA = A.length();
		int lenB = B.length();
		
		int cnt = 0;
		StringBuilder str = new StringBuilder(A);
		int len = lenA + lenB + lenA - 2;
		while (str.length() < len) {
			if (str.indexOf(B) < 0) {
				str.append(A);
				cnt++;
			} else {
				break;
			}
		}
		if (cnt > 0)
			return cnt + 1;

		return -1;
	}
	
	
	/*public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int q = 0;
        while (sb.length() < B.length()) {
            sb.append(A);
            q++;
        }
        if (sb.lastIndexOf(B) >= 0) {
            return q;
        }
        // A * (q+1) is already long enough to try all positions for B
        sb.append(A);
        if (sb.lastIndexOf(B) >= 0) {
            return q + 1;
        } else {
            return -1;
        }
    }*/
}
