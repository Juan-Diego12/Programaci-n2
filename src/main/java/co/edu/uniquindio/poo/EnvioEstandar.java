package co.edu.uniquindio.poo;
class EnvioEstándar implements CrearEnvio {
    @Override
    public void imprimirDetalles() {
        System.out.println("Tipo de envío: Estándar");
        System.out.println("Precio: $5.000");
        System.out.println("Tiempo de entrega: 25 días");
    }
}
