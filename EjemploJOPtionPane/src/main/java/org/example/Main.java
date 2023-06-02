package org.example;

import org.example.Controlador.ControladorEjemplo;
import org.example.Vista.Ventana;

public class Main {

    public static void main(String[] args) {

        Ventana ventana = new Ventana("Ejemplo JOtionPane");
        ControladorEjemplo controller = new ControladorEjemplo(ventana);
    }
}