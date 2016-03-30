
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
            buscar();        
            //this.mantenimientoEstudiantes.estadoInicial();
        }
        if(e.getActionCommand().equals("Agregar")){
        System.out.println("Agregar");
        this.metodos.agregarEstudiante(this.mantenimientoEstudiantes.devolverInformacion());
        this.metodos.mostrarInformacionEstudiantes();
        this.mantenimientoEstudiantes.limpiar();
        this.mantenimientoEstudiantes.estadoInicial();
        }
        if(e.getActionCommand().equals("Modificar")){
            this.metodos.modificarEstudiante(this.mantenimientoEstudiantes.devolverCarnet(), this.mantenimientoEstudiantes.devolverNombre());
            this.mantenimientoEstudiantes.limpiar();
            this.mantenimientoEstudiantes.estadoInicial();
        System.out.println("Modificar");
        }
        if(e.getActionCommand().equals("Eliminar")){
            this.metodos.eliminarEstudiante(this.mantenimientoEstudiantes.devolverCarnet());
            this.mantenimientoEstudiantes.limpiar();
            this.mantenimientoEstudiantes.estadoInicial();
        System.out.println("Eliminar");
        }
    }
    
    public void buscar(){
        if(metodos.consultarEstudiante(this.mantenimientoEstudiantes.devolverCarnet())){
            this.mantenimientoEstudiantes.mostrarInformacion(metodos.getArregloInformacion());
            this.mantenimientoEstudiantes.habilitarOpciones();
            this.mantenimientoEstudiantes.deshabilitarCarnet();
            this.mantenimientoEstudiantes.mostrarMensaje("El estudiante con el carnet: "+this.mantenimientoEstudiantes.devolverCarnet()+" se encuentra registrado");
        }
        else{
            mantenimientoEstudiantes.mostrarMensaje("El estudiante con este carnet "+this.mantenimientoEstudiantes.devolverCarnet()+" no existe");
            this.mantenimientoEstudiantes.habilitarAgregar();
        }
    }
}
