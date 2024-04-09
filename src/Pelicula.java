public class Pelicula {
    String nombre;

    int fechaLanzamiento;
    int duracionEnMinuto;
    boolean incluidoEnPlan;

    int totalEvaluaciones;
    double sumaEvaluaciones;

    void nuestraFichaTecnica(){
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
        System.out.println("Duracion de la pelicula: " + duracionEnMinuto+ " min");
    }

    void evalua(double nota){
        totalEvaluaciones++;
        sumaEvaluaciones+=nota;
    }

    double calcularMedia(){
        return sumaEvaluaciones/totalEvaluaciones;
    }
}