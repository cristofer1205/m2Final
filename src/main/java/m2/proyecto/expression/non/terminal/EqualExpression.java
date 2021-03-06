package m2.proyecto.expression.non.terminal;

import m2.proyecto.File;
import m2.proyecto.expression.Expression;

public class EqualExpression extends LogicalExpression {

    EqualExpression(Expression argument1, Expression argument2) {
        super(argument1, argument2);
    }

    @Override
    public Object interpret(File file) {
        return getArgument1().interpret(file) == getArgument2().interpret(file);

    }
}
