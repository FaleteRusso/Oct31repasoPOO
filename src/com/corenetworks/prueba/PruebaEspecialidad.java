package com.corenetworks.prueba;

import com.corenetworks.modelo.Especialidad;

public class PruebaEspecialidad {
    public static void main(String[] args) {

        Especialidad e1 = new Especialidad();
        e1.setIdEspecialidad(1);
        e1.setNombre("traumatología");
        System.out.println(e1.toString());
    }
}
