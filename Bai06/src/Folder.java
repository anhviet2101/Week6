import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemItem{
    private List<FileSystemItem> children;

    public Folder(String name){
        super(name);
        children = new ArrayList<>();
    }
    public void addSub(FileSystemItem item){
        if (item == this) return;
        children.add(item);
        item.setParent(this);
    }
    @Override
    public void print(String indent) {
        System.out.println(indent + "Folder: " + name);
        for (FileSystemItem child: children){
            child.print(indent + " ");
        }
    }
}
