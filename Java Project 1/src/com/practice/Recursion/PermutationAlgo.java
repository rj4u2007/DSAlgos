package com.practice.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationAlgo {
	
	// PSUEDOCODE
//	 permutations is a list of all the possible permutations of given array
//	helper(array, currentPermutation, permutations) {
//		 if(array.size == 0) {
//			 Add the current permutation to permutations list
//			 permutations.add(currentPermutation);
//		 } else {
//			 
//			 newArr = array.remove(i);
//			 newCurrentPermutation = currentPermutation.add(array.get(i))
//			 currentPermutation.add(array.get(i));
//			 helper(newArr, newCurrentPermutation, permutations);
//			 
//		 }
//	 }

	public static void main(String[] args) {

		//		int[] input = new int[] {1,2,3};
		//		String inputStr = "123";
		//		String perm = "";
		//		String perms = "";
		//		permutation(inputStr, perm, perms);
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		
		List<List<Integer>> output = getPermutations(input);
		
		for(int i=0; i< output.size();i++) {
			for(int num : output.get(i)) {
				System.out.print(num);
			}
			System.out.println("");
		}


	}

	public static List<List<Integer>> getPermutations(List<Integer> array) {
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		getPermutations(array, new ArrayList<Integer>(), permutations);
		return permutations;
	}

	public static void getPermutations(List<Integer> array, List<Integer> permutation, List<List<Integer>> permutations) {
		if(array.size() == 0 && permutation.size()>0) {
			permutations.add(permutation);
		} else {
			for(int i=0; i<array.size();i++) {
				List<Integer> newArr = new ArrayList<Integer>(array);
				newArr.remove(i);
				List<Integer> newPermutation = new ArrayList<Integer>(permutation);
				newPermutation.add(array.get(i));
				getPermutations(newArr, newPermutation, permutations);
			}
		}
	}

	//	public static void permutation(String inputStr, String perm, String perms) {
	//		if(inputStr.length() == 0 && perm.length()==0) {
	//			System.out.println(perm + perms);
	//			return;
	//		} else {
	//			for(int i=0; i<inputStr.length()-1; i++) {
	//				String temp = inputStr.substring(0, i) +inputStr.substring(i+1);
	//				perm + perms;
	//				permutation(temp, )
	//			}
	//		}
	//	}

}
