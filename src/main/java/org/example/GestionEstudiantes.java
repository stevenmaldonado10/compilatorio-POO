package org.example;

import java.util.HashMap;
import java.util.Map;

public class GestionEstudiantes {

    private Map<String,Estudiante> estudiantes = new HashMap<>();

    public void agregarEstudiante(String nombre, int edad, double calificacion){

        this.estudiantes.put(nombre, new Estudiante(nombre, edad, calificacion) );
    }

    public void eliminarEstudiante(String nombre){

        this.estudiantes.remove(nombre);
    }

    public void listarEstudiantes(){
        //System.out.println(this.estudiantes);

        for( Map.Entry<String,Estudiante> estudiante :this.estudiantes.entrySet()){
            System.out.println(estudiante.getValue().getNombre());
        }
    }
}
