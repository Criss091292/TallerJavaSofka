import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio7Test {

    @Test
    void esMayorOIgualQueCero() {
        Ejercicio7 ejercicio = new Ejercicio7();
        assertTrue(ejercicio.EsMayorOIgualQueCero(5.0));
        assertFalse(ejercicio.EsMayorOIgualQueCero(-5.0));
        assertTrue(ejercicio.EsMayorOIgualQueCero(0.0));
    }
}