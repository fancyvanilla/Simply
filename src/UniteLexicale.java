package parserexemple.src;


import parserexemple.src.Categorie;

public class UniteLexicale {
    private Categorie categorie;
    private Object lexeme;
    public UniteLexicale(Categorie categorie, Object lexeme) {
        this.categorie=categorie;
        this.lexeme=lexeme;
    }

    public String getCategorie() {
        return categorie.toString();
    }

    public String getLexeme() {
        return lexeme.toString();
    }

    public String toString() {
        return "<"+categorie.toString()+","+lexeme+">";
    }
}
