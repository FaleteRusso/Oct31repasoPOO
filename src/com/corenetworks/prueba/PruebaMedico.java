package com.corenetworks.prueba;

import com.corenetworks.modelo.Medico;

import java.util.Scanner;

public class PruebaMedico {
    public static void main(String[] args) {
        Medico m1 = new Medico();
        m1.setIdMedico(1);
        m1.setNombre("Victor");
        m1.setApellido("Alcaparra");
        m1.setCmp("Licenciado");
        System.out.println(m1.toString());
        //REcibiendo datos por consola
        Scanner teclado = new Scanner(System.in);
        Medico m2 = new Medico();

        System.out.println("escriba la Id del médico");
        m2.setIdMedico(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Escriba el nombre del medico");
        m2.setNombre(teclado.nextLine());
        System.out.println("Escriba el apellido del medico");
        m2.setApellido(teclado.nextLine());
        System.out.println("Escriba el numero de licencia");
        m2.setCmp(teclado.nextLine());
        System.out.println(m2.toString());
    }
}

