package org.example;

import java.util.Objects;

public class Paquete<T extends Envio> implements Comparable<Paquete>{
    public static String getGuia;
    private final String guia;
    private final double peso;
    private final ZonasEnvios zonaDestino;
    private final T tipoEnvio;

    public Paquete(int guia, double peso,ZonasEnvios zonaDestino, T tipoEnvio){
        if(peso>20){
            throw new PesoMayorA20Exception("El peso del paquete es mayor a 20kg, no se puede llevar en moto");
        }
        this.guia = "EY" + guia;
        this.peso = peso;
        this.zonaDestino = zonaDestino;
        this.tipoEnvio = tipoEnvio;
    }


    public String getGuia() {
        return guia;
    }

    @Override
    public int compareTo(Paquete otro){
        int compare =
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paquete<?> paquete = (Paquete<?>) o;
        return Objects.equals(getGuia(), paquete.getGuia());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getGuia());
    }
    public double precioTotal(){
        if (tipoEnvio instanceof EnvioFragil){
            double v = +(1000 * this.peso);
            return this.zonaDestino.getPrecioBase()+(zonaDestino.getPrecioBase())*0.5)+1000*this.peso;
        }
        else-if(tipoEnvio instanceof EnvioExpress){
            return this.zonaDestino.getPrecioBase()+5000+(1000*this.peso);
        }
        else return this.zonaDestino.getPrecioBase()+1000*this.peso;
    }
    @Override
    public String toString() {
        return "Paquete{" +
                "guia='" + guia + '\'' +
                ", peso=" + peso +
                ", zonaDestino=" + zonaDestino +
                ", tipoEnvio=" + tipoEnvio +
                '}';
    }
}
