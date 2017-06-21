package bosque;

import java.util.Scanner;

/**
 *
 * @author Raul Humberto Juliao
 */
public class Bosque {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("WELCOME");

        boolean sw = true;
        while (sw) {
            Controller cl = new Controller();

            System.out.println("MENU TO CREATE A FOREST OF TREES");
            System.out.println("1. PLANT YOU TREES.");
            System.out.println("2. ADD SHEET TO YOUR TREES");
            System.out.println("3. FIND A TREE");
            System.out.println("4. Look your tree");
            System.out.println("CHOOSE ONE: ");

            int op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("1. PLANT YOU TREES.");
                    System.out.println("HOW MANY TREES YOU WILL CREATE?");
                    int n = in.nextInt();
                    for (int i = 0; i < n; i++) {

                        String name = "";
                        while (name.isEmpty()) {
                            System.out.println("Name of your tree: ");
                            name = in.nextLine();
                        }

                        cl.createTree(name);
                    }
                    break;
                case 2:
                    System.out.println("2. ADD SHEET TO YOUR TREES");
                    System.out.println("Whats the name of your tree?");
                    String name = "";
                    while (name.isEmpty()) {
                        System.out.println("Name of your tree: ");
                        name = in.nextLine();
                    }
                    cl.addSheet(name);

                    break;
                case 3:
                    System.out.println("3. FIND A TREE");
                    name = "";
                    while (name.isEmpty()) {
                        System.out.println("What's the name of the tree: ");
                        name = in.nextLine();
                    }
                    cl.findTree(name);
                    break;
                case 4:
                    System.out.println("4. Look your tree");
                    name = "";
                    while (name.isEmpty()) {
                        System.out.println("What's the name of the tree: ");
                        name = in.nextLine();
                    }
                    cl.viewTree(name);
                    break;
                default:
                    System.out.println("ERROR WITH THE OPTIONS");
                    break;
            }
            System.out.println("DO YOU WANT TO BACK TO THE MENU? 1: YES / 2: NO");
            int o = in.nextInt();
            sw = (o == 1) ? true : false;
        }
    }

}
