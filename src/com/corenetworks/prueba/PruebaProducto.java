package com.corenetworks.prueba;

import com.corenetworks.modelo.Producto;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto p1=new Producto(1,"Sarten",10);
       p1.compraProducto(3);
       p1.ventaProducto(14);
        System.out.println(p1.toString());

    }
}
