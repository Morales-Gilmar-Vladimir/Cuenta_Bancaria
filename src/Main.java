import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, correo;
        int cedula, cedulan, cont = 0, conti = 5, clave, menu;

        SuperClass[] cuenta = new SuperClass[5];
        Ahorros ahorros = new Ahorros();
        Cheques cheques = new Cheques();

        for(int i = 0; i < cuenta.length; i++){
            cuenta[i] = new SuperClass();
            System.out.println("Cliente " + (i+1));
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

        System.out.println("\n*** INICIAR SESION ***");
        System.out.println("\nClave: 2023");
        System.out.println("\nIntentos: " + conti);
        for(int i = 0; i < 5; i++){
            System.out.print("\nIngrese la clave: ");
            clave = sc.nextInt();
            cont++;
            if(clave == 2023){
                System.out.println("\nBienvenido al sistema");
                do {
                    System.out.print("\nIngrese su cedula para acceder a su cuenta: ");
                    cedulan = sc.nextInt();
                    if (cedulan == cuenta[0].getCedula()) {
                        System.out.println("\nBienvenido Sr." + cuenta[0].getNombre());
                        do{
                            System.out.println("\n*** MENU ***");
                            System.out.println("\n1. Ver tus datos");
                            System.out.println("2. Cuenta Ahorros");
                            System.out.println("3. Cuenta Corriente");
                            System.out.println("4. Salir de la cuenta");
                            System.out.println("5. Salir del sistema");
                            System.out.print("\nIngrese una opcion del menu: ");
                            menu = sc.nextInt();

                            switch (menu){
                                case 1:
                                    System.out.println("\nDatos cliente");
                                    System.out.println("\nNombre: " + cuenta[0].getNombre());
                                    System.out.println("Apellido: " + cuenta[0].getApellido());
                                    System.out.println("Cedula: " + cuenta[0].getCedula());
                                    System.out.println("Correo: " + cuenta[0].getCorreo());
                                    break;
                                case 2:
                                    ahorros.ahorros();
                                    break;
                                case 3:
                                    cheques.corriente();
                                    break;
                                case 4:
                                    System.out.println("\nGracias por usar nuestro menu");
                                    break;
                                case 5:
                                    System.out.println("\nGracias por usar nuestro sistema");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("\nOpcion no disponible del menu");
                            }
                        }while(menu != 4);
                    } else if (cedulan == cuenta[1].getCedula()) {
                        System.out.println("\nBienvenido Sr." + cuenta[1].getNombre());
                        do{
                            System.out.println("\n*** MENU ***");
                            System.out.println("\n1. Ver tus datos");
                            System.out.println("2. Cuenta Ahorros");
                            System.out.println("3. Cuenta Corriente");
                            System.out.println("4. Salir de la cuenta");
                            System.out.println("5. Salir del sistema");
                            System.out.print("\nIngrese una opcion del menu: ");
                            menu = sc.nextInt();

                            switch (menu){
                                case 1:
                                    System.out.println("\nDatos cliente");
                                    System.out.println("\nNombre: " + cuenta[1].getNombre());
                                    System.out.println("Apellido: " + cuenta[1].getApellido());
                                    System.out.println("Cedula: " + cuenta[1].getCedula());
                                    System.out.println("Correo: " + cuenta[1].getCorreo());
                                    break;
                                case 2:
                                    ahorros.ahorros();
                                    break;
                                case 3:
                                    cheques.corriente();
                                    break;
                                case 4:
                                    System.out.println("\nGracias por usar nuestro menu");
                                    break;
                                case 5:
                                    System.out.println("\nGracias por usar nuestro sistema");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("\nOpcion no disponible del menu");
                            }
                        }while(menu != 4);
                    } else if (cedulan == cuenta[2].getCedula()) {
                        System.out.println("\nBienvenido Sr." + cuenta[2].getNombre());
                        do{
                            System.out.println("\n*** MENU ***");
                            System.out.println("\n1. Ver tus datos");
                            System.out.println("2. Cuenta Ahorros");
                            System.out.println("3. Cuenta Corriente");
                            System.out.println("4. Salir de la cuenta");
                            System.out.println("5. Salir del sistema");
                            System.out.print("\nIngrese una opcion del menu: ");
                            menu = sc.nextInt();

                            switch (menu){
                                case 1:
                                    System.out.println("\nDatos cliente");
                                    System.out.println("\nNombre: " + cuenta[2].getNombre());
                                    System.out.println("Apellido: " + cuenta[2].getApellido());
                                    System.out.println("Cedula: " + cuenta[2].getCedula());
                                    System.out.println("Correo: " + cuenta[2].getCorreo());
                                    break;
                                case 2:
                                    ahorros.ahorros();
                                    break;
                                case 3:
                                    cheques.corriente();
                                    break;
                                case 4:
                                    System.out.println("\nGracias por usar nuestro menu");
                                    break;
                                case 5:
                                    System.out.println("\nGracias por usar nuestro sistema");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("\nOpcion no disponible del menu");
                            }
                        }while(menu != 4);
                    } else if (cedulan == cuenta[3].getCedula()) {
                        System.out.println("\nBienvenido Sr." + cuenta[3].getNombre());
                        do{
                            System.out.println("\n*** MENU ***");
                            System.out.println("\n1. Ver tus datos");
                            System.out.println("2. Cuenta Ahorros");
                            System.out.println("3. Cuenta Corriente");
                            System.out.println("4. Salir de la cuenta");
                            System.out.println("5. Salir del sistema");
                            System.out.print("\nIngrese una opcion del menu: ");
                            menu = sc.nextInt();

                            switch (menu){
                                case 1:
                                    System.out.println("\nDatos cliente");
                                    System.out.println("\nNombre: " + cuenta[3].getNombre());
                                    System.out.println("Apellido: " + cuenta[3].getApellido());
                                    System.out.println("Cedula: " + cuenta[3].getCedula());
                                    System.out.println("Correo: " + cuenta[3].getCorreo());
                                    break;
                                case 2:
                                    ahorros.ahorros();
                                    break;
                                case 3:
                                    cheques.corriente();
                                    break;
                                case 4:
                                    System.out.println("\nGracias por usar nuestro menu");
                                    break;
                                case 5:
                                    System.out.println("\nGracias por usar nuestro sistema");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("\nOpcion no disponible del menu");
                            }
                        }while(menu != 4);
                    } else if (cedulan == cuenta[4].getCedula()) {
                        System.out.println("\nBienvenido Sr." + cuenta[4].getNombre());
                        do{
                            System.out.println("\n*** MENU ***");
                            System.out.println("\n1. Ver tus datos");
                            System.out.println("2. Cuenta Ahorros");
                            System.out.println("3. Cuenta Corriente");
                            System.out.println("4. Salir de la cuenta");
                            System.out.println("5. Salir del sistema");
                            System.out.print("\nIngrese una opcion del menu: ");
                            menu = sc.nextInt();

                            switch (menu){
                                case 1:
                                    System.out.println("\nDatos cliente");
                                    System.out.println("\nNombre: " + cuenta[4].getNombre());
                                    System.out.println("Apellido: " + cuenta[4].getApellido());
                                    System.out.println("Cedula: " + cuenta[4].getCedula());
                                    System.out.println("Correo: " + cuenta[4].getCorreo());
                                    break;
                                case 2:
                                    ahorros.ahorros();
                                    break;
                                case 3:
                                    cheques.corriente();
                                    break;
                                case 4:
                                    System.out.println("\nGracias por usar nuestro menu");
                                    break;
                                case 5:
                                    System.out.println("\nGracias por usar nuestro sistema");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("\nOpcion no disponible del menu");
                            }
                        }while(menu != 4);
                    } else {
                        System.out.println("\nNo existe ese usuario dentro de nuestro sistema!");
                    }
                }while(cedulan != cuenta[0].getCedula() & cedulan != cuenta[1].getCedula() & cedulan != cuenta[2].getCedula() & cedulan != cuenta[3].getCedula() & cedulan != cuenta[4].getCedula());
            }
            else{
                System.out.println("\nClave incorrecta, ingrese nuevamente");
                conti--;
                System.out.println("Intentos restantes: " + conti);
                if(cont == 5){
                    System.out.println("\nHas sobrepasado el numero de intentos");
                }
            }
        }
    }
}