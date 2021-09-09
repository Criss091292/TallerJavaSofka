import javax.swing.*;

import java.util.Scanner;

import static java.lang.Integer.*;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion=19;
        do{
            opcion = parseInt(JOptionPane.showInputDialog("Bienvenido, este es un taller de Sofka U\nDigite el numero del ejercicio a revisar, 19 para salir."));
            switch (opcion){
                case 1:
                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    boolean argumentosValidosEjercicio1 = false;
                    while(!argumentosValidosEjercicio1){
                        try{
                            float a = Float.parseFloat(JOptionPane.showInputDialog(null,"Escriba el primer numero"));
                            float b = Float.parseFloat(JOptionPane.showInputDialog(null,"Escriba el segundo numero"));
                            String message = ejercicio1.numeroMayor(a,b);
                            JOptionPane.showMessageDialog(null,message);
                            argumentosValidosEjercicio1=true;
                        }catch (IllegalArgumentException e){
                            JOptionPane.showMessageDialog(null, "Argumento incorrecto, solo numeros.");
                            //throw e;
                        }
                    }
                    break;
                case 2:
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    boolean argumentosValidosEjercicio2 = false;
                    while(!argumentosValidosEjercicio2){
                        try{
                            System.out.println("Ingrese el primer numero");
                            float a = Float.parseFloat(scanner.nextLine());
                            System.out.println("Ingrese el segundo numero");
                            float b = Float.parseFloat(scanner.nextLine());
                            String message = ejercicio2.numeroMayor(a,b);
                            System.out.println(message);
                            argumentosValidosEjercicio2=true;
                        }catch (IllegalArgumentException e){
                            System.out.println("Argumento incorrecto, solo numeros.");
                        }
                    }
                    break;

                default:
                    break;
            }
        }while(opcion!=19);
    }
}
