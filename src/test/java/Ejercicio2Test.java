import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {
    Ejercicio2 ejercicio2  = new Ejercicio2();
    @Test
    @DisplayName("dados dos numeros debe retornar el numero mayor")
    void numeroMayor(){
        assertEquals("El numero mayor es: "+5f, ejercicio2.numeroMayor( 5f,3f));
        assertEquals("El numero mayor es: "+5f,ejercicio2.numeroMayor(5f,3f));
        assertEquals("El numero mayor es: "+-3f,ejercicio2.numeroMayor(-5f,-3f));
        assertEquals("El numero mayor es: "+-3f,ejercicio2.numeroMayor(-3f,-5f));
        assertEquals("El numero mayor es: "+5.2f, ejercicio2.numeroMayor(5.2f,3f));
        assertEquals("El numero mayor es: "+5f,ejercicio2.numeroMayor(5f,3.3f));
        assertEquals("El numero mayor es: "+-3f,ejercicio2.numeroMayor(-5.5f,-3f));
        assertEquals("El numero mayor es: "+-3f,ejercicio2.numeroMayor(-3f,-5.5f));
        assertEquals("Los numeros son iguales: "+-5.5f,ejercicio2.numeroMayor(-5.5f,-5.5f));
        assertEquals("Los numeros son iguales: "+-5f,ejercicio2.numeroMayor(-5f,-5f));
    }
}