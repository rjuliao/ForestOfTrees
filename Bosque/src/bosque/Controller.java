package bosque;

import bosque.hojas.*;
import java.util.*;

/**
 *
 * @author Raul Humberto Juliao
 */
public class Controller {

    private static final Scanner in = new Scanner(System.in);
    private static final ArrayList<Nodo> bosque = new ArrayList<>();//This save all the trees

    public void createTree(String name) {

        Nodo q = new Nodo(name);
        bosque.add(q);
    }

    public void addSheet(String name) {

        Nodo p = null;
        for (Nodo nodo : bosque) {
            if (nodo.getInfo().equalsIgnoreCase(name)) {
                p = nodo;
                break;
            }
        }

        if (p != null) {

            boolean sw = true;
            while (sw) {

                System.out.println("Insert the number, 3 digit minimum");
                int nu = in.nextInt();
                Nodo antp = null;
                boolean dz = false;
                while (p != null) {
                    if (nu > p.getNdata()) {
                        dz = true;
                        antp = p;
                        p = p.getIzq();
                    } else {
                        dz = false;
                        antp = p;
                        p = p.getDer();
                    }
                }

                p = antp;
                String na = "";
                while (na.isEmpty()) {
                    System.out.println("Insert the name: ");
                    na = in.nextLine();
                }
                Nodo q = new Nodo(nu, na);

                if (dz == false) {
                    p.setDer(q);
                } else {
                    p.setIzq(q);
                }

                System.out.println("DESEA AÑADIR MAS CAMPOS? 1: SI / 0: NO");
                int s = in.nextInt();
                sw = (s == 1) ? true : false;
            }
        } else {
            System.out.println("No exist.");
        }
    }

    public void findTree(String name) {

        for (Nodo nodo : bosque) {
            if (nodo.getInfo().equalsIgnoreCase(name)) {
                System.out.println("EL ÁRBOL EXISTE");
            }
        }
    }

    public void viewTree(String name) {

        Nodo p = null;
        //Obtengo el apuntador del árbol 
        for (Nodo nodo : bosque) {
            if (nodo.getInfo().equalsIgnoreCase(name)) {
                p = nodo;
                break;
            }
        }
        if (p != null) {
            Queue<Nodo> dr = new LinkedList<>();
            dr.add(p);
            while (dr.peek() != null) {
                
                p = dr.poll();
                if(p.getNdata() == 500){
                    System.out.println("The head of the tree");
                    System.out.println(p.getInfo());
                }else{
                    System.out.println("The info of the node is: ");
                    System.out.println("The number: "+ p.getNdata());
                    System.out.println("The name: "+ p.getSdata());
                }
                    
                if(p.getDer() != null){
                    
                    dr.add(p.getDer());   
                }
                if(p.getIzq() != null){
                    
                    dr.add(p.getIzq());
                }
                
            }
        }
    }
}
