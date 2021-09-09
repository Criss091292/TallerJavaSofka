import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio4Test {

    @Test
    void calcularIva() {
        Ejercicio4 ejercicio = new Ejercicio4();
        assertEquals(121.0, ejercicio.calcularIva(100.0));
        assertEquals(60.5, ejercicio.calcularIva(50.0));
    }
}