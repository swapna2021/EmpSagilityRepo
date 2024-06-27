package com.sagility.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CurrentAccount extends Account{
	
	private double overDraftAmount;
	@OneToOne
	private AccountHolder accountHolderInfo;
	
	@Override
	public String withDraw(double amount) {
		
		if(amount<=this.overDraftAmount) {
			this.overDraftAmount-=amount;
			return "Amount withdrawn successfully";
		}
		else
			return "no sufficient balance";
	}
	

}
