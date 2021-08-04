package com.practice.hackerrank.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MigratoryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List<Integer> arr = new ArrayList<Integer>();
  arr.add(1);
  arr.add(4);
  arr.add(4);
  arr.add(4);
  arr.add(5);
  arr.add(3);
  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  for(int id : arr) {
      if(map.containsKey(id)) {
          int currFreq = map.get(id)+1;
          map.put(id, currFreq);
      } else {
          map.put(id, 1);
      }
  }
  int max = Integer.MIN_VALUE;
  List<Integer> op = new ArrayList<Integer>();
  for(int id : map.keySet()) {
      if(max <= map.get(id)) {
          max = map.get(id);
          op.add(id);
      }
  }
      Collections.sort(op);
      System.out.println(op.get(0));
  
   }
	}


