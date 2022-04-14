
public class StringExpression extends Expression{
	private String value;
	
	public StringExpression(String val) {
		value = val;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public String getVal() {
		return value;
	}
	
	public String toString() {
		return getVal();
	}

}
