package org.example.ejercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GestionEstudiantes estudiantes = new GestionEstudiantes();
        estudiantes.agregarEstudiante("Juan", 30, 70);
        estudiantes.agregarEstudiante("Andrés", 35, 80);
        estudiantes.agregarEstudiante("David", 20, 40);

        estudiantes.listarEstudiantes();

        estudiantes.mostrarEstudiantesAprobados();

        estudiantes.eliminarEstudiante("Juan");

        estudiantes.listarEstudiantes();
    }
}