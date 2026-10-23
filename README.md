# exercici10-java
PSEUDOCODI

INICI
    a: array de 5 enters
    b: array de 5 enters
    resultat: array de 5 enters
    i: enter

    PER i = 0 FINS A 4
        ESCRIURE "Posa un numero per a:"
        LLEGIR a[i]
    FI_PER

    PER i = 0 FINS A 4
        ESCRIURE "Posa un numero per b:"
        LLEGIR b[i]
    FI_PER

    PER i = 0 FINS A 4
        resultat[i] = a[i] + b[i]
    FI_PER

    PER i = 0 FINS A 4
        ESCRIURE "Posició: ", i
        ESCRIURE "a: ", a[i]
        ESCRIURE "b: ", b[i]
        ESCRIURE "Resultat: ", resultat[i]
    FI_PER
FI
