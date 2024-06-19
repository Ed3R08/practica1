package com.mycompany.practica1;
//importo la libreria Date para un futuro uso en la entrega y devolucion de libros
import java.util.Date;

//Creo la clase prestamo que implementa nuevamente mostrarInfo() de la interface ImprimirInfo
public class Prestamo implements ImprimirInfo{
    private Libro libro;
    private Usuario usuario;
    private String fechaPrestamo;
    private String fechaDevolucion;

    //Constructor de la clase prestamo
    public Prestamo(Libro libro, Usuario usuario, String fechaPrestamo, String fechaDevolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
    //getters and setters generados automaticamente
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    //nuevamente utilizo el metodo sobreescrito mostrarInfo()
    @Override
    public void mostrarInfo(){
        
        System.out.println("Información del Préstamo:");
        System.out.println("Libro: ");
        libro.mostrarInfo();
        System.out.println("Usuario: ");
        usuario.mostrarInfo();
        System.out.println("Fecha de Préstamo: " + fechaPrestamo);
        System.out.println("Fecha de Devolución Estimada: " + fechaDevolucion);
    }
}
    
    
