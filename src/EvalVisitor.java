/**
 * Classe représentant un visiteur qui se chargera de visiter (et donc d'évauluer) les expressions qu'une instance
 * de cette dernière visitera. Elle contient toute la logique métier de nos expressions. Une instance d'EvalVisitor
 * contient deux paramètres lui permettant de stocker le résultat de la visite d'une expression : un double pour les 
 * expressions arithmétiques, ainsi qu'une String pour les chaînes de caractères.
 * 
 * @author Samy ABDOUCHE
 * @author Maxime LOSSON
 */

public class EvalVisitor implements Visitor{
	
	private double doubleResult;
	private String stringResult;
	/**
	 * Méthode d'accès au résultat de la dernière visite d'une expression non-textuelle.
	 * @return le résultat de la dernière visite d'une expression non-textuelle.
	 */
	public double getDoubleResult() {
		return doubleResult;
	}

	/**
	 * Méthode de visite d'un Num
	 * @param num 
	 */
	@Override
	public void visit(Num num) {
		doubleResult = num.getVal();
	}
	
	/**
	 * Méthode de visite d'une chaîne de caractères.
	 * @param s la chaîne de caractères à visiter.
	 */
	@Override
	public void visit(StringExpression s) {
		stringResult = s.toString();
	}


	/**
	 * Méthode de visite d'une Binop
	 * @param b la Binop à visiter
	 */
	@Override
	public void visit(Binop b) {

		b.getLhs().accept(this);
		String lhss = stringResult;
		double lhs = doubleResult;

		b.getRhs().accept(this);
		String rhss = stringResult;
		double rhs = doubleResult;
		
		String op = b.getOp();
		
		switch(op) {
			case "+":
				doubleResult = rhs+lhs;
				stringResult = lhss+rhss;
				break;
			case "-":
				doubleResult = lhs-rhs;
				break;
			case "*":
				doubleResult = rhs*lhs;
				break;
			case "/":
				doubleResult = lhs/rhs;
				break;
			case "<":
				doubleResult = rhs<lhs?0.0:1.0;
				break;
			case ">":
				doubleResult = rhs>lhs?0.0:1.0;
				break;
			case "<>":
				doubleResult = rhs!=lhs?0.0:1.0;
				break;
			case "<=":
				doubleResult = rhs<=lhs?0.0:1.0;
				break;
			case ">=":
				doubleResult = rhs>=lhs?0.0:1.0;
				break;
			default:
				//erreur
			}
	}

	
	/**
	 * Méthode de visite d'une instance de Print.
	 * @param p l'instance de Print à visiter.
	 */
	@Override
	public void visit(Print p){
		p.getExpression().accept(this);
	}

	/**
	 * Méthode de visite d'une instance de If.
	 * @param i l'instance de If à visiter.
	 */
	@Override
	public void visit(If i){

		//evaluating condition
		i.getCondition().accept(this);

		//if condition is equal to true (superior to 1.0, in our case)
		if (this.getDoubleResult() > 0){
			i.getThenStatement().accept(this);
		}
		else if (i.getElseStatement()!= null){
			i.getElseStatement().accept(this);
		}
	}
}
