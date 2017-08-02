# ProxiBanque



A. Contexte

La banque ProxiBanque a sollicité notre société de conseil afin de développer un système d'information adapté à ces besoins. 


B. Cas d'utilisation

Dans un premier temps, nous avons décartographié l'ensemble des cas d'utilisation possibles de la banque ProxiBanque. 

Ces cas d'utilisation ont été 




C. Classes
D. Packages
E. Fonctionnalités



Le système d'information de la banque ProxiBanque est découpé en 4 couches représentées par 4 packages : 

1) la couche présentation: il s'agit de votre interface avec le système d'information. C'est à partir de cette couche et uniquement à partir de celle-ci que les actions suivantes sont possibles :

-  Virement de compte à compte, entre un client identique ou entre 2 clients différents. 
	=> Cette action est possible pour le Conseiller de Clientèle (Customer Advisor).

-  Investissement sur une place boursière.
	=> Cette action est possible pour les clients fortunés (HighNetWorthIndividual) sur un panel de place boursière prédéfini.
	
	
Cette liste de fonctionnalités sera élargie suivant la représentation du diagramme de cas d'utilisation joint à ce livrable. 
	
	
2) la couche métier: elle contient l'ensemble des classes de votre système d'information : 
- Compte (Account)
- Carte Bancaire (Banking Card)
- Agence (Branch)
- Client (Customer)
- Conseiller de Clientèle (CustomerAdvisor)
- Client Fortuné (HighNetWorthIndividual)
- Responsable d'agence (Manager)
- ProxiBAnque SI


3) La couche DAO: elle représente la couche qui interagit avec la base de données et réalise les modifications suivantes :

- lire un client.
- modifier un client.
- ajouter un client. 
- supprimer un client.


Ces fonctionnalités ne sont pas pas disponibles dans le présent livrable. Elles seront développées dans une version ultérieure. 


















