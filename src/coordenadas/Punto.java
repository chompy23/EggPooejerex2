/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordenadas;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Punto {

    private double corx;
    private double cory;

    public Punto() {
    }

    public Punto(double corx, double cory) {
        this.corx = corx;
        this.cory = cory;
    }

    /**
     *  En esta Función determino los dos puntos, utilizando solo dos atributos
     * @return
     */
    public double[][] CrearPunto() {
        Scanner leer = new Scanner(System.in);
        double[][] CrearPunto = new double[2][2];
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.println(" Ingrese la primer coordena x,y ");
                corx = leer.nextDouble();
                CrearPunto[i][i] = corx;
                cory = leer.nextDouble();
                CrearPunto[i][1] = cory;

            } else {
                System.out.println(" Ingrese la segunda coordenada x,y ");
                corx = leer.nextDouble();
                CrearPunto[i][0] = corx;
                cory = leer.nextDouble();
                CrearPunto[i][i] = cory;
            }
        }
        for (double[] ds : CrearPunto) {
            for (double d : ds) {
                System.out.print(" " + d);
            }
            System.out.println(" ");
        }
        return CrearPunto;
    }

    /**
     *  En este método calculo la distancia cargando los puntos. 
     * @return
     */
    public double CalcularDistancia() {
        double[][] punt = CrearPunto();
        double distancia;
        distancia = Math.sqrt((Math.pow(((punt[1][0])-(punt[0][0])), 2))+(Math.pow(((punt[1][1])-(punt[0][1])), 2)));
        return distancia;
    }
}
