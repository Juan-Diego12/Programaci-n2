package co.edu.uniquindio.poo;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class EnvioTest {
    private static final Logger LOG = Logger.getLogger(EnvioTest.class.getName());

    @Test
    public static void main(String[] args) {

        LOG.info("Iniciado test de envio");
        CrearEnvio envio1 = EnvioFactory.crearEnvio(TipoEnvio.ESTANDAR);
        CrearEnvio envio2 = EnvioFactory.crearEnvio(TipoEnvio.EXPRESS);
        CrearEnvio envio3 = EnvioFactory.crearEnvio(TipoEnvio.PRIORITARIO);
    
        envio1.imprimirDetalles();
        envio2.imprimirDetalles();
        envio3.imprimirDetalles();

            LOG.info("Finalizando test de envio");
        }
}

    
