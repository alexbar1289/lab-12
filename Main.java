import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int menuChildNumber;
        Menu menu = new Menu();
        System.out.println("Main menu\n");
        menu.render(menu.getCurrent());
        while(!menu.isExitState()) {
            try {
                Scanner in = new Scanner(System.in);
                menuChildNumber = in.nextInt();
                String func  = menu.getCurrent().get(menuChildNumber).getFunc();
                if(func.equals("Next")){
                    menu.next(menuChildNumber, false);
                }
                else if (func.equals("Back")) {
                    menu.back();
                }

                else if (func.equals("Exit")) {
                    menu.exit();
                }

            }
            catch (Exception e) {
                System.out.println("Введите корректное число");
            }



        }
    }

}



