import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SuperClass arrayObjetos[]=new SuperClass[5];
        Scanner sc = new Scanner(System.in);

        String nombre;
        int t;
        for (int i=0;i<arrayObjetos.length;i++){
            arrayObjetos[i]=new SuperClass();
        }

        for (int i=0;i<=4;i++){
            System.out.println("Datos cliente "+(i+1));
            System.out.print("Ingrese su nombre: ");
            arrayObjetos[i].setNombre(nombre = sc.next());
            System.out.print("Ingrese su apellido: ");
            arrayObjetos[i].setApellido(nombre = sc.next());
            System.out.print("Ingrese su cedula: ");
            arrayObjetos[i].setCedula(t = sc.nextInt());
            System.out.print("Ingrese su correo: ");
            arrayObjetos[i].setCorreo(nombre = sc.next());
        }
        /*
        System.out.println("INICIAR SESION ");
        System.out.println("Ingrese del cliente" );
        int cliente = sc.nextInt() ;
        //
        while ()
        int p = 0;
        System.out.println("MENU");

        System.out.println("CHEQUE ");
        System.out.println("AHORRO ");

        switch(p){
            case 1:

                break;
            case 2:

                break;

            default:

        }


*/


    }
}
