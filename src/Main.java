//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear productos de diferentes tipos
        Producto[] inventario = new Producto[3];

        inventario[0] = new Electronico("Smartphone", 899.99, 50, "ELEC-001",
                "Samsung", "Galaxy S23", 24);
        inventario[1] = new Alimento("Leche Entera", 2.49, 200, "ALIM-001",
                "2023-12-31", "LOTE-4567");
        inventario[2] = new Ropa("Camiseta", 19.99, 150, "ROPA-001",
                "M", "Azul", "Algodón");

        // Demostrar polimorfismo
        System.out.println("=== Mostrando detalles de todos los productos ===");
        for (Producto producto : inventario) {
            producto.mostrarDetalles();  // Llamada polimórfica
            System.out.println("---------------------");
        }

        System.out.println("\n=== Generando reportes ===");
        for (Producto producto : inventario) {
            producto.generarReporte();  // Llamada polimórfica
            System.out.println("---------------------");
        }

        System.out.println("\n=== Actualizando existencias ===");
        for (Producto producto : inventario) {
            producto.actualizarExistencia(10);  // Llamada polimórfica
            System.out.println("---------------------");
        }
    }
}