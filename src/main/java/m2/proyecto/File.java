package m2.proyecto;

import m2.proyecto.expression.Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class File extends FileComponent {
    private String extension;

    public File(String name, String extension, String size, String location, Date modifiedDate, Date openedDate, Date createdDate) {
        super(name, size, location, modifiedDate, openedDate, createdDate);
        this.extension = extension;
    }

    public List<FileComponent> InterpretExpression(Expression expression){
        boolean fileFulfilsExpression = (boolean)expression.interpret(this);
        return fileFulfilsExpression ? Collections.singletonList(this) : new ArrayList<>();
    }

    @Override
    public String toString(String indent) {
        return "File{" +
                "name='" + name + '\'' + '\n' +
                ", extension='" + extension + '\'' + '\n' +
                ", size='" + size + '\'' + '\n' +
                ", location='" + location + '\'' + '\n' +
                ", modifiedDate=" + modifiedDate + '\n' +
                ", openedDate=" + openedDate + '\n' +
                ", createdDate=" + createdDate +
                '}';
    }
}
