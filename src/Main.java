package parserexemple.src;
import java.util.ArrayList;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
		System.out.println("***********************Analyse lexicale*************************");
		Scanner anaLex=new Scanner();
		ArrayList<UniteLexicale> ulx=anaLex.getAllLex();
		ulx.add(new UniteLexicale(Categorie.$,"$"));

		System.out.println("Les unités lexicaux:");
		for (UniteLexicale ul : ulx) {
			String cat = ul.getCategorie();
			String lexeme = ul.getLexeme();
			System.out.println("Catégorie: " + cat + ", Lexème: " + lexeme);
		}

		System.out.println("***********************Analyse syntaxique et sémantique*************************");
		parserIF3 test22 = new parserIF3();
		test22.analyzeSLnew(ulx);
    }
}

 