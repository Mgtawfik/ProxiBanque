package com.proxibanque.metier;

import java.util.Hashtable;


public class HighNetWorthIndividual extends Customer {
	
		private Hashtable <String, Integer> investments;
		

		public HighNetWorthIndividual(String name, String firstname, String adress, short zipcode, String city, short phoneNumber,
				CustomerAdvisor customerAdvisor,Hashtable<String, Integer> investments) {
			super(name, firstname,adress, zipcode, city, phoneNumber, customerAdvisor);
			this.investments = investments;
		}
		
		public Hashtable<String, Integer> getInvestments() {
			return investments;
		}

		public void setInvestments(Hashtable<String, Integer> investments) {
			this.investments = investments;
		}

/**
 * investir sur le compte <number> sur la place <place>, concernant l'action <action>,
 * prixaction : prix d'une seule action
 * qtteaction : nombre d'actions à acheter
 * @param number
 * @param place
 * @param action
 * @param prixaction
 * @param qtteaction
 */
	
	// Méthodes associées
	public void investMoney(int number, String place, String action, int prixaction, int qtteaction) {
		int mt = prixaction * qtteaction;
		if (mt <0) {
			System.out.println("Cette opération est impossible");
			return;
		}
		else if ( !( place.equalsIgnoreCase("Paris") || place.equalsIgnoreCase("Londres") || place.equalsIgnoreCase("Singapour") || place.equalsIgnoreCase("New-York") || place.equalsIgnoreCase("Tokyo"))) {
			System.out.println(place);
			System.out.println("Cette opération est impossible car vous n'avez pas sélectionné une place boursière de notre panel.");
			return;
		}
		else {
			Account a = accounts.get(number);
			a.retirer(mt); 
			this.investments.put(place, mt);
			System.out.println("Votre investissement de " + mt + " sur la place boursière de " + place + " a bien été pris en compte. "
					+ "Le nouveau solde de votre compte est de " + a.getBalance() + " euros.");
		}
	}
	
	//toString

	@Override
	public String toString() {
		return "HighNetWorthIndividual [name=" + name + ", firstname=" + firstname + ", investments=" + investments + ", adress=" + adress
				+ ", zipcode=" + zipcode + ", city=" + city + ", phoneNumber=" + phoneNumber + ", accounts=" + accounts
				+ ", bankingcards=" + bankingcards + ", customerAdvisor=" + customerAdvisor + "]";
	}	
}
