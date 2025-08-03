// Clase Electrónico
public class Electronico extends Producto {
    private String marca;
    private String modelo;
    private int garantiaMeses;

    public Electronico(String nombre, double precio, int existencia, String codigo,
                       String marca, String modelo, int garantiaMeses) {
        super(nombre, precio, existencia, codigo);
        this.marca = marca;
        this.modelo = modelo;
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Electrónico:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Garantía: " + garantiaMeses + " meses");
        System.out.println("Precio: $" + precio);
        System.out.println("Existencias: " + existencia);
    }

    @Override
    public void generarReporte() {
        super.generarReporte();
        System.out.println("Tipo: Electrónico");
        System.out.println("Marca/Modelo: " + marca + " " + modelo);
    }

    // Getters y setters específicos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
}

