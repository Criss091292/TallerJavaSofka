
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    Ejercicio1 ejercicio1  = new Ejercicio1();
    @Test
    @DisplayName("dados dos numeros debe retornar el numero mayor")
    void numeroMayor(){
        assertEquals("El numero mayor es: "+5f, ejercicio1.numeroMayor( 5f,3f));
        assertEquals("El numero mayor es: "+5f,ejercicio1.numeroMayor(5f,3f));
        assertEquals("El numero mayor es: "+-3f,ejercicio1.numeroMayor(-5f,-3f));
        assertEquals("El numero mayor es: "+-3f,ejercicio1.numeroMayor(-3f,-5f));
        assertEquals("El numero mayor es: "+5.2f, ejercicio1.numeroMayor(5.2f,3f));
        assertEquals("El numero mayor es: "+5f,ejercicio1.numeroMayor(5f,3.3f));
        assertEquals("El numero mayor es: "+-3f,ejercicio1.numeroMayor(-5.5f,-3f));
        assertEquals("El numero mayor es: "+-3f,ejercicio1.numeroMayor(-3f,-5.5f));
        assertEquals("Los numeros son iguales: "+-5.5f,ejercicio1.numeroMayor(-5.5f,-5.5f));
        assertEquals("Los numeros son iguales: "+-5f,ejercicio1.numeroMayor(-5f,-5f));
    }

}