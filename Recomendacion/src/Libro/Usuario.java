package Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {


    Scanner sc = new Scanner(System.in);

    // Atributos encapsulados con el modificador private
    private int IdUsuario;
    private String NombreUsuario;
    private String DireccionUsuario;
    private long TelefonoUsuario;
    private int EdadUsuario;
    private String MedioPago;


    public Usuario(){

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

    public String getDireccionUsuario() {
        return DireccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        DireccionUsuario = direccionUsuario;
    }

    public long getTelefonoUsuario() {
        return TelefonoUsuario;
    }

    public void setTelefonoUsuario(long telefonoUsuario) {
        TelefonoUsuario = telefonoUsuario;
    }

    public int getEdadUsuario() {
        return EdadUsuario;
    }

    public void setEdadUsuario(int edadUsuario) {
        EdadUsuario = edadUsuario;
    }

    public String getMedioPago() {
        return MedioPago;
    }

    public void setMedioPago(String medioPago) {
        MedioPago = medioPago;
    }

    List<ArrayList<Object>> Usuarios = new ArrayList<>();
    ArrayList<Object> Usuario = new ArrayList<Object>();

    public void crearUsuario() {



        System.out.println("Id usuario:");
        IdUsuario = sc.nextInt();
        sc.nextLine();
        Usuario.add(IdUsuario);


        System.out.println("Nobre usuario:");
        NombreUsuario = sc.nextLine();
        Usuario.add(NombreUsuario);

        System.out.println("Direccion usuario:");
        DireccionUsuario = sc.nextLine();
        sc.nextLine();
        Usuario.add(DireccionUsuario);

        System.out.println("Telefono usuario:");
        TelefonoUsuario = sc.nextLong();
        sc.nextLine();
        Usuario.add(TelefonoUsuario);

        System.out.println("Edad usuario:");
        EdadUsuario = sc.nextInt();
        sc.nextLine();
        Usuario.add(EdadUsuario);

        System.out.println("Medio de pago:");
        MedioPago = sc.nextLine();
        sc.nextLine();
        Usuario.add(MedioPago);


        Usuarios.add(Usuario);

    }

    public void printUsuario() {

        for (Object item : Usuario) {

            System.out.println(item);

        }

    }


    public void printUsuarios() {

        for (Object item : Usuarios) {

            System.out.println(item);

        }


    }
}
