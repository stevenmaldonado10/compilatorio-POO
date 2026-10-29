package org.example.ejercicio1;

public class Estudiante implements AccionesEstudiante {

    private String nombre;
	private int edad;
	private double calificacion;

    public Estudiante (String nombre, int edad, double calificacion){
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public boolean esAprobado(){

        if(this.calificacion>=60){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void estudiar() {
        System.out.println(this.nombre+" está estudiando");
    }

    @Override
    public void presentarExamen() {
        System.out.println(this.nombre+" está presentando un examen");

    }
}
