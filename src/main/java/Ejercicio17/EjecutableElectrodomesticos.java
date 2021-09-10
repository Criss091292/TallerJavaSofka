package Ejercicio17;

public class EjecutableElectrodomesticos{
    public void ejecutar() {
        Electrodomestico[] arrayElectrodomesticos = new Electrodomestico[10];
        Electrodomestico electrodomestico1 = new Electrodomestico();
        Lavadora lavadora1 = new Lavadora();
        Televisor televisor1 = new Televisor();
        Electrodomestico electrodomestico2 = new Electrodomestico();
        Lavadora lavadora2 = new Lavadora();
        Televisor televisor2 = new Televisor();
        Electrodomestico electrodomestico3 = new Electrodomestico();
        Lavadora lavadora3 = new Lavadora();
        Televisor televisor3 = new Televisor();
        Electrodomestico electrodomestico = new Electrodomestico();

        //llenar array de electrodomesticos
        arrayElectrodomesticos[0]=(electrodomestico);
        arrayElectrodomesticos[1]=(televisor1);
        arrayElectrodomesticos[2]=(lavadora1);
        arrayElectrodomesticos[3]=(lavadora2);
        arrayElectrodomesticos[4]=(televisor2);
        arrayElectrodomesticos[5]=(electrodomestico1);
        arrayElectrodomesticos[6]=(electrodomestico2);
        arrayElectrodomesticos[7]=(lavadora3);
        arrayElectrodomesticos[8]=(electrodomestico3);
        arrayElectrodomesticos[9]=(televisor3);

        //recorrer Array
        double precioTotal=0;
        for (int i = 0; i < arrayElectrodomesticos.length; i++) {
            if (arrayElectrodomesticos[i] instanceof Televisor){
                System.out.println("precio del televisor en el indice "+ i + " " +arrayElectrodomesticos[i].precioFinal(arrayElectrodomesticos[i].consumoEnergetico));
                precioTotal+=((Televisor) arrayElectrodomesticos[i]).precioFinal(((Televisor) arrayElectrodomesticos[i]).getResolucion(),((Televisor) arrayElectrodomesticos[i]).isEsSintonizadorTDT());
            }else if (arrayElectrodomesticos[i] instanceof Lavadora) {
                System.out.println("precio de lavadora en el indice " + i + " " + ((Lavadora) arrayElectrodomesticos[i]).precioFinal(((Lavadora) arrayElectrodomesticos[i]).getCarga()));
                precioTotal += ((Lavadora) arrayElectrodomesticos[i]).precioFinal(((Lavadora) arrayElectrodomesticos[i]).getCarga());
            }else{
                System.out.println("precio del Electrodomestico en el indice " + i + " " + arrayElectrodomesticos[i].precioFinal(arrayElectrodomesticos[i].getConsumoEnergetico()));
                precioTotal += arrayElectrodomesticos[i].precioFinal(arrayElectrodomesticos[i].getConsumoEnergetico());
            }
            System.out.println("El precio final es:"  + precioTotal);
        }


    }
}
