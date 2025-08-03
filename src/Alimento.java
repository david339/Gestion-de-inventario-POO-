// Clase Alimento
public class Alimento extends Producto {
    private String fechaCaducidad;
    private String lote;

    public Alimento(String nombre, double precio, int existencia, String codigo,
                    String fechaCaducidad, String lote) {
        super(nombre, precio, existencia, codigo);
        this.fechaCaducidad = fechaCaducidad;
        this.lote = lote;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Alimenticio:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Lote: " + lote);
        System.out.println("Precio: $" + precio);
        System.out.println("Existencias: " + existencia);
    }

    @Override
    public void generarReporte() {
        super.generarReporte();
        System.out.println("Tipo: Alimento");
        System.out.println("Caducidad: " + fechaCaducidad);
    }

    // Getters y setters específicos
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
}