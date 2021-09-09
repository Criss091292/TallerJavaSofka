import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio3Test {

    @Test
    @DisplayName("Dado el radio devuelve el area del circulo")
    void calcularAreaCirculo() {
        Ejercicio3 ejercicio = new Ejercicio3();
        assertEquals(0,ejercicio.calcularAreaCirculo(0));
        assertEquals(Math.PI,ejercicio.calcularAreaCirculo(1));
        assertEquals(Math.PI*9, ejercicio.calcularAreaCirculo(3.0));
        assertEquals(Math.PI*0.25, ejercicio.calcularAreaCirculo(0.5));
        assertEquals(Math.PI,ejercicio.calcularAreaCirculo(-1));
        assertEquals(Math.PI*9, ejercicio.calcularAreaCirculo(-3.0));
        assertEquals(Math.PI*0.25, ejercicio.calcularAreaCirculo(-0.5));
    }
}