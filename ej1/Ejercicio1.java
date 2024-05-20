package ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {
        HashMap<String, List<Producto>> listaDeLaCompra = new HashMap<>();
        Producto producto = new Producto("Leche", 1, "L");
        anyiadirProducto(producto, "Cereales", listaDeLaCompra);
        printLista(listaDeLaCompra);
        Producto producto2 = new Producto("Chocokrispies", 1, "g");
        anyiadirProducto(producto2, "Cereales", listaDeLaCompra);
        printCategoria("Cereales",listaDeLaCompra);
    }

    public static void anyiadirProducto(Producto producto, String categoria,
                                        HashMap<String, List<Producto>> listaDeLaCompra) {
        if(listaDeLaCompra.containsKey(categoria)){
            listaDeLaCompra.get(categoria).add(producto);
        } else {
            List<Producto> lista = new ArrayList<>();
            lista.add(producto);
            listaDeLaCompra.put(categoria, lista);
        }
    }

    public static void printCategoria(String categoria, HashMap<String, List<Producto>> listaDeLaCompra) {
        if(listaDeLaCompra.containsKey(categoria)){
            System.out.println(categoria);
            for(Producto producto : listaDeLaCompra.get(categoria)){
                System.out.println(producto.getCantidad() + producto.getUnidad() + " " + producto.getNombre());
            }
        }
        else {
            System.out.println("La categoria no existe");
        }
    }

    public static void printLista(HashMap<String, List<Producto>> listaDeLaCompra) {
        System.out.println("Lista de la compra");
        for(String categoria : listaDeLaCompra.keySet()){
            printCategoria(categoria, listaDeLaCompra);
        }
    }
}
