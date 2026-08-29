package actividad4;

import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int CUPO_MINIMO = 5;
    private List<Inscripcion> inscripciones;

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public Inscripcion inscribir(Estudiante estudiante) {
        if (inscripciones.size() < cupoMaximo) {
            Inscripcion nuevaInscripcion = new Inscripcion(estudiante);
            inscripciones.add(nuevaInscripcion);
            return nuevaInscripcion;
        } else {
            System.out.println("Cupo lleno para la actividad: " + titulo);
            return null;
        }
    }

    public void mostrarInscripciones() {
        System.out.println("   Inscriptos (" + inscripciones.size() + "/" + cupoMaximo + "):");
        for (Inscripcion i : inscripciones) {
            System.out.println("    - " + i.getEstudiante().getNombre() + " (Legajo: " + i.getEstudiante().getLegajo() + ") - Estado: " + i.getEstado());
        }
    }

    public final void mostrarIdentificacion() {
        System.out.println("Actividad ID: " + id + " | Título: " + titulo + " | Tipo: " + getTipo() + " | Costo Materiales: $" + calcularCostoMateriales());
    }

    public abstract double calcularCostoMateriales();
    public abstract String getTipo();
}