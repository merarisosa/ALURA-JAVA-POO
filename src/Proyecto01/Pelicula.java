package Proyecto01;

import java.sql.SQLOutput;

/**
 * Ahora te toca a ti, realizar el mismo procedimiento que hice en la lección,
 * creando el proyecto "screenmatch" en IntelliJ. Dentro de él, debes crear la
 * clase "Pelicula" que contenga los atributos "nombre", "fechaDeLanzamiento",
 * "duracionEnMinutos", "incluidoEnElPlan", "sumaDeLasEvaluaciones" y "totalDeLasEvaluaciones".
 * También, debes incluir los métodos "muestraFichaTecnica", "evalua" y "calculaMedia".
 *
 * Además, crea otra clase que contenga el método "main". En este método, debes crear
 * un objeto "Pelicula", llenar sus atributos y llamar a sus métodos.
 */

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private double duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private double totalDeLasEvaluaciones;

     void muestraFichaTecnica(){
        System.out.println("PELICULA");
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Duración en minutos: "+duracionEnMinutos);
        System.out.println("Incluida en el plan: "+incluidoEnElPlan);
    }

     void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

     double calculaMedia(){
        return sumaDeLasEvaluaciones /totalDeLasEvaluaciones;
    }
}
