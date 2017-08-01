package com.proxibanque.metier;

import java.util.Collection;
import java.util.Hashtable;

public class HighNetWorthIndividual extends Customer {
	
		private float balance;
		private Hashtable <String, Integer> investments;

	

	
	
	
	// Constructeur	
		public HighNetWorthIndividual(String adress, short zipcode, String city, short phoneNumber,
			Collection<Account> accounts, Collection<BankingCard> bankingcards, CustomerAdvisor customerAdvisor,
			float balance, Hashtable<String, Integer> investments) {
		super(adress, zipcode, city, phoneNumber, accounts, bankingcards, customerAdvisor);
		this.investments = investments;
		if (balance >= 500000) {
			this.balance = balance;
			}
			else {
				System.out.println("Ce client ne possède pas un solde suffisant pour être considéré comme fortuné.");
			}
	}


	
	// Accesseurs
	

		public float getBalance() {
			return balance;
		}

		public void setBalance(float balance) {
			this.balance = balance;
		}

		public Hashtable<String, Integer> getInvestments() {
			return investments;
		}

		public void setInvestments(Hashtable<String, Integer> investments) {
			this.investments = investments;
		}
	
		
	
	// Méthodes associées
	public void investMoney(float mt) {
		if (mt <0) {
			System.out.println("Cette opération est impossible");
		}
		else {
			balance = balance - mt; 	
			// Il faut créer un nouveau compte investissement !!
			System.out.println("Votre investissement de " + mt + " a bien été pris en compte. Le nouveau solde de votre compte est de " + balance + " euros.");
		}
	
	}
	
	//toString

	@Override
	public String toString() {
		return "HighNetWorthIndividual [balance=" + balance + ", investments=" + investments + ", adress=" + adress
				+ ", zipcode=" + zipcode + ", city=" + city + ", phoneNumber=" + phoneNumber + ", accounts=" + accounts
				+ ", bankingcards=" + bankingcards + ", customerAdvisor=" + customerAdvisor + "]";
	}	
}
