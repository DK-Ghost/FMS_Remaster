package Simulador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Listener implements Runnable {

    @Override
    public void run() {
        while (!Thread.interrupted()) {
//            if (Gestor.cortadoraEstado == ) {
//                System.out.println("Escuche la terminada");
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
            switch (Gestor.cortadoraEstado) {
                case 1: {
                    System.out.println("Cortadora Ocupada");
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}


/*while (!Thread.interrupted()) {
            //Si no esta vacia la cola
            System.out.print("");
            if (!Gestor.colaTransportador.isEmpty()) {
//                System.out.println("Cola no vacia: " + size);
                //Recibir la pieza
                int size = Gestor.colaTransportador.size();
                this.pieza = Gestor.colaTransportador.get(0);
                Gestor.colaTransportador.remove(pieza);
                System.out.println("Pieza recogida");
                Sim_main.log.agregar("Pieza recogida");
                if(pieza == null){
                    System.out.println("no puede ser");
                }
                String[] secuencia = this.pieza.getSecuencia();
                int etapa = this.pieza.getEtapa();

                //Liberar maquinas 
                System.out.println("Liberando maquinas");
                Sim_main.log.agregar("Liberando maquinas");
                System.out.println("");
                Sim_main.log.agregar("");
                String secuenciaAnterior = secuencia[etapa - 1];
                //Liberar la estacion de la que se obtuvo la pieza
                switch (secuenciaAnterior) {
                    case "Corte": {
                        Gestor.liberarEstaciones("ec");
                    }
                    break;
                    case "Pintura": {
                        Gestor.liberarEstaciones("ep");
                    }
                    break;
                    case "Ensamble": {
                        Gestor.liberarEstaciones("ee");
                    }
                    break;
                    case "Doblado": {
                        Gestor.liberarEstaciones("ecm");
                    }
                    break;
                    default:
                        break;
                }

                if (etapa < secuencia.length) {
                    String secuenciaSiguiente = secuencia[etapa];
                    //Mandar a cola correspondiente segun su secuencia
                    switch (secuenciaSiguiente) {
                        case "Corte": {
                            this.pieza.setEtapa(etapa + 1);
                            Gestor.colaCorte.add(this.pieza);
                        }
                        break;
                        case "Pintura": {
                            this.pieza.setEtapa(etapa + 1);
                            Gestor.colaPintura.add(this.pieza);
                        }
                        break;
                        case "Ensamble": {
                            this.pieza.setEtapa(etapa + 1);
                            Gestor.colaEnsamble.add(this.pieza);
                        }
                        break;
                        case "Doblado": {
                            this.pieza.setEtapa(etapa + 1);
                            Gestor.colaCmm.add(this.pieza);
                        }
                        break;
                        default:
                            break;
                    }
                }else{
                    Gestor.almacen.add(this.pieza);
                    if (Gestor.almacen.size() == Sim_main.gestor.ensamble.listaDePartes.size()) {
                        System.out.println("Produccion terminada");
                        Sim_main.log.agregar("Produccion terminada");
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                         fecf = dtf.format(LocalDateTime.now());
                        for (int i = 0; i < Gestor.almacen.size(); i++) {
                            System.out.println("Pieza " + i + ": " + Gestor.almacen.get(i).toString());
                            Sim_main.log.agregar("Pieza " + i + ": " + Gestor.almacen.get(i).toString());
                        }
                        BasicDBObject documento = new BasicDBObject();
        Reg_Orden o = new Reg_Orden();
        documento.put("Nombre Orden", combO.getSelectedItem().toString());
        DBCursor datos = o.coleccion.find(documento);
        String nameo = "";
        String nameP = "";
        String Cliente = "";
        String fecha = "";
        String status = "";
        while (datos.hasNext()) {
            DBObject value = datos.next();
            //Con el metodo addElement vamos a agregar cada resultado al comboBox
            nameo = (String) value.get("Nombre Orden");
            nameP = (String) value.get("Producto");
            Cliente = (String) value.get("Cliente");
            fecha = (String) value.get("fPlaneada");
            status = (String) value.get("Estatus");
            BasicDBObject documento2 = new BasicDBObject();
                documento2.put("Cliente", Cliente);
                documento2.put("Nombre Orden", nameo);
                documento2.put("Producto", nameP);
                documento2.put("Estatus", "Terminado");
                documento2.put("fPlaneada", fecha);
                o.coleccion.findAndModify(documento, documento2);

                System.out.println("Pieza Terminadada");
        }
                    }
                }
            }
        } */
