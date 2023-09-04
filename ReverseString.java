package com.coding;

public class ReverseString {
	public static void main(String[] args) {
		String str="Lalit";
		char[] charr=str.toCharArray();
		for(int i=charr.length -1;i>=0;i--) {
			System.out.print(charr[i]);
		}
		for(int i = str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	

}
