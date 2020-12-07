package colas;

import java.util.Scanner;

public class Colas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cola[] = new char[4];
        int op = 0, tope = 0;
        do {
            System.out.println("1.- Agregar dato");
            System.out.println("2.- Mostrar cola");
            System.out.println("3.- Eliminar ultimo dato");
            System.out.println("4.- Vaciar cola");
            System.out.println("5.- Eliminar primer dato;");
            System.out.println("6.- Salir");
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Inserte un dato...");
                    cola[tope] = sc.next().charAt(0);
                    tope++;
                    System.out.println("Dato agregado...");
                }
                break;
                case 2: {
                    System.out.println("Imprimiendo cola...");
                    for (int x = 0; x < tope; x++) {
                        System.out.print(cola[x] + " ");
                    }
                    System.out.println(" ");
                }
                break;
                case 3: {
                    tope--;
                    System.out.println("Ultimo dato borrado...");
                }
                break;
                case 4: {
                    tope = 0;
                    System.out.println("Cola vacia...");
                }
                break;
                case 5: {
                    for (int x = 0; x < (tope - 1); x++) {
                        cola[x] = cola[x + 1];
                    }
                    tope--;
                }
                break;
                default:{
                System.out.println("Opcion incorrecta...");
                }
                 break;   
            }
        } while (op != 6);
        System.out.println("Programa terminado");
    }
}
