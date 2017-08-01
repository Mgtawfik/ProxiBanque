package com.proxibanque.metier;

import java.util.Date;

public class Account {
	
	
	// Attributs
	protected int number;
	protected Date creationDate;
	protected float balance;
	protected int overdraft;
	
	// Associations
	protected BankingCard bankingCard;
	protected Customer customer;
	protected CustomerAdvisor customerAdvisor;
	protected ProxiBankSI proxibanksi;
	
	// Accesseurs
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(int overdraft) {
		this.overdraft = overdraft;
	}

	public BankingCard getBankingCard() {
		return bankingCard;
	}

	public void setBankingCard(BankingCard bankingCard) {
		this.bankingCard = bankingCard;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerAdvisor getCustomerAdvisor() {
		return customerAdvisor;
	}

	public void setCustomerAdvisor(CustomerAdvisor customerAdvisor) {
		this.customerAdvisor = customerAdvisor;
	}

	public ProxiBankSI getProxibanksi() {
		return proxibanksi;
	}

	public void setProxibanksi(ProxiBankSI proxibanksi) {
		this.proxibanksi = proxibanksi;
	}

	public static int getNbAccounts() {
		return nbAccounts;
	}

	public static void setNbAccounts(int nbAccounts) {
		Account.nbAccounts = nbAccounts;
	}

	// Constructeur
	public Account(int number, Date creationDate, float balance, int overdraft, BankingCard bankingCard,
			Customer customer, CustomerAdvisor customerAdvisor, ProxiBankSI proxibanksi) {
		super();
		this.number = number;
		this.creationDate = creationDate;
		this.balance = balance;
		this.overdraft = overdraft;
		this.bankingCard = bankingCard;
		this.customer = customer;
		this.customerAdvisor = customerAdvisor;
		this.proxibanksi = proxibanksi;
	}


	//Statiques
	protected static int nbAccounts;


	// M�thodes associ�es au compte
	
	public void verser (float mt) {
		if (mt <0) {
			System.out.println("Cette op�ration est impossible");
		}
		else {
			balance = balance + mt; 	
			System.out.println("Votre d�p�t de " + mt + " a bien �t� pris en compte. Le nouveau solde de votre compte est de " + balance + " euros.");
		}
	}
	
	public void retirer (float mt) {
		if (mt <0) {
			System.out.println("Cette op�ration est impossible");
		}
		else {
			balance = balance - mt;
			System.out.println("Votre retrait de " + mt + " a bien �t� pris en compte. Le nouveau solde de votre compte est de " + balance + " euros.");
		}
}
}