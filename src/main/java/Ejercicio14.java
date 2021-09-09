public class Ejercicio14 {
    public String mostrarSecuanciaDesdeNHastaMilConIncrementosDeDos(int a) {
        String mensaje ="";
        for (int i=a;a<=1000;a+=2){
            mensaje+=a+",";
        }
        return mensaje;
    }
}
