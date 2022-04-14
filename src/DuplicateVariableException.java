
public class DuplicateVariableException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public DuplicateVariableException(String varName) {
		super("Variable " + varName + " already exists in this scope");
	}

}
