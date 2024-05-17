package Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libro {

    Scanner sc = new Scanner(System.in);

    // Atributos encapsulados con el modificador private
    private int Idlibro;
    private String NombreLibro;
    private String Autor;
    private String Sipnosis;

    public Libro(){

    }

    public int getIdlibro() {
        return Idlibro;
    }

    public void setIdlibro(int idlibro) {
        Idlibro = idlibro;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        NombreLibro = nombreLibro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getSipnosis() {
        return Sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        Sipnosis = sipnosis;
    }

    List<ArrayList<Object>> Libros = new ArrayList<>();
    ArrayList<Object> Libro = new ArrayList<Object>();

    public void crearLibro() {



        System.out.println("Id libro:");
        Idlibro = sc.nextInt();
        sc.nextLine();
        Libro.add(Idlibro);


        System.out.println("Nobre libro:");
        NombreLibro = sc.nextLine();
        Libro.add(NombreLibro);

        System.out.println("Autor Libro:");
        Autor = sc.nextLine();
        sc.nextLine();
        Libro.add(Autor);

        System.out.println("Sipnosis libro:");
        Sipnosis = sc.nextLine();
        sc.nextLine();
        Libro.add(Sipnosis);


        Libros.add(Libro);

    }

    public void printLibro() {

        for (Object item : Libro) {

            System.out.println(item);

        }

    }


    public void printLibros() {

        for (Object item : Libros) {

            System.out.println(item);

        }


    }
}










