package Ejercicio17;

public class Lavadora extends Electrodomestico{

    private final double carga;
    public Lavadora(){
        super();
        this.carga =5;
    }
    public Lavadora(double precio, double peso){
        super(precio,peso);
        this.carga =5;
    }
    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga){
        super(precio,color,consumoEnergetico,peso);
        this.carga = carga;
    }

    double precioFinal(double carga){
        double precio = super.precioFinal(this.consumoEnergetico);
        double aumento = 0;
        if(carga >30){
            aumento = 50;
        }
        double precioFinal = precio + aumento;
        return precioFinal;
    }

    public double getCarga() {
        return carga;
    }
}
