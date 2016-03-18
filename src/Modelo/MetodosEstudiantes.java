
package Modelo;

import java.util.ArrayList;


public class MetodosEstudiantes {
    
    ArrayList <Estudiantes> arrayEstudiantes;
    
    public MetodosEstudiantes()
    {
        arrayEstudiantes=new ArrayList<Estudiantes>();
    }
    public void agregarEstudiante(String informacion[]){
        Estudiantes temporal=new Estudiantes(informacion[0],informacion[1]);
        this.arrayEstudiantes.add(temporal);
    }
    public void mostrarInformacionEstudiantes(){
        Estudiantes temporal;
        temporal=arrayEstudiantes.get(0);
        System.out.println(temporal.getInformacion());
    }
}
