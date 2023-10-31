package com.corenetworks.prueba;

import com.corenetworks.modelo.Medico;

public class PruebaMedico {
    public static void main(String[] args) {
        Medico m1 = new Medico();
        m1.setIdMedico(1);
        m1.setNombre("Victor");
        m1.setApellido("Alcaparra");
        m1.setCmp("Licenciado");
        System.out.println(m1.toString());
    }
}

