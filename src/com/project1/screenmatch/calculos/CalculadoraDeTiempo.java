package com.project1.screenmatch.calculos;
import com.project1.screenmatch.modelos.Pelicula;
import com.project1.screenmatch.modelos.Serie;
import com.project1.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinuto();
    }
}
