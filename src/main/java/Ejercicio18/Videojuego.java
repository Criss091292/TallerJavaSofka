package Ejercicio18;

public class Videojuego implements Entregable{
    private String titulo = "";
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";
    Videojuego(){
    }
    Videojuego(String titulo, int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }
    Videojuego(String titulo, int horasEstimadas, boolean entregado, String genero, String compania){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregado;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    @Override
    public String toString(){
        return ("titulo" + this.titulo + " horas estimadas: " + this.horasEstimadas +
                " entregado: "+ this.entregado + " genero: " + this.genero + " compania:" + this.compania);
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean esEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object a) {
        Videojuego videojuegoAComparar = (Videojuego) a;
        return  (String.valueOf(videojuegoAComparar.getHorasEstimadas())).compareTo(String.valueOf(this.getHorasEstimadas()));
    }

}