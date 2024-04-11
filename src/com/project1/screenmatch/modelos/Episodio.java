package com.project1.screenmatch.modelos;

import com.project1.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    private int numeroEpisodio;

    private String nombre;

    private Serie serie;

    private int totalVisualizaciones;

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if(totalVisualizaciones>100){
            return 4;
        }else{
            return 2;
        }
    }
}
