package parserexemple.src;
public enum Categorie{
    EOF,
    $,
    NUL,
    ID,
    NOMBRE,
    PV,
    OPPAff,
    OPPRel,
    IF,
    ELSE,
    WHILE,
    AFFECT,
    OP,
    CP
    ;

//hey
/*La méthode java string toLowerCase () renvoie la chaîne en minuscules. En d'autres termes,
il convertit tous les caractères de la chaîne en minuscules. */

    public String toString() {
        return this.name().toLowerCase();
    }
    /*
La méthode equalsIgnoreCase() compare deux chaînes en ignorant les différences entre
minuscules et majuscules et renvoie « true » si les chaînes sont égales sinon renvoie « false ».
*/
    public static Categorie toCategorie(String s) {
        for(Categorie c:Categorie.values())
            if(c.toString().equalsIgnoreCase(s))
                return c;
        return null;
    }


    /*La méthode ordinal() permet de retrouver le numéro d'ordre d'un élément énuméré,
     dans la liste de tous les éléments d'une énumération. Le premier numéro d'ordre est 0.
    */
    public boolean estTerminal() {
        return ordinal()>=0 && ordinal()<=5;
    }

    public boolean estNonTerminal() {
        return ordinal()>5;
    }
}




