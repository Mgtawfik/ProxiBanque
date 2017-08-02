package com.proxibanque.dao;

import com.proxibanque.metier.Customer;

/**
 * Classe qui permet d'interroger la base de donn�es 
 * @author tk
 */

	public class CustomerJDBC {
		
		/**
		 * M�thode d'ajout d'une client en base de donn�es
		 * @param p client � ajouter en base de donn�es
		 */	
		
		
		public void addCustomer(Customer c) {
			System.out.println("J'ajoute la personne " + c + "en base de donn�es"); 
		}
		
		/**
		 * M�thode de r�cup�ration d'un client en base de donn�es
		 * @param p client � r�cup�rer
		 * @return client trouv�e en BDD
		 */
		
		
		 public Customer readCustomer (Customer c) {
		 	return c;
		 }
		
		/**
		 * M�thode de modification d'un client (nom et pr�nom) en base de donn�es
		 * @param p client � modifier
		 * @param thename nouveau nom du client
		 * @param thefirstname nouveau pr�nom du client
		 * @return client apr�s mise � jour
		 */
		 
		 public Customer updateCustomer (Customer c, String thename, String thefirstname) {
		 	c.setName(thename);
		 	c.setFirstname(thefirstname);
		 	return c;
		 }
		 
		 
		/**
		 * M�thode de suppression d'une personne en base de donn�es
		 * @param p personne � r�cup�rer
		 */
		 public void deleteCustomer (Customer c) {
			System.out.println("Je supprime le client " + c + "en base de donn�es");
		}
		
}


