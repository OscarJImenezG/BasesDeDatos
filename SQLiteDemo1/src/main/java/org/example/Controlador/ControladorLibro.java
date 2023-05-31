package org.example.Controlador;

import org.example.Vista.VentanaLibro;
import org.example.modelo.Libro;
import org.example.modelo.ModeloTablaLibro;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorLibro extends MouseAdapter {
    private VentanaLibro view;
    private ModeloTablaLibro modelo;

    public ControladorLibro(VentanaLibro view) {
        this.view = view;
        modelo = new ModeloTablaLibro();
        this.view.getTblLIbro().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if(e.getSource() == this.view.getBtnCargar()){

           modelo.cargarDatos();
           this.view.getTblLIbro().setModel(modelo);
           this.view.getTblLIbro().updateUI();
       }
       if(e.getSource() == this.view.getBtnAgregar()){
           Libro libro= new Libro();
           libro.setId(0);
           libro.setTitulo(this.view.getTxtTitulo().getText());
           libro.setAutor(this.view.getTxtAutor().getText());
           if (modelo.agregarLibro(libro)){
               JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
               this.view.getTblLIbro().updateUI();
           }else{
               JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Por favor revise su cinexión", "Error al insertar", JOptionPane.ERROR_MESSAGE);
           }
           this.view.limpiar();
       }

    }

}
