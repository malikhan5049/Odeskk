package odesk.test.java.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public static String question2ConvertRGBtoHex(int red, int green, int blue){
		return String.format("#%02x%02x%02x", red, green, blue);
	}
	
	
	public static void question3PrintPercentiles(Integer[] input){
		Arrays.sort(input);
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(input));
		input = set.toArray(new Integer[0]);
		double percentile;
		for(int i = 0; i<input.length;i++){
			percentile = Math.round((i+1)*100/input.length);
			System.out.println(percentile+"% of the numbers are less than or equal to "+input[i]);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(question2ConvertRGBtoHex(68, 58, 197));
		System.out.println();
		question3PrintPercentiles(new Integer[]{8, 6, 6, 20, 9, 1, 12, 16, 3, 16, 22, 2});
	}
}
