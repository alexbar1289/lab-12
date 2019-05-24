import java.util.HashMap;

public class MenuItem {
    private String name;

    private String desc;

    private String func;

    private HashMap<Integer, MenuItem> children = null;

    public MenuItem(String name, String desc, String func) {
        this.name = name;
        this.desc = desc;
        this.func = func;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public MenuItem withChildren(HashMap<Integer, MenuItem> children) {
        this.children = children;
        return this;
    }

    public HashMap<Integer, MenuItem> getChildren() {
        return children;
    }
}
