package org.example;


public class Main {
    static void main() {

        EnvioEstandar EnvioEstandar = new EnvioEstandar(1000);
        EnvioExpress EnvioExpress = new EnvioExpress(1000);
        EnvioFragil EnvioFragil1 = new EnvioFragil(1000, "vajilla", "");
        Paquete prueba1 = new Paquete(2001, 5, ZonasEnvios.ORIENTE, EnvioEstandar);
        Paquete prueba2 = new Paquete(2002, 1.5, ZonasEnvios.NORTE, EnvioExpress);
        Paquete prueba3 = new Paquete(2003, 2, ZonasEnvios.CENTRO, EnvioFragil1);


    }
}
