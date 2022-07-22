# ConvertiseurCSVtoXApiMathador

*ConvertiseurCSVtoXApiMathador* est un script Java permettant de convertir des données d'utilisation du [jeu Mathador du réseau Canopé Bourgogne Franche-Comté] de manière à pouvoir utiliser la norme [xAPI].

## Installation

### À partir de la distribution source

- décompressez le fichier de la distribution source (`ConvCsvMathadorToXapi-1.0.zip`)
- allez dans le dossier décompressé (`ConvertiseurCSVtoXApiMathador`)
- exécutez la commande *maven* (`mvn package`)

### À partir d'un IDE (Eclipse est donné en exemple)

- décompressez le fichier de la distribution source (`ConvCsvMathadorToXapi-1.0.zip`)
- ouvrez Eclipse IDE
- import..., Maven -> existing maven project
- (optionel) avant l'exécution du programme faites : Run As -> Maven Install

## Usage

### argumment

```
 --input, -i <arg>    //nom du fichier .csv
 --number, -n <arg>   //seuil de partitionnement
 --output, -o <arg>   //nom du dossier résultat
```

## Authors

- Romain Reiter (LORIA, Nancy, France)
