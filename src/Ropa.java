// Clase Ropa
public class Ropa extends Producto {
    private String talla;
    private String color;
    private String material;

    public Ropa(String nombre, double precio, int existencia, String codigo,
                String talla, String color, String material) {
        super(nombre, precio, existencia, codigo);
        this.talla = talla;
        this.color = color;
        this.material = material;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto de Ropa:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Talla: " + talla);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Precio: $" + precio);
        System.out.println("Existencias: " + existencia);
    }

    @Override
    public void generarReporte() {
        super.generarReporte();
        System.out.println("Tipo: Ropa");
        System.out.println("Talla/Color: " + talla + " " + color);
    }

    // Getters y setters específicos
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
