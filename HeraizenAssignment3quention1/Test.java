package com.HeraizenAssignmentNo3.QuestionNo1;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc1 =  new Scanner(System.in);
	System.out.println("Enter the first number :");
	int s1 = sc1.nextInt();
	Scanner sc2 =  new Scanner(System.in);
	System.out.println("Enter the second number :");
	int s2 = sc1.nextInt();
	Scanner sc3 =  new Scanner(System.in);
	System.out.println("Enter the 1 : Add");
	System.out.println("Enter the 2 : Subtract");
	System.out.println("Enter the 3 : Multiplication");
	System.out.println("Enter the 4 : Division");
	
	int s3 = sc1.nextInt();
	MyNumber m1 = new MyNumber(s1,s2);
	m1.check(s3);
}
}
