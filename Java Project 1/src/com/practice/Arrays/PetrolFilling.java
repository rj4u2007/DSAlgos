package com.practice.Arrays;

public class PetrolFilling {

	public static void main(String[] args) {
		int[] distances = {5, 2, 3};
		int[] fuel = {1, 0, 1};
		int mpg = 5;
		//System.out.println(validStartingCity(distances, fuel, mpg));
		System.out.println(validStartingCityn2(distances, fuel, mpg));

	}
	
	  public static int validStartingCityn2(int[] distances, int[] fuel, int mpg) {
			int n = distances.length;
			int j = 0;
			for(int i=0; i<n;i++) {
				j = i;
				int count = 0;
				int distanceRemaining = 0;
				while(count < n) {
					distanceRemaining = distanceRemaining + fuel[j%n]*mpg - distances[j%n];
					if(distanceRemaining < 0) {
						break;
					} 
					j++;
					count++;
				}
				if(count == n) {
					return j%n;
				}
			}
			return -1;
	  }

	public static int validStartingCity(int[] distances, int[] fuel, int mpg) {
		int tank =0;
		int j=-1;
		int n = distances.length;
		for(int i=0; i<n;i++) {
			tank = tank + fuel[i] - distances[i]/mpg;
			if (tank > 0) {
				int tempTank = tank;
				for(int k=0; k< n-1; k++) {
					tempTank = tempTank + fuel[k%n] - distances[k%n]/mpg;
					if(tempTank < 0) {
						break;
					} else {
						j = k%n;
					}
				}
			}			
		}
		return j;
	}
}
