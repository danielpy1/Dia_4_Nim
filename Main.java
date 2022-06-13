import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**** Bootcamp Roshka DIA 4 ****");
        System.out.println("Ejercicio 1\n");
        int columna_1,columna_2,columna_3;
        Scanner input=new Scanner(System.in);
        System.out.print("#### Bienvenido al juego del dia 4 ####");
        System.out.println("\nIngrese los nombre de los jugadores");
        System.out.print("Jugador 1: ");
        String nombre_judador1=input.nextLine();
        System.out.print("Jugador 2: ");
        String nombre_jugador2=input.nextLine();
        System.out.println("Ingrese los contadores");
        System.out.print("Columna 1: ");
        columna_1=input.nextInt();
        columna_1=validacion_contador(columna_1);
        System.out.print("Columna 2: ");
        columna_2=input.nextInt();
        columna_2=validacion_contador(columna_2);
        System.out.print("Columna 3: ");
        columna_3=input.nextInt();
        columna_3=validacion_contador(columna_3);
        Tablero tablero=new Tablero(columna_1,columna_2,columna_3);
        System.out.println("C1: "+tablero.getColumna_1()+"\tC2: "+tablero.getColumna_2()+"\tC3: "+tablero.getColumna_3());
        int c=1;
        int opcion;
        int cant_resta;
        int auxiliar;
        while(tablero.getColumna_1()>=0 && tablero.getColumna_2()>=0 && tablero.getColumna_3()>=0){
            if(c%2==0){
                System.out.print(nombre_judador1+", elije una columna [1,2,3]: ");
            }else{
                System.out.print(nombre_jugador2+", elije una columna [1,2,3]: ");
            }
            opcion=input.nextInt();
            opcion=validacion_opcion(opcion);
            System.out.print("¿Cuantos quirara de la columna "+opcion+"?: ");
            cant_resta=input.nextInt();
            cant_resta=validacion_contador(cant_resta);
            auxiliar=0;
            if(opcion==1 && cant_resta<=tablero.getColumna_1()){
                tablero.setColumna_1(cant_resta);
            }else if(opcion==1 && cant_resta>tablero.getColumna_1()){
                System.out.println("Error.. valor fuera de rango, no puedes sacar esa cantidad de esta columna");
                auxiliar=1;
            }else if(opcion==2 && cant_resta<=tablero.getColumna_2()){
                tablero.setColumna_2(cant_resta);
            }else if(opcion==2 && cant_resta>tablero.getColumna_2()){
                System.out.println("Error.. valor fuera de rango, no puedes sacar esa cantidad de esta columna");
                auxiliar=1;
            }else if(opcion==3 && cant_resta<=tablero.getColumna_3()){
                tablero.setColumna_3(cant_resta);
            }else if(opcion==3 && cant_resta>tablero.getColumna_1()){
                System.out.println("Error.. valor fuera de rango, no puedes sacar esa cantidad de esta columna");
                auxiliar=1;
            }
            if(auxiliar==0){
                c++;
            }
            System.out.println("C1: "+tablero.getColumna_1()+"\tC2: "+tablero.getColumna_2()+"\tC3: "+tablero.getColumna_3());
            if(tablero.getColumna_1()==0 && tablero.getColumna_2()==0 && tablero.getColumna_3()==0){
                tablero.setColumna_1(100);
            }
        }
        if(c%2==0){
            System.out.print(nombre_judador1+", Es el ganador ");
        }else{
            System.out.print(nombre_jugador2+", Es el ganador ");
        }
    }
    static public int validacion_contador(int contador){
        Scanner input2=new Scanner(System.in);
        while (contador<=0){
            System.out.print("Error, valor fuera de rango, favor volver a ingresar: ");
            contador=input2.nextInt();
        }
        return contador;
    }
    static public int validacion_opcion(int opcion){
        Scanner input2=new Scanner(System.in);
        while (opcion<=0 ||opcion>3){
            System.out.print("Error, valor fuera de rango, favor volver a ingresar: ");
            opcion=input2.nextInt();
        }
        return opcion;
    }
}
