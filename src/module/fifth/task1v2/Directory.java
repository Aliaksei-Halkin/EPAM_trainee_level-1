package module.fifth.task1v2;




public class Directory {
    private  String directory;

    public Directory() {
    }

    public Directory(String directory) {
        this.directory = directory;

    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void changeDirectory(String directory){
        this.directory=directory;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "directory='" + directory + '\'' +
                '}';
    }

}
