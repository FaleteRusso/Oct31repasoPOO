package com.corenetworks.modelo;

public class Producto {
    private int idProducto;
    private String nombre;
    private int cantidadExistencias;

    public void compraProducto(int cantidad){
        if (cantidad>0){
            cantidadExistencias+=cantidad;
        }
    }
    public void ventaProducto(int cantidad) {
        if (cantidad <= cantidadExistencias) {
            cantidadExistencias -= cantidad;

        }else {

        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", cantidadExistencias=" + cantidadExistencias +
                '}';
    }

    public Producto() {
    }

    public Producto(int idProducto, String nombre, int cantidadExistencias) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidadExistencias = cantidadExistencias;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadExistencias() {
        return cantidadExistencias;
    }

    public void setCantidadExistencias(int cantidadExistencias) {
        this.cantidadExistencias = cantidadExistencias;
    }
}
