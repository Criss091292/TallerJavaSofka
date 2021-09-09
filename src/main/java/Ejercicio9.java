public class Ejercicio9 {

    String reemplazarLetraAPorEDentroDeCadenasDeTexto(String cadena){
        return cadena.replace("a","e");
    }
    String concatenarMensaje(String cadena, String mensajeAConcatenar){
        return reemplazarLetraAPorEDentroDeCadenasDeTexto("La sonrisa sera la mejor arma contra la tristeza").concat(" ").concat(mensajeAConcatenar);
    }
}
