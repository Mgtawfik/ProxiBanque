package com.proxibanque.metier;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CustomerAdvisorTest {

	/*
	 	public void transferMoney(int num1, int num2, float mt) {
		if (mt<0) {
			System.out.println("Erreur montant du transfert. Veuillez saisir un montant positif.");
			return;
		}
		else {
			
			Account account1 = chercherAccount(num1);
			Account account2 = chercherAccount(num2);
			System.out.println("compte 1 avant : " + account1.balance);
			System.out.println("compte 2 avant : " + account2.balance);
			account1.balance -= mt;
			account2.balance += mt;
			
			System.out.println("compte 1 après : " + account1.balance);
			System.out.println("compte 2 après : " + account2.balance);
			
			System.out.println("------------------------------------------");
			
			System.out.println("Votre compte numéro " + num1 + " a bien transféré la somme " + mt + " euros au profit du compte numéro " + num2);
			System.out.println("virement effectué !");
		}	
	}
	 */
	
	
	// TEST 1: TRANSFERT DE 500 EUROS ENTRE 2 COMPTES
	
	@Test
	public void testTransferMoney() {
	 	
		// création du compte 1
			CustomerAdvisor ca = new CustomerAdvisor();
			BankingCard bc = new BankingCard();
			Customer c = new Customer();
			ProxiBankSI pb = new ProxiBankSI();
		
			Account a1 = new Account (12345, "17022002", 1000, 0,bc,c,ca,pb);
			c.addAccount(12345,a1);
		
		// création du compte 2 :
			CustomerAdvisor ca2 = new CustomerAdvisor();
			BankingCard bc2 = new BankingCard();
			Customer c2 = new Customer();
			ProxiBankSI pb2 = new ProxiBankSI();
		
			Account a2 = new Account (98765, "01052006", 2000, 0,bc2,c2,ca2,pb2);
			c2.addAccount(98765,a2);
		
		// ajout des nouveaux clients dans la liste des clients du conseiller (CustomerAdvisor)
			ca.addCustomer(c);
			ca.addCustomer(c2);
		
		// Virement	
			ca.transferMoney(12345, 98765, 500.00);
			Assert.assertEquals("erreur virement", 2500, c2.getAccounts().get(98765).getBalance(), 0);
			
	}
			
	
	// TEST 2: TRANSFERT DE -500 EUROS ENTRE 2 COMPTES
		
	@Test
	public void test2TransferMoney() {
		
		// création du compte 1
			CustomerAdvisor ca = new CustomerAdvisor();
			BankingCard bc = new BankingCard();
			Customer c = new Customer();
			ProxiBankSI pb = new ProxiBankSI();
				
			Account a1 = new Account (12345, "17022002", 1000, 0,bc,c,ca,pb);
			c.addAccount(12345,a1);
				
		// création du compte 2 :
			CustomerAdvisor ca2 = new CustomerAdvisor();
			BankingCard bc2 = new BankingCard();
			Customer c2 = new Customer();
			ProxiBankSI pb2 = new ProxiBankSI();
				
			Account a2 = new Account (98765, "01052006", 2000, 0,bc2,c2,ca2,pb2);
			c2.addAccount(98765,a2);
				
		// ajout des nouveaux clients dans la liste des clients du conseiller (CustomerAdvisor)
			ca.addCustomer(c);
			ca.addCustomer(c2);
	
		// Virement	
			ca.transferMoney(12345, 98765, -500.00);
			Assert.assertEquals("erreur virement", 2000, c2.getAccounts().get(98765).getBalance(), 0);

	}

	
	// TEST 3: TRANSFERT DE 500 EUROS SUR UN MAUVAIS COMPTE
	
	@Test
	public void test3TransferMoney() {
	
		// création du compte 1
		CustomerAdvisor ca = new CustomerAdvisor();
		BankingCard bc = new BankingCard();
		Customer c = new Customer();
		ProxiBankSI pb = new ProxiBankSI();
			
		Account a1 = new Account (12345, "17022002", 1000, 0,bc,c,ca,pb);
		c.addAccount(12345,a1);
			
	// création du compte 2 :
		CustomerAdvisor ca2 = new CustomerAdvisor();
		BankingCard bc2 = new BankingCard();
		Customer c2 = new Customer();
		ProxiBankSI pb2 = new ProxiBankSI();
			
		Account a2 = new Account (98765, "01052006", 2000, 0,bc2,c2,ca2,pb2);
		c2.addAccount(98765,a2);
	
	// création du compte 3 :
		CustomerAdvisor ca3 = new CustomerAdvisor();
		BankingCard bc3 = new BankingCard();
		Customer c3 = new Customer();
		ProxiBankSI pb3 = new ProxiBankSI();
			
		Account a3 = new Account (10000, "02062012", 5000, 0,bc3,c3,ca3,pb3);
		c3.addAccount(10000,a3);
		
	// ajout des nouveaux clients dans la liste des clients du conseiller (CustomerAdvisor)
		ca.addCustomer(c);
		ca.addCustomer(c2);
		ca.addCustomer(c3);
	
	// Virement	
		ca.transferMoney(12345, 10000, 500.00);
		Assert.assertEquals("erreur virement", 2000, c2.getAccounts().get(98765).getBalance(), 0);
		
	}
}
	
	
	

