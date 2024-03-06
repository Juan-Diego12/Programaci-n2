package co.edu.uniquindio.poo;

class EnvioPrioritario implements CrearEnvio {
    @Override
    public void imprimirDetalles() {
        System.out.println("Tipo de envío: Prioritario");
        System.out.println("Precio: $20.000");
        System.out.println("Tiempo de entrega: 0.5 días");
    }
}
