I.	Prérequis

1.	Avoir une machine distante avec ssh installer dessus (sudo apt-get insall openssh-server)
2.	Mettre en réseau la machine linux et la machine qui exécute .war java (vérifier la connectivité la commande ping vers la machine linux)
3.	Pour pouvoir exécuter l’application Tomcat doit être installé (sur la machine Windows)
4.	Notre projet est basé sur SpringBoot.


II.	Paramètres de l’application
Pour exécuter l’application on aura besoin de renseigner les paramètres suivants dans le fichier application.properties :

o	Le numéro de port : le correspond au numéro de port du démarrage de l’application (nous avons utilisé le port par défaut 8080)
o	Hostname : il correspond au nom ou à l’adresse IP de la machine linux distant. Il s’agit de app.session.ssh.hostname donc la valeur correspondra l’adresse ip ou au nom de la machine linux (nous avons utilisé localhost)
o	Username : correspond au nom d’utilisateur de la machine linux ; il s’agit de app.session.ssh.username (nous avons utilisé eric )
o	Le numéro de port ssh : il s’agit du numéro de port du serveur ssh installé sur la machine linux ; il s’agit de app.session.ssh.port (sa valeur par défaut est le 22)
o	Mot de passe : il s’agit du mot de passe de la machine linux ; il s’agit de app.session.ssh.password (nous avons utilisé comme mot de passe 1234)

III. Présentation de l’application .war

 	Présentation de l’application .war
Elle est composée de deux parties:
De l’application java qui intègre la couche métier du projet
La partie front end (les fichiers utilisés sont .html, .css, .js) qui assure l’interfaçage entre utilisateur final et l’application java.

1.	Présentation de l’application java
      Pour la mise sur pied de notre application nous avons utilisé les dépendances suivantes :
      La dépendance Web :  Elle permet le développement de l’application web via java.
      La dépendance Jcraft : Elle permet d’établir la connexion ssh à partir d’une application java.
      La dépendance Websocket : Elle permet d’établir une communication bidirectionnelle entre le front end et backend (application java), Elle permet d’envoyer les messages à un serveur et recevoir les réponses d’une manière évènementielle.
      La dépendance Bootstrap : Elle permet de charger les dépendances de Bootstrap afin d’avoir une interface de bonne qualité.
      La dépendance jQuery : il permet la gestion des scripts côté client.

2.	 Présentation du front end

Le front end communique avec l’application java (couche métier) à partir de l’API Websocket. Le front end écoute et souscrit aux messages (résultats de la commande).
Nous avons :
Le fichier index.html qui nous permet d’entrer une commande et d’afficher son résultat,
Le fichier script.js qui nous permet de gérer les actions sur le formulaire
Le fichier style.css qui nous a permis de designer le fichier index.html
