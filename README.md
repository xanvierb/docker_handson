# docker_handson
Hands-on sessie over Docker. 

## Voorbereiding
Voor deze hands-on sessie heb je `docker-ce` nodig.

## Opdracht 0
In opdracht 0 heb je kunnen zien hoe je met Docker in de basis werkt. Je kunt dit nogmaals doen of je kunt doorgaan naar opdracht 1 waar je, in essentie, dezelfde kennis nodig hebt.

## Opdracht 1
In de map `opdracht_1` vind je een een jar-bestand. Het is de bedoeling dat je deze jar in een container gaat draaien.

1. Vind een geschikt basis image op [https://hub.docker.com/](https://hub.docker.com/).
2. Schrijf de docker file en bouw het image op.
3. Start het image en kijk of je de applicatie kan benaderen op poort `8080` en pad `/list`.

## Opdracht 2

1. Haal voor deze opdracht [dit image](https://hub.docker.com/r/xanvier/secret/) naar binnen.
2. Dit image is gebaseerd op de [Nginx](https://hub.docker.com/_/nginx/) image. Er draait dus een webserver op.
3. Het is de bedoeling om de website die hier op draait, te laten opereren op poort 8080 met port forwarding in het run commando.
4. Pas het image dusdanig aan dat Nginx op port 80 draait, maak gebruik van de `interactive shell` en het `commit` commando
5. Maak een docker hub account en zet daar je nieuw gemaakte image op.

## opdracht 3


Speciaal voor de Microsoft fanboys is er deze laatste oefening. Zet voor deze images containers op:

- https://hub.docker.com/r/xanvier/contactsapi/
- https://hub.docker.com/r/xanvier/angularfrontend/
- https://hub.docker.com/r/xanvier/qmysqlserver/

Contactsapi betreft een .NET Core api die draait op port 5000. De angularfrontend image is op basis van een nginx container en draait op port 80. De qmysqlserver is een mysql container en draait op port 3306. 

Dit is alle informatie de je nodig zou moeten hebben. Succes!








