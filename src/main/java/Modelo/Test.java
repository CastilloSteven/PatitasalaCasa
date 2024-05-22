package Modelo;

import java.io.Console;
import java.util.ArrayList;

public class Test {
    private ArrayList<Preguntas> preguntas;
    private ArrayList<Boolean> respuestas;

    public Test() {
        preguntas = new ArrayList<>();
        respuestas = new ArrayList<>();
        // Agrega las preguntas y sus posibles respuestas (true para "a", false para "b")
        preguntas.add(new Preguntas("¿Has tenido mascotas?\n a) Si\n b) No\n ", true));
        preguntas.add(new Preguntas("¿Te sientes bien en un ambiente social?\n a) Si\n b) No\n ", true));
        preguntas.add(new Preguntas("¿Tiene conocimiento sobre cuidado de mascotas?\n a) Si\n b) No\n ", true));
        preguntas.add(new Preguntas("¿Su salario es mayor o igual que el mínimo?\n a) Si\n b) No\n ", true));
        preguntas.add(new Preguntas("¿La mascota tendrá supervisión?\n a) Si\n b) No\n ", true));
    }

    public void realizarTest() {
        Console console = System.console();

        if (console == null) {
            System.err.println("No se puede obtener la consola.");
            return;
        }

        System.out.println("Responde las siguientes preguntas responde (a) para SI y (b) para NO:");
        for (Preguntas pregunta : preguntas) {
            String respuestaUsuario;
            while (true) {
                System.out.println(pregunta.getDescripcion());
                respuestaUsuario = console.readLine().trim();

                if (respuestaUsuario.equalsIgnoreCase("a") || respuestaUsuario.equalsIgnoreCase("b")) {
                    break;
                } else {
                    System.out.println("Respuesta inválida. Por favor responde (a) para Si o (b) para No");
                }
            }

            boolean valor = respuestaUsuario.equalsIgnoreCase("a");
            respuestas.add(valor == pregunta.isValorCorrecto());
        }

        calcularAplicavilidad();
    }

    public void calcularAplicavilidad() {
        int respuestasCorrectas = 0;
        for (boolean respuesta : respuestas) {
            if (respuesta) {
                respuestasCorrectas++;
            }
        }
        double puntaje = (double) respuestasCorrectas / preguntas.size() * 100;
        boolean aplica = puntaje >= 70;

        if (aplica) {
            System.out.println("¡Bien hecho! Estas aplicado para adoptar una mascota :D");
        } else {
            System.out.println("Lo lamentamos, no puedes adoptar uno de nuestros amigos de cuatro patas :c.");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.realizarTest();
    }
}
