package actividad4;

public class App {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("6767", "Villarreal");
        Estudiante e2 = new Estudiante("7676", "Fran Carry");
        Estudiante e3 = new Estudiante("1671", "Papiroldan");


        EventoUniversitario evento1 = new EventoUniversitario("1", "Inteligencia Artificial", 15000.0, false);
        EventoUniversitario evento2 = new EventoUniversitario("2", "Auntocontrol", 0.0, true);


        Sala salaA = new Sala(1, "Factory");
        Sala salaB = new Sala(2, "Carryon");

        evento1.asignarSala(salaA);
        evento2.asignarSala(salaB);


        evento1.crearActividad(1, "Introducción", 20, "Charla", "Alan Turing", false);
        evento1.crearActividad(2, "Pax mental", 15, "Taller", "", true);

        evento2.crearActividad(3, "Open Source", 30, "Charla", "Pablo Wilkinson", false);
        evento2.crearActividad(4, "Contemplación del espacio", 10, "Taller", "", false);


        Actividad charlaEV1 = evento1.getActividades().get(0);
        Actividad tallerEV1 = evento1.getActividades().get(1);

        charlaEV1.inscribir(e1);
        charlaEV1.inscribir(e2);
        tallerEV1.inscribir(e2);
        tallerEV1.inscribir(e3);


        evento1.mostrarDatos();
        evento2.mostrarDatos();


        System.out.println("Total de eventos creados en el sistema: " + EventoUniversitario.getCantidadEventos());
    }
}