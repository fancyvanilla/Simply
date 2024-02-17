package parserexemple.src;
import java.util.*;

public class parserIF3 {
public String[] LRGS = {"P->P S",
        "P->ε",
        "S->id = E ;",
   		"S->if ( C ) S else S",
   		"S->while ( C ) S",
   		"E->E + T",
        "E->T",
        "T->T * F",
        "T->F",
        "F->( E )",
        "F->id",
        "F->N",
        "N->N D",
        "N->D",
        "D->0",
        "D->1",
        "D->2",
        "D->3",
        "D->4",
        "D->5",
        "D->6",
        "D->7",
        "D->8",
        "D->9",
        "C->E R E",
        "R->==",
        "R->!=",
        "R-><",
        "R->>",
        "R-><=",
        "R->>=",
   		};
public String[][] tableSLR =
                {{"etat/VT", "id", "=", ";", "if", "(", ")","else","while","+","*","0","1","2","3","4","5","6","7","8","9","==","!=","<","<=",">",">=","$","P'","P","S","E","T","F","N","D","C","R"},
                {"0", "r2", "", "", "r2", "", "", "", "r2", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "r2", "", "1", "", "", "", "", "", "", "", ""},
                {"1", "s3", "", "", "s4", "", "", "", "s5", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "acc", "", "", "2", "", "", "", "", "", "", ""},
                {"2", "r1", "", "", "r1", "", "", "", "r1", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "r1", "", "", "", "", "", "", "", "", "", ""},
                {"3", "", "s6", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
                {"4", "", "", "", "", "s7", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
                {"5", "", "", "", "", "s8", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
                {"6", "s13", "", "", "", "s12", "", "", "", "", "", "s16", "s17", "s18", "s19", "s20", "s21", "s22", "s23", "s24", "s25", "", "", "", "", "", "", "", "", "", "", "9", "10", "11", "14", "15", "", ""},
                {"7", "s13", "", "", "", "s12", "", "", "", "", "", "s16", "s17", "s18", "s19", "s20", "s21", "s22", "s23", "s24", "s25", "", "", "", "", "", "", "", "", "", "", "27", "10", "11", "14", "15", "26", ""},
                {"8", "s13", "", "", "", "s12", "", "", "", "", "", "s16", "s17", "s18", "s19", "s20", "s21", "s22", "s23", "s24", "s25", "", "", "", "", "", "", "", "", "", "", "27", "10", "11", "14", "15", "28", ""},
                {"9", "", "", "s29", "", "", "", "", "", "s30", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
                {"10", "", "", "r7", "", "", "r7", "", "", "r7", "s31", "", "", "", "", "", "", "", "", "", "", "r7", "r7", "r7", "r7", "r7", "r7", "", "", "", "", "", "", "", "", "", "", ""},
                {"11", "", "", "r9", "", "", "r9", "", "", "r9", "r9", "", "", "", "", "", "", "", "", "", "", "r9", "r9", "r9", "r9", "r9", "r9", "", "", "", "", "", "", "", "", "", "", ""}, {"12", "s13", "", "", "", "s12", "", "", "", "", "", "s16", "s17", "s18", "s19", "s20", "s21", "s22", "s23", "s24", "s25", "", "", "", "", "", "", "", "", "", "", "32", "10", "11", "14", "15", "", ""}, {"13", "", "", "r11", "", "", "r11", "", "", "r11", "r11", "", "", "", "", "", "", "", "", "", "", "r11", "r11", "r11", "r11", "r11", "r11", "", "", "", "", "", "", "", "", "", "", ""}, {"14", "", "", "r12", "", "", "r12", "", "", "r12", "r12", "s16", "s17", "s18", "s19", "s20", "s21", "s22", "s23", "s24", "s25", "r12", "r12", "r12", "r12", "r12", "r12", "", "", "", "", "", "", "", "", "33", "", ""}, {"15", "", "", "r14", "", "", "r14", "", "", "r14", "r14", "r14", "r14", "r14", "r14", "r14", "r14", "r14", "r14", "r14", "r14", "r14", "r14", "r14", "r14", "r14", "r14", "", "", "", "", "", "", "", "", "", "", ""}, {"16", "", "", "r15", "", "", "r15", "", "", "r15", "r15", "r15", "r15", "r15", "r15", "r15", "r15", "r15", "r15", "r15", "r15", "r15", "r15", "r15", "r15", "r15", "r15", "", "", "", "", "", "", "", "", "", "", ""}, {"17", "", "", "r16", "", "", "r16", "", "", "r16", "r16", "r16", "r16", "r16", "r16", "r16", "r16", "r16", "r16", "r16", "r16", "r16", "r16", "r16", "r16", "r16", "r16", "", "", "", "", "", "", "", "", "", "", ""}, {"18", "", "", "r17", "", "", "r17", "", "", "r17", "r17", "r17", "r17", "r17", "r17", "r17", "r17", "r17", "r17", "r17", "r17", "r17", "r17", "r17", "r17", "r17", "r17", "", "", "", "", "", "", "", "", "", "", ""}, {"19", "", "", "r18", "", "", "r18", "", "", "r18", "r18", "r18", "r18", "r18", "r18", "r18", "r18", "r18", "r18", "r18", "r18", "r18", "r18", "r18", "r18", "r18", "r18", "", "", "", "", "", "", "", "", "", "", ""}, {"20", "", "", "r19", "", "", "r19", "", "", "r19", "r19", "r19", "r19", "r19", "r19", "r19", "r19", "r19", "r19", "r19", "r19", "r19", "r19", "r19", "r19", "r19", "r19", "", "", "", "", "", "", "", "", "", "", ""}, {"21", "", "", "r20", "", "", "r20", "", "", "r20", "r20", "r20", "r20", "r20", "r20", "r20", "r20", "r20", "r20", "r20", "r20", "r20", "r20", "r20", "r20", "r20", "r20", "", "", "", "", "", "", "", "", "", "", ""}, {"22", "", "", "r21", "", "", "r21", "", "", "r21", "r21", "r21", "r21", "r21", "r21", "r21", "r21", "r21", "r21", "r21", "r21", "r21", "r21", "r21", "r21", "r21", "r21", "", "", "", "", "", "", "", "", "", "", ""}, {"23", "", "", "r22", "", "", "r22", "", "", "r22", "r22", "r22", "r22", "r22", "r22", "r22", "r22", "r22", "r22", "r22", "r22", "r22", "r22", "r22", "r22", "r22", "r22", "", "", "", "", "", "", "", "", "", "", ""}, {"24", "", "", "r23", "", "", "r23", "", "", "r23", "r23", "r23", "r23", "r23", "r23", "r23", "r23", "r23", "r23", "r23", "r23", "r23", "r23", "r23", "r23", "r23", "r23", "", "", "", "", "", "", "", "", "", "", ""}, {"25", "", "", "r24", "", "", "r24", "", "", "r24", "r24", "r24", "r24", "r24", "r24", "r24", "r24", "r24", "r24", "r24", "r24", "r24", "r24", "r24", "r24", "r24", "r24", "", "", "", "", "", "", "", "", "", "", ""}, {"26", "", "", "", "", "", "s34", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}, {"27", "", "", "", "", "", "", "", "", "s30", "", "", "", "", "", "", "", "", "", "", "", "s36", "s37", "s38", "s39", "s40", "s41", "", "", "", "", "", "", "", "", "", "", "35"}, {"28", "", "", "", "", "", "s42", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}, {"29", "r3", "", "", "r3", "", "", "r3", "r3", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "r3", "", "", "", "", "", "", "", "", "", ""}, {"30", "s13", "", "", "", "s12", "", "", "", "", "", "s16", "s17", "s18", "s19", "s20", "s21", "s22", "s23", "s24", "s25", "", "", "", "", "", "", "", "", "", "", "", "43", "11", "14", "15", "", ""}, {"31", "s13", "", "", "", "s12", "", "", "", "", "", "s16", "s17", "s18", "s19", "s20", "s21", "s22", "s23", "s24", "s25", "", "", "", "", "", "", "", "", "", "", "", "", "44", "14", "15", "", ""}, {"32", "", "", "", "", "", "s45", "", "", "s30", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}, {"33", "", "", "r13", "", "", "r13", "", "", "r13", "r13", "r13", "r13", "r13", "r13", "r13", "r13", "r13", "r13", "r13", "r13", "r13", "r13", "r13", "r13", "r13", "r13", "", "", "", "", "", "", "", "", "", "", ""}, {"34", "s3", "", "", "s4", "", "", "", "s5", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "46", "", "", "", "", "", "", ""}, {"35", "s13", "", "", "", "s12", "", "", "", "", "", "s16", "s17", "s18", "s19", "s20", "s21", "s22", "s23", "s24", "s25", "", "", "", "", "", "", "", "", "", "", "47", "10", "11", "14", "15", "", ""}, {"36", "r26", "", "", "", "r26", "", "", "", "", "", "r26", "r26", "r26", "r26", "r26", "r26", "r26", "r26", "r26", "r26", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}, {"37", "r27", "", "", "", "r27", "", "", "", "", "", "r27", "r27", "r27", "r27", "r27", "r27", "r27", "r27", "r27", "r27", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}, {"38", "r28", "", "", "", "r28", "", "", "", "", "", "r28", "r28", "r28", "r28", "r28", "r28", "r28", "r28", "r28", "r28", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}, {"39", "r29", "", "", "", "r29", "", "", "", "", "", "r29", "r29", "r29", "r29", "r29", "r29", "r29", "r29", "r29", "r29", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}, {"40", "r30", "", "", "", "r30", "", "", "", "", "", "r30", "r30", "r30", "r30", "r30", "r30", "r30", "r30", "r30", "r30", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}, {"41", "r31", "", "", "", "r31", "", "", "", "", "", "r31", "r31", "r31", "r31", "r31", "r31", "r31", "r31", "r31", "r31", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}, {"42", "s3", "", "", "s4", "", "", "", "s5", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "48", "", "", "", "", "", "", ""}, {"43", "", "", "r6", "", "", "r6", "", "", "r6", "s31", "", "", "", "", "", "", "", "", "", "", "r6", "r6", "r6", "r6", "r6", "r6", "", "", "", "", "", "", "", "", "", "", ""}, {"44", "", "", "r8", "", "", "r8", "", "", "r8", "r8", "", "", "", "", "", "", "", "", "", "", "r8", "r8", "r8", "r8", "r8", "r8", "", "", "", "", "", "", "", "", "", "", ""}, {"45", "", "", "r10", "", "", "r10", "", "", "r10", "r10", "", "", "", "", "", "", "", "", "", "", "r10", "r10", "r10", "r10", "r10", "r10", "", "", "", "", "", "", "", "", "", "", ""}, {"46", "", "", "", "", "", "", "s49", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}, {"47", "", "", "", "", "", "r25", "", "", "s30", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}, {"48", "r5", "", "", "r5", "", "", "r5", "r5", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "r5", "", "", "", "", "", "", "", "", "", ""}, {"49", "s3", "", "", "s4", "", "", "", "s5", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "50", "", "", "", "", "", "", ""}, {"50", "r4", "", "", "r4", "", "", "r4", "r4", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "r4", "", "", "", "", "", "", "", "", "", ""}};
    public Stack<String> stackState = new Stack<>();
    public Stack<String> analyse = new Stack<>();
    
    public Stack<String> stackSymbol = new Stack<>();
    String ch[]= {"a", "b", "b", "a","$"};
    public String strInput ;
    
   
    public String action = "";

    int index = 0;
    Map<String, Integer> columnIndexMap;
   
    public void analyzeSLnew() {
    	
        action = "";
        index = 0;
       
        analyse.push("0");
        
       
        System.out.println("********pile     Entrée   Action			   ");
        this.AfficherSLR();
    
       while(index<ch.length) 
        
        {
              
            String s = analyse.peek();
            
            String act=Action(s,ch[index]);
          
            if (Action(s,ch[index]).charAt(0) == 'r') {
                   	
                           
                analyse.push(ch[index]);
                analyse.push(Action(s, ch[index]).substring(1));
               
                              
              
                index++;
                action = "shift";
                
                AfficherSLR();
            }
            // Réduction
            else if (Action(s,ch[index]).charAt(0) == 's') {
                //
                String str = LRGS[Integer.parseInt(Action(s, ch[index]).substring(1))-1];

                String tabparties[]= str.split("->");
                
                
                String Partiegauche=tabparties[0];
               // System.out.println("Partiegauche"+Partiegauche); 
                
                String Partiedroite=tabparties[1];
                //System.out.println("Partiedroite"+Partiedroite);

                String tabtoken[]= Partiedroite.split(" ");
                int taillepile= tabtoken.length +tabtoken.length;

                for (int i = 0; i < taillepile; i++) {
                    analyse.pop();
                }
                String sommetpile = analyse.peek();
                analyse.push(Partiegauche);
                //String tetesucc = analyse.peek();
                
                analyse.push(Action(sommetpile, Partiegauche));
                
               
                action = "reduce:" + str;
                AfficherSLR();
            } 
            //acceptation
            else if (Objects.equals(Action(s, ch[index]), "ACC"))
            	{
            	System.out.println("analyze SLR successfully"); 
            	break;}
            	
            else
            	//erreur
            	{
            	
            	//System.out.println("texterreur"+Action(s,ch[index])+s+ch[index]+index); 
            	System.out.println("analyze SLR failled"); 
        	break;
            	}
               
        }
        
    }
    public void analyzeSLnew(String []tt) {

        String[] header = {"id", "=", ";", "if", "(", ")", "else", "while", "+", "*", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "==", "!=", "<", "<=", ">", ">=", "$", "P'", "P", "S", "E", "T", "F", "N", "D", "C", "R"};

        columnIndexMap = new HashMap<>();

        for (int i = 0; i < header.length; i++) {
            columnIndexMap.put(header[i], i+1);
        }

        index = 0;
        analyse.push("0");
        System.out.println("********pile     	    Entrée            Action***********");
        this.AfficherSLRnew(tt,"");
    
       while(index<tt.length) 
        
        {
          //  String s = stackState.peek();
            
            String s = analyse.peek();
            
            String act=Action(s,tt[index]);
          
            if (act.charAt(0) == 's') {

                //stackState.push(Action(s, ch[index]).substring(1));
                //stackSymbol.push(ch[index]);
                
                analyse.push(tt[index]);
                analyse.push(Action(s, tt[index]).substring(1));
                index++;
                AfficherSLRnew(tt,"shift ");
            }
            // Réduction
            else if (act.charAt(0) == 'r') {
                String str = LRGS[Integer.parseInt(Action(s, tt[index]).substring(1))-1];

                String tabparties[]= str.split("->");
                
                
                String Partiegauche=tabparties[0];
               // System.out.println("Partiegauche"+Partiegauche); 
                
                String Partiedroite=tabparties[1];
                //System.out.println("Partiedroite"+Partiedroite);
                if (!Partiedroite.equals("ε")) {

                    String tabtoken[] = Partiedroite.split(" ");
                    System.out.println(Partiedroite);
                    int taillepile = tabtoken.length + tabtoken.length;
                    for (int i = 0; i < taillepile; i++) {
                        analyse.pop();
                    }
                }
                String sommetpile = analyse.peek();
                analyse.push(Partiegauche);
                analyse.push(Action(sommetpile, Partiegauche));
                AfficherSLRnew(tt,"reduce:" + str);
            } 
            //acceptation
            else if (Objects.equals(act, "acc"))
            	{
            	System.out.println("analyze SLR successfully"); 
            	break;}
            	
            else
            	//erreur
            	{
            	
            	//System.out.println("texterreur"+Action(s,ch[index])+s+ch[index]+index); 
            	System.out.println("analyze SLR failled"); 
        	break;
            	}
               
        }
        
    }

    public String Action(String s, String a) {
        if (columnIndexMap.get(a) != null) {
            String action = tableSLR[Integer.parseInt(s) + 1][columnIndexMap.get(a)];
            if (action.isEmpty()) return "err";
            return action;
        }
        return "err";
    }
    public void AfficherSLR() {
        //  SLR
    	StringBuilder ss= new StringBuilder("-------");
    	StringBuilder ss1= new StringBuilder("-------");
    	 int taillepile=analyse.size();
    	int taillepilediv2= taillepile /2;
        ss.append("-------".repeat(taillepilediv2));
         int tailleinput=ch.length;
        ss1.append("-------".repeat(tailleinput));

        strInput="";
        for(int i=index; i<ch.length;i++)
        	strInput= strInput+ ch[i];
       
        System.out.printf("%s", analyse + ss1.toString());
        System.out.printf("%s", strInput+ ss);
        System.out.printf("%s", action);
        System.out.println();
    }

    public void AfficherSLRnew(String []tt,String action) {
        //  SLR
    	StringBuilder ss= new StringBuilder("-------");
    	StringBuilder ss1= new StringBuilder("-------");
        ss.append("-------".repeat(analyse.size() / 2));
        ss1.append("-------".repeat(tt.length));
        StringBuilder strInput= new StringBuilder();
        for(int i=index; i<tt.length;i++)
        	strInput.append(tt[i]);
       
        System.out.printf("%s", analyse + ss1.toString());
        System.out.printf("%s", strInput);
        System.out.printf("%s", action);
        System.out.println();
    }

    public void output() {

        System.out.println("**********Tableau SLR¨********");

        for (int i = 0; i < 11 ; i++) {
            for (int j = 0; j <7; j++) {
                System.out.printf("%6s", tableSLR[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("**********Fin tableau SLR********");
    }

}




