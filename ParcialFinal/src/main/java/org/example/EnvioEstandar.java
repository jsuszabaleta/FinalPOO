package org.example;

public class EnvioEstandar extends Envio{
    private int prioridad = 1;

    public EnvioEstandar(double precioBase){
        super(precioBase);
    }

    public int getPrioridad() {
        return prioridad;
    }
}
