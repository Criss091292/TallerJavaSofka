import java.util.Locale;

public class Ejercicio8 {
    Boolean esDiaLaboral(String diaDeLaSemana){
        boolean esLaboral = false;
        switch (diaDeLaSemana.toLowerCase()){

            case "lunes":
                esLaboral=true;
                break;
            case "martes":
                esLaboral=true;
                break;
            case "miercoles":
                esLaboral=true;
                break;
            case "jueves":
                esLaboral=true;
                break;
            case "viernes":
                esLaboral=true;
                break;
            case "sabado":
                esLaboral=true;
                break;
            case "domingo":
                esLaboral=false;
                break;
            default:
                esLaboral=false;
                break;
        }
        return esLaboral;
    }
}
