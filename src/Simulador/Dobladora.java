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

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            if (!flag) {
                //Cuando se detecte apagada la bandera libre de la estacion
                System.out.println("Heeeeeelp");
                this.operar();
                this.flag = true;
                Gestor.panelMain.setEstadoDobladora(flag);
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
        System.out.println("");
        System.out.println("Dobladora: Doblando...");
        Herramientas.waitInSeconds(3); // Espera 5 segundos
        System.out.println("Dobladora: Doblez terminado");
        super.operar();
    }
    
    
    
}
