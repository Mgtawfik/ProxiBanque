# ProxiBanque



A. Contexte

La banque ProxiBanque a sollicit� notre soci�t� de conseil afin de d�velopper un syst�me d'information adapt� � ces besoins. 


B. Cas d'utilisation

Dans un premier temps, nous avons d�cartographi� l'ensemble des cas d'utilisation possibles de la banque ProxiBanque. 

Ces cas d'utilisation ont �t� 




C. Classes
D. Packages
E. Fonctionnalit�s



Le syst�me d'information de la banque ProxiBanque est d�coup� en 4 couches repr�sent�es par 4 packages : 

1) la couche pr�sentation: il s'agit de votre interface avec le syst�me d'information. C'est � partir de cette couche et uniquement � partir de celle-ci que les actions suivantes sont possibles :

-  Virement de compte � compte, entre un client identique ou entre 2 clients diff�rents. 
	=> Cette action est possible pour le Conseiller de Client�le (Customer Advisor).

-  Investissement sur une place boursi�re.
	=> Cette action est possible pour les clients fortun�s (HighNetWorthIndividual) sur un panel de place boursi�re pr�d�fini.
	
	
Cette liste de fonctionnalit�s sera �largie suivant la repr�sentation du diagramme de cas d'utilisation joint � ce livrable. 
	
	
2) la couche m�tier: elle contient l'ensemble des classes de votre syst�me d'information : 
- Compte (Account)
- Carte Bancaire (Banking Card)
- Agence (Branch)
- Client (Customer)
- Conseiller de Client�le (CustomerAdvisor)
- Client Fortun� (HighNetWorthIndividual)
- Responsable d'agence (Manager)
- ProxiBAnque SI


3) La couche DAO: elle repr�sente la couche qui interagit avec la base de donn�es et r�alise les modifications suivantes :

- lire un client.
- modifier un client.
- ajouter un client. 
- supprimer un client.


Ces fonctionnalit�s ne sont pas pas disponibles dans le pr�sent livrable. Elles seront d�velopp�es dans une version ult�rieure. 


















