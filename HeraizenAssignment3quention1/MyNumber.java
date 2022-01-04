package com.HeraizenAssignmentNo3.QuestionNo1;

public class MyNumber {
	int firstNumber;
	int secondNumber;
	int input;
	double result;

	public MyNumber(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public void check(int input) {
		// TODO Auto-generated method stub
		int option = input;
		switch (option) {
		case 1: {
			try {
				result = firstNumber + secondNumber;
				System.out.println("ADD :" + result);
			} catch (Exception e) {
				throw new IllegalArgumentException();
			}
			break;
		}

		case 2: {
			try {
				result = firstNumber - secondNumber;
				System.out.println("Subtraction :" + result);
			} catch (Exception e) {
				throw new IllegalArgumentException();
			}
			break;
		}

		case 3: {
			try {
				result = firstNumber * secondNumber;
				System.out.println("Multiplication :" + result);
			} catch (Exception e) {
				throw new IllegalArgumentException();
			}
			break;
		}

		case 4: {
			try {
				result = firstNumber / secondNumber;
				System.out.println("Division :" + result);
			} catch (Exception e) {
				throw new IllegalArgumentException("Pl enter the valid input");
			}
			break;
		}

		}
	}
}
