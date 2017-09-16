package ejercicio6;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author user
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    
    public static void Menu() {
        System.out.println("\n\n\t\t\t=========Menú Manejo PILA(STACK)======");
        System.out.println("\t\t\t=                                    =");
        System.out.println("\t\t\t= 1- Insertar elemento               =");
        System.out.println("\t\t\t= 2- Eliminar elemento               =");
        System.out.println("\t\t\t= 3- Buscar elemento                 =");
        System.out.println("\t\t\t= 4- Imprimir pila                   =");
        System.out.println("\t\t\t= 5- Imprimir Toda la pila           =");
        System.out.println("\t\t\t= 6- Salir                           =");
        System.out.println("\t\t\t======================================");
        System.out.print("\t\t\tIngrese Opcion: ");
    }
    public static void main(String[] args) {
        Stack pila = new Stack();
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        String dato;
        

        do {
            Menu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    dato = teclado.nextLine();
                    dato = teclado.nextLine();
                    pila.add(dato);
                    break;
                case 2:
                    if (pila.empty() == true) {
                        System.out.println("LA COLA ESTA VACIA");
                    } else {
                         System.out.println("ELEMENTO A ELIMINAR: " + pila.pop());
                    }          
                    break;
                case 3:
                    System.out.println("INGRESE EL DATO A BUSCAR: ");
                    dato = teclado.nextLine();
                    dato = teclado.nextLine();
                    if(pila.contains(dato)){
                        System.out.println(dato + " SI SE ENCUENTRA EN LA PILA");
                    }else{
                        System.out.println(dato + " NO SE ENCUENTRA EN LA PILA");
                    }
                    break;
                case 4:
                     System.out.println("LA CIMA DE LA PILA: " + pila.peek());
                    break;
                case 5:
                    System.out.println(pila);
                    break;
                case 6:
                    System.out.println("PROGRAMA FINALIZADO..!!!");
                    break;                    
                default:
                   System.out.println("INGRESE UNA OPCION CORRECTA.!!!");
                    break;
             
            }
        } while (opcion != 6);
        
    }
}