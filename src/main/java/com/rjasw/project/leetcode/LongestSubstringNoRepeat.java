package com.rjasw.project.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoRepeat {
	
	public static int lengthOfLongestSubstring(String s) {
	
		Set<Character> charset = new HashSet<>();
		int max = 0;
		int s_size = s.length();
		
		//sliding window approach
		for(int l = 0; l< s_size ; l++) {
			charset.clear();
			int tmp = 0;
			for( int r = l; r<s_size; r++) {
//				System.out.println(s.charAt(r));
				if(!charset.contains(s.charAt(r))) {
//					System.out.println("bp 2");
					charset.add(s.charAt(r));
					tmp++;
				} else {
//					System.out.println("bp 3");					
					break;
				}
			}
			
//			System.out.println(charset);
			max = (max > tmp)? max:tmp;
//			System.out.println(max);

		}
		
		return max;
	}
}
