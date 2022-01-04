package com.HeraizenAssignmentNo3.QuestionNo2;

public class BankAccount {

	int accNo;
	String custName;
	String accType;
	float balance;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public BankAccount(int accNo, String custName, String accType) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
	}

	public BankAccount(int accNo, String custName, String accType, int balance) throws NegativeAmount, LowBalanceException {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		if(balance<0) {
			throw new NegativeAmount("Pl set the correct initial balance");
		}
		if (accType.equalsIgnoreCase("savings") && balance <= 1000) {
			throw new LowBalanceException("Balance should be greater than 1000");
		} else {
			this.balance = balance;
		}

		if (accType.equalsIgnoreCase("current") && balance <= 5000) {
			throw new LowBalanceException("Balance should be greater than 5000");
		} else {
			this.balance = balance;
		}
	}

	void deposit(float amt) throws NegativeAmount {

		if (amt > 0) {
			balance = amt;
		} else {
			throw new NegativeAmount("Invalid Amount Entered");
		}
	}

	void withdraw(float amt) throws InsufficientFunds {
		if (accType.equalsIgnoreCase("savings")) {
			if (amt==0 || amt>balance || balance <= 1000) {
				throw new InsufficientFunds("Balance should be greater than 1000");
			} else {
				balance = balance - amt;
			}
		} else if (accType.equalsIgnoreCase("current")) {
			if (amt==0 || amt>balance || balance <= 5000) {
				throw new InsufficientFunds("Balance should be greater than 5000");
			} else {
				balance = balance - amt;
			}
		}
	}

	float getBalance() throws LowBalanceException {
		if (accType.equalsIgnoreCase("savings")) {
			if (balance <= 1000) {
				throw new LowBalanceException("Balance should be greater than 1000");
			}
		} else if (accType.equalsIgnoreCase("current")) {
			if (balance <= 5000) {
				throw new LowBalanceException("Balance should be greater than 5000");
			}
		}
		return balance;

	}
}
