package actividad4;

import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos = 0;
    private Sala sala;
    private List<Actividad> actividades;

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList<>();
        cantidadEventos++;
    }

    public EventoUniversitario(EventoUniversitario otro) {
        this.id = otro.id + "_copia";
        this.titulo = otro.titulo + " (Copia)";
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        this.sala = otro.sala;
        this.actividades = new ArrayList<>(otro.actividades);
        cantidadEventos++;
    }

    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    public void crearActividad(int id, String titulo, int cupo, String tipo, String disertante, boolean requiereNotebook) {
        if (tipo.equalsIgnoreCase("Charla")) {
            actividades.add(new Charla(id, titulo, cupo, disertante));
        } else if (tipo.equalsIgnoreCase("Taller")) {
            actividades.add(new Taller(id, titulo, cupo, requiereNotebook));
        } else {
            System.out.println("Tipo de actividad no reconocido.");
        }
    }

    public double calcularCostoEstimado() {
        if (gratuito) {
            return 0.0;
        }

        double sumaMaterialesActividades = 0.0;
        for (Actividad act : actividades) {
            sumaMaterialesActividades += act.calcularCostoMateriales();
        }
        return (costoBase + sumaMaterialesActividades) * 1.21;
    }

    public void mostrarDatos() {
        System.out.println("=========================================");
        System.out.println("EVENTO: " + titulo + " [ID: " + id + "]");
        System.out.println("Gratuito: " + (gratuito ? "Sí" : "No"));
        System.out.println("Costo Base: $" + costoBase);
        System.out.println("Costo Total Estimado (c/IVA): $" + calcularCostoEstimado());
        System.out.println("Sala: " + (sala != null ? sala.getNombre() : "No asignada"));
        System.out.println("--- ACTIVIDADES ---");
        for (Actividad act : actividades) {
            act.mostrarIdentificacion();
            act.mostrarInscripciones();
        }
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }
}