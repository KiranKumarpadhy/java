package com.HeraizenAssignmentNo3.QuestionNo2;

public class TestAccount {
	public static void main(String[] args) {
		try {
			BankAccount b1 = new BankAccount(101, "kiran", "savings");
			b1.deposit(10000);
			System.out.println(b1.getBalance());
			b1.withdraw(100);
			System.out.println(b1.getBalance());
//			b1.withdraw(10000);
//			System.out.println(b1.getBalance());
//			b1.deposit(-100);
//			b1.getBalance();
			BankAccount b2 = new BankAccount(101, "kiran", "current", 1000);
			System.out.println(b2.getBalance());
		} catch (LowBalanceException e) {
			System.out.println("Your account balance is low");
		} catch (InsufficientFunds e) {
			System.out.println("Your account is having Insufficient funds");
		} catch (NegativeAmount e) {
			System.out.println("You are entering the negative balance");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();

		}

	}
}
