import java.util.ArrayList;
import java.util.List;

public class LibroDAOImpl implements LibroDAO {
    private List<Libro> libros;

    public LibroDAOImpl() {
        libros = new ArrayList<>();
    }

    @Override
    public void crear(Libro libro) {
        libros.add(libro);
    }

    @Override
    public Libro leer(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public List<Libro> leerTodos() {
        return libros;
    }

    @Override
    public void actualizar(Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == libro.getId()) {
                libros.set(i, libro);
                return;
            }
        }
    }

    @Override
    public void eliminar(int id) {
        libros.removeIf(libro -> libro.getId() == id);
    }
}