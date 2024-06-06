package Simulador;

import java.util.ArrayList;
import Simulador.Estacion;

public class Gestor {
    
    private ArrayList<Pieza> cola;
    private ArrayList<Pieza> almacen;

    public void empezar() {
        ArrayList<Estacion> estaciones = new ArrayList();
        estaciones.add(new Estacion("corte"));
        estaciones.add(new Estacion("doblez"));
        estaciones.add(new Estacion("ensamble"));
        estaciones.add(new Estacion("pintura"));

        String[] secuencia = {"corte", "ensamble", "pintura"};
        String[] secuencia2 = {"doblez", "ensamble", "pintura"};

        ArrayList<Pieza> piezas = new ArrayList();
        piezas.add(new Pieza("pieza1", 2, 2, "rojo", secuencia));
        piezas.add(new Pieza("pieza2", 2, 2, "azul", secuencia2));
        //piezas.add(new Pieza("pieza3",2,2,"amarillo", secuencia));
        
        System.out.println("Estaciones:");
        for (int i = 0; i < estaciones.size(); i++) {
            System.out.println(estaciones.get(i).getTipo());
        }
        System.out.println("");

        System.out.println("Piezas:");
        for (int i = 0; i < piezas.size(); i++) {
            System.out.print(piezas.get(i).getNombre() + " " + piezas.get(i).getColor() + " Secuencia: ");
            for (int j = 0; j < piezas.get(i).getSecuencia().length; j++) {
                System.out.print(piezas.get(i).getSecuencia()[j] + " ");
            }
            System.out.println("");
        }
    }

}
