import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {

    private final String name;
    private final List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void add(FileSystem item) {
        if (item == null) {
            System.out.println("Bo'sh element qo'shib bo'lmaydi!");
            return;
        }
        children.add(item);
    }

    public boolean remove(FileSystem item) {
        return children.remove(item);
    }

    public boolean remove(String name) {
        for (FileSystem item : children) {
            if (item.getName().equals(name)) {
                children.remove(item);
                return true;
            }
        }
        return false;
    }

    public List<FileSystem> getChildren() {
        return children;
    }

    @Override
    public void show() {
        System.out.println(name);
        showChildren("    ");
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "|---- " + name);
        showChildren(indent + "|         ");
    }

    private void showChildren(String childIndent) {
        for (int i = 0; i < children.size(); i++) {
            FileSystem item = children.get(i);
            boolean gap = (i == 0) || (children.get(i - 1) instanceof Folder);
            if (gap) {
                System.out.println(childIndent + "|");
            }
            item.show(childIndent);
        }
    }
}
