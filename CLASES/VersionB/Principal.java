package VersionB;

public class Principal {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS CLASE PRODUCTO ===\n");
        
        // Crear un producto con constructor parametrizado
        Producto p1 = new Producto("P001", "Laptop Dell", 2, 1500.0);
        System.out.println("Producto creado:");
        System.out.println(p1);
        System.out.println();
        
        // Calcular subtotal
        System.out.println("Subtotal inicial: $" + p1.calcularSubtotal());
        System.out.println();
        
        // Incrementar cantidad
        System.out.println("--- Incrementando cantidad en 3 unidades ---");
        p1.incrementarCantidad(3);
        System.out.println(p1);
        System.out.println("Nuevo subtotal: $" + p1.calcularSubtotal());
        System.out.println();
        
        // Aplicar descuento válido (20%)
        System.out.println("--- Aplicando descuento del 20% ---");
        double totalConDescuento = p1.aplicarDescuento(20);
        System.out.println("Total con descuento: $" + totalConDescuento);
        System.out.println();
        
        // Intentar aplicar descuento inválido (60%)
        System.out.println("--- Intentando aplicar descuento del 60% (inválido) ---");
        double totalInvalido = p1.aplicarDescuento(60);
        System.out.println("Total: $" + totalInvalido);
        System.out.println();
        
        // Crear producto con constructor por defecto
        System.out.println("--- Producto con constructor por defecto ---");
        Producto p2 = new Producto();
        System.out.println(p2);
        System.out.println();
        
        // Modificar producto por defecto
        System.out.println("--- Modificando producto por defecto ---");
        p2.setCodigo("P002");
        p2.setDescripcion("Mouse inalámbrico");
        p2.setCantidad(10);
        p2.setPrecioUnitario(25.5);
        System.out.println(p2);
        System.out.println("Subtotal: $" + p2.calcularSubtotal());
        System.out.println("Total con 15% descuento: $" + p2.aplicarDescuento(15));
        System.out.println();
        
        // Prueba con validaciones
        System.out.println("--- Pruebas de validación ---");
        System.out.println("Intentando incrementar con valor negativo:");
        p2.incrementarCantidad(-5);
        
        System.out.println("Intentando establecer cantidad inválida:");
        p2.setCantidad(0);
        System.out.println("Cantidad actual: " + p2.getCantidad());
        
        System.out.println("Intentando establecer precio negativo:");
        p2.setPrecioUnitario(-10);
        System.out.println("Precio actual: $" + p2.getPrecioUnitario());
    }
}