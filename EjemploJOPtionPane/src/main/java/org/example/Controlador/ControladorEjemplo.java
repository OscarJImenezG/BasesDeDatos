package org.example.Controlador;

import org.example.Vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorEjemplo extends MouseAdapter {
    private Ventana view;

    public ControladorEjemplo(Ventana ventana) {
        this.view = ventana;
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.getBtnMensaje()){
            //System.out.println("Mensaje");
            ImageIcon icono = new ImageIcon("exito.png");
            JOptionPane.showMessageDialog(view, "Hola desde el ejemplo", "Titulo personalizado", JOptionPane.ERROR_MESSAGE, icono);
        }

        if (e.getSource() == view.getBtnEntrada()){
            //System.out.println("Entrada");
            String datos = JOptionPane.showInputDialog(view, "Ejmplo de entrada", "Titulo personalizado", JOptionPane.QUESTION_MESSAGE);
            this.view.getLblResultado().setText(datos);
        }

        if (e.getSource() == view.getBtnOpcion()){
            //System.out.println("Opcion");
            int respuesta = JOptionPane.showConfirmDialog(view, "¿Estas seguro de borrar este registro?", "Confirmacion", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION){
                view.getLblResultado().setText("Elegiste la opcion SI");
            }else{
                view.getLblResultado().setText("Elegiste la opcion NO");
            }
        }
    }
}
