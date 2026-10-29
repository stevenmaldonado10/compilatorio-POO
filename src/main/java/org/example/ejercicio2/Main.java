package org.example.ejercicio2;

public class Main {

    public static void main(String[] args) {

        Producto producto = new Producto("PC", 3000000);
        Producto producto1 = new Producto("Impresora", 2000000);
        Producto producto2 = new Producto("Scanner", 5000000);

        Venta venta = new Venta();
        venta.agregarProducto(producto);
        venta.agregarProducto(producto1);
        venta.agregarProducto(producto2);

        venta.realizarVenta("Juan");

        Producto producto3 = new Producto("Balón", 300000);
        Producto producto4 = new Producto("Camiseta", 200000);
        Producto producto5 = new Producto("Tennis", 500000);

        venta.agregarProducto(producto3);
        venta.agregarProducto(producto4);
        venta.agregarProducto(producto5);

        venta.realizarVenta("Luis");

        venta.mostrarVentas();
    }
}
