package Ejercicio17;

import java.util.Locale;

public class Electrodomestico {
    private double precioBase = 100;
    private String color = "blanco";
    char consumoEnergetico = 'F';
    private  double peso = 5;

    public Electrodomestico(){

    }
    public Electrodomestico(double precio, double peso){
        this.precioBase = precio;
        this.peso = peso;
    }
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso){
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public char comprobarConsumoEnergetico(char consumoEnergetico){
        char retorno = 'F';
        switch (consumoEnergetico){
            case 'A':
                retorno = 'A';
                break;
            case 'B':
                retorno = 'B';
                break;
            case 'C':
                retorno = 'C';
            case 'D':
                retorno = 'D';
            case 'E':
                retorno = 'E';
            case 'F':
                retorno = 'F';
            default:
                break;
        }
        return retorno;
    }

    public String comprobarColor(String color){
        switch (color.toLowerCase()){
            case "azul":
                break;
            case "amarillo":
                break;
            case "rojo":
                break;
            case "negro":
                break;
            case "blanco":
                break;
            default:
                color = "blanco";
                break;
        }
        return color;
    }

    public double precioFinal(char consumoEnergetico){
        double precioFinal;
        switch (consumoEnergetico){
            case 'A':
                precioFinal=100;
                break;
            case 'B':
                precioFinal=80;
                break;
            case 'C':
                precioFinal=60;
                break;
            case 'D':
                precioFinal=50;
                break;
            case 'E':
                precioFinal=30;
                break;
            case 'F':
                precioFinal=10;
                break;
            default:
                precioFinal=10;
                break;
        }

        if(this.peso >= 0 && this.peso <= 19)
            precioFinal += 10;
        else if(this.peso >= 20 && this.peso <= 49)
            precioFinal += 50;
        else if(this.peso >= 50 && this.peso <= 79)
            precioFinal += 80;
        else if(this.peso > 80)
            precioFinal += 100;

        return precioFinal+this.precioBase;
    }
}
