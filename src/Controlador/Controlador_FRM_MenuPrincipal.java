/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_MantenimientoCursos;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hogar
 */
public class Controlador_FRM_MenuPrincipal implements ActionListener{
    FRM_MantenimientoEstudiantes mantenimientoEstudiantes;
    FRM_MantenimientoCursos mantenimientoCursos;

public Controlador_FRM_MenuPrincipal(){
this.mantenimientoEstudiantes=new FRM_MantenimientoEstudiantes();
this.mantenimientoCursos=new FRM_MantenimientoCursos();
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Salir")){
        System.exit(0);
        }
        if(e.getActionCommand().equals("Estudiantes")){
            this.mantenimientoEstudiantes.setVisible(true);
            //this.mantenimientoEstudiantes.setLocation(null);
            System.out.println("Presiono el menú Estudiantes");
        }
        if(e.getActionCommand().equals("Cursos")){
            this.mantenimientoCursos.setVisible(true);
            System.out.println("presiono el menú Cursos");
        }
    }

}



