import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio11Test {

    @Test
    void contarCadaVocalYLongitudDelMensaje() {
        Ejercicio11 ejercicio = new Ejercicio11();
        assertEquals("El mensaje tiene 11 caracteres de longitud\nCantidad de 'a': 1\nCantidad de 'e': 1\nCantidad de 'i': 1\nCantidad de 'o': 1\nCantidad de 'u': 1",ejercicio.contarCadaVocalYLongitudDelMensaje("Murcielagos"));
        assertEquals("El mensaje tiene 12 caracteres de longitud\nCantidad de 'a': 2\nCantidad de 'e': 1\nCantidad de 'i': 1\nCantidad de 'o': 1\nCantidad de 'u': 1",ejercicio.contarCadaVocalYLongitudDelMensaje("MUrcielagosa"));
    }
}