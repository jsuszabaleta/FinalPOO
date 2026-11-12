package org.example;

public class EnvioExpress extends Envio{
    private static final double porcentajeExtra = 0.50;
    private final int prioridad = 2;

    public EnvioExpress(int precioEnvio){
        super(precioEnvio+(precioEnvio * porcentajeExtra));
    }

    public int getPrioridad() {
        return prioridad;
    }
}


