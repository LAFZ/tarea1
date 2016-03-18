
package Controlador;

import Modelo.MetodosEstudiantes;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador_FRM_MantenimientoEstudiantes implements ActionListener {
    MetodosEstudiantes metodos;
    FRM_MantenimientoEstudiantes mantenimientoEstudiantes;

    public Controlador_FRM_MantenimientoEstudiantes(FRM_MantenimientoEstudiantes mantenimientoEstudiantes)
    {
        this.mantenimientoEstudiantes=mantenimientoEstudiantes;
        metodos=new MetodosEstudiantes();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Consultar")){
        System.out.println("Consultar");
        }
        if(e.getActionCommand().equals("Agregar")){
        System.out.println("Agregar");
        this.metodos.agregarEstudiante(this.mantenimientoEstudiantes.devolverInformacion());
        this.metodos.mostrarInformacionEstudiantes();
        }
        if(e.getActionCommand().equals("Modificar")){
        System.out.println("Modificar");
        }
        if(e.getActionCommand().equals("Eliminar")){
        System.out.println("Eliminar");
        }
    }

}
