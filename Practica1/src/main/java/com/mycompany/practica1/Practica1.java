
package com.mycompany.practica1;
//importamos JOptionPane para darle una interfaz amigable al usuario 
// y la libreria ArrayList para almacenar los datos necesarios
import javax.swing.JOptionPane;
import java.util.ArrayList;

//clase principal
public class Practica1 {

    public static void main(String[] args) {
    //Creamos los arreglos para agregra libros, autores, usuarios y prestamos correspondientemente        
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        
        //creamos los libros uno por uno para ser agregado posteriormente
        Libro libro1 = new Libro("Harry Potter", "J,K Rowling", "10-15-2001",
        "Magia",true);
        Libro libro2 = new Libro("IT", "Stephen King", "1-1-1986", "Terror",true);
        
        //igualmente creamos los autores los cuales seran agregados a continuacion
        Autor autor1 = new Autor("Joanne","Rowling","Inglesa","31-7-1965");
        Autor autor2 = new Autor("Stephen","King","Estadounidense","21-7-1947");
        
        //Creo un par de usuarios predeterminados
        Usuario usuario1 = new Usuario("Eder","Serrano","Getsemani","8319-9289",12345);
        Usuario usuario2 = new Usuario("Fernanda","Ramirez","Getsemani","8720-7065",123456);
        
        // aca agregamos tanto los libros creados como los autores y usuarios a sus respectivos arreglos
        //cabe recalcar que mas adelante podremos agregar usuarios nuevos y la lista de prestamos se ira
        //llenando conforme se realice nos prestamos de libros 
        libros.add(libro1);
        libros.add(libro2);
        
        autores.add(autor1);
        autores.add(autor2);
        
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        
        //creo un ciclo el cual nos permitira mostrar el menu de opciones mostrado mediante el cuadro
        //generado por JOptionPane segun la opcion elegida seguiremos mostrando el menu, hasta que elijamos
        //la opcion 7 la cual quiebra el ciclo y cierra el programa
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
            //Creo una condicional switch case para la elccion del menu 
            //opciones 1, 2, y 3 nos mostrar unicamente la informacion ya agregada
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
            //aca creamos la logica del codigo para poder agregar un usuario nuevo solicitando los datos
            //mediante el cuadro JOptionPane y agregando los datos a sus respectivas variables
            case "4" -> {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo usuario: ");
                String apellido = JOptionPane.showInputDialog("Ingrese el apellido: ");
                String direccion = JOptionPane.showInputDialog("Ingrese la direccion: ");
                String telefono = JOptionPane.showInputDialog("Ingrese el numero de telefono: ");
                int cedula; 

                //creacion de una excepcion la cual no permite que el usuario ingrese un numero de cedula que 
                // no sea un numero entero
                try{
                    cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula: "));
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"El numero de cedula debe ser un numero entero");
                    break;
                }
                // se crea el nuevo usuario para irlo agregando a la lista usuarios creada inicialmente
                Usuario nuevoUsuario = new Usuario (nombre,apellido,direccion,telefono,cedula);
                usuarios.add(nuevoUsuario);
                JOptionPane.showInternalMessageDialog(null,"¡Usuario agregado!");
                }
                
                //creamos la logica para el prestamo de libros 
            case "5" -> {
                String prestarLibro = JOptionPane.showInputDialog("Cual libro se va llevar: ");
                Libro libroPrestado = null;
                
                //con este ciclo for nos permite recorrer la lista y la igualdad utilizada .equalsIgnoreCase
                //verifica que ingresemos el nombre del libro correctamente para buscarlo en el arreglo e
                // indicarnos si el libro existe en nuestra biblioteca 
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
                
                //aca igualamos el numero de cedula ingresado por usuario el cual es un dato que no cambia
                //para relacionar el libro que prestaremos con el usuario correspondiente
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
                //se solicita la fecha de entrega mas la fecha de devolucion para mostarlo en la lista de prestamos
                String fechaPrestamo = JOptionPane.showInputDialog("Ingrese la fecha en que se realiza el prestamo(dd-mm-aa)");
                String fechaDevolucion = JOptionPane.showInputDialog("Ingrese la fecha de devolución(dd-mm-aa)");
                
                Prestamo prestamoNuevo = new Prestamo (libroPrestado,usuarioPrestamo,fechaPrestamo,fechaDevolucion);
                prestamos.add(prestamoNuevo);
                JOptionPane.showMessageDialog(null, "¡Prestamo realizado!");
                }

            // muestra la info de prestamos    
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