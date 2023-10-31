package com.corenetworks.prueba;

import com.corenetworks.modelo.Paciente;

public class PruebaPaciente {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        p1.setIdPaciente(1);
        p1.setNombre("Juanito");
        p1.setApellido("López");
        p1.setDni("51890985C");
        p1.setDireccion("calle 14 abril");
        p1.setTelefono("623456876");
        p1.setEmail("jlopz@tutifruti.com");

        System.out.println("id paciete"+ p1.getIdPaciente());
        System.out.println(p1.toString());

        //intaciamos la clase de nuevo
        Paciente p2=new Paciente(2,"Manuel","Moreno","52009856L","calle Republica","915546768","mmorrepublic@tifus.com");
        System.out.println(p2.toString());
    }
}
