package Simulador;

public class Herramientas {
    
    //Metodo para esperar
    public static  void waitInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000); 
        } catch (InterruptedException e) {
            System.err.println("La espera fue interrumpida.");
            e.printStackTrace();
        }
    }
    
}
