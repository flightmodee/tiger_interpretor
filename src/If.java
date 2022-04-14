/**
 * Classe représentant la structure de contrôle if. Une grammaire informelle associée à celle-ci serait la suivante :
 * if (condition) then (statement1) (else statement2)?
 * Ainsi, une instance d'If possède trois attributs Expression : la condition à évaluer, l'expression à évaluer en cas de condition évaluée à vraie, et celle en cas de condition évaluée à faux.
 * @author Samy ABDOUCHE
 * @author Maxime LOSSON
 */

public class If extends Expression {
    private Expression condition;
    private Expression thenStatement;
    private Expression elseStatement;


    /**
     * Constructeur de la classe If.
     * @param condition la condition à évaluer d'une instance de If
     * @param thenStatement l'expression à évaluer, en cas de condition évaluée à true
     * @param elseStatement l'expression à évaluer, en cas de condition évaluée à false
     */
    public If(Expression condition, Expression thenStatement, Expression elseStatement){
        this.condition = condition;
        this.thenStatement = thenStatement;
        this.elseStatement = elseStatement;
    }

    /**
     * Méthode d'accès à la condition d'une instance de If.
     * @return la condition d'une instance de If.
     */
    public Expression getCondition(){
        return this.condition;
    }

    /**
     * Méthode d'accès à l'expression à évaluer, en cas de condition vérifiée
     * @return l'expression à évaluer, en cas de condition évaluée à true
     */
    public Expression getThenStatement(){
        return this.thenStatement;
    }

     /**
     * Méthode d'accès à l'expression à évaluer, en cas de condition évaluée à false
     * @return l'expression à évaluer, en cas de condition évaluée à true
     */
    public Expression getElseStatement(){
        return this.elseStatement;
    }


    /**
     * 
     * @return true si l'instance de If possède bien une clause else
     */
    public boolean hasElse(){
        if (elseStatement != null)
            return true;

        return false;
    }


    /**
     * Méthode d'acceptation de la visite d'un Visiteur passé en argument.
     * @param v le Visiteur dont l'instance de If accepte la visite.
     */
    @Override
    public void accept(Visitor v){
        v.visit(this);
    }
}
