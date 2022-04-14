/**
 * Classe abstraite représentant une expression.
 * @author Samy ABDOUCHE
 * @author Maxime LOSSON
 */

public abstract class Expression {
	
	/**
	 * Méthode d'acceptation de visite d'un Visiteur passé en paramètre.
	 * @param v le Visiteur dont l'instance d'Expression accepte la visite
	 */
	public abstract void accept(Visitor v);
}
