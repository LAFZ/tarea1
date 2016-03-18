
package Modelo;

import java.util.ArrayList;


public class MetodosCursos {
    ArrayList <Cursos> arrayCursos;
    public MetodosCursos(){
        arrayCursos=new ArrayList <Cursos>();
    }
    
    public void agregarCurso(String informacion[]){
        Cursos temporal=new Cursos(informacion[0], informacion[1], informacion[2]);
        this.arrayCursos.add(temporal);
    }
    
    public void mostrarInformacionCursos(){
        Cursos temporal;
        temporal=this.arrayCursos.get(0);
        System.out.println(temporal.getInformacion());
    }
}
