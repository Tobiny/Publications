package publication;

//Se usó object,en vez de array y arraylist debido a que fue más cómodo y era un nuevo concepto que quisimos aplicar
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Object publications[] = new Object[10000];
    static int contP = 0, contM = 0, contN = 0, contB = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opc = 0;

        do {
            try {
                MenuImprime();
                opc = sc.nextInt();
            }catch (InputMismatchException e){
                sc.next();
                System.out.println("Opción o texto ingresado no válido, ingrese su respuesta nuevamente");

            }
            switch (opc){
                case 1:
                    publicationReg();
                    break;
                case 2:
                    showPublications();
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opc != 3);


    }

    public static void MenuImprime(){
        System.out.println("----MENU----");
        System.out.println("[1] - Dar de alta una publicación");
        System.out.println("[2] - Mostrar las publicaciones");
        System.out.println("[3] - Salir");
        System.out.print("Ingrese su opción: ");
    }

    public static void showPublications(){
        if(contP == 0){
            System.out.println("----No hay publicaciones----");
        } else if(contM != 0){
            System.out.println("----REVISTAS----");
            for(int i = 0; i < contP; i ++ ){
                if(publications[i] instanceof Magazine) {
                    Magazine mag = new Magazine();
                    mag = (Magazine)publications[i];
                    System.out.println("ISSN: " + mag.getISSN());
                    System.out.println("-----------------------");
                }
            }
        } else if(contN != 0){
            System.out.println("----PERIÓDICOS----");
            for(int i = 0; i < contP; i ++ ){
                if(publications[i] instanceof Newspaper) {
                    Newspaper news = new Newspaper();
                    news = (Newspaper)publications[i];
                    System.out.println("----PERIODICO----");
                    System.out.println("EDITOR: " + news.getEditor());
                    System.out.println("-----------------------");
                }
            }
        } else if(contB != 0){
            System.out.println("----LIBROS----");
            for(int i = 0; i < contP; i ++ ) {
                if (publications [i] instanceof Book ) {
                    Book book = new Book();
                    book = (Book)publications[i];
                    System.out.println("ISBN: " + book.getISBN());
                    System.out.println("-----------------------");
                }
            }
        }
    }

    public static void publicationReg(){
            int opc = 0;
            do {
                 try {
                    System.out.println("----Alta Publcición----");
                    System.out.println("[1] - Revista");
                    System.out.println("[2] - Periódico");
                    System.out.println("[3] - Libro");
                    System.out.println("[4] - Salir al menu");
                    System.out.print("¿Qué tipo de publicación quiere hacer?: ");
                    opc = sc.nextInt();
                }catch (InputMismatchException e){
                    sc.next();
                    System.out.println("Opción o texto ingresado no válido, ingrese su respuesta nuevamente");
                }
                 switch (opc){
                     case 1:
                         Magazine mag = new Magazine();
                         System.out.println("----Revista----");
                         System.out.print("Ingrese el ISSN de la revista: ");
                         mag.setISSN(sc.next());
                         System.out.print("Ingrese el titulo de la revista: ");
                         mag.setTitle(sc.next());
                         System.out.print("Ingrese el precio de la revista: ");
                         mag.setPrice(validaIngD());
                         System.out.print("Ingrese el numero de edicion de la revista: ");
                         mag.setNumber(validaIngI());
                         System.out.print("Ingrese el año de la revista: ");
                         mag.setYear(validaIngI());
                         System.out.print("Ingrese el número de páginas de la revista: ");
                         mag.setNumPag(validaIngI());
                         publications[contP] = mag;
                         contP++;
                         contM++;
                         break;
                     case 2:
                         Newspaper newsp = new Newspaper();
                         System.out.println("----Periódico----");
                         System.out.print("Ingrese el titulo del periódico: ");
                         newsp.setTitle(sc.next());
                         System.out.print("Ingrese el precio del periódico: ");
                         newsp.setPrice(validaIngD());
                         System.out.print("Ingrese las secciones del periódico (separados por comas): ");
                         newsp.setSections(sc.next());
                         System.out.print("Ingrese el editor del periódico: ");
                         newsp.setEditor(sc.next());
                         System.out.print("Ingrese el número de páginas del periódico: ");
                         newsp.setNumPag(validaIngI());
                         publications[contP] = newsp;
                         contP++;
                         contN++;
                         break;
                     case 3:
                         Book books = new Book();

                         System.out.println("----Libro----");
                         System.out.print("Ingrese el ISBN del libro: ");
                         books.setISBN(sc.next());
                         System.out.print("Ingrese el titulo del libro: ");
                         books.setTitle(sc.next());
                         System.out.print("Ingrese el autor del libro (o los autores, separados por comas): ");
                         books.setAuthor(sc.next());
                         System.out.print("Ingrese el precio de la revista: ");
                         books.setPrice(validaIngD());
                         System.out.print("Ingrese el numero de edicion de la revista: ");
                         books.setEdition(sc.next());
                         System.out.print("Ingrese el número de páginas de la revista: ");
                         books.setNumPag(validaIngI());
                         publications[contP] = books;
                         contP++;
                         contB++;
                         break;
                     default:
                         System.out.println("Opción inválida");
                         break;
                 }
            } while (opc != 4);
    }
    public static int validaIngI(){
        int temp = 0;
        boolean n = false;
        do {
            n = false;
            try {
                temp = sc.nextInt();
            }catch (InputMismatchException e){
                sc.next();
                System.out.print("Ingrese un valor válido: ");
                n = true;
            }
        } while(n);
        return temp;
    }
    public static double validaIngD(){
        double temp = 0;
        boolean n = false;
        do {
            n = false;
            try {
                temp = sc.nextDouble();
            }catch (InputMismatchException e){
                sc.next();
                System.out.print("Ingrese un valor válido: ");
                n = true;
            }
        } while(n);
        return temp;
    }
}