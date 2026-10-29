package org.example.ejercicio2;

import java.util.ArrayList;
import java.util.TreeMap;

public class Venta {

    private final ArrayList<Producto> productos = new ArrayList<>();

    private final TreeMap<String, Double> clientes = new TreeMap<>();

    public ArrayList<Producto> getProducto() {
        return productos;
    }

    public TreeMap<String, Double> getCliente() {
        return clientes;
    }

    public void agregarProducto(Producto producto){

        this.productos.add(producto);
        System.out.println("producto agregado: "+producto);
    }

    public void realizarVenta(String cliente){

        double totalProductos=0;

        for( Producto producto : this.productos){

            totalProductos+=producto.getPrecio();
        }

        this.clientes.put(cliente, totalProductos);

        System.out.println("venta realizada para: "+cliente+" con total de: "+totalProductos);

        this.productos.clear();
    }

    public void mostrarVentas(){

        System.out.println("ventas realizadas:");
        System.out.println(clientes);
    }
}
