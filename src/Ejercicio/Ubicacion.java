package Ejercicio;

import java.util.HashMap;
import java.util.Map;

public class Ubicacion {
    int id;
    String descripcion;
    Map<String, Integer> ubicacion;

    public Ubicacion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.ubicacion = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Map<String, Integer> getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Map<String, Integer> ubicacion) {
        this.ubicacion = new HashMap<>();
    }
    public void addExit(String direccion, int idUbicacion){
        ubicacion.put(direccion.toUpperCase(), idUbicacion);
    }
}
