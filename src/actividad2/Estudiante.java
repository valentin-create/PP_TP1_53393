package actividad2;

public class Estudiante {
    private String Nombre;
    private String Legajo;
    public Estudiante(String nombre, String legajo) {
        Nombre = nombre;
        Legajo = legajo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getLegajo() {
        return Legajo;
    }
}
