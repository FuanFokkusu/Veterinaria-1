package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Veterinaria {

    private String nombre;

    private Collection<Mascota> listaMascotas;

    // CONSTRUCTOR

    public Veterinaria(String nombre, Collection<Mascota> listaMascotas) {
        this.nombre = nombre;
        this.listaMascotas = new LinkedList<>();
        
    }


    // GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void agregarMascota(Mascota mascota){
  
        listaMascotas.add(mascota);
    
    }
}