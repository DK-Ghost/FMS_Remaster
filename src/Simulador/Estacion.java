package Simulador;

import java.util.ArrayList;

public class Estacion {
    private String tipo; //corte, doblez, pintura, ensamble
    private ArrayList<String> procesos;
    private ArrayList<String> herramientas;
    private int tiempoAvg;
    private double costoProduccion;
    private double tiempoTotal;
    private int piezasDefectuosas;

    public Estacion(String tipo) {
        this.tipo = tipo;
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
    
    
    
    
}
