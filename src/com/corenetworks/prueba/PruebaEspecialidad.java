package com.corenetworks.prueba;

import com.corenetworks.modelo.Especialidad;

import java.util.Scanner;

public class PruebaEspecialidad {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        Especialidad e1 = new Especialidad();
        System.out.println("Escriba su Id:");
        e1.setIdEspecialidad(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Escriba su nombre:");
        e1.setNombre(teclado.nextLine());
        System.out.println(e1.toString());
    }
}
