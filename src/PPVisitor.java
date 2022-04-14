/**
 * Cette classe représente un Visiteur à la fonction de pretty-printer : il nous permettra
 * de nous assurer que les étapes de parsing et de scanning sont correctes.
 * @author Samy ABDOUCHE
 * @author Maxime LOSSON	
 */

public class PPVisitor implements Visitor{

	/**
	 * Méthode de visite du PPVisitor d'une instance de Num.
	 * @param num l'instance de Num à pretty-print.
	 */
	@Override
	public void visit(Num num) {
		System.out.print(Double.toString(num.getVal()));
		
	}

	/**
	 * Méthode de visite du PPVisitor d'une instance de Binop.
	 * @param b l'instance de Binop à pretty-print.
	 */
	@Override
	public void visit(Binop b) {
		b.getLhs().accept(this);
		System.out.print(b.getOp());
		b.getRhs().accept(this);
		System.out.print("\n");
		
	}
	
	/**
	 * Méthode de visite du PPVisitor d'une instance de StringExpression.
	 * @param s l'instance de StringExpression à pretty-print.
	 */
	@Override
	public void visit(StringExpression s) {
		System.out.println(s.toString());
	}

	/**
	 * Méthode de visite d'une instance de Print.
	 * @param p l'instance de Print à pretty-print.
	 */
	@Override
	public void visit(Print p){
		System.out.println("print(" + p.getExpression().toString() + ")");
	}

	/**
	 * Méthode de visite d'une instance de If.
	 * @param i l'instance de If à pretty-print.
	 */
	@Override
	public void visit(If i){
		System.out.print("if ");
		i.getCondition().accept(this);
		System.out.print(" then ");
		i.getThenStatement().accept(this);

		if (i.getElseStatement() != null){
			System.out.print(" else ");
			i.getElseStatement().accept(this);
		}
	}
}
