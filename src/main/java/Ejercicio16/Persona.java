package Ejercicio16;

import lombok.*;

@ToString
public class Persona {
    private String nombre ="";
    private int edad = 0;
    private String DNI;
    private final char sexo;
    private double peso = 0;
    private double altura = 0;
    public Persona(){
        this.sexo = comprobarSexo('H');
        this.DNI = generaDNI();
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre= nombre;
        this.edad = edad;
        this.sexo = comprobarSexo('H');
        this.DNI = generaDNI();
    }
    public Persona(String nombre, int edad,/*String DNI,*/ char sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.DNI= generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    int calcularIMC(double peso, double estatura){
        double IMC = peso/Math.pow(estatura,2);
        if(IMC<20){
            return -1;
        } else if (IMC <= 25) {
            return 0;
        }else {
            return 1;
        }
    }
    boolean esMayorDeEdad(Integer edad){
        return edad >= 18 ? true : false;
    }
    char comprobarSexo(char sexo){
        char respuesta ='H';
        switch (sexo){
            case 'M':
                respuesta ='M';
                break;
            case 'm':
                respuesta = 'm';
                break;
            case 'h':
                respuesta = 'h';
                break;
            case 'H':
                respuesta = 'H';
                break;
            default:
                respuesta = 'H';
                break;
        }
        return  respuesta;
    }
    String generaDNI(){
        Integer numeroDNI=(int)(Math.random()*(99999999-10000000+1)+10000000);
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        Integer modulo= numeroDNI % 23;
        char letra = juegoCaracteres.charAt(modulo);
        String DNI=numeroDNI.toString()+letra;
        return DNI;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
