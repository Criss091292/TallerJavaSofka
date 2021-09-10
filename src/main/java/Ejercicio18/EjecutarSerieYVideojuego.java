package Ejercicio18;

public class EjecutarSerieYVideojuego {
    private Serie arraySerie[] = new Serie[5];
    private Videojuego arrayVideoJuego[] = new Videojuego[5];

    public EjecutarSerieYVideojuego() {
        llenarArreglos();
        entregarSeriesYVideoJuegos();
        System.out.println("Total videojuegos entregados: " + contarVideoJuegosYEntregarlas(arrayVideoJuego));
        System.out.println("Total series entregadas: " + contarSeriesYEntregarlas(arraySerie));
        System.out.println(mostrarVideoJuegoConMasHorasYSerieMasTemporadas(arrayVideoJuego,arraySerie));
    }

    public void llenarArreglos() {
        Serie serie1 = new Serie();
        Serie serie2 = new Serie();
        Serie serie3 = new Serie("How i met your Mother", 10, "Comedia", "Ni idea");
        Serie serie4 = new Serie("Frozen", "Disney");
        Serie serie5 = new Serie("Lost", 15,"Supervivencia", "Anonimo");
        arraySerie[0] = serie1;
        arraySerie[1] = serie2;
        arraySerie[2] = serie3;
        arraySerie[3] = serie4;
        arraySerie[4] = serie5;

        Videojuego videojuego1 = new Videojuego();
        Videojuego videojuego2 = new Videojuego();
        Videojuego videojuego3 = new Videojuego("Super Mario Bros", 5);
        Videojuego videojuego4 = new Videojuego("Halo", 20);
        Videojuego videojuego5 = new Videojuego("Resident evil 4", 30, false, "Survival horro", "capcom");

        arrayVideoJuego[0] = videojuego1;
        arrayVideoJuego[1] = videojuego2;
        arrayVideoJuego[2] = videojuego3;
        arrayVideoJuego[3] = videojuego4;
        arrayVideoJuego[4] = videojuego5;
    }

    public void entregarSeriesYVideoJuegos() {
        arraySerie[2].entregar();
        arraySerie[4].entregar();
        arrayVideoJuego[0].entregar();
        arrayVideoJuego[3].entregar();
    }

    public int contarVideoJuegosYEntregarlas(Videojuego arrayVideoJuego[]) {
        int contador = 0;
        for (Videojuego videoJuego : arrayVideoJuego) {
            if (videoJuego.esEntregado()) {
                videoJuego.devolver();
                contador++;
            }
        }
        return contador;
    }

    public int contarSeriesYEntregarlas(Serie arraySerie[]) {
        int contador = 0;
        for (Serie serie : arraySerie) {
            if (serie.esEntregado()) {
                serie.devolver();
                contador++;
            }
        }
        return contador;
    }

    public String mostrarVideoJuegoConMasHorasYSerieMasTemporadas(Videojuego arrayVideoJuego[], Serie arraySerie[]) {
        String mensajeRespuesta = "VideoJuego con mas horas estimadas: ";
        int indiceVideoJuegoMasHoras = 0;
        int indiceSerieMasHoras = 0;
        if (arrayVideoJuego.length <= 0) {
            return "El array esta vacio";
        }
        for (int i = 0; i < arrayVideoJuego.length-1; i++) {
            if (i > 0) {
                if (arrayVideoJuego[i].getHorasEstimadas() > arrayVideoJuego[i - 1].getHorasEstimadas()) {
                    indiceVideoJuegoMasHoras = i;
                }
            }
            mensajeRespuesta += "\n" + arrayVideoJuego[i].toString() + "\nSerie con mas temporadas:";
            for (i = 0; i < arraySerie.length-1; i++) {
                if (i > 0) {
                    if (arraySerie[i].getNumeroDeTemporadas() > arraySerie[i - 1].getNumeroDeTemporadas()) {
                        indiceSerieMasHoras = i;
                    }
                }
            }
            mensajeRespuesta += "\n" + arraySerie[i].toString();
        }
        return mensajeRespuesta;
    }
}
