package Clase01;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        pelicula.nombre = "Encanto";
        pelicula.fehaLanzamiento = 2021;
        pelicula.duracionPelicula = 128;

        pelicula.muestraFichatTcnica();
        pelicula.evalua(10);
        pelicula.evalua(1);


        Pelicula pelicula2 =  new Pelicula();
        pelicula2.nombre = "Matrix";
        pelicula2.fehaLanzamiento = 1190;
        pelicula2.duracionPelicula = 120;

        System.out.println("Mi pelicula "+pelicula2.nombre);
        System.out.println("Su fecha de lanzamiento es: "+pelicula2.fehaLanzamiento);
    }
}
