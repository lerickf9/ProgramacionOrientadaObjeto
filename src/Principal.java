public class Principal {
    public static void main(String[] args) {
        Pelicula mipelicula = new Pelicula();
        mipelicula.nombre = "Piratas del Caribe";
        mipelicula.fechaLanzamiento = 2024;
        mipelicula.duracionEnMinuto = 120;

        mipelicula.nuestraFichaTecnica();
        mipelicula.evalua(4.3);
        mipelicula.evalua(4.2);


        System.out.println(mipelicula.sumaEvaluaciones);
        System.out.println(mipelicula.totalEvaluaciones);
        System.out.println(mipelicula.calcularMedia());

        Pelicula miOtraPelicula = new Pelicula();
        miOtraPelicula.nombre = "Matrix";
        miOtraPelicula.fechaLanzamiento =1998;
        miOtraPelicula.duracionEnMinuto = 90;

        System.out.println("*******************++");

        miOtraPelicula.nuestraFichaTecnica();

    }
}
