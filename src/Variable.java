
public class Variable {
	private String name;
	private Expression value;
	
	public Variable(String name,Expression value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public Expression getValue() {
		return value;
	}

}
