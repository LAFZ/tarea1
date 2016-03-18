/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosCursos;
import Vista.FRM_MantenimientoCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hogar
 */
public class Controlador_FRM_MantenimientoCursos implements ActionListener{
    MetodosCursos metodos;
    FRM_MantenimientoCursos mantenimientoCursos;
    
public Controlador_FRM_MantenimientoCursos(FRM_MantenimientoCursos mantenimientoCursos)
{
    this.mantenimientoCursos=mantenimientoCursos;
    metodos=new MetodosCursos();
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Consultar")){
            System.out.println("Consultar");
        }
        if(e.getActionCommand().equals("Agregar")){
            System.out.println("Agregar");
            this.metodos.agregarCurso(mantenimientoCursos.devolverInformacion());
            metodos.mostrarInformacionCursos();
        }
        if(e.getActionCommand().equals("Modificar")){
            System.out.println("Modificar");
        }
        if(e.getActionCommand().equals("Eliminar")){
            System.out.println("Eliminar");
        }
    }

}
