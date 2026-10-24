public class notificador {

    // Versión 1: recibe un mensaje
    public void enviar(String mensaje) {
        System.out.println("Envío general: " + mensaje);
    }

    // Versión 2: recibe un mensaje y las veces que se repite
    public void enviar(String mensaje, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
        }
    }
}
