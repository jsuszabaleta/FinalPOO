package org.example;

import java.util.HashMap;
import java.util.Map;

public class Despacho {
    private String idDespacho;
    private int idMensajero;
    private String nombreMensajero;
    private static final int contadorDespacho = 1;
    private final Map<String, Paquete> paquetesAEntregar = new HashMap<>();

    public Despacho(String nombreMensajero, int idMensajero, Map(String, Paquete) paquetes){

        this.idDespacho = "D" + contadorDespacho;
        this.nombreMensajero = nombreMensajero;
        this.idMensajero = idMensajero;
        this.paquetesAEntregar = new HashMap<>();
    }
    public void RegistrarPaquete(Paquete paquete){
        paquetesAEntregar.put(Paquete.getGuia, paquete);
    }
}
