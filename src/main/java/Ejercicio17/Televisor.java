package Ejercicio17;

public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean esSintonizadorTDT;

    public Televisor(){
        super();
        resolucion = 20;
        esSintonizadorTDT = false;
    }
    public Televisor(double precio, double peso){
        super(precio,peso);
        this.resolucion = 20;
        this.esSintonizadorTDT = false;
    }
    public Televisor(int resolucion, boolean esSintonizadorTDT,double precio, String color, char consumoEnergetico, double peso){
        super(precio,color,consumoEnergetico,peso);
        this.resolucion = resolucion;
        this.esSintonizadorTDT = esSintonizadorTDT;
    }

    double precioFinal(int resolucion,boolean esSintonizadorTDT){
        double precio = super.precioFinal(this.consumoEnergetico);
        double aumento = 0;
        if(esSintonizadorTDT){
            aumento = 50;
        }
        if(resolucion>40){
            precio = precio*1.3;
        }
        double precioFinal = precio + aumento;
        return precioFinal;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isEsSintonizadorTDT() {
        return esSintonizadorTDT;
    }
}
