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
                case 7:
                    Ejercicio7 ejercicio7 = new Ejercicio7();
                    boolean argumentosValidosEjercicio7 = false;
                    do{
                        try{
                            Double numero = Double.parseDouble(JOptionPane.showInputDialog(null,"Escriba el primer numero"));
                            if(ejercicio7.EsMayorOIgualQueCero(numero)){
                                System.out.println("El numero dado ("+numero+") es mayor o igual que 0");
                                argumentosValidosEjercicio7=true;
                            }else{
                                System.out.println("Solo numero mayores o iguales que 0");
                            }

                        }catch (IllegalArgumentException e){
                            System.out.println("Argumento incorrecto, solo numeros mayores que 0.");
                        }
                    }while(!argumentosValidosEjercicio7);
                case 8:
                    Ejercicio8 ejercicio8 = new Ejercicio8();
                    boolean argumentosValidosEjercicio8 = false;
                    String diaSemana="";
                    do{
                        System.out.println("Escriba el dia de la semana");
                        diaSemana = scanner.next();
                        if(diaSemana.equalsIgnoreCase("lunes")||diaSemana.equalsIgnoreCase("martes")
                                ||diaSemana.equalsIgnoreCase("miercoles")||diaSemana.equalsIgnoreCase("jueves")
                                ||diaSemana.equalsIgnoreCase("viernes")||diaSemana.equalsIgnoreCase("sabado")
                                ||diaSemana.equalsIgnoreCase("domingo")){
                            argumentosValidosEjercicio8=true;
                        }
                    }while(!argumentosValidosEjercicio8);
                    if(ejercicio8.esDiaLaboral(diaSemana)){
                        System.out.println("Es dia laboral");
                    }else{
                        System.out.println("No es dia laboral");
                    }
                    break;
                case 9:
                    Ejercicio9 ejercicio9 = new Ejercicio9();
                    String mensajeAReemplazar = "La sonrisa sera la mejor arma contra la tristeza";
                    String mensajeReemplazado = ejercicio9.reemplazarLetraAPorEDentroDeCadenasDeTexto(mensajeAReemplazar);
                    System.out.println(mensajeReemplazado);
                    System.out.println("Ingrese mensaje a concatenar:");
                    String mensajeAConcatenar = scanner.nextLine();
                    System.out.println(ejercicio9.concatenarMensaje(mensajeAReemplazar,mensajeAConcatenar));
                    break;
                case 10:
                    Ejercicio10 ejercicio10 = new Ejercicio10();
                    System.out.println("Ingrese mensaje al cual quitar los espacios:");
                    String mensajeAQuitarEspacios = scanner.nextLine();
                    System.out.println(ejercicio10.eliminarEspacios(mensajeAQuitarEspacios));
                    break;
                case 11:
                    Ejercicio11 ejercicio11 = new Ejercicio11();
                    System.out.println("Ingrese mensaje al cual contar longitud y vocales:");
                    String mensaje = scanner.nextLine();
                    System.out.println(ejercicio11.contarCadaVocalYLongitudDelMensaje(mensaje));
                    break;
                case 12:
                    Ejercicio12 ejercicio12 = new Ejercicio12();
                    System.out.println("Ingrese la primera palabra:");
                    String palabra1 = scanner.nextLine();
                    String palabra[]= palabra1.split(" ");
                    palabra1 = palabra[0];
                    System.out.println("Ingrese la segunda palabra:");
                    String palabra2 = scanner.nextLine();
                    String segundaPalabra[] = palabra2.split(" ");
                    palabra2 = segundaPalabra[0];
                    System.out.println(ejercicio12.compararPalabras(palabra1,palabra2));
                    break;
                case 13:
                    Ejercicio13 ejercicio13 = new Ejercicio13();
                    System.out.println(ejercicio13.obtenerFechaActual());
                    break;
                case 14:
                    Ejercicio14 ejercicio14 = new Ejercicio14();
                    boolean argumentosValidosEjercicio14 = false;
                    String mensajeEjercicio ="";
                    while(!argumentosValidosEjercicio14) {
                        try {
                            System.out.println("Escriba el numero desde el cual mostrar la secuencia:");
                            int a = Integer.parseInt(scanner.nextLine());
                            mensajeEjercicio = ejercicio14.mostrarSecuanciaDesdeNHastaMilConIncrementosDeDos(a);
                            argumentosValidosEjercicio14 = true;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Argumento incorrecto, solo numeros enteros.");
                        }
                    }
                    System.out.println(mensajeEjercicio);
                default:
                    break;
            }
        }while(opcion!=19);
    }
}
