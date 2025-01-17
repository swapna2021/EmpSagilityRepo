package com.sagility;

import java.util.Scanner;

public class SavingsAccount extends Account{
	
	private double balance;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String bankName, String accountHolderName, long accountId, int pinNum, String iFSCNum
		) {
		super(bankName, accountHolderName, accountId, pinNum, iFSCNum);
		this.balance = 0.0;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", getBankName()=" + getBankName() + ", getAccountHolderName()="
				+ getAccountHolderName() + ", getAccountId()=" + getAccountId() + ", getPinNum()=" + getPinNum()
				+ ", getiFSCNum()=" + getiFSCNum() + "]";
	}
	
	
	@Override
	public void withDraw(double amount) {
		
		//read pin num
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pin num");
		int tempPin=sc.nextInt();
		if(pinNum==tempPin) {
		if(amount<balance)
		{
			System.out.println("withdrawn");
			balance-=amount;
		}
		else
			System.out.println("insufficient balance");
		}
		else
			System.out.println("Invalid pin");
	
		}
	
	public double checkBalance() {
		
		
		return getBalance();
	}
	

}
