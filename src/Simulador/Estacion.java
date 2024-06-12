package Simulador;

import java.util.ArrayList;

public class Estacion implements Runnable{
    private String tipo; //corte, doblez, pintura, ensamble  Identificador de la maquina
    private ArrayList<String> procesos;
    private ArrayList<String> herramientas; 
    private int tiempoAvg;
    private double costoProduccion;
    private double tiempoTotal;
    private int piezasDefectuosas;
    //-----------------------------------
    private boolean flagLibre; //Bandera de ocupacion true = libre / false = ocupada
    private Pieza pieza;  //La pieza que operara la maquina

    @Override
    public void run() {
        
    } 
    
    public Estacion(String tipo) {
        this.tipo = tipo;
        this.flagLibre = true;
    }

    public boolean isFlagLibre() {
        return flagLibre;
    }
    
    public void setFlagLibre(boolean flagLibre) {
        this.flagLibre = flagLibre;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }
   
    public void setFlag(boolean flag) {
        this.flagLibre = flag;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getProcesos() {
        return procesos;
    }

    public void setProcesos(ArrayList<String> procesos) {
        this.procesos = procesos;
    }

    public ArrayList<String> getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(ArrayList<String> herramientas) {
        this.herramientas = herramientas;
    }

    public int getTiempoAvg() {
        return tiempoAvg;
    }

    public void setTiempoAvg(int tiempoAvg) {
        this.tiempoAvg = tiempoAvg;
    }

    public double getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(double costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    public double getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(double tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public int getPiezasDefectuosas() {
        return piezasDefectuosas;
    }

    public void setPiezasDefectuosas(int piezasDefectuosas) {
        this.piezasDefectuosas = piezasDefectuosas;
    }

    //Metodo donde se realiza la operacion de la estacion
    void operar() {
        
    }

    //Metodo donde se realiza la operacion de la estacion
    void operar(Pieza get) {
        
    }
}
