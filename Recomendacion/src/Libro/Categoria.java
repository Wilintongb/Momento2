package Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Categoria {


    Scanner sc = new Scanner(System.in);

    // Atributos encapsulados con el modificador private
    private int IdCategoria;
    private String NombreCategoria;


    public Categoria(){

    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        IdCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        NombreCategoria = nombreCategoria;
    }



    List<ArrayList<Object>> Categorias = new ArrayList<>();
    ArrayList<Object> Categoria = new ArrayList<Object>();

    public void crearCategoria() {



        System.out.println("Id categoria:");
        IdCategoria = sc.nextInt();
        sc.nextLine();
        Categoria.add(IdCategoria);


        System.out.println("Nobre categoria:");
        NombreCategoria = sc.nextLine();
        Categoria.add(NombreCategoria);


        Categorias.add(Categoria);

    }

    public void printCategoria() {

        for (Object item : Categoria) {

            System.out.println(item);

        }

    }


    public void printCategorias() {

        for (Object item : Categorias) {

            System.out.println(item);

        }


    }
}
