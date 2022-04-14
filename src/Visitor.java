
public interface Visitor {
	public void visit(Num num);
	public void visit(Binop b);
	public void visit(StringExpression s);
	public void visit(If ifs);
	public void visit(Print p);
}
