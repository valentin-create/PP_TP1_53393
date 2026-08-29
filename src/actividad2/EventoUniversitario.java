package actividad2;

import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {

    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private Salas salas;
    private static int cantidadEventos = 0;
    private List<Actividad> lActividad = new ArrayList<>();

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
    }

    public EventoUniversitario(EventoUniversitario copia) {
        this.id = copia.id;
        this.titulo = copia.titulo;
        this.costoBase = copia.costoBase;
        this.gratuito = copia.gratuito;
        this.salas = copia.salas;

        if (copia.lActividad != null) {
            this.lActividad = new ArrayList<>(copia.lActividad);
        }
        cantidadEventos++;
    }


    public double calcularCostoEstimado() {
        if (this.gratuito) {
            return 0.0;
        }
        return this.costoBase;
    }

    public void mostrarDatos() {
        System.out.println("El id es: " + id);
        System.out.println("El titulo es " + titulo);
        System.out.println("El costo base es " + calcularCostoEstimado());
        System.out.println("La sala es " + Salas.getNombre() + " y su id es " + Salas.getId());
        System.out.println(" ");
        for (Actividad actividad : lActividad) {
            System.out.println("El actividad es: " + actividad.getId() + "-" + actividad.getTitulo() + "(Cupo maximo: " + actividad.getCupomaximo() + ")" + "(Cupo Minimo: " + actividad.getCupominimo() + ")");
            System.out.println("Inscripto");
            actividad.mostrarInscripciones();
        }
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }
    
    public Salas asignarsalas (Salas sala1) { return salas;}

    public void crearActividades (int id, String titulo, int cupoMaximo, int cupoMinimo) {
        Actividad actividad  = new Actividad(id, titulo, cupoMaximo, cupoMinimo);
        this.lActividad.add(actividad);
    }

    public Actividad getActividad (int id) {
        for (Actividad actividad : this.lActividad) {
            if (actividad.getId() == id) {
                return actividad;
            }
        }
        return null;
    }
    {
        for (Actividad actividad : this.lActividad){
            System.out.println("Actividad: " + actividad.getId() + " - " + actividad.getTitulo()
                    + " (Cupo Maximo: " + actividad.getCupomaximo() + " ) (Cupo Minimo " + actividad.getCupominimo() + " ) ");
            System.out.println("Inscriptos");
            actividad.mostrarInscripciones();
        }
    }
}
