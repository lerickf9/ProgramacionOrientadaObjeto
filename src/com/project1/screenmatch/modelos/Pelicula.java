package com.project1.screenmatch.modelos;

public class Pelicula {
    private String nombre;

    private int fechaLanzamiento;
    private int duracionEnMinuto;
    private boolean incluidoEnPlan;

    private int totalEvaluaciones;
    private double sumaEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getDuracionEnMinuto() {
        return duracionEnMinuto;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionEnMinuto(int duracionEnMinuto) {
        this.duracionEnMinuto = duracionEnMinuto;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

    public void nuestraFichaTecnica(){
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
        System.out.println("Duracion de la pelicula: " + duracionEnMinuto+ " min");
    }

    public void evalua(double nota){
        totalEvaluaciones++;
        sumaEvaluaciones+=nota;
    }

    public double calcularMedia(){
        return sumaEvaluaciones/totalEvaluaciones;
    }
}
