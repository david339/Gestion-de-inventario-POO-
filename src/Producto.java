public abstract class Producto implements Inventariable {
    protected String nombre;
    protected double precio;
    protected int existencia;
    protected String codigo;

    public Producto(String nombre, double precio, int existencia, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
        this.codigo = codigo;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void mostrarDetalles();

    // Implementación de métodos de la interfaz
    @Override
    public void actualizarExistencia(int cantidad) {
        this.existencia += cantidad;
        System.out.println("Existencia actualizada. Nuevo stock: " + this.existencia);
    }

    @Override
    public void generarReporte() {
        System.out.println("Reporte de producto: " + this.nombre);
        System.out.println("Código: " + this.codigo);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Existencias: " + this.existencia);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}