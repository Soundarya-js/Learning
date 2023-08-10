package com.demo;

import java.util.Scanner;

public class StringJoiner {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your FirstName and LastName");
	String FirstName=scan.nextLine();
	String LastName=scan.nextLine();
	System.out.println(joinStrings(FirstName, LastName));
	}
	public static String joinStrings(String str1, String str2)
	{
		return str1 + str2;
	}

}
