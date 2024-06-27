package com.sagility.entities;

import org.springframework.http.ResponseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
@MappedSuperclass
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Account {
	
	@Id
	private String accountNum;
	private String bankName;
	private String ifsc;
	private int pin;
	
	
	public abstract String withDraw(double amount);
	public int changePin(int curPin,int newPin) {
		
		if(this.pin==curPin)
			this.pin=newPin;
		return newPin;
	}
	
	

}
