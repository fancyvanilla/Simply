package parserexemple.src;

import java.util.*;

public class SemanticAnalyzer {
    // Déclaration d'une table des symboles pour stocker les types des variables
    private static Map<String, String> symbolTable;

    // Constructeur
    public SemanticAnalyzer() {
        symbolTable = new HashMap<>();
    }

    // Méthode pour effectuer l'analyse sémantique
    public void analyze(String[] tokens) {
        try {
            for (String token : tokens) {
                if (isVariableDeclaration(token)) {
                    processVariableDeclaration(token);
                } else if (isAssignment(token)) {
                    processAssignment(token);
                } else if (isIfStatement(token)) {
                    processIfStatement(token);
                } else if (isWhileLoop(token)) {
                    processWhileLoop(token);
                } else {
                    throw new Exception("Erreur : Expression non reconnue.");
                }
            }
            System.out.println("Analyse sémantique terminée avec succès.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void processVariableDeclaration(String token) throws Exception {
        String[] parts = token.split("=");
        String variableName = parts[0].trim();
        String variableType = parts[1].trim();
        symbolTable.put(variableName, variableType);
    }

    private void processAssignment(String token) throws Exception {
        String[] parts = token.split("=");
        String variableName = parts[0].trim();
        String expression = parts[1].trim();
        if (!symbolTable.containsKey(variableName)) {
            throw new Exception("Erreur : Variable '" + variableName + "' non déclarée.");
        }
        String expectedType = symbolTable.get(variableName);
        String actualType = getTypeOfExpression(expression);
        if (!expectedType.equals(actualType)) {
            throw new Exception("Erreur : Type mismatch pour la variable '" + variableName + "'. Attendu : "
                    + expectedType + ", trouvé : " + actualType);
        }
    }

    private void processIfStatement(String token) {
        // Vous pouvez ajouter une logique spécifique pour traiter les instructions if
        // ici
        // Par exemple, vérifier la validité de la condition, puis analyser le corps du
        // if
        // et le corps du else en conséquence.
    }

    private void processWhileLoop(String token) {
        // Vous pouvez ajouter une logique spécifique pour traiter les boucles while ici
        // Par exemple, vérifier la validité de la condition, puis analyser le corps de
        // la boucle.
    }

    // Méthode pour trouver l'index de la fermeture du bracket correspondant
    private int findMatchingClosingBracket(String[] tokens, int startIndex) {
        int count = 0;
        for (int i = startIndex + 1; i < tokens.length; i++) {
            if (tokens[i].equals("{")) {
                count++;
            } else if (tokens[i].equals("}")) {
                if (count == 0) {
                    return i;
                } else {
                    count--;
                }
            }
        }
        return -1; // Aucun bracket de fermeture correspondant trouvé
    }

    // Méthode pour vérifier si le token est une déclaration de variable
    private boolean isVariableDeclaration(String token) {
        return token.contains("=") && !token.startsWith("if") && !token.startsWith("while");
    }

    // Méthode pour vérifier si le token est une affectation
    private boolean isAssignment(String token) {
        return token.contains("=") && !isVariableDeclaration(token);
    }

    // Méthode pour vérifier si le token est une instruction if
    private boolean isIfStatement(String token) {
        return token.startsWith("if");
    }

    // Méthode pour vérifier si le token est une boucle while
    private boolean isWhileLoop(String token) {
        return token.startsWith("while");
    }

    // Méthode pour obtenir le type d'une expression
    private String getTypeOfExpression(String expression) {
        // Supprimer les espaces inutiles
        expression = expression.trim();

        // Vérifier si l'expression contient une opération arithmétique
        if (expression.contains("+") || expression.contains("-") || expression.contains("*")
                || expression.contains("/")) {
            // Si oui, retourner le type "int" ou "double" selon le type de l'opérande
            if (expression.contains(".")) {
                return "double";
            } else {
                return "int";
            }
        }

        // Si l'expression est un nombre entier, retourner le type "int"
        try {
            Integer.parseInt(expression);
            return "int";
        } catch (NumberFormatException e) {
            // Si l'expression ne peut pas être convertie en entier, cela signifie qu'elle
            // n'est pas valide
            // Vérifier si l'expression est un nombre à virgule flottante
            try {
                Double.parseDouble(expression);
                return "double";
            } catch (NumberFormatException ex) {
                // Si l'expression ne peut pas être convertie en double, cela signifie qu'elle
                // n'est pas valide
                // Pour une implémentation plus avancée, vous pouvez ajouter la prise en charge
                // d'autres types d'expressions ici
                // Par exemple, la gestion des chaînes de caractères, des opérations logiques,
                // etc.
                return "unknown";
            }
        }
    }

    // Méthode pour tester l'analyseur sémantique

    public static void main(String[] args) {
        String[] tokens = {
                "int y = 10;",
                "x = y + 5;",
        };
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.analyze(tokens);
    }
}
