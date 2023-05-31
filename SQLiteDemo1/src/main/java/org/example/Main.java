package org.example;

import org.example.Controlador.ControladorLibro;
import org.example.Vista.VentanaLibro;
import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;
import org.example.persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        VentanaLibro view =  new VentanaLibro("MVC, JDBC");
        ControladorLibro contoller = new ControladorLibro(view);
    }
}