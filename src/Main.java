import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAOImpl();

        Libro libro1 = new Libro(1, "Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
        Libro libro3 = new Libro(3, "1984", "George Orwell", 1949);

        libroDAO.crear(libro1);
        libroDAO.crear(libro2);
        libroDAO.crear(libro3);

        System.out.println("Leer libro con ID 2: " + libroDAO.leer(2));

        System.out.println("\nLeer todos los libros:");
        List<Libro> libros = libroDAO.leerTodos();
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        libro1.setTitulo("Cien años de soledad (Edición revisada)");
        libroDAO.actualizar(libro1);

        System.out.println("\nLibros después de actualización:");
        libros = libroDAO.leerTodos();
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        libroDAO.eliminar(2);

        System.out.println("\nLibros después de eliminación:");
        libros = libroDAO.leerTodos();
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}