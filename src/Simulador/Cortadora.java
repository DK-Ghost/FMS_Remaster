package Simulador;

import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.util.Duration.seconds;

public class Cortadora extends Estacion{
      
    
    public Cortadora(String tipo) {
        super(tipo);
    }
    
    public Cortadora() {
        super("corte");
    }
    
    @Override
    void operar() {
        System.out.println("Cortando...");
        waitInSeconds(3); // Espera 5 segundos
        System.out.println("Corte terminado");
        super.operar(); 
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            if (!flag) {
                //Cuando se detecte apagada la bandera libre de la estacion
                this.operar();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        super.run();
    }
    
    

    private void waitInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000); 
        } catch (InterruptedException e) {
            System.err.println("La espera fue interrumpida.");
            e.printStackTrace();
        }
    }

    
    
    
}
