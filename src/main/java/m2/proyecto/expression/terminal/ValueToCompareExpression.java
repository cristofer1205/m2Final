package m2.proyecto.expression.terminal;

import m2.proyecto.File;
import m2.proyecto.expression.Expression;

public class ValueToCompareExpression implements Expression {

    private Object value;

    public ValueToCompareExpression(Object newValue) {
        this.value = newValue;
    }

    @Override
    public Object interpret(File file) {
        return value;
    }


}
