package module.fifth.task1v2;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement{

    private String name;
    private List<FileSystemElement> childElements = new ArrayList<>();

    public Directory() {
    }

    public Directory(final String name) {
        this.name = name;
    }

    public void addChild(FileSystemElement element) {
        this.childElements.add(element);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<FileSystemElement> getChild() {
        return childElements;
    }

    @Override
    public void printContentsToConsole() {
        for (FileSystemElement childElement : childElements) {
            System.out.println(childElement.getName());
        }
    }
}
