package org.example;

public enum ZonasEnvios {
    CENTRO("CENTRO", 6000),
    NORTE("NORTE", 8000),
    SUR("SUR", 8000),
    ORIENTE("ORIENTE", 15000);

    private String zona;
    private int precioBase;

    private ZonasEnvios(String zona, int precioBase){
        this.zona = zona;
        this.precioBase = precioBase;
    }
    public int getPrecioBase() {
        return precioBase;
    }
}
