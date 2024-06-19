package com.mycompany.practica1;

public class Autor extends Persona implements ImprimirInfo {
    private String nacionalidad;
    private String fechaNacimiento;

    public Autor(String nombre, String apellido,String nacionalidad, String fechaNacimiento ) {
        super(nombre, apellido);
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    @Override
     public void mostrarInfo(){
    
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Nacionalidad: "+nacionalidad);
        System.out.println("Fecha de nacimiento: "+fechaNacimiento);
        
        
    }
}
    
