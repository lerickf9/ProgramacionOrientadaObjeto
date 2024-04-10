import com.project1.screenmatch.modelos.Pelicula;
import com.project1.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula mipelicula = new Pelicula();
        mipelicula.setNombre("Piratas del Caribe");
        mipelicula.setFechaLanzamiento(2024);
        mipelicula.setDuracionEnMinuto(120);
        mipelicula.setIncluidoEnPlan(true);

        mipelicula.nuestraFichaTecnica();
        mipelicula.evalua(4.3);
        mipelicula.evalua(4.2);


        System.out.println(mipelicula.getTotalEvaluaciones());
        System.out.println(mipelicula.calcularMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La Casa de Dragon");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);

        System.out.println(casaDragon.getDuracionEnMinuto());


    }
}
