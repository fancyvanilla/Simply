package parserexemple.src;

import java.util.ArrayList;
//import parserIF3
//import TPIF3PARSER.anallex;

public class Main {
    public static void main(String[] args) {
		System.out.println("***********************Analyse lexical*************************");
		Scanner anaLex=new Scanner();
		ArrayList<UniteLexicale> ulx=anaLex.getAllLex();
		ulx.add(new UniteLexicale(Categorie.$,"$"));
		/**ArrayList<String> tab= new ArrayList<>();
		for (UniteLexicale  ul:ulx)
		{
			if (ul.getCategorie().equals("id"))  tab.add("id");
			else tab.add(ul.getLexeme());
		}
        tab.add("$");**/
		System.out.println("Les unités lexicaux:");
		System.out.println(ulx);
    	  System.out.println("***********************Analyse Syntaxique*************************");
		parserIF3 test22 = new parserIF3();
        System.out.println(test22.analyzeSLnew(ulx));
    }
}

 