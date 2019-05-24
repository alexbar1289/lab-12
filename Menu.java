import java.util.HashMap;

public class Menu {
    private HashMap<Integer, MenuItem> first_menu_list = new HashMap<Integer, MenuItem >();
    private HashMap<Integer, MenuItem> second_menu_list = new HashMap<Integer, MenuItem >();
    private boolean exitState = false;
    public HashMap<Integer, MenuItem> getCurrent() {
        return current;
    }

    private HashMap<Integer, MenuItem> current = this.first_menu_list;

    public Menu() {
        //        Inicialize second_menu_list
        this.second_menu_list.put(0, new MenuItem("Audio", "Audio", "Next"));
        this.second_menu_list.put(1, new MenuItem("Video", "Video", "Next"));
        this.second_menu_list.put(2, new MenuItem(
                "Game options",
                "Game options",
                "LastItem"));
        this.second_menu_list.put(3, new MenuItem("Back", "Back", "Back"));
        this.second_menu_list.put(4, new MenuItem("Exit", "Exit", "Exit"));
//        Inicialize first_menu_list
        this.first_menu_list.put(0, new MenuItem("Play", "Play", "Next"));
        this.first_menu_list.put(1, new MenuItem("Options", "Options", "Next")
                .withChildren(this.second_menu_list));
        this.first_menu_list.put(2, new MenuItem("Gallery", "Gallery", "Next"));
        this.first_menu_list.put(3, new MenuItem("Play online", "Play online", "Next"));
        this.first_menu_list.put(4, new MenuItem("Exit", "Exit", "Exit"));

    }



    public void next(int menuItemNumber, boolean isLast) {
        MenuItem current = this.current.get(menuItemNumber);
        HashMap<Integer, MenuItem> childs = current.getChildren();
        if(childs!=null) {
            this.current = childs;
            System.out.println("Main menu ->" + current.getName());
            render(childs);
        }
        else
        {
            System.out.println("Main menu\n");
            render(this.current);
        }
    }

    public void back() {
        System.out.println("Main menu\n");
        this.current = first_menu_list;
        render(this.current);
    }
    public void exit() {
        this.exitState = true;
    }

    public boolean isExitState() {
        return exitState;
    }

    public void render (HashMap<Integer, MenuItem> menu) {

        for (int i = 0; i<menu.size(); i++) {
            System.out.println( i + " " + menu.get(i).getName());
        }

    }
}
