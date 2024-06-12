package App;

import Simulador.Gestor;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String args[]){
        //Iniciar el gestor para las pruebas de las estaciones
        Gestor gestor = new Gestor();
        Thread t = new Thread(gestor);
        t.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Gestor Iniciado...\n");
        
        gestor.empezar();
    }
}
