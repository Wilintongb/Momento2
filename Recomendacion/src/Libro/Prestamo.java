package Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prestamo {



    Scanner sc = new Scanner(System.in);

    // Atributos encapsulados con el modificador private
    private int IdUsuario;
    private String NombreUsuario;
    private String LibroPrestado;
    private String DiaPrestamo;
    private String DiaEntrega;
    private String EstadoLibro;

    public Prestamo(){

    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }

    public String getLibroPrestado() {
        return LibroPrestado;
    }

    public void setLibroPrestado(String libroPrestado) {
        LibroPrestado = libroPrestado;
    }

    public String getDiaPrestamo() {
        return DiaPrestamo;
    }

    public void setDiaPrestamo(String diaPrestamo) {
        DiaPrestamo = diaPrestamo;
    }

    public String getDiaEntrega() {
        return DiaEntrega;
    }

    public void setDiaEntrega(String diaEntrega) {
        DiaEntrega = diaEntrega;
    }

    public String getEstadoLibro() {
        return EstadoLibro;
    }

    public void setEstadoLibro(String estadoLibro) {
        EstadoLibro = estadoLibro;
    }

    List<ArrayList<Object>> Prestamos = new ArrayList<>();
    ArrayList<Object> Prestamo = new ArrayList<Object>();

    public void crearPrestamo() {



        System.out.println("Id usuario:");
        IdUsuario = sc.nextInt();
        sc.nextLine();
        Prestamo.add(IdUsuario);


        System.out.println("Nobre usuario:");
        NombreUsuario = sc.nextLine();
        Prestamo.add(NombreUsuario);

        System.out.println("Nombre del libro prestado:");
        LibroPrestado = sc.nextLine();
        sc.nextLine();
        Prestamo.add(LibroPrestado);

        System.out.println("Dia en que se presto:");
        DiaPrestamo = sc.nextLine();
        sc.nextLine();
        Prestamo.add(DiaPrestamo);

        System.out.println("Dia de entrega del libro:");
        DiaEntrega = sc.nextLine();
        sc.nextLine();
        Prestamo.add(DiaEntrega);

        System.out.println("Estado en que fue devuelto el libro:");
        EstadoLibro = sc.nextLine();
        sc.nextLine();
        Prestamo.add(EstadoLibro);


        Prestamos.add(Prestamo);

    }

    public void printPrestamo() {

        for (Object item : Prestamo) {

            System.out.println(item);

        }

    }


    public void printPrestamos() {

        for (Object item : Prestamos) {

            System.out.println(item);

        }


    }
}
