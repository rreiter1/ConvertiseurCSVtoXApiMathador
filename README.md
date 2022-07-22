# ConvertiseurCSVtoXApiMathador

*ConvertiseurCSVtoXApiMathador* est un script java pour convertir les données du [jeu Mathador du réseau Canopé Bourgogne Franche-Comté] en [xAPI].

## Installation

### À partir de la distribution source

- unzip la source de distribution (`ConvCsvMathadorToXapi-1.0.zip`)
- allez dans le dossier décompresser (`ConvertiseurCSVtoXApiMathador`)
- éxécuter la commande *maven* (`mvn package`)

### À partir d'un IDE (comme eclipse)

- unzip la source de distribution (`ConvCsvMathadorToXapi-1.0.zip`)
- ouvrir eclipse IDE
- `import...`, `Maven` -> `existing maven project`
- (optionel) avant d'exécuter le programme, réalisé l'action suivante : `Run As` -> `Maven Install`

## Usage

### argumment

```
 --input, -i <arg>    //nom du fichier .csv
 --number, -n <arg>   //seuil de partitionnement
 --output, -o <arg>   //nom du dossier résultat
```

## Authors

- Romain Reiter (LORIA, Nancy, France)
