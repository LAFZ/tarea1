
package Modelo;

import java.util.ArrayList;


public class MetodosCursos {
    ArrayList <Cursos> arrayCursos;
    String arregloInformacion[];
    
    public MetodosCursos(){
        arrayCursos=new ArrayList <Cursos>();
        arregloInformacion=new String[2];
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
    
    public boolean consultarCurso(String sigla)
    {
        boolean itemEncontrado=false;
        for(int i=0;i<arrayCursos.size();i++)
        {
           if(arrayCursos.get(i).getSiglas().equals(sigla))
                {
                    arregloInformacion[0]=arrayCursos.get(i).getNombreDelCurso();
                    arregloInformacion[1]=arrayCursos.get(i).getCreditos();
                    itemEncontrado=true;
                }
        }
        return itemEncontrado;
    }
    public void modificarCurso(String sigla, String nombre, String credito){
    for(int i=0;i<arrayCursos.size();i++)
        {
           if(arrayCursos.get(i).getSiglas().equals(sigla))
            {
                this.arrayCursos.get(i).setNombreDelCurso(nombre);
                this.arrayCursos.get(i).setCreditos(credito);
            }
        }
    }
    public void eliminarCurso (String sigla)
    {
        for(int i=0;i<arrayCursos.size();i++)
        {
           if(arrayCursos.get(i).getSiglas().equals(sigla))
            {
               this.arrayCursos.remove(i);
            }
        }
    }
    public String[] getArregloInformacion(){
        return arregloInformacion;
    }
}
