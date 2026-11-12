# FinalPOO
En este repo estará montado los archivos respectivos al parcial final
Principios SOLID:
Utilice el principio open-closed al momento de utilizar las las clases envio, y las clases que heredan de el, esto con el fin de no tener que crear envios muy distintos, y porque el ejercicio mencionaba que se queria crear un nuevo modo de servicio mas, entonces es mejor crear un service del que los demas hereden.
  
    public abstract class Envio {
      private double precioEnvio;

    public Envio(double precioEnvio){
        this.precioEnvio = precioEnvio;
    }
    }

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

Trate de implementar un principio al crear una clase aparte utilitaria pero al no tener tiempo suficiente lo implemente en la misma clase, esto con el fin de mantener el principio de que una clase haga lo que necesite, y no haga muchas cosas al mismo tiempo:

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
