package module.fifth.task1v2;

import java.util.List;

public interface FileSystemElement {
    String getName();

    List<FileSystemElement> getChild();

    void printContentsToConsole();
}
