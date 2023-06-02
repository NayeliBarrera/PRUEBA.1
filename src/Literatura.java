import java.util.Scanner;

public class Literatura {

//Atributos
    String autor;
    String nacionalidad;
    String nombreLibro;
    String genero;
    int anio;
    public Literatura(String autor, String nacionalidad, String nombreLibro, String genero, int anio)
        this.autor=autor;
        this.nacionalidad=nacionalidad;
        this.nombreLibro=nombreLibro;
        this.genero=genero;
        this.anio=anio;

    //Getter y Setter
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro; //Constructores
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

