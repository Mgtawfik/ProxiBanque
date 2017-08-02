package com.proxibanque.test;

import static org.junit.Assert.*;

import java.util.Hashtable;

import org.junit.Assert;
import org.junit.Test;

import com.proxibanque.metier.Account;
import com.proxibanque.metier.BankingCard;
import com.proxibanque.metier.CustomerAdvisor;
import com.proxibanque.metier.HighNetWorthIndividual;
import com.proxibanque.metier.ProxiBankSI;

public class HighNetWorthIndividualTest {

	
	// Test 1: INVESTISSEMENT D'UNE SOMME DE 5000 euros.
	@Test
	public void testInvestMoney() {
		BankingCard bc3 = new BankingCard();
		CustomerAdvisor ca3 = new CustomerAdvisor();
		ProxiBankSI pb3 = new ProxiBankSI();
		Hashtable <String, Integer> i = new Hashtable<>();
		HighNetWorthIndividual h = new HighNetWorthIndividual("Thomas", "Dupont", "Place Beauveau", (short)75008, "Paris", (short)600, ca3,i);
		
		/*
		h.investMoney(20112, "Paris", "Sanofi", 50, 100);
		Assert.assertEquals("erreur investissement", 995000, a.getBalance(), 0);
		*/
		
		//HighNetWorthIndividual h = new HighNetWorthIndividual("Place Beauveau", (short)75008, "Paris", (short)600, ca3,i);
		
		Account a = new Account(20112,"20081994",1000000,0,bc3,h,ca3,pb3);
		h.getAccounts().put(20112,new Account(20112,"20081994",1000000,0,bc3,h,ca3,pb3));
		h.investMoney(20112, "Paris", "Sanofi", 50, 100);
		Assert.assertEquals("erreur investissement", 995000, h.getAccounts().get(20112).getBalance(), 0);
	
	}
	
	
	
	
	// Test 2: INVESTISSEMENT D'UNE SOMME DE -5000 euros.
	@Test
	public void test2InvestMoney() {
		
		BankingCard bc4 = new BankingCard();
		CustomerAdvisor ca4 = new CustomerAdvisor();
		ProxiBankSI pb4 = new ProxiBankSI();
		Hashtable <String, Integer> i4 = new Hashtable<>();
		HighNetWorthIndividual h4 = new HighNetWorthIndividual("Eric", "Lecomte","Place Vendome", (short)31000, "Toulouse", (short)604, ca4,i4);
	
		Account a4 = new Account(45699,"18011998",2000000,0,bc4,h4,ca4,pb4);
		h4.getAccounts().put(45699,new Account(45699,"18011998",2000000,0,bc4,h4,ca4,pb4));
		h4.investMoney(45699, "Londres", "AXA", 50, -100);
		Assert.assertEquals("erreur investissement", 2000000, h4.getAccounts().get(45699).getBalance(), 0);	
	}
	

	
	//Test 3: INVESTISSEMENT D'UNE SOMME SUR UNE PLACE BOURSIERE NON AUTORISEE (AMSTERDAM).
	@Test
	public void test3InvestMoney() {
		
		BankingCard bc5 = new BankingCard();
		CustomerAdvisor ca5 = new CustomerAdvisor();
		ProxiBankSI pb5 = new ProxiBankSI();
		Hashtable <String, Integer> i5 = new Hashtable<>();
		HighNetWorthIndividual h5 = new HighNetWorthIndividual("Thomas", "Dupont","Place Beauveau", (short)75008, "Amsterdam", (short)600, ca5,i5);

		Account a5 = new Account(20112,"20081994",1000000,0,bc5,h5,ca5,pb5);
		h5.getAccounts().put(20112,new Account(20112,"20081994",1000000,0,bc5,h5,ca5,pb5));
		h5.investMoney(20112, "Amsterdam", "Sanofi", 50, 100);
		Assert.assertEquals("erreur investissement", 1000000, h5.getAccounts().get(20112).getBalance(), 0);	
}



}











