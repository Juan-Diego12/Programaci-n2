package co.edu.uniquindio.poo;
public class EnvioFactory {
    public static CrearEnvio crearEnvio(TipoEnvio tipoEnvio) {
        switch (tipoEnvio) {
            case ESTANDAR:
                return new EnvioEstándar();
            case EXPRESS:
                return new EnvioExpress();
            case PRIORITARIO:
                return new EnvioPrioritario();
            default:
                throw new IllegalArgumentException("Tipo de envío no válido");
        }
    }
}

