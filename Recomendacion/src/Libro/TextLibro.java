package Libro;

public class TextLibro {

    public static void main(String[] args) {


        Libro libro1 = new Libro();
        Usuario usuario1 = new Usuario();
        Prestamo prestamo1 = new Prestamo();
        Musica musica1 = new Musica();
        Categoria categoria1 = new Categoria();


        libro1.crearLibro();
        libro1.printLibro();
        libro1.printLibros();

        usuario1.crearUsuario();
        usuario1.printUsuario();
        usuario1.printUsuarios();

        prestamo1.crearPrestamo();
        prestamo1.printPrestamo();
        prestamo1.printPrestamos();

        musica1.crearMusica();
        musica1.printMusica();
        musica1.printMusicas();

        categoria1.crearCategoria();
        categoria1.printCategoria();
        categoria1.printCategorias();

    }
}
