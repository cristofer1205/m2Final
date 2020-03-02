package m2.proyecto;


import m2.proyecto.expression.Expression;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Folder extends FileComponent {
    private List<FileComponent> contents;

    public Folder(String name, String size, String location, Date modifiedDate, Date openedDate, Date createdDate) {
        super(name, size, location, modifiedDate, openedDate, createdDate);
        this.contents = new ArrayList<>();
    }


    public void addFileComponent(FileComponent fileComponent) {
        if (!contents.contains(fileComponent)) {
            contents.add(fileComponent);
        }
    }

    @Override
    public List<FileComponent> InterpretExpression(Expression expression){
        List<FileComponent> result = new ArrayList<>();
        for (FileComponent fileComponent : contents) {
            result.addAll(fileComponent.InterpretExpression(expression));
        }
        return result;
    }

    @Override
    public String toString(String indent) {
        indent += indent;
        System.out.println(indent + name);
        for (FileComponent fileComponent : contents) {
            System.out.println(fileComponent.toString(indent));
        }
        return "";
    }
}
