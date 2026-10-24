
public class Main {
    public static void main(String[] args) {

        // 1. Creamos un objeto de Notificador
        notificador notificador = new notificador();

        // 2. Probamos el primer método
        notificador.enviar("Hola, usuario");

        // 3. Probamos el segundo método: repetir 2 veces
        notificador.enviar("Tu código es 1234", 2);

        // 4. Creamos un objeto de NotificadorEmail
        NotificadorEmail email = new NotificadorEmail();

        // 5. Probamos el método sobrescrito
        email.enviar("Bienvenido a nuestra plataforma");
    }
}
