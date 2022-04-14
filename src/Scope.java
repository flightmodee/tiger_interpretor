import java.util.HashMap;
import java.util.Map;

public class Scope {
	private Map<String,Expression> variables;
	
	public Scope() {
		variables = new HashMap<>();
	}
	
	public void addVariable(Variable v) throws DuplicateVariableException {
		if(variables.containsKey(v.getName()))
			throw new DuplicateVariableException(v.getName());
		variables.put(v.getName(), v.getValue());
	}
	
	public void updateVariable(Variable v) {
		variables.put(v.getName(), v.getValue());
	}
}
