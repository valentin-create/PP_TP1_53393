package actividad1;

public class EventoUniversitario {

    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;

    private static int cantidadEventos = 0;

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
    }

    public EventoUniversitario(EventoUniversitario otro) {
        this.id = otro.id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
    }

    public double calcularCostoEstimado() {
        if (this.gratuito) {
            return 0.0;
        }
        return this.costoBase;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id );
        System.out.println("Título: " + titulo);
        System.out.println("Gratuito: " + (gratuito ? "Sí" : "No"));
        System.out.println("Costo Estimado: $" + calcularCostoEstimado());
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }
}
