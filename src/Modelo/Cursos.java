
package Modelo;


public class Cursos {
private String nombreDelCurso;
private String siglas;
private String creditos;

public Cursos(String nombreDelCurso, String siglas, String creditos){
    this.nombreDelCurso=nombreDelCurso;
    this.siglas=siglas;
    this.creditos=creditos;
}

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getInformacion(){
    return "Nombre del Curso: "+nombreDelCurso+"\nSiglas: "+siglas+"\nCreditos: "+creditos;
    }
}
