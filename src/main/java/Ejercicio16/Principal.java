package Ejercicio16;

import java.util.Scanner;

public class Principal {

    public void mostrarPersonas(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Nombre:");
        String nombre = lector.nextLine();
        Integer edad = -1;
        do{
            try{
                System.out.println("Edad:");
                edad  = Integer.parseInt(lector.nextLine().toString());
            }catch (IllegalArgumentException e){
                System.out.println("Debe digitar un numero positivo");
                edad = -1;
            }
        }while (edad <0);

        System.out.println("Sexo:");
        Character sexo = lector.nextLine().charAt(0);
        double peso = -1;
        do{
            try{
                System.out.println("Peso:");
                peso  = Double.parseDouble(lector.nextLine().toString());
            }catch (IllegalArgumentException e){
                System.out.println("Debe digitar un numero positivo");
                peso = -1;
            }
        }while (peso <0);
        double altura = -1;
        do{
            try{
                System.out.println("Altura:");
                altura  = Double.parseDouble(lector.nextLine().toString());
            }catch (IllegalArgumentException e){
                System.out.println("Debe digitar un numero positivo");
                altura = -1;
            }
        }while (altura <0);
        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

        if (persona1.calcularIMC(peso,altura)<0){
            System.out.println("Esta por debajo de su peso ideal.");
        }else if (persona1.calcularIMC(peso,altura)==0){
            System.out.println("Esta en su peso ideal.");
        }else{
            System.out.println("Tiene sobrepeso.");
        }
        if (persona1.esMayorDeEdad(edad)){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("No es mayor de edad");
        }
        System.out.println(persona1.toString());

        if (persona2.calcularIMC(peso,altura)<0){
            System.out.println("Esta por debajo de su peso ideal.");
        }else if (persona2.calcularIMC(peso,altura)==0){
            System.out.println("Esta en su peso ideal.");
        }else{
            System.out.println("Tiene sobrepeso.");
        }
        if (persona2.esMayorDeEdad(edad)){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("No es mayor de edad");
        }
        System.out.println(persona2.toString());

        if (persona3.calcularIMC(peso,altura)<0){
            System.out.println("Esta por debajo de su peso ideal.");
        }else if (persona3.calcularIMC(peso,altura)==0){
            System.out.println("Esta en su peso ideal.");
        }else{
            System.out.println("Tiene sobrepeso.");
        }
        if (persona3.esMayorDeEdad(edad)){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("No es mayor de edad");
        }
        System.out.println(persona3.toString());
    }
}
