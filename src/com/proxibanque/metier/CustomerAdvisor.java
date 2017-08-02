package com.proxibanque.metier;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.proxibanque.dao.CustomerJDBC;

/**
 * classe Conseiller Client
 * @author adminl
 *
 */

public class CustomerAdvisor {
	protected String firstName;
	protected String name;
	// Associations
	private Manager manager;
	private Branch branch;
	private Set<Customer> customers;
	
	
	// constructeur
	public CustomerAdvisor(String firstName, String name, Manager manager, Branch branch, Set<Customer> customers,
			Map<Integer, Account> accounts) {
		this();
		this.firstName = firstName;
		this.name = name;
		this.manager = manager;
		this.branch = branch;
		if(customers!= null)
			this.customers = customers;
	}

	public CustomerAdvisor() {
		super();
		customers = new HashSet<Customer>();
	}
	
	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}

	// Méthodes de la classe
	
		// Chercher Compte

	public Account chercherAccount(int num) {
		Account account = null;
		for(Customer customer : customers) {
			Map<Integer,Account> accounts = customer.getAccounts();
			if(accounts.get(num) != null) {
				 account =  customer.getAccounts().get(num) ;
				 break;
			}
		}
		return account;
	}
	
		// Transférer Argent
	
	/**
	 * méthode virement de compte 1 à compte 2
	 * @param num1
	 * @param num2
	 * @param d
	 */
	public void transferMoney(int num1, int num2, double d) {
		if (d<0) {
			System.out.println("Erreur montant du transfert. Veuillez saisir un montant positif.");
			return;
		}
		else {
			
			Account account1 = chercherAccount(num1);
			Account account2 = chercherAccount(num2);
			System.out.println("compte 1 avant : " + account1.balance);
			System.out.println("compte 2 avant : " + account2.balance);
			account1.balance -= d;
			account2.balance += d;
			
			System.out.println("compte 1 après : " + account1.balance);
			System.out.println("compte 2 après : " + account2.balance);
			
			System.out.println("------------------------------------------");
			
			System.out.println("Votre compte numéro " + num1 + " a bien transféré la somme " + d + " euros au profit du compte numéro " + num2);
			System.out.println("virement effectué !");
		}	
		
	/*	
		// Ajouter un client en BDD
		
	public void addCustomer (Customer c) {	
		CustomerJDBC.addCustomer(c);
	}
		
	*/
		
	}
	
	// public void createCustomer(Customer customer) {
		//this.BankingCard = bankingcard;
		//CustomerAdvisor ca = new CustomerAdvisor();
		// Customer c = new Customer(adresse,code,ville,phone,bankingcard,customerAdvisor);


	/*
	public void deleteCustomer() {
	}
	public void modifyCustomer() {
	}
	public void readCustomer() {	
	}
	*/
	
	// Accesseurs
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	// toString

	@Override
	public String toString() {
		return "CustomerAdvisor [firstName=" + firstName + ", name=" + name + ", manager=" + manager + ", branch="
				+ branch + ", customers=" + customers + "]";
	}
}
