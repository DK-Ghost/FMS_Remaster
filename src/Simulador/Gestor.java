package Simulador;

import java.util.ArrayList;
import Simulador.Estacion;
import Simulador.EstacionesPanel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Gestor {

    private ArrayList<Pieza> cola;
    private ArrayList<Pieza> almacen;
    public static EstacionesPanel panelMain;
    private ArrayList<Estacion> estaciones;
    public static int cortadoraEstado = 0;
    public static Estacion estacion;

    public void empezar() {    
        //genera el listenerpara la prueba del detector de ocupacion
//        generarListener();
        
        //Se genera el panel de control para prueba de estaciones        
        panelMain = new EstacionesPanel();
        panelMain.setVisible(true);

        //Se generan las estaciones y piezas
        estaciones = crearEstaciones();
        ArrayList<Pieza> piezas = generarPiezas();

        //Instanciamos la cortadora para las pruebas de la estacion
        this.estacion = estaciones.get(0);
        System.out.println(this.estacion.getTipo());
        
        //Se inicia el hilo de la estacion
        Thread t = new Thread(this.estacion);
        t.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int getCortadoraEstado() {
        return cortadoraEstado;
    }

    public static void setCortadoraEstado(int cortadoraEstado) {
        Gestor.cortadoraEstado = cortadoraEstado;
    }
  
    private ArrayList<Estacion> crearEstaciones() {
        //Se generan las 4 estaciones, en este caso la cortadora recibe trato especial para las pruebas
        ArrayList<Estacion> estaciones = new ArrayList();
        estaciones.add(new Cortadora());
        estaciones.add(new Estacion("doblez"));
        estaciones.add(new Estacion("ensamble"));
        estaciones.add(new Estacion("pintura"));

        //Para las pruebas se muestran las estaciones
        System.out.println("Estaciones:");
        for (int i = 0; i < estaciones.size(); i++) {
            System.out.println(estaciones.get(i).getTipo());
        }
        System.out.println("");

        return estaciones;
    }

    private ArrayList<Pieza> generarPiezas() {
        //Se generan  2 piezas con 2 secuencias diferentes para la prueba
        String[] secuencia = {"corte", "ensamble", "pintura"};
        String[] secuencia2 = {"doblez", "ensamble", "pintura"};

        ArrayList<Pieza> piezas = new ArrayList();
        piezas.add(new Pieza("pieza1", 2, 2, "rojo", secuencia));
        piezas.add(new Pieza("pieza2", 2, 2, "azul", secuencia2));
        //piezas.add(new Pieza("pieza3",2,2,"amarillo", secuencia));

        //Para las pruebas se muestran las piezas
        System.out.println("Piezas:");
        for (int i = 0; i < piezas.size(); i++) {
            System.out.print(piezas.get(i).getNombre() + " " + piezas.get(i).getColor() + " Secuencia: ");
            for (int j = 0; j < piezas.get(i).getSecuencia().length; j++) {
                System.out.print(piezas.get(i).getSecuencia()[j] + " ");
            }
            System.out.println("");
        }

        return piezas;
    }

    private void generarListener() {
        //Se crea el hilo del Listener para detectar cuando este ocupada la cortadora
        Runnable list = new Listener();
        Thread t = new Thread(list);
        t.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
