package actividad2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actividad {
    private int id;
    private String titulo;
    private int cupomaximo;
    private int cupominalimo;
    public List<Inscripción> listaInscripciones;

    public Actividad(int id, String titulo, int cupomaximo, int cupominalimo) {
        this.id = id;
        this.titulo = titulo;
        this.cupomaximo = cupomaximo;
        this.cupominalimo = cupominalimo;
        this.listaInscripciones = new ArrayList<Inscripción>();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCupomaximo() {
        return cupomaximo;
    }

    public int getCupominimo() {
        return cupominalimo;
    }

    public Inscripción inscribir(Estudiante estudiante) {
        Inscripción inscripcion1 = new Inscripción(LocalDate.now(), "Inscripto", estudiante);
        this.listaInscripciones.add(inscripcion1);
        return inscripcion1;
    }

    public void mostrarInscripciones() {
        System.out.println("Inscripciones para: " + titulo);
        for (Inscripción ins : listaInscripciones) {
            System.out.println("  - Fecha: " + ins.getFecha() +
                    " | Estado: " + ins.getEstado() +
                    " | Estudiante: " + ins.getEstudiante().getNombre() +
                    " (Legajo: " + ins.getEstudiante().getLegajo() + ")");
        }
    }

}

