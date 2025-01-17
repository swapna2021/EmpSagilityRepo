package com.sagility;

public class CurrentAccount extends Account {
	
	private double overDraftAmunt;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(String bankName, String accountHolderName, long accountId, int pinNum, String iFSCNum,
			double overDraftAmunt) {
		super(bankName, accountHolderName, accountId, pinNum, iFSCNum);
		this.overDraftAmunt = overDraftAmunt;
	}

	public double getOverDraftAmunt() {
		return overDraftAmunt;
	}

	public void setOverDraftAmunt(double overDraftAmunt) {
		this.overDraftAmunt = overDraftAmunt;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overDraftAmunt=" + overDraftAmunt + ", getBankName()=" + getBankName()
				+ ", getAccountHolderName()=" + getAccountHolderName() + ", getAccountId()=" + getAccountId()
				+ ", getPinNum()=" + getPinNum() + ", getiFSCNum()=" + getiFSCNum() + "]";
	}
	
	@Override
	public void withDraw(double amount) {
		
		if(amount<overDraftAmunt)
		{
			System.out.println("withdrawn");
			this.overDraftAmunt-=amount;
		}
	
	}
	
	public double checkOverdraftAmount() {
		return getOverDraftAmunt();
	}

}
