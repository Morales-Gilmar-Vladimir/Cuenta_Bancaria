import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, correo;
        int cedula, cedulan, cont = 0, conti = 5, clave;

        SuperClass[] cuenta = new SuperClass[5];
        cuenta[0] = new SuperClass();

        for (int i = 0; i < cuenta.length; i++) {
            cuenta[i] = new SuperClass();
            System.out.println("Cliente " + (i + 1));
            System.out.print("Ingrese el nombre: ");
            nombre = sc.next();
            System.out.print("Ingrese el apellido: ");
            apellido = sc.next();
            System.out.print("Ingrese la cedula: ");
            cedula = sc.nextInt();
            System.out.print("Ingrese el correo: ");
            correo = sc.next();
            System.out.println();
            cuenta[i].setNombre(nombre);
            cuenta[i].setApellido(apellido);
            cuenta[i].setCedula(cedula);
            cuenta[i].setCorreo(correo);
        }
        for (int i = 0; i < cuenta.length; i++) {
            System.out.println("\nDatos cliente " + (i + 1));
            System.out.println("\nNombre: " + cuenta[i].getNombre());
            System.out.println("Apellido: " + cuenta[i].getApellido());
            System.out.println("Cedula: " + cuenta[i].getCedula());
            System.out.println("Correo: " + cuenta[i].getCorreo());
        }

        System.out.println("\n*** INICIAR SESION ***");
        System.out.println("\nIntentos: " + conti);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nIngrese la clave: ");
            clave = sc.nextInt();
            cont++;
            if (clave == 2023) {
                System.out.println("\nBienvenido al sistema");
                do {
                    System.out.print("\nIngrese su cedula para acceder a su cuenta: ");
                    cedulan = sc.nextInt();
                    if (cedulan == cuenta[0].getCedula()) {
                        System.out.println("\nBienvenido " + cuenta[0].getNombre());
                        System.exit(0);
                    } else if (cedulan == cuenta[1].getCedula()) {
                        System.out.println("\nBienvenido " + cuenta[1].getNombre());
                        System.exit(0);
                    } else if (cedulan == cuenta[2].getCedula()) {
                        System.out.println("\nBienvenido " + cuenta[2].getNombre());
                        System.exit(0);
                    } else if (cedulan == cuenta[3].getCedula()) {
                        System.out.println("\nBienvenido " + cuenta[3].getNombre());
                        System.exit(0);
                    } else if (cedulan == cuenta[4].getCedula()) {
                        System.out.println("\nBienvenido " + cuenta[4].getNombre());
                        System.exit(0);
                    } else {
                        System.out.println("\nNo existe ese usuario dentro de nuestro sistema!");
                    }
                } while (cedulan != cuenta[0].getCedula() & cedulan != cuenta[1].getCedula() & cedulan != cuenta[2].getCedula() & cedulan != cuenta[3].getCedula() & cedulan != cuenta[4].getCedula());
            } else {
                System.out.println("\nClave incorrecta, ingrese nuevamente");
                conti--;
                System.out.println("Intentos restantes: " + conti);
                if (cont == 5) {
                    System.out.println("\nHas sobrepasado el numero de intentos");
                }
            }
        }
    }
}
