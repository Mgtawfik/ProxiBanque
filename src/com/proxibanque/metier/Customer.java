package com.proxibanque.metier;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * classe Client
 * @author adminl
 *
 */
public class Customer {

	// Attributs
	
	protected String name;
	protected String firstname;
	protected String adress;
	protected short zipcode;
	protected String city;
	protected short phoneNumber;
	
	// Associations
	
	protected Map<Integer, Account> accounts;
	protected  Map<Integer, BankingCard> bankingcards;
	protected CustomerAdvisor customerAdvisor;
	

	
	// Constructeur

	public Customer(String name, String firstname, String adress, short zipcode, String city, short phoneNumber,CustomerAdvisor customerAdvisor) {
		this();
		this.adress = adress;
		this.zipcode = zipcode;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.customerAdvisor = customerAdvisor;
	}
	
	
	public Customer() {
		super();
		this.accounts = new HashMap<Integer,Account>() ;
		this.bankingcards = new HashMap<Integer,BankingCard>() ;
	}


	// toString
	@Override
	public String toString() {
		return "Customer [name=" + name + ", firstname=" + firstname + ", adress=" + adress + ", zipcode=" + zipcode + ", city=" + city + ", phoneNumber=" + phoneNumber
				+ ", accounts=" + accounts + ", bankingcards=" + bankingcards + ", customerAdvisor=" + customerAdvisor
				+ "]";
	}
	
	// Méthode
	
	public void addAccount(int numero, Account compte) {
		accounts.put(numero, compte);
	}
	
	
	// Accesseurs 

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

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
	
	
	public CustomerAdvisor getCustomerAdvisor() {
		return customerAdvisor;
	}
	public void setCustomerAdvisor(CustomerAdvisor customerAdvisor) {
		this.customerAdvisor = customerAdvisor;
	}

	public Map<Integer, Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<Integer, Account> accounts) {
		this.accounts = accounts;
	}

	public Map<Integer, BankingCard> getBankingcards() {
		return bankingcards;
	}

	public void setBankingcards(Map<Integer, BankingCard> bankingcards) {
		this.bankingcards = bankingcards;
	}
	

}
