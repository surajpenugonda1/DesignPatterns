import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {
    List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void display() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent child : children) {
            child.display();
        }
    }
}
