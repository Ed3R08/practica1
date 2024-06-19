
package com.mycompany.practica1;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Practica1 {

    public static void main(String[] args) {
        
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        
        Libro libro1 = new Libro("Harry Potter", "J,K Rowling", "10-15-2001",
        "Magia",true);
        Libro libro2 = new Libro("IT", "Stephen King", "1-1-1986", "Terror",true);
        
        Autor autor1 = new Autor("Joanne","Rowling","Inglesa","31-7-1965");
        Autor autor2 = new Autor("Stephen","King","Estadounidense","21-7-1947");
    
        Usuario usuario1 = new Usuario("Eder","Serrano","Getsemani","8319-9289",12345);
        Usuario usuario2 = new Usuario("Fernanda","Ramirez","Getsemani","8720-7065",123456);
        
        libros.add(libro1);
        libros.add(libro2);
        
        autores.add(autor1);
        autores.add(autor2);
        
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        
        while (true){
            String opcion = JOptionPane.showInputDialog("""
                                                        Elija una opción
                                                        1.Ver opciones de libros
                                                        2.Ver Autores
                                                        3.Ver usuarios actuales
                                                        4.Agregar usuario nuevo
                                                        5.Prestamo de libro
                                                        6.Ver libros prestados
                                                        7.Salir""");
            if (opcion == null){
                break;
            }
           switch(opcion){
            case "1" -> {
                for (Libro libro : libros){
                    libro.mostrarInfo();
                }
                }
            case "2" -> {
                for (Autor autor : autores){
                    autor.mostrarInfo();
                }
                }
            case "3" -> {
                for (Usuario usuario : usuarios){
                    usuario.mostrarInfo();
                }
                }
            case "4" -> {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo usuario: ");
                String apellido = JOptionPane.showInputDialog("Ingrese el apellido: ");
                String direccion = JOptionPane.showInputDialog("Ingrese la direccion: ");
                String telefono = JOptionPane.showInputDialog("Ingrese el numero de telefono: ");
                int cedula; 
                try{
                    cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula: "));
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"El numero de cedula debe ser un numero entero");
                    break;
                }
                
                Usuario nuevoUsuario = new Usuario (nombre,apellido,direccion,telefono,cedula);
                usuarios.add(nuevoUsuario);
                JOptionPane.showInternalMessageDialog(null,"¡Usuario agregado!");
                }
                
            case "5" -> {
                String prestarLibro = JOptionPane.showInputDialog("Cual libro se va llevar: ");
                Libro libroPrestado = null;
                for (Libro libro : libros){
                    if(libro.getTitulo().equalsIgnoreCase(prestarLibro)){
                        libroPrestado = libro;
                        break;
                    }
                }
                if (libroPrestado == null){
                    JOptionPane.showMessageDialog(null,"El libro no se encuentra disponible");
                    break;
                }
                
                String cedulaUsuario = JOptionPane.showInputDialog("Digite el numero de cedula del usuario: ");
                Usuario usuarioPrestamo = null;
                for (Usuario usuario : usuarios){
                    if (usuario.getCedula() == Integer.parseInt(cedulaUsuario)){
                        usuarioPrestamo = usuario;
                        break;                        
                    }
                }
                if (usuarioPrestamo == null){
                    JOptionPane.showMessageDialog(null,"El usuario no existe");
                    break;
                }
                String fechaPrestamo = JOptionPane.showInputDialog("Ingrese la fecha en que se realiza el prestamo(dd-mm-aa)");
                String fechaDevolucion = JOptionPane.showInputDialog("Ingrese la fecha de devolución(dd-mm-aa)");
                
                Prestamo prestamoNuevo = new Prestamo (libroPrestado,usuarioPrestamo,fechaPrestamo,fechaDevolucion);
                prestamos.add(prestamoNuevo);
                JOptionPane.showMessageDialog(null, "¡Prestamo realizado!");
                }

                
            case "6" -> {
                for (Prestamo prestamo : prestamos){
                    prestamo.mostrarInfo();
                }
                }
            
            case "7" -> {
                return;
                }
                
            default -> JOptionPane.showMessageDialog(null,"Opción invalida intente de nuevo");
        }
    }    

    }
}