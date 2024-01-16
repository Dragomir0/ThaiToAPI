# Convertisseur de Syllabes Thaï en API
Ce projet Java fournit une fonctionnalité pour convertir des syllabes en thaï (écrites en Unicode) en leur équivalent en Alphabet Phonétique International (API). Il est spécialement conçu pour traiter et analyser chaque segment de texte thaï délimité par un espace, en fournissant une transcription fidèle en API.

Pour utiliser ce convertisseur, importez le package Thai dans votre projet Java. La classe principale Thai contient la méthode statique versAPI qui prend en argument une chaîne de caractères thaïe en Unicode et retourne sa transcription en API.

## Exemple d'Utilisation
```java
String texteThai = "\u0E33"; // Texte thaï en Unicode
String transcriptionAPI = Thai.versAPI(texteThai);
System.out.println(transcriptionAPI);
```

Des tests unitaires sont fournis pour valider les fonctionnalités du convertisseur. Ils utilisent JUnit et couvrent une gamme de cas, y compris la conversion de syllabes simples et complexes, ainsi que la gestion des entrées non valides.

## Dépendances
Java (Version 8 ou ultérieure)
JUnit (Pour l'exécution des tests)