public class Ejercicio1 {
    String numeroMayor(float a, float b){
        String mensaje = "El numero mayor es: ";
        if(a>b)
            mensaje += a;
        else if (a<b)
            mensaje += b;
        else
            mensaje = "Los numeros son iguales: " + a;
        return mensaje;
    }
}