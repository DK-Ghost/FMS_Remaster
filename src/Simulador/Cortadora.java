package Simulador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cortadora extends Estacion{
      
    
    public Cortadora(String tipo) {
        super(tipo);
    }
    
    public Cortadora() {
        super("corte");
    }
    
    @Override
    void operar() {
        System.out.println("\nCortadora: Cortando...");
        Herramientas.waitInSeconds(3); // Espera 5 segundos
        System.out.println("\nCortadora: Corte terminado");
        super.operar(); 
    }

    @Override
    void operar(Pieza pieza) {
        //Agregar pieza a la maquina
        this.setPieza(pieza);
        this.getPieza().toString();
        System.out.println("\nCortadora: Cortando...");
        this.getPieza().setEtapa((this.getPieza().getEtapa())+1);
        Herramientas.waitInSeconds(3); // Espera 5 segundos
        this.getPieza().toString();
        System.out.println("\nCortadora: Corte terminado");
        super.operar(); 
    }

    //Metodo que espera la activacion de la maquina
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            if (!this.isFlagLibre()) {
                //Cuando se detecte apagada la bandera libre de la estacion
                this.operar();
                //Restablece la bandera
                this.setFlagLibre(true);
                //Actualizar el Gui
                Gestor.panelMain.setEstadoCortadora(this.isFlagLibre());
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        super.run();
    }    
    
}
