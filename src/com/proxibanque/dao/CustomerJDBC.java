package com.proxibanque.dao;

import com.proxibanque.metier.Customer;

/**
 * Classe qui permet d'interroger la base de données 
 * @author tk
 */

	public class CustomerJDBC {
		
		/**
		 * Méthode d'ajout d'une client en base de données
		 * @param p client à ajouter en base de données
		 */	
		
		
		public void addCustomer(Customer c) {
			System.out.println("J'ajoute la personne " + c + "en base de données"); 
		}
		
		/**
		 * Méthode de récupération d'un client en base de données
		 * @param p client à récupérer
		 * @return client trouvée en BDD
		 */
		
		
		 public Customer readCustomer (Customer c) {
		 	return c;
		 }
		
		/**
		 * Méthode de modification d'un client (nom et prénom) en base de données
		 * @param p client à modifier
		 * @param thename nouveau nom du client
		 * @param thefirstname nouveau prénom du client
		 * @return client après mise à jour
		 */
		 
		 public Customer updateCustomer (Customer c, String thename, String thefirstname) {
		 	c.setName(thename);
		 	c.setFirstname(thefirstname);
		 	return c;
		 }
		 
		 
		/**
		 * Méthode de suppression d'une personne en base de données
		 * @param p personne à récupérer
		 */
		 public void deleteCustomer (Customer c) {
			System.out.println("Je supprime le client " + c + "en base de données");
		}
		
}


