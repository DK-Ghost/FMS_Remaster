package Simulador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Listener implements Runnable {

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            //Se activa cuando la cortadora se enciende
//            switch (Gestor.estacion.flag) {
//                case true: {
//                    System.out.println("Cortadora Ocupada");
//                }
//            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
