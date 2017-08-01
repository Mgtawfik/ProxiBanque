package com.proxibanque.metier;

import java.util.Set;
import com.proxibanque.service.Service;;

public class CustomerAdvisor implements Service {
	
	protected String firstName;
	protected String name;
	
	
	// Associations
	private Manager manager;
	private Branch branch;
	private Set<Customer> customers;
	private Set<Account> account;
	
	
	// Méthodes de la classe
	
	public void transferMoney(int num1,int num2,float mt) {
		if(mt<0) {
			System.out.println("montant négatif !!!");
			return;
			}
		else{
			for(int i=0; i<account.size();i++) {
				if(account.get(i).number = num1) {
					for(int j=0; i<account.size();j++) {
						if(account.get(j).number = num2) {
							account.get(j).balance += mt ;
							account.get(i).balance -= mt ;
						}
					}
				}
			}
		}// fin else
	}// fin transferMoney()
		
	
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
