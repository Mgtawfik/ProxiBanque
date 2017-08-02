package com.proxibanque.metier;

<<<<<<< HEAD

/**
 * classe Compte bancaire (attributs : numero, dateCreation, solde, decouvert)
 * @author adminl
 *
 */

=======
>>>>>>> branch 'master' of https://github.com/Mgtawfik/ProxiBanque.git
public class Account {
	
	// Attributs
	protected int number;
	protected String creationDate;
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

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
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
	public Account(int number, String creationDate, float balance, int overdraft, BankingCard bankingCard,
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
	
	public Account(int number, String creationDate, float balance, int overdraft, BankingCard bankingCard,
			HighNetWorthIndividual highnetworthindividual, CustomerAdvisor customerAdvisor, ProxiBankSI proxibanksi) {
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


	// Méthodes associées au compte
	
	/**
	 * méthode de versement sur un compte
	 * @param mt
	 */
	public void verser (float mt) {
		if (mt <0) {
			System.out.println("Cette opération est impossible");
		}
		else {
			balance = balance + mt; 	
			System.out.println("Votre dépôt de " + mt + " a bien été pris en compte. Le nouveau solde de votre compte est de " + balance + " euros.");
		}
	}
	
<<<<<<< HEAD
	
	
	/**
	 * méthode de retrait (débiter) sur un compte
	 * @param mt
	 */
=======
>>>>>>> branch 'master' of https://github.com/Mgtawfik/ProxiBanque.git
	public void retirer (int mt) {
		if (mt <0) {
			System.out.println("Cette opération est impossible");
		}
		else {
			balance = balance - mt;
		}
}
}
