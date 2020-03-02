package m2.proyecto.expression.non.terminal;

import m2.proyecto.File;
import m2.proyecto.expression.Expression;

public abstract class LogicalExpression implements Expression {

    private Expression argument1 = null;
    private Expression argument2 = null;

    LogicalExpression(Expression argument1, Expression argument2) {
        this.argument1 = argument1;
        this.argument2 = argument2;
    }

    Expression getArgument1() {
        return argument1;
    }

    Expression getArgument2() {
        return argument2;
    }

    @Override
    public Object interpret(File file) {
        return null;
    }
}
