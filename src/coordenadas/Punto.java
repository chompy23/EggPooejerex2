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

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Punto() {
    }

    public Punto(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * En esta Función determino los dos puntos, instanciando dos objetos
     *
     * @return
     */
    public void CrearPunto() {
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese las coordenadas x1,y1,x2,y2");
        x1 = leer.nextDouble();
        y1 = leer.nextDouble();
        x2 = leer.nextDouble();
        y2 = leer.nextDouble();

    }
    public double CalcularDistancia(){
        double distancia = Math.sqrt((Math.pow((x2-x1), 2))+ (Math.pow((y2 - y1), 2)));
    
        return distancia;
    }

}
