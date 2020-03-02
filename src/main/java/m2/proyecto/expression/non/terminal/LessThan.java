package m2.proyecto.expression.non.terminal;

import m2.proyecto.File;
import m2.proyecto.expression.Expression;

import java.util.Date;

public class LessThan extends LogicalExpression {


    LessThan(Expression argument1, Expression argument2) {
        super(argument1, argument2);
    }

    @Override
    public Object interpret(File file) {
        return ((Date) getArgument1().interpret(file)).before((Date) getArgument2().interpret(file));
    }
}
