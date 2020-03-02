package m2.proyecto;

import m2.proyecto.expression.Expression;

import java.util.Date;
import java.util.List;

public abstract class FileComponent {
    String name;
    String size;
    String location;
    Date modifiedDate;
    Date openedDate;
    Date createdDate;

    public FileComponent(String name, String size, String location, Date modifiedDate, Date openedDate, Date createdDate) {
        this.name = name;
        this.size = size;
        this.location = location;
        this.modifiedDate = modifiedDate;
        this.openedDate = openedDate;
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }


    public Date getOpenedDate() {
        return openedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public abstract String toString(String indent);

    public abstract List<FileComponent> InterpretExpression(Expression expression);
}
