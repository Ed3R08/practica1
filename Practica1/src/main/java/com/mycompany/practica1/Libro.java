package com.mycompany.practica1;
//Creo mi clase libro con sus atributos
public class Libro implements ImprimirInfo {
    private String titulo;
    private String autor;
    private String fecha;
    private String genero;
    private boolean disponibilidad;
// Hago mi constructor 
    public Libro(String titulo, String autor, String fecha, String genero, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.genero = genero;
        this.disponibilidad = disponibilidad;
    }
// getters and setrers
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    //Realizo mi metodo para mostrar la informacion de los libros
    @Override
    public void mostrarInfo(){
        System.out.println("El titulo del libro es: "+titulo);
        System.out.println("El autor del libro es: "+autor);
        System.out.println("La fecha de lanzamiento del libro es: "+fecha);
        System.out.println("Genero del libro: "+genero);
        System.out.println("¿Esta disponible el libro? "+disponibilidad);
    }
}
