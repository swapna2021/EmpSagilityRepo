package com.sagility;

public abstract class Account {
	
	private String bankName;
	private String accountHolderName;
	private long accountId;
	protected int pinNum;
	private String iFSCNum;
	public Account() {
		super();
	}
	public Account(String bankName, String accountHolderName, long accountId, int pinNum, String iFSCNum) {
		super();
		this.bankName = bankName;
		this.accountHolderName = accountHolderName;
		this.accountId = accountId;
		this.pinNum = pinNum;
		this.iFSCNum = iFSCNum;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public int getPinNum() {
		return pinNum;
	}
	public void setPinNum(int pinNum) {
		this.pinNum = pinNum;
	}
	public String getiFSCNum() {
		return iFSCNum;
	}
	public void setiFSCNum(String iFSCNum) {
		this.iFSCNum = iFSCNum;
	}
	@Override
	public String toString() {
		return "Account [bankName=" + bankName + ", accountHolderName=" + accountHolderName + ", accountId=" + accountId
				+ ", pinNum=" + pinNum + ", iFSCNum=" + iFSCNum + "]";
	}
	
	public abstract void withDraw(double amount) ;
		
		
	
	public void changePin(int pinNum) {
		this.pinNum=pinNum;
		System.out.println("Pin changed successfully");
	}
	

}
