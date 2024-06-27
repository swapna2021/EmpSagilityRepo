package com.sagility.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AccountHolder {
	
	@Size(min=3,message = "name should be minimum of length")
	private String accountHolderName;
	@Id
	private int accountHolderId;
	private String mobile;
	private String email;
	private String address;
	@OneToOne
	private SavingAccount sAccount;
	@OneToOne
	private CurrentAccount cAccount;
	
	

}
