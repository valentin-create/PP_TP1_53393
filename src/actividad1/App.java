package actividad1;

public class App {
        public static void main(String[] args) {

            EventoUniversitario evento1 = new EventoUniversitario("Evento 1", "Inteligencia Artificial", 6767, false);
            EventoUniversitario evento2 = new EventoUniversitario("Evento 2", "Charla de Bienvenida", 0.0, true);

            EventoUniversitario copiaEvento1 = new EventoUniversitario(evento1);
            EventoUniversitario copiaEvento2 = new EventoUniversitario(evento2);


            System.out.println("------Eventos------");
            evento1.mostrarDatos();
            evento2.mostrarDatos();


            System.out.println("------Eventos Copias------");
            copiaEvento1.mostrarDatos();
            copiaEvento2.mostrarDatos();

            System.out.println("----------------------");
            System.out.println("Total de eventos registrados en la aplicación: " + EventoUniversitario.getCantidadEventos());
        }
    }