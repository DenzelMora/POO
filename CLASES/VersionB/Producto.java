package VersionB;

public class Producto {
    // Atributos privados
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    
    // Constructor por defecto
    public Producto() {
        this.codigo = "P000";
        this.descripcion = "Producto genérico";
        this.cantidad = 1;
        this.precioUnitario = 0.0;
    }
    
    // Constructor parametrizado con validaciones
    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        this.codigo = (codigo != null && !codigo.isEmpty()) ? codigo : "P000";
        this.descripcion = (descripcion != null && !descripcion.isEmpty()) ? descripcion : "Sin descripción";
        this.cantidad = (cantidad >= 1) ? cantidad : 1;
        this.precioUnitario = (precioUnitario >= 0) ? precioUnitario : 0.0;
    }
    
    // Getters y Setters con validaciones
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        }
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.isEmpty()) {
            this.descripcion = descripcion;
        }
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        if (cantidad >= 1) {
            this.cantidad = cantidad;
        }
    }
    
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        }
    }
    
    // Método calcularSubtotal
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }
    
    // Método aplicarDescuento
    public double aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 50) {
            double subtotal = calcularSubtotal();
            double descuento = subtotal * (porcentaje / 100);
            return subtotal - descuento;
        } else {
            System.out.println("Error: El descuento debe estar entre 0 y 50%");
            return calcularSubtotal();
        }
    }
    
    // Método incrementarCantidad
    public void incrementarCantidad(int valor) {
        if (valor > 0) {
            this.cantidad += valor;
        } else {
            System.out.println("Error: El valor a incrementar debe ser mayor a 0");
        }
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", subtotal=" + calcularSubtotal() +
                '}';
    }
}