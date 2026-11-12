package org.example;

public class EnvioFragil extends Envio {
    private String queContiene;
    private String advertencia;
    private int prioridad = 1;

    public EnvioFragil(int precioBase, String queContiene, String advertencia){
        super(precioBase);
        if(queContiene == null){
            throw new queContieneNullException("Debe registrar el contenido, si no, su pedido no sera aceptado");
        }
        this.queContiene = queContiene;
        this.advertencia = advertencia;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public String getAdvertencia() {
        return advertencia;
    }

}
