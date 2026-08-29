package actividad2;

import java.time.LocalDate;

public class Inscripción {
    private LocalDate fecha;
    private String Estado;
    private Estudiante estudiante;

    public Inscripción(LocalDate fecha, String Estado, Estudiante estudiante) {
        this.fecha = fecha;
        this.Estado = Estado;
        this.estudiante = estudiante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

}

