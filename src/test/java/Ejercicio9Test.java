import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio9Test {
    Ejercicio9 ejercicio = new Ejercicio9();
    @Test
    void reemplazarLetraAPorEDentroDeCadenasDeTexto() {

        assertEquals("Le sonrise sere le mejor erme contre le tristeze",ejercicio.reemplazarLetraAPorEDentroDeCadenasDeTexto("La sonrisa sera la mejor arma contra la tristeza"));
    }

    @Test
    void concatenarMensaje(){
        String mensajeAConcatenar= "Prueba de mensaje a concatenar.";
        assertEquals("Le sonrise sere le mejor erme contre le tristeze"+" "+mensajeAConcatenar,ejercicio.concatenarMensaje("La sonrisa sera la mejor arma contra la tristeza",mensajeAConcatenar));
    }
}