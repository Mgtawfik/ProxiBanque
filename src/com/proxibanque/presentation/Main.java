package com.proxibanque.presentation;

import java.util.Collection;
import java.util.Date;
import java.util.Hashtable;
import java.util.Scanner;

import com.proxibanque.metier.Account;
import com.proxibanque.metier.BankingCard;
import com.proxibanque.metier.Customer;
import com.proxibanque.metier.CustomerAdvisor;
import com.proxibanque.metier.HighNetWorthIndividual;
import com.proxibanque.metier.ProxiBankSI;

/**
 * classe de lancement du Main programme
 * @author adminl
 *
 */
public class Main {

	public static void main(String[] args) {
		
		/*
		// SPRINT 1 : TRANSFER MONEY
		// création du compte 1
		System.out.print("Entrez votre numéro de compte à débiter:");
		Scanner clavier = new Scanner (System.in);
		int numero = clavier.nextInt();
		System.out.print("Entrez votre numéro de compte à créditer:");
		Scanner clavier2 = new Scanner (System.in);
		int numero2 = clavier2.nextInt();
		System.out.println("Indiquez le montant à transférer:");
		Scanner clavier3 = new Scanner (System.in);
		int numero3 = clavier3.nextInt();
		 
		BankingCard bc = new BankingCard();
		Customer c = new Customer();
		CustomerAdvisor ca = new CustomerAdvisor();
		ProxiBankSI pb = new ProxiBankSI();
		
		Account a1 = new Account (numero, "17022002", 1000, 0,bc,c,ca,pb);
		c.addAccount(a1.getNumber(), a1);
		
		// création du compte 2
		BankingCard bc2 = new BankingCard();
		Customer c2 = new Customer();
		CustomerAdvisor ca2 = new CustomerAdvisor();
		ProxiBankSI pb2 = new ProxiBankSI();
		
		Account a2 = new Account (numero2, "01052006", 2000, 0,bc2,c2,ca2,pb2);
		
		c2.addAccount(a2.getNumber(), a2);
		ca.addCustomer(c);
		ca.addCustomer(c2);
		
		// Virement	
		ca.transferMoney(a1.getNumber(), a2.getNumber(), numero3);
		
		clavier.close()
		
		
		*/
		

		// SPRINT 2 INVEST MONEY
		
			
		// création du compte 1
		System.out.print("Entrez votre numéro de compte à débiter:");
		Scanner clavier4 = new Scanner (System.in);
		int numero4 = clavier4.nextInt();
		System.out.print("Choisissez la place boursière dans laquelle vous souhaitez investir parmi les propositions suivantes: Paris, Londres, Singapour, New-York, Tokyo ");
		Scanner clavier5 = new Scanner (System.in);
		String numero5 = clavier5.nextLine();
		System.out.println("Indiquez le nom de l'action à acheter:");
		Scanner clavier6 = new Scanner (System.in);
		String numero6 = clavier6.nextLine();
		System.out.println("Indiquez le nombre d'actions à acheter:");
		Scanner clavier7 = new Scanner (System.in);
		int numero7 = clavier7.nextInt();
		System.out.println("Indiquez le prix de l'action à acheter:");
		Scanner clavier8 = new Scanner (System.in);
		int numero8 = clavier8.nextInt();
			
		
		
		BankingCard bc3 = new BankingCard();
		CustomerAdvisor ca3 = new CustomerAdvisor();
		ProxiBankSI pb3 = new ProxiBankSI();
		Hashtable <String, Integer> i = new Hashtable<>();
		
		HighNetWorthIndividual h = new HighNetWorthIndividual("Thomas", "Dupont", "Place Beauveau", (short)75008, "Paris", (short)600, ca3,i);
		h.getAccounts().put(numero4,new Account(numero4,"20081994",1000000,0,bc3,h,ca3,pb3));
		
		// Investissement	
		h.investMoney(numero4, numero5, numero6, numero8, numero7);

		
	}
		
}
