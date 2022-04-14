/**
 * Classe encapsulant la notion de nombre. Elle hérite de la classe Expression.
 * @author Samy ABDOUCHE
 * @author Maxime LOSSON
 */

public class Num extends Expression{
	private double val;

	/**
	 * Constructeur de la classe
	 * @param val
	 */
	public Num(double val) {
		this.val = val;
	}

	/**
	 * Méthode d'accès à la valeur encapsulée au sein du Num.
	 * @return la valeur encapsulée au sein du num
	 */
	public double getVal() {
		return val;	
	}
	
	/**
	 * Méthode d'acceptation de visite d'une instance de Visiteur
	 * @param v l'instance de Visiteur dont l'instance de Num accepte la visite
	 */
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String toString(){
		return Double.toString(val);
	}
	
}
