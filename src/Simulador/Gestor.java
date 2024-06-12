package Simulador;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gestor implements Runnable {

    public static ArrayList<Pieza> almacen;
    public static EstacionesPanel panelMain;
    private ArrayList<Estacion> estaciones;
    public static Estacion cortadora;
    public static Estacion dobladora;
    public static int colaIndex;

    public void empezar() {
        //genera el listenerpara la prueba del detector de ocupacion
//        generarListener();

        this.colaIndex = 0;
        //Se genera el panel de control para prueba de estaciones        
        panelMain = new EstacionesPanel();
        panelMain.setVisible(true);

        //Se generan las estaciones y piezas
        Gestor.almacen = generarPiezas();
        crearEstaciones();

//        //Prueba para operar la pieza 1
//        this.cortadora.operar(piezas.get(0));
//        
//        //Esperar 10 segundos
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        //Prueba para operar la pieza 2
//        this.cortadora.operar(piezas.get(1));
    }

    //Getters y Setters
    public static int getColaIndex() {
        return colaIndex;
    }

    public static void setColaIndex(int colaIndex) {
        Gestor.colaIndex = colaIndex;
    }

    public static Estacion getCortadora() {
        return cortadora;
    }

    public static void setCortadora(Estacion cortadora) {
        Gestor.cortadora = cortadora;
    }

    public static Estacion getDobladora() {
        return dobladora;
    }

    public static void setDobladora(Estacion dobladora) {
        Gestor.dobladora = dobladora;
    }
    
    //Metodo para operar la siguiente pieza en almacen 
    static void siguientePieza() {
        //Si aun hay piezas en el almacen, manda la siguiente pieza a operar
        try {
            Pieza p = almacen.get(Gestor.getColaIndex());
            //aumentael numero de la cola *** Aun no se quitan los elementos de la lista
            Gestor.setColaIndex(Gestor.getColaIndex() + 1);
            Gestor.siguientePieza(p);
        } catch (Exception ex) {
            System.out.println("Ya no hay piezas en el Almacen");
//            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Metodo para operar la siguiente pieza
    static void siguientePieza(Pieza p) {
        Gestor.cortadora.operar(p);
    }

    //Metodo para generar las 4 estaciones
    private void crearEstaciones() {
        //Se generan las 4 estaciones, en este caso la cortadora recibe trato especial para las pruebas
        ArrayList<Estacion> estaciones = new ArrayList();
        estaciones.add(new Cortadora());
        estaciones.add(new Dobladora());
        estaciones.add(new Estacion("ensamble"));
        estaciones.add(new Estacion("pintura"));

        //Para las pruebas se muestran las estaciones
        System.out.println("\nEstaciones:");
        for (int i = 0; i < estaciones.size(); i++) {
            System.out.println(estaciones.get(i).getTipo());
        }
        System.out.println("");
        this.estaciones = estaciones;

        //Se inician los hilos de las estaciones
        generarEstacionesHilos();
    }

    //Metodo para generar la lista de piezas
    private ArrayList<Pieza> generarPiezas() {
        //Se generan  2 piezas con 2 secuencias diferentes para la prueba
        String[] secuencia = {"corte", "ensamble", "pintura"};
        String[] secuencia2 = {"doblez", "ensamble", "pintura"};

        ArrayList<Pieza> piezas = new ArrayList();
        piezas.add(new Pieza("pieza_1", 2, 2, "rojo", secuencia));
        piezas.add(new Pieza("pieza_2", 2, 2, "azul", secuencia2));
        piezas.add(new Pieza("pieza_3", 2, 2, "amarillo", secuencia));

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

    //Generador del listener para las pruebas
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

    //Metodo para iniciar los hilos de las estaciones
    private void generarEstacionesHilos() {
        //Instanciamos la cortadora para las pruebas de la estacion
        this.cortadora = estaciones.get(0);

        //Instanciamos la dobladora para las pruebas de la estacion
        this.dobladora = estaciones.get(1);

        //Se inicia el hilo de la cortadora
        Thread t = new Thread(this.cortadora);
        t.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Maquina encendida: " + this.cortadora.getTipo());

        //Se inicia el hilo de la dobladora
        Thread t1 = new Thread(this.dobladora);
        t1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Maquina encendida: " + this.dobladora.getTipo());
        System.out.println("");
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {

        }
    }

}
