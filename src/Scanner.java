package parserexemple.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Scanner {
    public ArrayList<Character> fluxCaracteres;
    private int indiceCourant;
    private char caractereCourant;
    private boolean eof;

    public Scanner() {
        this("");
    }
    public Scanner(String nomFich) {
        BufferedReader f;
        BufferedReader reader;
        int car = 0;
        fluxCaracteres = new ArrayList<>();
        indiceCourant = 0;
        eof = false;
        try {
            f = new BufferedReader(new FileReader(nomFich));
            int charRead;
            while ((charRead = f.read()) != -1) {
                char character = (char) charRead;
                fluxCaracteres.add(character);
            }
            f.close();
            caractereCourant=fluxCaracteres.getFirst();
        } catch (IOException e) {
            try {
                System.out.println("taper votre texte ci-dessous (taper espace pour finir)");
                reader = new BufferedReader(new InputStreamReader(System.in));
                int bytes;
                while ((bytes = reader.read()) != -1) {
                    if ((char) bytes == '\n') {
                        break;
                    }
                    fluxCaracteres.add((char) bytes);
                }
                reader.close();
                caractereCourant=fluxCaracteres.getFirst();
            } catch (IOException err) {
                err.printStackTrace();
            }
        }
    }
    public void caractereSuivant() {
        if(indiceCourant<fluxCaracteres.size()-1) {
            indiceCourant++;
            caractereCourant = fluxCaracteres.get(indiceCourant);
        }
        else
            eof=true;
    }

    public void reculer() {
        if(indiceCourant>0)
        {
            indiceCourant--;
            caractereCourant=fluxCaracteres.get(indiceCourant);
        }
    }

   public UniteLexicale lexeme() {
       while (eof || Character.isWhitespace(caractereCourant)) {
           if (eof)
               return new UniteLexicale(Categorie.EOF, "0");
           caractereSuivant();
       }
       if (fluxCaracteres.size() - indiceCourant>= 2 ) {
           String result = String.valueOf(fluxCaracteres.get(indiceCourant)) + fluxCaracteres.get(indiceCourant + 1);
           if (result.equals("if")) {
               if (indiceCourant + 2 >= fluxCaracteres.size() - 1 || !Character.isLetter(fluxCaracteres.get(indiceCourant + 2))) {
                   caractereSuivant();
                   return new UniteLexicale(Categorie.IF, "if");
               }
           }
       }
       if (fluxCaracteres.size() - indiceCourant>= 5 ) {
           String result = joinChars(fluxCaracteres.subList(indiceCourant,indiceCourant+5));
           if (result.equals("while")) {
               if (indiceCourant + 5 >= fluxCaracteres.size() - 1 || !Character.isLetter(fluxCaracteres.get(indiceCourant + 5))) {
                   caractereSuivant();
                   caractereSuivant();
                   caractereSuivant();
                   caractereSuivant();
                   return new UniteLexicale(Categorie.WHILE, "while");
               }
           }
       }
       if (fluxCaracteres.size() - indiceCourant>= 4 ) {
           String result = joinChars(fluxCaracteres.subList(indiceCourant,indiceCourant+4));
           if (result.equals("else")) {
               if (indiceCourant + 4 >= fluxCaracteres.size() - 1 || !Character.isLetter(fluxCaracteres.get(indiceCourant + 4))) {
                   caractereSuivant();
                   caractereSuivant();
                   caractereSuivant();
                   return new UniteLexicale(Categorie.ELSE, "else");
               }
           }
       }
       if (caractereCourant =='(') return new UniteLexicale(Categorie.OP, "(");
       if (caractereCourant ==')') return new UniteLexicale(Categorie.CP, ")");
       if (caractereCourant =='+') return new UniteLexicale(Categorie.OPPAff, "+");
       if (caractereCourant =='*') return new UniteLexicale(Categorie.OPPAff, "*");


       if(Character.isLetter(caractereCourant)) {
            return getID();
        }
		
		if(Character.isDigit(caractereCourant))
			return getNombre();
		
		if(caractereCourant==';')
			return new UniteLexicale(Categorie.PV, ";");
               
		if(caractereCourant=='<' || caractereCourant=='>' ||caractereCourant=='=')
			return getOPPRel();
		return null;
	}



	public UniteLexicale getID() {
        int etat=0;
		StringBuffer sb=new StringBuffer();
		while(true) {
			switch(etat) {
				case 0 : etat=1; 
						 sb.append(caractereCourant);
						 break;
				case 1 : caractereSuivant();
						 if(eof)
							 etat=3;
						 else
							 if(Character.isLetterOrDigit(caractereCourant)) {
                                 sb.append(caractereCourant);
                             }
							 else
								 etat=2;
						 break;
				case 2 : //System.out.println(indiceCourant);
                         reculer();
                         //System.out.println(caractereCourant);
						 return new UniteLexicale(Categorie.ID, sb.toString());
				case 3 : return new UniteLexicale(Categorie.ID, sb.toString());

			}
		}
	}
	
	public UniteLexicale getNombre() {
		int etat=0;
		StringBuffer sb=new StringBuffer();
		while(true) {
			switch(etat) {
			case 0 : etat=1; 
					 sb.append(caractereCourant); 
					 break;
			case 1 : caractereSuivant();
					 if(eof)
						 etat=3;
					 else
						 if(Character.isDigit(caractereCourant)) 
							 sb.append(caractereCourant);
						 else
							 etat=2;
					 break;
			case 2 : reculer();
					 return new UniteLexicale(Categorie.NOMBRE, sb.toString());
			case 3 : return new UniteLexicale(Categorie.NOMBRE, sb.toString());
			}
		}
		
	}
public UniteLexicale getOPPRel() {
        int etat = 0;
        StringBuffer sb = new StringBuffer();
        while (true) {
            switch (etat) {
                case 0:
                    if (caractereCourant == '=') {
                        sb.append(caractereCourant);
                        caractereSuivant();
                         etat = 1;
                          } else if (caractereCourant == '>') {
                               sb.append(caractereCourant);
                               caractereSuivant();
                               etat = 3;
                           }
                          else if (caractereCourant == '<') {
                               sb.append(caractereCourant);
                               caractereSuivant();
                               etat = 6;
                           }
                          else if (caractereCourant == '!'){
                               sb.append(caractereCourant);
                               caractereSuivant();
                               etat = 9;
                    }
                        break;
                case 1:
                    if (!eof && caractereCourant == '=') {
                        sb.append(caractereCourant);
                        caractereSuivant();
                        etat=2;
                    }
                    else {
                        if (eof) return new UniteLexicale(Categorie.AFFECT, "=");
                        reculer();
                        return new UniteLexicale(Categorie.AFFECT, "=");
                    }
                    break;
                case 2:
                    if (eof)
                        return new UniteLexicale(Categorie.OPPRel, "==");
                    reculer();
                    return new UniteLexicale(Categorie.OPPRel, "==");

                case 3:
                    if (caractereCourant == '=') {
                        sb.append(caractereCourant);
                        caractereSuivant();
                        etat = 4;
                    }
                    else {
                        etat=5;
                    }
                    break;
                  case 6:
                      if (caractereCourant == '=') {
                          sb.append(caractereCourant);
                          caractereSuivant();
                          etat = 7;
                      }
                      else {
                          etat=8;
                      }
                      break;
                case 9:
                    if (caractereCourant == '=') {
                        sb.append(caractereCourant);
                        caractereSuivant();
                        etat = 10;
                    }
                    break;
                 case 4:
                    if (eof)
                        return new UniteLexicale(Categorie.OPPRel, ">=");

                    reculer();
                    return new UniteLexicale(Categorie.OPPRel, ">=");
               case 5:
                    if (eof)
                        return new UniteLexicale(Categorie.OPPRel, ">");
                    reculer();
                    return new UniteLexicale(Categorie.OPPRel, ">");

                case 7:
                    if (eof)
                        return new UniteLexicale(Categorie.OPPRel, "<=");
                    reculer();
                    return new UniteLexicale(Categorie.OPPRel, "<=");

                 case 8:
                    if (eof)
                        return new UniteLexicale(Categorie.OPPRel, "<");
                    reculer();
                    return new UniteLexicale(Categorie.OPPRel, "<");
                case 10:
                    if (eof)
                        return new UniteLexicale(Categorie.OPPRel, "!=");
                    reculer();
                    return new UniteLexicale(Categorie.OPPRel, "!=");

            }

        }
}

public ArrayList<UniteLexicale> getAllLex()
{
    ArrayList<UniteLexicale> result= new ArrayList<UniteLexicale>();
    while (!eof)
    {
        UniteLexicale uni=lexeme();
        result.add(uni);
        caractereSuivant();
    }
    return result;
}
    public static String joinChars(List<Character> charList) {
        StringBuilder result = new StringBuilder(charList.size());

        for (Character character : charList) {
            result.append(character);
        }

        return result.toString();
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return fluxCaracteres.toString();
	}

     }

