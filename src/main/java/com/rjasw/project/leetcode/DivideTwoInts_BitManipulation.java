package com.rjasw.project.leetcode;

import java.text.MessageFormat;

public class DivideTwoInts_BitManipulation {
	
	public static long divide(long dividend, long divisor) {
		
		int sign = 1;
		long c = 0;
		
		if(divisor == 1) return dividend;
		if( (divisor < 0 && dividend >= 0)
			|| (divisor > 0 && dividend < 0) )
		{
			sign = -1;
		}
		
		long dd = Math.abs(dividend);
		long dr = Math.abs(divisor);
		
		for (int i = 30; i >= 0; --i) {
			//System.out.println(MessageFormat.format("dd - {0}, dr - {1}, i - {2}, c- {3}",dd,dr,i,c));
			//System.out.println((dr << i));
			if( (dr << i) <= dd ) {
				c += (1 << i);
				dd -= (dr << i);
			}
		}
		
		return c * sign;
	}

}
