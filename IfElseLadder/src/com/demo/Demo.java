package com.demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter score");
		int score=scan.nextInt();
		Grade G1=new Grade();
		G1.givegrade(score);
	}

}
