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
                case 3:
                    Ejercicio3 ejercicio3 = new Ejercicio3();
                    boolean argumentosValidosEjercicio3 = false;
                    while(!argumentosValidosEjercicio3){
                        try{
                            System.out.println("Ingrese el radio");
                            Double radio = Double.parseDouble(scanner.nextLine());
                            Double area = ejercicio3.calcularAreaCirculo(radio);
                            System.out.println("El area del circulo es: "+area);
                            argumentosValidosEjercicio3=true;
                        }catch (IllegalArgumentException e){
                            System.out.println("Argumento incorrecto, solo numeros.");
                        }
                    }
                    break;
                case 4:
                    Ejercicio4 ejercicio4 = new Ejercicio4();
                    boolean argumentosValidosEjercicio4 = false;
                    while(!argumentosValidosEjercicio4){
                        try{
                            System.out.println("Ingrese el precio del producto");
                            Double precio = Double.parseDouble(scanner.nextLine());
                            Double precioConIva = ejercicio4.calcularIva(precio);
                            if(precio>=0){
                                System.out.println("El precio con Iva del producto es: "+precioConIva);
                                argumentosValidosEjercicio4=true;
                            }else{
                                System.out.println("Solo numero mayores que 0");
                            }
                        }catch (IllegalArgumentException e){
                            System.out.println("Argumento incorrecto, solo numeros mayores que 0.");
                        }
                    }
                    break;
                case 5:
                    Ejercicio5 ejercicio5 = new Ejercicio5();
                    System.out.println(ejercicio5.mostrarParesEImparesHastaN(100));
                    break;
                case 6:
                    Ejercicio6 ejercicio6 = new Ejercicio6();
                    System.out.println(ejercicio6.mostrarParesEImparesHastaN(100));
                    break;

                default:
                    break;
            }
        }while(opcion!=19);
    }
}
