package com.mycompany.practica1;
// creo una clase llamada autor que hereda de Persona e implementa de ImprimirInfo el metodo mostrarInfo()
public class Autor extends Persona implements ImprimirInfo {
    //Creo atributos necesarios sabiendo que estamos heredando de persona nombre y apellido
    private String nacionalidad;
    private String fechaNacimiento;
    //Creamos el constructor de manera automatica
    public Autor(String nombre, String apellido,String nacionalidad, String fechaNacimiento ) {
        super(nombre, apellido);
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }
    //Creamos los getters and setters de la misma forma, automaticamente
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

    //Se utiliza el metodo mostrarInfo sobreescrito que proviene de la interface ImprimirInfo 
    @Override
     public void mostrarInfo(){
    
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Nacionalidad: "+nacionalidad);
        System.out.println("Fecha de nacimiento: "+fechaNacimiento);
        
        
    }
}
    
