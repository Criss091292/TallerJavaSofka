package Ejercicio18;

public class Serie implements Entregable {
    private String titulo="";
    private int numeroDeTemporadas = 3;
    private boolean entregado = false;
    private String genero="";
    private String creador="";

    Serie(){
    }

    Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }

    Serie(String titulo,int numeroDeTemporadas,String genero,String creador){
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString(){
        return ("titulo" + this.titulo + " numero de temporadas: " + this.numeroDeTemporadas +
                " entregado: "+ this.entregado + " genero: " + this.genero + " creador:" + this.creador);
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
        Serie serieAComparar= (Serie) a;
        return  (String.valueOf(serieAComparar.getNumeroDeTemporadas())).compareTo(String.valueOf(this.getNumeroDeTemporadas()));
    }
}
