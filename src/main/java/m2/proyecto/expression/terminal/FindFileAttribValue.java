package m2.proyecto.expression.terminal;

import m2.proyecto.File;
import m2.proyecto.expression.Expression;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class FindFileAttribValue implements Expression {

    private String methodName;

    public FindFileAttribValue(String newMethodName) {
        this.methodName = newMethodName;
    }

    @Override
    public Object interpret(File file) {
        try {
            if (Objects.nonNull(file)) {
                Method method = file.getClass().getMethod(methodName, null);
                return method.invoke(file, null);
            }
        } catch (NoSuchMethodException exc) {
        } catch (IllegalAccessException exc) {
        } catch (InvocationTargetException exc) {
        }
        return false;
    }
}
