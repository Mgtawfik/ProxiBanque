package com.proxibanque.metier;

import java.util.Set;

public class CustomerAdvisor {
	
	protected String firstName;
	protected String name;
	
	
	// Associations
	private Manager manager;
	private Branch branch;
	private Set<Customer> customers;
	private Set<Account> accounts;
	
	
	// Méthodes de la classe
	
	public void transferMoney() {
		
		
	}
	
	public void simulateCredit() {	
	}
		
	public void createCustomer() {
	}
	
	public void deleteCustomer() {
	}
	
	public void modifyCustomer() {
	}
	
	public void readCustomer() {	
	}
	
	
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


	// Constructeur
	public CustomerAdvisor(String firstName, String name, Manager manager, Branch branch, Set<Customer> customers) {
		super();
		this.firstName = firstName;
		this.name = name;
		this.manager = manager;
		this.branch = branch;
		this.customers = customers;
	}


	// toString
	@Override
	public String toString() {
		return "CustomerAdvisor [firstName=" + firstName + ", name=" + name + ", customers=" + customers + "]";
	}
	

}
