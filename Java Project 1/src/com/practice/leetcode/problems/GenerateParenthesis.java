package com.practice.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	public static void main(String[] args) {
		System.out.println(generateParenthesis(5));

	}
	
    public static List<String> generateParenthesis(int n) {
        int open = n;
        int close = n;
        String output = "";
        List<String> outputList = new ArrayList<String>();
        generate(open, close, output, outputList);
        return outputList;
    }
    
    public static void generate(int open, int close, String output, List<String> outputList) {
        // Base condition
        if(open == 0 && close == 0) {
            outputList.add(output);
            return;
        }
        
        // Verma's Code
//        if(open !=0) {
//        	String o1 = output + "(";
//        	generate(open-1, close, o1, outputList);
//        }
//        if(open < close) {
//            String o3 = output + ")";
//            generate(open, close-1, o3, outputList);
//        }
        
        
        
        
        if(open == close) {
            String o1 = output + "(";
            generate(open-1, close, o1, outputList);
        }
        if(open == 0) {
            String o2 = output + ")";
            generate(open, close-1, o2, outputList);
        }
        if(open < close) {
            String o3 = output + "(";
            generate(open-1, close, o3, outputList);
            
            String o4 = output + ")";
            generate(open, close-1, o4, outputList);
        }
       
    }

}
