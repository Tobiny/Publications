package publication;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int ctrlPub = 0, opc = 0;
        ArrayList<Object> publications[] = new ArrayList[10];
        Object publications1[] = new Object[10];

        do {
            System.out.println("----MENU----");
            System.out.println("[1] - Dar de alta una publicación");
            System.out.println("[2] - Mostrar el contenido del arreglo");
            System.out.println("[3] - Salir");
            try {

            }catch (){

            }
        } while (opc != 3);









        for(int i = 0; i < ctrlPub; i ++ )
        {
            System.out.println("  " + publications [i].getClass());
            if(publications[i] instanceof Magazine)
            {
                Magazine rev1 = new Magazine();
                rev1 = (Magazine)publications[i];
                System.out.println("----REVISTA----");
                System.out.println("ISSN " + rev1.getISSN());

            }
            else if (publications [i] instanceof Book )
            {
                Book lib = new Book();
                lib = (Book)publications[i];
                System.out.println("---LIBRO---");
                System.out.println("ISBN " + lib.getISBN());
            }
        }

    }
}
