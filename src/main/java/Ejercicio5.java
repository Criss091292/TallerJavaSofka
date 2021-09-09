public class Ejercicio5 {
    String mostrarParesEImparesHastaN(int n){
        int i = 1;
        String mensajePares = "Pares: ";
        String mensajeImpares ="Impares: ";
        while(i<=n){
            if(i%2==0){
                mensajePares= mensajePares+i+",";
            }else{
                mensajeImpares= mensajeImpares+i+",";
            }
            i++;
        }
        String mensaje = mensajeImpares+"\n"+mensajePares;
        return mensaje;
    }
}
