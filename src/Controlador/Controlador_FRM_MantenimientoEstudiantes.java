
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
            this.mantenimientoEstudiantes.mostrarInformacion(metodos.consultarEstudiante(this.mantenimientoEstudiantes.devolverCarnet()));
        System.out.println("Consultar");
        }
        if(e.getActionCommand().equals("Agregar")){
        System.out.println("Agregar");
        this.metodos.agregarEstudiante(this.mantenimientoEstudiantes.devolverInformacion());
        this.metodos.mostrarInformacionEstudiantes();
        this.mantenimientoEstudiantes.limpiar();
        }
        if(e.getActionCommand().equals("Modificar")){
            this.metodos.modificarEstudiante(this.mantenimientoEstudiantes.devolverCarnet(), this.mantenimientoEstudiantes.devolverNombre());
            this.mantenimientoEstudiantes.limpiar();
        System.out.println("Modificar");
        }
        if(e.getActionCommand().equals("Eliminar")){
            this.metodos.eliminarEstudiante(this.mantenimientoEstudiantes.devolverCarnet());
        System.out.println("Eliminar");
        }
    }

}
