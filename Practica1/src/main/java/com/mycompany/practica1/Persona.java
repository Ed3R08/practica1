package com.mycompany.practica1;
//creo la clase base la cual heredara a usuario y autor
public class Persona {
    private String nombre;
    private String apellido;

    //Creo el constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //getters and setters automaticos
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
