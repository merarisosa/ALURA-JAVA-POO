package Clase01;

public class Pelicula {
    String nombre;
    int fehaLanzamiento;
    int duracionPelicula;
    boolean incluidaEnPlan;
    double sumaEvaluaciones;
    double totalEvaluaciones;

    void muestraFichatTcnica(){
        System.out.println("El nombre de la pelicula es: "+nombre);
        System.out.println("La fecha de lanzamiento es: "+fehaLanzamiento);
        System.out.println("La duración de la película es de: "+duracionPelicula);
    }

    void evalua(double nota){
        sumaEvaluaciones += nota;
        totalEvaluaciones++;
    }

    double calculaMedia(){
        return sumaEvaluaciones / totalEvaluaciones;
    }
}
