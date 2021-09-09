import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {
    String obtenerFechaActual(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");
        //System.out.println
        return("Fecha y hora actual: "+dtf.format(LocalDateTime.now()));
    }
}
