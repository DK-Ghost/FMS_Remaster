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
        System.out.println("");
        System.out.println("Cortadora: Cortando...");
        Herramientas.waitInSeconds(3); // Espera 5 segundos
        System.out.println("Cortadora: Corte terminado");
        super.operar(); 
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            if (!flag) {
                //Cuando se detecte apagada la bandera libre de la estacion
                this.operar();
                this.flag = true;
                Gestor.panelMain.setEstadoCortadora(flag);
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
