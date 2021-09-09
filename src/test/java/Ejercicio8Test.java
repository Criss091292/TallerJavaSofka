import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio8Test {

    @Test
    void esDiaLaboral() {
        Ejercicio8 ejercicio = new Ejercicio8();
        assertTrue(ejercicio.esDiaLaboral("lunes"));
        assertTrue(ejercicio.esDiaLaboral("martes"));
        assertTrue(ejercicio.esDiaLaboral("miercoles"));
        assertTrue(ejercicio.esDiaLaboral("jueves"));
        assertTrue(ejercicio.esDiaLaboral("viernes"));
        assertTrue(ejercicio.esDiaLaboral("sabado"));
        assertFalse(ejercicio.esDiaLaboral("domingo"));
        assertTrue(ejercicio.esDiaLaboral("luNes"));
        assertTrue(ejercicio.esDiaLaboral("maRtes"));
        assertTrue(ejercicio.esDiaLaboral("mieRcoles"));
        assertTrue(ejercicio.esDiaLaboral("jueVes"));
        assertTrue(ejercicio.esDiaLaboral("vieRnes"));
        assertTrue(ejercicio.esDiaLaboral("sabAdo"));
        assertFalse(ejercicio.esDiaLaboral("domIngo"));

    }
}