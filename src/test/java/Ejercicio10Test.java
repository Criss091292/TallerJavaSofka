import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio10Test {

    @Test
    void eliminarEspacios() {
        Ejercicio10 ejercicio = new Ejercicio10();
        assertEquals("AlPerroLeGustanLasCroquetas",ejercicio.eliminarEspacios("Al Perro Le Gustan Las Croquetas"));
        assertEquals("AlPerroLeGustanLasCroquetas",ejercicio.eliminarEspacios("Al P   erro Le Gu  stan L as Croquetas "));
    }
}