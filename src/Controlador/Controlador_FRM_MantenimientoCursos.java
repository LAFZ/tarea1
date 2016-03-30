
package Controlador;

import Modelo.MetodosCursos;
import Vista.FRM_MantenimientoCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
            buscar();
            System.out.println("Consultar");
        }
        if(e.getActionCommand().equals("Agregar")){
            System.out.println("Agregar");
            this.metodos.agregarCurso(mantenimientoCursos.devolverInformacion());
            metodos.mostrarInformacionCursos();
            this.mantenimientoCursos.limpiar();
            this.mantenimientoCursos.estadoInicial();
        }
        if(e.getActionCommand().equals("Modificar")){
            this.metodos.modificarCurso(this.mantenimientoCursos.devolverSigla(),this.mantenimientoCursos.devolverNombre(),this.mantenimientoCursos.devolverCreditos());
            this.mantenimientoCursos.limpiar();
            System.out.println("Modificar");
            this.mantenimientoCursos.limpiar();
            this.mantenimientoCursos.estadoInicial();
        }
        if(e.getActionCommand().equals("Eliminar")){
            this.metodos.eliminarCurso(this.mantenimientoCursos.devolverSigla());
            System.out.println("Eliminar");
            this.mantenimientoCursos.limpiar();
            this.mantenimientoCursos.estadoInicial();
        }
    }
    public void buscar(){
        if(metodos.consultarCurso(this.mantenimientoCursos.devolverSigla())){
            this.mantenimientoCursos.mostrarInformacion(metodos.getArregloInformacion());
            this.mantenimientoCursos.habilitarOpciones();
            this.mantenimientoCursos.deshabilitarSigla();
            this.mantenimientoCursos.mostrarMensaje("El curso con las siglas: "+this.mantenimientoCursos.devolverSigla()+" se encuentra registrado");
        }
        else{
            this.mantenimientoCursos.mostrarMensaje("El curso consultado con las siglas: "+this.mantenimientoCursos.devolverSigla()+" no esta registrado.");
            this.mantenimientoCursos.habilitarAgregar();
        }
    }
}
