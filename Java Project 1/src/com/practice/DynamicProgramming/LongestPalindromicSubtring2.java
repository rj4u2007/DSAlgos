package com.practice.DynamicProgramming;

public class LongestPalindromicSubtring2 {

	public static void main(String[] args) {
		
		// abaxyzzyxf
		// a b a x y z z y x f
		// 0 1 2 3 4 5 6 7 8 9
		// 
		
		
		System.out.println(longestPalindromicSubstring("a"));

	}
	
	public static String longestPalindromicSubstring(String str) {
	    int[] arr = new int[str.length()];
			int max = -1;
			String output="";
			for(int i=0; i<str.length(); i++) {
				StringBuilder sb = new StringBuilder();
				int l = i-1;
				int r = i+1; 
				int maxLenOdd = 1;
				sb.append(str.charAt(i));
				
				// Odd Palindrome
				while(l >= 0 && r <= str.length() - 1) {
					if(str.charAt(l) == str.charAt(r)) {
						sb.reverse();
						sb.append(str.charAt(l));
						sb.reverse();
						sb.append(str.charAt(r));
						l--;
						r++;
						maxLenOdd++;
					} else {
						break;
					}
				}
				// Even Palindrome
				StringBuilder sb2 = new StringBuilder();
				int l1 = i;
				int r1 = i+1;
				int maxLenEven = 1;
				//sb2.append(str.charAt(i));
				while(l1 >= 0 && r1 <= str.length() - 1) {
					if(str.charAt(l1) == str.charAt(r1)) {
						sb2.reverse();
						sb2.append(str.charAt(l1));
						sb2.reverse();
						sb2.append(str.charAt(r1));
						l1--;
						r1++;
						maxLenEven++;
					} else {
						break;
					}
				}
				
				
				arr[i] = Math.max(maxLenOdd, maxLenEven);
				if(max < arr[i]) {
					max = arr[i];
					if(maxLenOdd > maxLenEven) {
						output = sb.toString();
					} else {
						output = sb2.toString();
					}
					
				}
			}

	    return output;
	  }
}
