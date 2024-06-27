package com.sagility.entities;

import org.springframework.http.ResponseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SavingAccount  extends Account{
	
	public double balance;
	@OneToOne
	private AccountHolder accountHolderInfo;

	@Override
	public String withDraw(double amount) {
		
		if(amount<=this.balance) {
			this.balance-=amount;
			return "Amount withdrawn successfully";
		}
		else
			return "no sufficient balance";
	}

}
