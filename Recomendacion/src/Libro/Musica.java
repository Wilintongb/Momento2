package Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Musica {


    Scanner sc = new Scanner(System.in);

    // Atributos encapsulados con el modificador private
    private int IdGenero;
    private String NombreGenero;
    private String NombreCancion;
    private String NombreCantante;


    public Musica(){

    }

    public int getIdGenero() {
        return IdGenero;
    }

    public void setIdGenero(int idGenero) {
        IdGenero = idGenero;
    }

    public String getNombreGenero() {
        return NombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        NombreGenero = nombreGenero;
    }

    public String getNombreCancion() {
        return NombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        NombreCancion = nombreCancion;
    }

    public String getNombreCantante() {
        return NombreCantante;
    }

    public void setNombreCantante(String nombreCantante) {
        NombreCantante = nombreCantante;
    }




    List<ArrayList<Object>> Musicas = new ArrayList<>();
    ArrayList<Object> Musica = new ArrayList<Object>();

    public void crearMusica() {



        System.out.println("Id genero:");
        IdGenero = sc.nextInt();
        sc.nextLine();
        Musica.add(IdGenero);


        System.out.println("Nobre genero:");
        NombreGenero = sc.nextLine();
        Musica.add(NombreGenero);

        System.out.println("Nombre cancion:");
        NombreCancion = sc.nextLine();
        Musica.add(NombreCancion);

        System.out.println("Nombre cantante:");
        NombreCantante = sc.nextLine();
        Musica.add(NombreCantante);


        Musicas.add(Musica);

    }

    public void printMusica() {

        for (Object item : Musica) {

            System.out.println(item);

        }

    }


    public void printMusicas() {

        for (Object item : Musicas) {

            System.out.println(item);

        }


    }
}
