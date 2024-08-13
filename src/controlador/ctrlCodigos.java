/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Codigos;
import vista.frmCodigos;

/**
 *
 * @author Estudiante
 */
public class ctrlCodigos implements MouseListener{
    
    //Llamar a las otras 2 capas (modelo y la vista)
    
    private Codigos modelo;
    private frmCodigos vista;
    
    //2- Crear constructor de la clase
    
    public ctrlCodigos(Codigos modeloQuePido, frmCodigos vistaQuePido){
        
        this.modelo = modeloQuePido;
        this.vista = vistaQuePido;
        
        vista.btnAgregar.addMouseListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()== vista.btnAgregar){
            modelo.setNombre_Estudiante(vista.txtNombre.getText());
            modelo.setTipo_Codigo(vista.txtTipoCodigo.getText());
            modelo.setCarnet_estudiante(Integer.parseInt(vista.txtCarnet.getText()));
            
            modelo.Guardar();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
