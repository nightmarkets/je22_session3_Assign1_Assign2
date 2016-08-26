//Print reverse of a given String value.
// StringBuilder objects are like String objects, except that they can be modified

package com.session4.ass2ReverseString;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] arg)
{
	System.out.println("Enter a string: ");
	Scanner sc = new Scanner(System.in);
	String origString = sc.nextLine();
	
	//StringBuilder has reverse method
	StringBuilder sb = new StringBuilder(origString);
	sb.reverse();
	System.out.println("Reversed string is:"+sb);
}
}
