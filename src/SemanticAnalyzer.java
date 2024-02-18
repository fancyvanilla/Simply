import java.util.*;

public class SemanticAnalyzer {
    // Déclaration d'une table des symboles pour stocker les types des variables
    private Map<String, String> symbolTable;

    // Constructeur
    public SemanticAnalyzer() {
        symbolTable = new HashMap<>();
    }

    // Méthode pour effectuer l'analyse sémantique
    public void analyze(String[] tokens) {
        // Parcourir les tokens
        for (String token : tokens) {
            // Vérifier le type de token
            if (isVariableDeclaration(token)) {
                // Si c'est une déclaration de variable, ajouter la variable à la table des
                // symboles avec son type
                String[] parts = token.split("=");
                String variableName = parts[0].trim();
                String variableType = parts[1].trim();
                symbolTable.put(variableName, variableType);
            } else if (isAssignment(token)) {
                // Si c'est une affectation, vérifier que la variable existe dans la table des
                // symboles et que les types correspondent
                String[] parts = token.split("=");
                String variableName = parts[0].trim();
                String expression = parts[1].trim();
                if (!symbolTable.containsKey(variableName)) {
                    System.out.println("Erreur : Variable '" + variableName + "' non déclarée.");
                    return;
                }
                String expectedType = symbolTable.get(variableName);
                String actualType = getTypeOfExpression(expression);
                if (!expectedType.equals(actualType)) {
                    System.out.println("Erreur : Type mismatch pour la variable '" + variableName + "'. Attendu : "
                            + expectedType + ", trouvé : " + actualType);
                    return;
                }
            }
            // Ajoutez d'autres cas selon les besoins, par exemple, pour la vérification des
            // expressions arithmétiques, etc.
        }
        System.out.println("Analyse sémantique terminée avec succès.");
    }

    // Méthode pour vérifier si le token est une déclaration de variable
    private boolean isVariableDeclaration(String token) {
        return token.contains("=");
    }

    // Méthode pour vérifier si le token est une affectation
    private boolean isAssignment(String token) {
        return token.contains("=");
    }

    // Méthode pour obtenir le type d'une expression
    private String getTypeOfExpression(String expression) {
        // Supprimer les espaces inutiles
        expression = expression.trim();

        // Vérifier si l'expression contient une opération arithmétique
        if (expression.contains("+") || expression.contains("-") || expression.contains("*")
                || expression.contains("/")) {
            // Si oui, retourner le type "int"
            return "int";
        }

        // Si l'expression est un nombre entier, retourner le type "int"
        try {
            Integer.parseInt(expression);
            return "int";
        } catch (NumberFormatException e) {
            // Si l'expression ne peut pas être convertie en entier, cela signifie qu'elle
            // n'est pas valide
            // Pour une implémentation plus avancée, vous pouvez ajouter la prise en charge
            // d'autres types d'expressions ici
            // Par exemple, la gestion des expressions flottantes, des chaînes de
            // caractères, des opérations logiques, etc.
            return "unknown";
        }
    }

    // Méthode pour tester l'analyseur sémantique
    public static void main(String[] args) {
        String[] tokens = {
                "int x = 5;",
                "int y = 10;",
                "x = y + 5;",
                "x = y * 2.5;" // Ceci générera une erreur de type car l'expression est de type double
        };
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.analyze(tokens);
    }
}
