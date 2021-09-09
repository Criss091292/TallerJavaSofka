import java.util.Locale;

public class Ejercicio11 {
    String contarCadaVocalYLongitudDelMensaje(String mensaje){
        int longitudMensaje = mensaje.length();
        int cantidadA=0,cantidadE=0,cantidadI=0,cantidadO=0,cantidadU=0;
        String mensajeRespuesta = "El mensaje tiene "+mensaje.length()+ " caracteres de longitud";
        for(int i =0;i<longitudMensaje;i++){
            switch (mensaje.toLowerCase().charAt(i)){
                case 'a':
                    cantidadA++;
                    break;
                case 'e':
                    cantidadE++;
                    break;
                case 'i':
                    cantidadI++;
                    break;
                case 'o':
                    cantidadO++;
                    break;
                case 'u':
                    cantidadU++;
                    break;
                default:
                    break;
            }
        }
        mensajeRespuesta = mensajeRespuesta +"\nCantidad de 'a': "+cantidadA +"\nCantidad de 'e': "+cantidadE+
                "\nCantidad de 'i': "+cantidadI+"\nCantidad de 'o': "+cantidadO + "\nCantidad de 'u': "+cantidadU;
        return mensajeRespuesta;
    }
}
