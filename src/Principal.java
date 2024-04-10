import com.project1.screenmatch.modelos.Pelicula;

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




    }
}
