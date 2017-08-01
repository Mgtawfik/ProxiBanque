package com.proxibanque.metier;

import java.util.Collection;

public class Customer {

	// Attributs
	
	protected String adress;
	protected short zipcode;
	protected String city;
	protected short phoneNumber;
	
	
	// toString
	@Override
	public String toString() {
		return "Customer [adress=" + adress + ", zipcode=" + zipcode + ", city=" + city + ", phoneNumber=" + phoneNumber
				+ ", accounts=" + accounts + ", bankingcards=" + bankingcards + ", customerAdvisor=" + customerAdvisor
				+ "]";
	}
	
	
	// Accesseurs 

	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public short getZipcode() {
		return zipcode;
	}
	public void setZipcode(short zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public short getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(short phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Collection<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Collection<Account> accounts) {
		this.accounts = accounts;
	}
	public Collection<BankingCard> getBankingcards() {
		return bankingcards;
	}
	public void setBankingcards(Collection<BankingCard> bankingcards) {
		this.bankingcards = bankingcards;
	}
	public CustomerAdvisor getCustomerAdvisor() {
		return customerAdvisor;
	}
	public void setCustomerAdvisor(CustomerAdvisor customerAdvisor) {
		this.customerAdvisor = customerAdvisor;
	}
	
	
	// Constructeur

	public Customer(String adress, short zipcode, String city, short phoneNumber, Collection<Account> accounts,
			Collection<BankingCard> bankingcards, CustomerAdvisor customerAdvisor) {
		super();
		this.adress = adress;
		this.zipcode = zipcode;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.accounts = accounts;
		this.bankingcards = bankingcards;
		this.customerAdvisor = customerAdvisor;
	}
	
	
	// Associations
	
	protected Collection<Account> accounts;
	protected Collection<BankingCard> bankingcards;
	protected CustomerAdvisor customerAdvisor;
	

	
}
