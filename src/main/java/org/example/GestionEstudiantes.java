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
            System.out.println("Estudiante: "+estudiante.getValue().getNombre()+" calificación: "+estudiante.getValue().getCalificacion());
        }
    }

    public void mostrarEstudiantesAprobados(){

        for( Map.Entry<String,Estudiante> estudiante :this.estudiantes.entrySet()){

            if(estudiante.getValue().getCalificacion()>=60){
                System.out.println("Estudiante: "+estudiante.getValue().getNombre()+" Calificación: "+estudiante.getValue().getCalificacion());
            }
        }
    }
}
