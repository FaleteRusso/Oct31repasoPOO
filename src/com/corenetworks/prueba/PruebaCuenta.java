package com.corenetworks.prueba;

import com.corenetworks.modelo.Cuenta;

public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta c1=new Cuenta("Jaime Martos", 2000.50);
       System.out.println("Nombre de la cuenta: "+c1.getTitular()+" importe en cuenta: " + c1.getCantidad());
        c1.ingresar(200.45);
        System.out.println("Saldo: "+ c1.getCantidad());
        c1.retirar(1000.95);
        System.out.println("Saldo: "+ c1.getCantidad());
        c1.retirar(1200);
        System.out.println();


    }

}
