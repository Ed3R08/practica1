package com.mycompany.practica1;
//Creacion de la clase usuario que hereda de persona e implementa de ImprimirInfo
public class Usuario extends Persona implements ImprimirInfo {
    private String direccion;
    private String telefono;
    private int cedula;

    //Creamos el constructor 
    public Usuario(String nombre, String apellido, String direccion, String telefono,int cedula) {
        super(nombre, apellido);
        this.direccion = direccion;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    // getters and setters generados automaticamente
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    //utilizamos el metodo sobreescrito mostrarInfo()
    @Override
     public void mostrarInfo(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Dirección: "+direccion);
        System.out.println("Telefono: "+telefono);
        System.out.println("Cedula: "+cedula);
        
    }

}