package co.edu.uniquindio.poo;

class EnvioExpress implements CrearEnvio {
    @Override
    public void imprimirDetalles() {
        System.out.println("Tipo de envío: Express");
        System.out.println("Precio: $10.000");
        System.out.println("Tiempo de entrega: 1 día");
    }
}


