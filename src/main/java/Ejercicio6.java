public class Ejercicio6 {
    String mostrarParesEImparesHastaN(int n){

        String mensajePares = "Pares: ";
        String mensajeImpares ="Impares: ";
        for(int i=1;i<=n;i++){
            if(i%2==0){
                mensajePares= mensajePares+i+",";
            }else{
                mensajeImpares= mensajeImpares+i+",";
            }
        }
        String mensaje = mensajeImpares+"\n"+mensajePares;
        return mensaje;
    }
}
