package Simulador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Dobladora extends Estacion{
    
    public Dobladora(String tipo) {
        super(tipo);
    }
    
    public Dobladora() {
        super("doblez");
    }

    //Metodo que espera la activacion de la maquina
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            if (!this.isFlagLibre()) {
                //Cuando se detecte apagada la bandera libre de la estacion
                this.operar();
                this.setFlagLibre(true);
                Gestor.panelMain.setEstadoDobladora(this.isFlagLibre());
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        super.run(); 
    }

    @Override
    void operar() { 
        System.out.println("\nDobladora: Doblando...");
        Herramientas.waitInSeconds(3); // Espera 5 segundos
        System.out.println("\nDobladora: Doblez terminado");
        super.operar();
    }
    
    
    
}
