package actividad2;

public class App {
        public static void main(String[] args) {

            Estudiante estudiante1 = new Estudiante("Franepic" , "67666");
            Estudiante estudiante2 = new Estudiante("papiroldan" , "66667");

            Salas sala1 = new Salas(1, "Factory");
            Salas sala2 = new Salas(2, "Create");

            EventoUniversitario evento1 = new EventoUniversitario("1A", "Paradigma", 67.0,  false);
            evento1.asignarsalas(sala1);
            evento1.crearActividades(1, "Introducción", 40,5);
                 Actividad oAct1 = evento1.getActividad(1);
                 if (oAct1 != null) {
                     oAct1.inscribir(estudiante1);
                 }


            EventoUniversitario evento2 = new EventoUniversitario("1B", "vamo a bailar", 76.0,  true);
            evento2.asignarsalas(sala2);
            evento2.crearActividades(2, "Estudio",40,5);
                 Actividad oAct2 = evento2.getActividad(2);
                 if (oAct2 != null) {
                     oAct2.inscribir(estudiante2);
                 }


            EventoUniversitario copiaEvento1 = new EventoUniversitario(evento1);
            EventoUniversitario copiaEvento2 = new EventoUniversitario(evento2);


            System.out.println("------Eventos------");
            evento1.mostrarDatos();
            evento2.mostrarDatos();


            System.out.println("------Eventos_Copias------");
            copiaEvento1.mostrarDatos();
            copiaEvento2.mostrarDatos();

            System.out.println("----------------------");
            System.out.println("Total de eventos registrados en la aplicación: " + EventoUniversitario.getCantidadEventos());
        }
}