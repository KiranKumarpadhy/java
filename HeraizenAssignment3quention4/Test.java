package com.HeraizenAssignmentNo3.QuestionNo4;

public class Test {
	public static void main(String[] args) {
		try {
			Emp e1 = new Emp(1, "kv", "manager", 1000);
			System.out.println(e1.calculateHRA());
			Emp e2 = new Emp(1, "kv", "clerk", 1000);
			System.out.println(e2.calculateHRA());

		} catch (LowSalException e) {
			System.out.println("Pl give the valid basic amount");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
