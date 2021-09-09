public class Ejercicio12 {
    String compararPalabras(String palabra1, String palabra2){
        int menorLongitud;
        int mayorLongitud;
        String mensajeRespuesta= "";
        if (palabra1.equals(palabra2)){
            mensajeRespuesta= "Las palabras son iguales.";
        }
        if(palabra1.length()>palabra2.length()){
            menorLongitud=palabra2.length();
            mayorLongitud=palabra1.length();
        }else{
            menorLongitud=palabra1.length();
            mayorLongitud=palabra2.length();
        }
        for (int i =0;i<menorLongitud;i++){
            if(palabra1.charAt(i)!=palabra2.charAt(i)){
                mensajeRespuesta += "Difrecencia en la letra " +(i+1)+ " valor palabra 1: "+palabra1.charAt(i) + " valor palabra 2: "+palabra2.charAt(i)+"\n";
            }
        }
        for (int i = menorLongitud;i<mayorLongitud;i++){
            if (palabra1.length()<=palabra2.length()){
                mensajeRespuesta += "Difrecencia en la letra " +(i+1)+ " valor palabra 1: ''  valor palabra 2: "+palabra2.charAt(i)+"\n";
            }else{
                mensajeRespuesta += "Difrecencia en la letra " +(i+1)+ " valor palabra 1: "+palabra1.charAt(i)+ " valor palabra 2: ''";
            }
        }
        return mensajeRespuesta;

    }
}
