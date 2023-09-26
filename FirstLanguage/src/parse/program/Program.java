package parse.program;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public List<Expression> expressions;

	public Program () {
		expressions = new ArrayList<>();
	}
	
	public void addExpression(Expression expression) {
		expressions.add(expression);
	}
	
}
