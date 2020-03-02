package m2.proyecto.expression.non.terminal;

import m2.proyecto.File;
import m2.proyecto.expression.Expression;

public class AndExpression extends LogicalExpression {

    AndExpression(Expression argument1, Expression argument2) {
        super(argument1, argument2);
    }

    @Override
    public Object interpret(File file) {
        return (boolean) getArgument1().interpret(file) && (boolean) getArgument2().interpret(file);
    }
}
