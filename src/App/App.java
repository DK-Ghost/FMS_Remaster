package App;

import Simulador.Estacion;
import Simulador.Gestor;
import Simulador.Pieza;
import java.util.ArrayList;

public class App {
    public static void main(String args[]){
        //Iniciar el gestor para las pruebas de las estaciones
        Gestor gestor = new Gestor();
        gestor.empezar();
    }
}
