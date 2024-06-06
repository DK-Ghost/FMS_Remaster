package Simulador;

import java.util.ArrayList;
import java.util.Date;

public class Pieza {
    
    private String nombre;
    private Date fecha;
    private Date fecha2;
    private String plano;
    private String rutas;
    private double calire;
    private double tolerancia;
    private String [] secuencia;
    private String color; //rojo, azul, amarillo
    private ArrayList<String> provedores;
    private int etapa;

    public Pieza(String nombre, double calire, double tolerancia, String color, String [] secuencia) {
        this.nombre = nombre;
        this.calire = calire;
        this.tolerancia = tolerancia;
        this.color = color;
        this.secuencia = secuencia;
        this.etapa = 0;
    }

    public int getEtapa() {
        return etapa;
    }

    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha2() {
        return fecha2;
    }

    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getRutas() {
        return rutas;
    }

    public void setRutas(String rutas) {
        this.rutas = rutas;
    }

    public double getCalire() {
        return calire;
    }

    public void setCalire(double calire) {
        this.calire = calire;
    }

    public double getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(double tolerancia) {
        this.tolerancia = tolerancia;
    }

    public String [] getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String [] secuencia) {
        this.secuencia = secuencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<String> getProvedores() {
        return provedores;
    }

    public void setProvedores(ArrayList<String> provedores) {
        this.provedores = provedores;
    }
    
}
