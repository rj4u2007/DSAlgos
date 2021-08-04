package com.practice.hackerrank.problems;

public class CavityMap {

	public static void main(String[] args) {
		String input = "8316367721984838592282693133446625341275338241466354524729424384615647514615523763198353549484986131";
		
		// Input
		System.out.println(input);
		// Expected output
		System.out.println("8316367721984X3X5X22826X313344662534127533824146635452472X4243X461564X5146155237631X8353X494X4X86131");
		System.out.println(findCavities(input));
		
	}
	// Trick was to compare the numbers just above and below as they are also considered as adjacent
	private static String findCavities(String input) {
		String output = "";
		int wordLen = input.length();
        char[] currArr = input.toCharArray();
        for(int j=0; j<wordLen-2; j++) {
            if(currArr[j] < currArr[j+1] && currArr[j+1] > currArr[j+2]) {
                currArr[j+1] = 'X';
            }
        }
        output = String.valueOf(currArr);
		return output;
	}

}
