/**
 * Cette classe représente les opérations binaires dans leur globalité.
 * @author Samy ABDOUCHE
 * @author Maxime LOSSON
 */

public class Binop extends Expression{
	private Expression lhs;
	private Expression rhs;
	private String op;
	
	/**
	 * Crée une opération binaire avec les arguments spécifiés.
	 * @param lhs l'opérande de gauche
	 * @param rhs l'opérande de droite
	 * @param op l'opérateur
	 */
	public Binop(Expression lhs, Expression rhs, String op) {
		this.lhs = lhs;
		this.rhs = rhs;
		this.op = op;
	}

	/** Méthode de récupération de l'opérande gauche d'une instance de Binop.
	 * 
	 * @return une Expression dénotant l'opérande de gauche d'une instance de Binop
	 */
	public Expression getLhs() {
		return lhs;
	}

	/**
	 * 
	 * @return une Expression représentant l'opérande de droite
	 */
	public Expression getRhs() {
		return rhs;
	}

	/** 
	 * 
	 * @return une String représentant l'opérateur de la Binop
	 */
	public String getOp() {
		return op;
	}

	/**
	 * Méthode d'acceptation d'un visiteur, cette dernière déclenche la visite de la Binop.
	 */
	@Override
	public void accept(Visitor v) {
		v.visit(this);	
	}
	/**
	 * Retourne une représentation textuelle d'une Binop.
	 * 
	 * @return une représentation textuelle d'une Binop
	 */
	@Override
	public String toString(){
		String s = lhs+op+rhs;
		return s;
	}
	
	
	
}
