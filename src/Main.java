package parserexemple.src;

import java.util.ArrayList;
//import parserIF3
//import TPIF3PARSER.anallex;

public class Main {
    public static void main(String[] args) {
		System.out.println("***********************Analyse lexical*************************");
		Scanner anaLex=new Scanner();
		ArrayList<UniteLexicale> ulx=anaLex.getAllLex();
		ArrayList<String> tab= new ArrayList<>();
		for (UniteLexicale  ul:ulx)
		{
			if (ul.getCategorie().toString().equals("id"))  tab.add("id");
			else tab.add(ul.getLexeme().toString());
		}
        tab.add("$");
		System.out.println("Les unités lexicaux:");
		System.out.println(tab);
    	  System.out.println("***********************Analyse Syntaxique*************************");
		parserIF3 test22 = new parserIF3();
        test22.analyzeSLnew(tab.toArray(new String[0]));
    }
}

