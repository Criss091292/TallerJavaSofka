import javax.swing.*;

public class Ejercicio15 {
    public void mostrarMenu(){
        int opt=9;
        do{
            String opcion= JOptionPane.showInputDialog("****** GESTION CINEMATOGRÁFICA ********\n1-NUEVO ACTOR\n2-BUSCAR ACTOR\n3-ELIMINAR ACTOR\n4-MODIFICAR ACTOR\n5-VER TODOS LOS ACTORES\n6- VER PELICULAS DE LOS ACTORES\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8-SALIR",1);
            try{
                opt=Integer.parseInt(opcion);
                switch (opt){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        return;
                    default:
                        JOptionPane.showMessageDialog(null,"OPCION INCORRECTO");
                }
            }catch (IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
            }
        }while(opt!=8);
    }

}
