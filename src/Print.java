/**
 * Cette classe va représenter une expression précise : l'instruction Print.
 * Une instance de la classe Print va encapsuler une Expression, qui sera évaluée, et dont le résultat
 * de ladite évaluation sera affichée par la suite.
 * 
 * @author Samy ABDOUCHE
 * @author Maxime LOSSON 
 */

public class Print extends Expression {

    private Expression exp;

    /**
     * Constructeur de la classe Print
     * @param e l'expression qui sera print
     */
    public Print(Expression e){
        exp = e;
    }

    /**
     * Méthode d'accès de l'expression contenue au sein de l'instance de Print
     * @return l'expression contenue au sein de l'instance de Print
     */
    public Expression getExpression(){
        return exp;
    }

    /**
     * Méthode d'acceptation d'une visite de l'expression Print.
     * @param v le visiteur qui visitera l'expression
     */
    @Override
    public void accept(Visitor v){
        v.visit(this);
    }
    
}
