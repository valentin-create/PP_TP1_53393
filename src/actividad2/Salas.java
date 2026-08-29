package actividad2;

public class Salas {

    private static int id;
    private static String nombre;

    public Salas(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public static int getId() {
        return id;
    }

    public static String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Salas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
