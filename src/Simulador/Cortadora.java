package Simulador;

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
        Gestor.setCortadoraEstado(1);
        System.out.println("Cortando...");
        waitInSeconds(3); // Espera 5 segundos
        System.out.println("Corte terminado");
        Gestor.setCortadoraEstado(0);
        super.operar(); 
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
