package module.fifth.task1v2;

import java.util.Collections;
import java.util.List;

public abstract class File implements FileSystemElement{

    private String fileType;
    private String name;

    public File(String name, String fileType) {
        this.fileType = fileType;
        this.name = name;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return " " + fileType + '\'';
    }

    @Override
    public String getName() {
        return name;
    }

    public void rename(String name) {
        this.name = name;
    }

    @Override
    public List<FileSystemElement> getChild() {
        return Collections.singletonList(this);
    }
}
