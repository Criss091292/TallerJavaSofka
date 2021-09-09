import javax.swing.*;

import static java.lang.Integer.*;

public class Menu {
    public static void main(String[] args) {
        int opcion=19;
        do{
            opcion = parseInt(JOptionPane.showInputDialog("Bienvenido, este es un taller de Sofka U\nDigite el numero del ejercicio a revisar, 19 para salir."));
            switch (opcion){
                case 1:
                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    boolean argumentosValidos = false;
                    while(!argumentosValidos){
                        try{
                            float a = Float.parseFloat(JOptionPane.showInputDialog(null,"Escriba el primer numero"));
                            float b = Float.parseFloat(JOptionPane.showInputDialog(null,"Escriba el segundo numero"));
                            String message = ejercicio1.numeroMayor(a,b);
                            JOptionPane.showMessageDialog(null,message);
                            argumentosValidos=true;
                        }catch (IllegalArgumentException e){
                            JOptionPane.showMessageDialog(null, "Argumento incorrecto, solo numeros.");
                            //throw e;
                        }
                    }
                    break;
                default:
                    break;
            }
        }while(opcion!=19);
    }
}
